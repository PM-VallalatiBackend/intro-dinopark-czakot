package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DinosaurRepository {

    Dinosaur save(Dinosaur dinosaur);
    List<Dinosaur> getAll();
    List<Dinosaur> getByEatingHabit(EatingHabit eatingHabit);

}
