package steps;

import elements.RunForm;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.objectFullAdd.Run;
import pages.CalendarPage;

@Log4j2
public class RunSteps {

    RunForm runForm = new RunForm();
    CalendarPage calendarPage = new CalendarPage();

    @Step("Creating on the run workout form")
    public void createRunWorkout(Run run) {
        calendarPage.clickFullAddButton();
        log.info("Creating {} of the run workout form", run);
        runForm.clickOnTheRunMenuButton()
                .selectDate(run.getDate())
                .selectTimeOfDay(run.getTimeOfDay())
                .inputWorkoutName(run.getWorkoutName())
                .inputWorkoutDescription(run.getWorkoutDescription())
                .clickShowPlannedDistanceButton()
                .selectPlannedDistance(run.getPlannedDistanceManual(), run.getPlannedDistanceType())
                .inputPlannedDuration(run.getPlannedDuration());
        log.info("Filling of the basic workout");
        runForm.inputDistanceBasic(run.getDistanceBasicManual(), run.getDistanceBasicType())
                .inputDurationBasic(run.getDurationBasic())
                .inputPace(run.getPaceBasic())
                .clickAdvancedWorkout();
        log.info("Filling of the advanced workout");
        runForm.inputReps(run.getRepsAdvanced())
                .inputDistanceAdvance(run.getDistanceAdvancedManual(), run.getDistanceAdvancedType())
                .inputDurationAdvanced(run.getDurationAdvanced())
                .clickAddAnotherSet()
                .inputRecovery(run.getRecoveryTime(), run.getRecoveryDistance(), run.getRecoveryDistanceType())
                .clickDeleteThisSet()
                .clickExpandReps()
                .clickMarkAsRaceButton()
                .inputPlace(run.getOverallPlace(), run.getAgeGroupPlace())
                .selectHowIFelt(run.getHowIFelt())
                .selectPerceivedEffort(run.getPerceivedEffort())
                .inputHR(run.getMinHR(), run.getAvgHR(), run.getMaxHR())
                .selectCaloriesBurned(run.getCaloriesBurned())
                .clickAddWorkoutButton()
                .checkCreateRunWorkout();
    }
}
