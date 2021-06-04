package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DinosaurRepositoryCombined extends CrudRepository<Dinosaur, Integer>, DinosaurRepository {

    List<Dinosaur> findAll();
    List<Dinosaur> findByEatingHabit(EatingHabit eatingHabit);
}
