package dinopark.service;

import dinopark.domain.Dinosaur;
import dinopark.dto.DinosaurCreateCommand;
import dinopark.dto.DinosaurDisplay;
import dinopark.repository.DinosaurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinosaurService {

    private final DinosaurRepository dinosaurRepository;

    DinosaurService(DinosaurRepository dinosaurRepository) {
        this.dinosaurRepository = dinosaurRepository;
    }

    //  todo Mapper class convert between Dinosaur, DinosaurCreateCommand, DinosaurDisplay?

    public Dinosaur save(DinosaurCreateCommand dinosaurCreate) {
        return null;
    }

    public List<DinosaurDisplay> getAll() {
        return null;
    }

    public List<DinosaurDisplay> getByEatingHabits() {
        return null;
    }

}
