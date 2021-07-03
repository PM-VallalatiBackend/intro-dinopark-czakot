package dinopark.repository;

import dinopark.domain.Visitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitorRepository extends CrudRepository<Visitor, Integer> {
    List<Visitor> findAll();
}
