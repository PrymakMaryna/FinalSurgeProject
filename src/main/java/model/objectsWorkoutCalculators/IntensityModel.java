package model.objectsWorkoutCalculators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class IntensityModel {

    @Builder.Default
    private String event = "HALFMAR";
    @Builder.Default
    private String hours = "3";
    @Builder.Default
    private String minutes = "20";
    @Builder.Default
    private String seconds = "30";

}
