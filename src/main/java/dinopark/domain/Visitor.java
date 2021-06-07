package dinopark.domain;

import dinopark.dto.EatingHabit;

import javax.persistence.*;

@Entity
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private EatingHabit preferredEatingHabit;

}
