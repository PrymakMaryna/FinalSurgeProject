package model.objectsWorkoutCalculators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TinmanModel {

    @Builder.Default
    private String raceDistance = "10 km";
    @Builder.Default
    private String hours = "1";
    @Builder.Default
    private String minutes = "20";
    @Builder.Default
    private String seconds = "10";
    @Builder.Default
    private String gender = "F";

}
