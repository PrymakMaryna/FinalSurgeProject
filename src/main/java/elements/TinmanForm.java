package elements;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static constants.WorkoutCalculatorsConstants.*;

@Log4j2
public class TinmanForm {

    public TinmanForm clickTinmanButton() {
        $(TINMAN_BUTTON).click();
        return this;
    }

    public TinmanForm selectDistanceTinman(String raceDistance) {
        new Select($(TINMAN_DISTANCE)).selectByVisibleText(raceDistance);
        return this;
    }

    public TinmanForm selectGender(String gender) {
        $(GENDER).selectRadio(gender);
        return this;
    }

    public TinmanForm clickReCalculateMyPaces() {
        $(CALCULATE_PACES_BUTTON).click();
        return this;
    }

    public void checkTinmanForm() {
        $(byText(CHECK_TINMAN_FORM)).shouldBe(visible).should(text("Race Information"));
    }
}
