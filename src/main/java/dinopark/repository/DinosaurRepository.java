package dinopark.repository;

import dinopark.domain.Dinosaur;
import dinopark.dto.EatingHabit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DinosaurRepository extends CrudRepository<Dinosaur, Integer>, DinosaurRepositoryCustomFunctionNames {
    List<Dinosaur> findAll();
    List<Dinosaur> findByEatingHabit(EatingHabit eatingHabit);
}
