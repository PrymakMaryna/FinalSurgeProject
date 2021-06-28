package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static constants.RunConstants.*;

@Log4j2
public class RunForm {

    public RunForm clickOnTheRunMenuButton() {
        $(RUN_MENU).click();
        return this;
    }

    public RunForm selectDate(String date) {
        $(DATE).val(date);
        return this;
    }

    public RunForm selectTimeOfDay(String timeOfDay) {
        $(TIME_OF_DAY).val(timeOfDay);
        return this;
    }

    public RunForm inputWorkoutName(String workoutName) {
        $(WORKOUT_NAME).val(workoutName);
        return this;
    }

    public RunForm inputWorkoutDescription(String workoutDescription) {
        $(WORKOUT_DESCRIPTION).val(workoutDescription);
        return this;
    }

    public RunForm clickShowPlannedDistanceButton() {
        $(SHOW_PLANNED_DISTANCE_BUTTON).click();
        return this;
    }

    public RunForm selectPlannedDistance(String plannedDistanceManual, String plannedDistanceType) {
        $(PLANNED_DISTANCE_MANUAL).val(plannedDistanceManual);
        new Select($(PLANNED_DISTANCE_TYPE)).selectByVisibleText(plannedDistanceType);
        return this;
    }

    public void inputPlannedDuration(String plannedDuration) {
        $(PLANNED_DURATION).val(plannedDuration);
    }

    public RunForm inputDistanceBasic(String distanceBasicManual, String distanceBasicType) {
        $(DISTANCE_BASIC_MANUAL).val(distanceBasicManual);
        new Select($(DISTANCE_BASIC_TYPE)).selectByVisibleText(distanceBasicType);
        return this;
    }

    public RunForm inputDurationBasic(String durationBasic) {
        $(DURATION_BASIC).val(durationBasic);
        return this;
    }

    public RunForm inputPace(String paceBasic) {
        $(PACE_MANUAL).shouldHave(value("3:34"));
        new Select($(PACE_TYPE)).selectByVisibleText(paceBasic);
        return this;
    }

    public void clickAdvancedWorkout() {
        $(ADVANCED_WORKOUT_BUTTON).click();
    }


    public RunForm inputReps(String repsAdvanced) {
        $(REPS).val(repsAdvanced);
        return this;
    }

    public RunForm inputDistanceAdvance(String distanceAdvancedManual, String distanceAdvancedType) {
        $(DISTANCE_ADVANCED_MANUAL).val(distanceAdvancedManual);
        new Select($(DISTANCE_ADVANCED_TYPE)).selectByVisibleText(distanceAdvancedType);
        return this;
    }

    public RunForm inputDurationAdvanced(String durationAdvanced) {
        $(DURATION_ADVANCED).val(durationAdvanced);
        return this;
    }

    public RunForm clickAddAnotherSet() {
        $(ANOTHER_SET_BUTTON).click();
        $(RECOVERY_TIME).shouldBe(visible);
        return this;
    }

    public RunForm inputRecovery(String recoveryTime, String recoveryDistance, String recoveryDistanceType) {
        $(RECOVERY_TIME).val(recoveryTime);
        $(RECOVERY_DISTANCE_MANUAL).val(recoveryDistance);
        new Select($(RECOVERY_DISTANCE_TYPE)).selectByVisibleText(recoveryDistanceType);
        return this;
    }

    public RunForm clickDeleteThisSet() {
        $(DELETE_THIS_SET_BUTTON).click();
        $(RECOVERY_TIME).shouldNotBe(visible);
        return this;
    }

    public RunForm clickExpandReps() {
        $(EXPAND_REPS_BUTTON).click();
        $(DURATION_ADVANCED).shouldBe(disabled);
        return this;
    }

    public RunForm clickMarkAsRaceButton() {
        $(MARK_AS_RACE_BUTTON).click();
        return this;
    }

    public RunForm inputPlace(String overallPlace, String ageGroupPlace) {
        $(OVERALL_PLACE).val(overallPlace);
        $(AGE_GROUP_PLACE).val(ageGroupPlace);
        return this;
    }

    public RunForm selectHowIFelt(String howIFelt) {
        $(HOW_I_FELT).selectRadio(howIFelt);
        return this;
    }

    public RunForm selectPerceivedEffort(String perceivedEffort) {
        new Select($(PERCEIVED_EFFORT)).selectByVisibleText(perceivedEffort);
        return this;
    }

    public RunForm inputHR(String minHR, String avgHR, String maxHR) {
        $(MIN_HR).val(minHR);
        $(AVG_HR).val(avgHR);
        $(MAX_HR).val(maxHR);
        return this;
    }

    public RunForm selectCaloriesBurned(String caloriesBurned) {
        $(CALORIC_BURNED).val(caloriesBurned);
        return this;
    }

    public RunForm clickAddWorkoutButton() {
        $(ADD_WORKOUT).click();
        return this;
    }

    public void checkCreateRunWorkout() {
        $(CHECK_RUN_FORM).shouldBe(visible);
    }
}
