package dinopark.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DinosaurInfo {

    private Integer id;
    private String name;
    private String species;
    private String eatingHabit;
}
