package dinopark.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VisitorInfo {

    private Long id;
    private String name;
    private String preferredEatingHabit;
    private int rating;
}
