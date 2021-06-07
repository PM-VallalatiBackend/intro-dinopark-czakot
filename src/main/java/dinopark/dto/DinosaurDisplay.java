package dinopark.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class DinosaurDisplay {

    private Integer id;
    private String name;
    private String species;
    private String eatingHabit;
}
