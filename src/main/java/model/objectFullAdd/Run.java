package model.objectFullAdd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Run {

    @Builder.Default
    private String date = "6/5/2021";
    @Builder.Default
    private String timeOfDay = "07:00 AM";
    @Builder.Default
    private String workoutName = "My run";
    @Builder.Default
    private String workoutDescription = "Preparation for the competition";
    @Builder.Default
    private String plannedDistanceManual = "10";
    @Builder.Default
    private String plannedDistanceType = "km";
    @Builder.Default
    private String plannedDuration = "00:02:32";
    @Builder.Default
    private String distanceBasicManual = "9";
    @Builder.Default
    private String distanceBasicType = "km";
    @Builder.Default
    private String durationBasic = "00:20:00";
    @Builder.Default
    private String paceBasic = "min/100m";
    @Builder.Default
    private String repsAdvanced = "1";
    @Builder.Default
    private String distanceAdvancedManual = "11";
    @Builder.Default
    private String distanceAdvancedType = "km";
    @Builder.Default
    private String durationAdvanced = "00:02.2";
    @Builder.Default
    private String recoveryTime = "00:01.2";
    @Builder.Default
    private String recoveryDistance = "5";
    @Builder.Default
    private String recoveryDistanceType = "km";
    @Builder.Default
    private String overallPlace = "12";
    @Builder.Default
    private String ageGroupPlace = "25";
    @Builder.Default
    private String howIFelt = "1";
    @Builder.Default
    private String perceivedEffort = "3 (Light)";
    @Builder.Default
    private String minHR = "60";
    @Builder.Default
    private String avgHR = "70";
    @Builder.Default
    private String maxHR = "80";
    @Builder.Default
    private String caloriesBurned = "120";

}
