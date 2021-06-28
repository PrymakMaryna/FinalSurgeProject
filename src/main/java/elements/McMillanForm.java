package elements;

import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static constants.WorkoutCalculatorsConstants.*;

public class McMillanForm {

    public McMillanForm clickMcMillanButton() {
        $(MCMILLAN_BUTTON).click();
        return this;
    }

    public McMillanForm selectDistanceMcMillan(String raceDistance) {
        new Select($(MCMILLAN_DISTANCE)).selectByVisibleText(raceDistance);
        return this;
    }

    public McMillanForm selectGoalDistanceMcMillan(String raceGoalDistance) {
        new Select($(MCMILLAN_GOAL_DISTANCE)).selectByVisibleText(raceGoalDistance);
        return this;
    }

    public McMillanForm selectGoalTime(String goalHours, String goalMinutes, String goalSeconds) {
        $(String.format(GOAL_TIME_HOURS, goalHours)).val(goalHours);
        $(String.format(GOAL_TIME_MINUTES, goalMinutes)).val(goalMinutes);
        $(String.format(GOAL_TIME_SECONDS, goalSeconds)).val(goalSeconds);
        return this;
    }

    public McMillanForm clickCalculatePacesButton() {
        $(CALCULATE_PACES_BUTTON).click();
        return this;
    }

    public McMillanForm checkMcMillanForm() {
        $(byText(CHECK_MCMILLAN_FORM)).shouldBe(visible).should(text("Training Paces"));
        return this;
    }

    public void clickReCalculateMyPaces() {
        $(RE_CALCULATE_MY_PACES_BUTTON).click();
        $(byText(CHECK_RE_CALCULATE_MY_PACES_BUTTON)).shouldBe(visible).should(text("Enter a recent race time (or estimated time):"));
    }
}
