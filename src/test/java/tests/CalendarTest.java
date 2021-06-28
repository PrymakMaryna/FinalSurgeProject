package tests;

import io.qameta.allure.*;
import model.objectFullAdd.Run;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("CalendarTest")
public class CalendarTest extends ValidAuthentication {

    @Test(priority = 1, description = "Viewing of the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void viewRunWorkout() {
        calendarSteps
                .viewRunWorkout(Run.builder().build());
    }

    @Test(description = "Updating of the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void updateRunWorkout() {
        calendarSteps
                .updateRunWorkout();
    }

    @Test(description = "Adding of the comment to the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void commentsRunWorkout() {
        calendarSteps
                .commentsRunWorkout();
    }

    @Test(description = "Uploading of the invalid file to the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void uploadInvalidDataRunWorkout() {
        calendarSteps
                .uploadDataWithInvalidFileRunWorkout();
    }

    @Test(description = "Uploading of the empty file to the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void uploadDataWithEmptyFileRunWorkout() {
        calendarSteps
                .uploadDataWithEmptyFileRunWorkout();
    }

    @Test(description = "Choosing of the type of a pane of the headache")
    @Severity(value = SeverityLevel.CRITICAL)
    public void painInjuryHeadacheRunWorkout() {
        calendarSteps
                .painInjuryHeadacheRunWorkout();
    }

    @Test(description = "Moving of the race")
    @Severity(value = SeverityLevel.CRITICAL)
    public void moveRace() {
        calendarSteps
                .moveRace();
    }

    @Test(description = "Coping of the workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void copyRunWorkout() {
        calendarSteps
                .copyRunWorkout();
    }

    @Test(description = "Deleting of the workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void deleteRunWorkout() {
        calendarSteps
                .deleteRunWorkout();
    }

    @Test(description = "Printing of the workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void printRunWorkout() {
        calendarSteps
                .printRunWorkout();
    }

}
