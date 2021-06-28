package model.objectsWorkoutCalculators;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class HunsonsModel {

    @Builder.Default
    private String distanceSelect = "Marathon";
    @Builder.Default
    private String distanceManual = "10";
    @Builder.Default
    private String distanceType = "km";
    @Builder.Default
    private String hours ="3";
    @Builder.Default
    private String minutes = "20";
    @Builder.Default
    private String seconds = "10";
    @Builder.Default
    private String temperatureManual = "25";
    @Builder.Default
    private String temperatureType = "°C";
    @Builder.Default
    private String humidity = "64";
    @Builder.Default
    private String windSpeedManual = "13";
    @Builder.Default
    private String windSpeedType ="kph";

}
