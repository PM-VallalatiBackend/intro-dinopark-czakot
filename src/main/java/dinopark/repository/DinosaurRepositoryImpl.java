package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class DinosaurRepositoryImpl implements DinosaurRepositoryCombined {

    public List<Dinosaur> getAll() {
        return findAll();
    }
    public List<Dinosaur> getByEatingHabit(EatingHabit eatingHabit) {
        return findByEatingHabit(eatingHabit);
    }
}
