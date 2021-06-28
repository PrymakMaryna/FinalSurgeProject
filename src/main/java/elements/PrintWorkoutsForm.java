package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchFrameException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class PrintWorkoutsForm {

    public static final String PRINT_WORKOUT_LINK = ".icsw16-printer";
    public static final String PRINT_STARTING_DATE = "#PrintStartDate";
    public static final String PRINT_ENDING_DATE = "#PrintEndDate";
    public static final String PRINT_WORKOUTS_BUTTON = "#saveButtonPrint";
    public static final String CHECK_CONTENT_PRINT_RUN_WORKOUT = ".dayHeader";

    public PrintWorkoutsForm openPrintWorkoutsForm() {
        log.info("Opening {} form", "PrintWorkoutsForm");
        $(PRINT_WORKOUT_LINK).click();
        log.info("Frame {} is loaded", "PrintWorkoutsiFrame");
        try {
            switchTo().frame("PrintWorkoutsiFrame");
        } catch (NoSuchFrameException ex) {
            System.out.println("Frame doesn't exist.  Continuing anyways.");
        }
        return this;
    }

    public PrintWorkoutsForm enterStartingDay() {
        $(PRINT_STARTING_DATE).val("06/01/2021");
        return this;
    }

    public PrintWorkoutsForm enterEndingDay() {
        $(PRINT_ENDING_DATE).val("06/30/2021");
        return this;
    }

    public PrintWorkoutsForm clickPrintButton() {
        $(PRINT_WORKOUTS_BUTTON).click();
        return this;
    }

    public PrintWorkoutsForm switchToWindowPrint() {
        switchTo().window("Final Surge - Print Workouts");
        return this;
    }

    public void checkContentPrintWorkout() {
        $(CHECK_CONTENT_PRINT_RUN_WORKOUT).shouldBe(visible);
    }
}
