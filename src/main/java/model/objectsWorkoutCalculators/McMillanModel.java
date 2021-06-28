package model.objectsWorkoutCalculators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class McMillanModel {

    @Builder.Default
    private String raceDistance = "5Km";
    @Builder.Default
    private String hours = "1";
    @Builder.Default
    private String minutes = "20";
    @Builder.Default
    private String seconds = "10";
    @Builder.Default
    private String raceGoalDistance = "5Km";
    @Builder.Default
    private String goalHours = "2";
    @Builder.Default
    private String goalMinutes = "15";
    @Builder.Default
    private String goalSeconds ="11";

}
