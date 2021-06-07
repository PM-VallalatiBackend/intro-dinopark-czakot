package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DinosaurRepositoryCustomFunctionNames {

    List<Dinosaur> getAll();
    List<Dinosaur> getByEatingHabit(EatingHabit eatingHabit);
}
