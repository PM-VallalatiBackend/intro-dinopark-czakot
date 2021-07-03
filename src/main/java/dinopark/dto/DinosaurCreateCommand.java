package dinopark.dto;

import dinopark.domain.Species;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DinosaurCreateCommand {

    private String name;
    private Enum<Species> dinosaurBreed;
    private Enum<EatingHabit> dinosaurType;

}
