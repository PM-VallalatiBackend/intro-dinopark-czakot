package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DinosaurRepositoryImpl implements DinosaurRepositoryCustomFunctionNames {

    @Autowired
    private DinosaurRepository dinosaurRepository;

    @Override
    public List<Dinosaur> getAll() {
        return dinosaurRepository.findAll();
    }

    @Override
    public List<Dinosaur> getByEatingHabit(EatingHabit eatingHabit) {
        return dinosaurRepository.findByEatingHabit(eatingHabit);
    }

}
