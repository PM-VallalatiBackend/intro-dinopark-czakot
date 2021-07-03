package dinopark.service;

import dinopark.domain.Dinosaur;
import dinopark.domain.Visitor;
import dinopark.dto.*;
import dinopark.repository.DinosaurRepository;
import dinopark.repository.VisitorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DinoService {

    private final DinosaurRepository dinosaurRepository;
    private final VisitorRepository visitorRepository;
    private final ModelMapper modelMapper;

    DinoService(DinosaurRepository dinosaurRepository, VisitorRepository visitorRepository, ModelMapper modelMapper) {
        this.dinosaurRepository = dinosaurRepository;
        this.visitorRepository = visitorRepository;
        this.modelMapper = modelMapper;
    }

    public DinosaurInfo saveDino(DinosaurCreateCommand command) {
        return modelMapper.map(dinosaurRepository.save(modelMapper.map(command, Dinosaur.class)), DinosaurInfo.class);
    }

    public List<DinosaurInfo> findAll() {
        return dinosaurRepository.findAll().stream()
                .map(dinosaur -> modelMapper.map(dinosaur, DinosaurInfo.class))
                .collect(Collectors.toList());
    }

    public List<DinosaurInfo> findByEatingHabit(String eatingHabitName) {
        Enum<EatingHabit> eatingHabit = EatingHabit.valueOf(eatingHabitName);
        return dinosaurRepository.findByEatingHabit(eatingHabit).stream()
                .map(dinosaur -> modelMapper.map(dinosaur, DinosaurInfo.class))
                .collect(Collectors.toList());
    }

    public VisitorInfo saveVisitor(VisitorCreateCommand command) {
        Visitor visitorToSave = modelMapper.map(command, Visitor.class);
        visitorToSave.setRating(calculateDinoParkRating(command.getPreferredEatingHabit()));
        return modelMapper.map(visitorRepository.save(visitorToSave), VisitorInfo.class);
    }

    private int calculateDinoParkRating(String preferredEatingHabitName) {
        Enum<EatingHabit> preferredEatingHabit = EatingHabit.valueOf(preferredEatingHabitName);
        long dinoCount = dinosaurRepository.count();
        if (dinoCount < 3) {
            return 1;
        } else {
            long preferredDinoCount = dinosaurRepository.countByEatingHabit(preferredEatingHabit);
            return (int) ((preferredDinoCount * 3 + dinoCount * 2) / dinoCount);
        }
    }

    public List<VisitorInfo> findAllVisitor() {
        return visitorRepository.findAll().stream()
                .map(visitor -> modelMapper.map(visitor, VisitorInfo.class))
                .collect(Collectors.toList());
    }

    public String getAverageParkRating() {
        long ratingSum = visitorRepository.findAll().stream().mapToInt(Visitor::getRating).sum();
        return Integer.toString((int) (ratingSum / visitorRepository.count()));
    }
}
