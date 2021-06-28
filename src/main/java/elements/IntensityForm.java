package elements;

import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static constants.WorkoutCalculatorsConstants.*;

@Log4j2
public class IntensityForm {

    public IntensityForm selectEvent(String event) {
        $(EVENT).selectRadio(event);
        return this;
    }

    public IntensityForm clickCalculatePaceButton() {
        $(CALCULATE_PACES_BUTTON).click();
        return this;
    }

    public void checkIntensityForm(){
        $(byText(CHECK_INTENSITY_FORM)).shouldBe(visible).should(text("Your Workout Paces"));
    }
}
