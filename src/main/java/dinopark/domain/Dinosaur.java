package dinopark.domain;

import dinopark.dto.EatingHabit;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Enum<Species> species;

    @Column(nullable = false)
    private Enum<EatingHabit> eatingHabit;

}
