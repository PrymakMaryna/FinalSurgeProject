package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchFrameException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.WorkoutCalculatorsConstants.WORKOUT_CALCULATORS_ICON;

@Log4j2
public class WorkoutCalculatorsForm {

    public static final String TIME_HOURS = "#TimeHH";
    public static final String TIME_MINUTES = "#TimeMM";
    public static final String TIME_SECONDS = "#TimeSS";

    public WorkoutCalculatorsForm openOfTheWorkoutCalculatorsForm() {
        $(WORKOUT_CALCULATORS_ICON).click();
        log.info("Frame {} is loaded", "IntensityCalciFrame");
        try {
            switchTo().frame("IntensityCalciFrame");
        } catch (NoSuchFrameException ex) {
            System.out.println("Frame doesn't exist.  Continuing anyways.");
        }
        return this;
    }

    public void selectTime(String hours, String minutes, String seconds) {
        $(String.format(TIME_HOURS, hours)).val(hours);
        $(String.format(TIME_MINUTES, minutes)).val(minutes);
        $(String.format(TIME_SECONDS, seconds)).val(seconds);
    }

}
