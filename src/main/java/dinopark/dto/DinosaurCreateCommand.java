package dinopark.dto;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class DinosaurCreateCommand {

    private String name;
    private Enum<Species> dinosaurBreed;
    private Enum<EatingHabit> dinosaurType;

}
