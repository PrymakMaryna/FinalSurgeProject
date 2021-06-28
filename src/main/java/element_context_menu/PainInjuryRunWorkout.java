package element_context_menu;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import utils.StringUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.PainInjuryRunWorkoutConstants.*;

@Log4j2
public class PainInjuryRunWorkout {

    public PainInjuryRunWorkout openOfThePainInjuryFrame() {
        $(PAIN_INJURY_LINK).click();
        log.info("Frame {} is loaded", "PainInjuryFrame");
        try {
            switchTo().frame("PainInjuryFrame");
        } catch (NoSuchFrameException ex) {
            System.out.println("Frame doesn't exist.  Continuing anyways.");
        }
        return this;
    }

    public PainInjuryRunWorkout clickHeadacheDot() {
        $(HEADACHE_DOT).click();
        $(CHECK_PAIN_POINT_TITLE).shouldHave(text("Headache"));
        return this;
    }

    public PainInjuryRunWorkout moveRatingPainLevel(int painLevel) {
        String valueNow = $(SLIDER_VALUE_NOW_LEVEL).getText();
        Integer defaultPain = StringUtils.getIntFromString(valueNow);
        $(SLIDER_VALUE_NOW_LEVEL).click();
        Keys direction;
        if (painLevel > defaultPain) {
            direction = Keys.ARROW_RIGHT;
        } else {
            direction = Keys.ARROW_LEFT;
        }
        int interval = painLevel - defaultPain;
        for (int i = 0; i < interval; i++) {
            $(SLIDER_VALUE_NOW_LEVEL).sendKeys(direction);
        }
        return this;
    }

    public PainInjuryRunWorkout moveRatingPainDuration(int painDuration) {
        String valueNow = $(SLIDER_VALUE_NOW_DURATION).getText();
        Integer defaultPain = StringUtils.getIntFromString(valueNow);
        $(SLIDER_VALUE_NOW_DURATION).click();
        Keys direction;
        if (painDuration > defaultPain) {
            direction = Keys.ARROW_RIGHT;
        } else {
            direction = Keys.ARROW_LEFT;
        }
        int interval = painDuration - defaultPain;
        for (int i = 0; i < interval; i++) {
            $(SLIDER_VALUE_NOW_DURATION).sendKeys(direction);
        }
        return this;
    }

    public PainInjuryRunWorkout moveRatingPainTrend(int painTrend) {
        String valueNow = $(SLIDER_VALUE_NOW_TREND).getText();
        Integer defaultPain = StringUtils.getIntFromString(valueNow);
        $(SLIDER_VALUE_NOW_TREND).click();
        Keys direction;
        if (painTrend > defaultPain) {
            direction = Keys.ARROW_RIGHT;
        } else {
            direction = Keys.ARROW_LEFT;
        }
        int interval = painTrend - defaultPain;
        for (int i = 0; i < interval; i++) {
            $(SLIDER_VALUE_NOW_TREND).sendKeys(direction);
        }
        return this;
    }

    public PainInjuryRunWorkout enterPainNotesText() {
        log.info("Enter {} into description", "This pain has been bothering me for two days");
        $(PAIN_NOTES).val("This pain has been bothering me for two days");
        return this;
    }

    public PainInjuryRunWorkout clickAddButton() {
        $(ADD_BUTTON).click();
        return this;
    }

    public void checkPainLevel() {
        $(CHECK_PAIN_LEVEL).shouldHave(visible);
    }
}
