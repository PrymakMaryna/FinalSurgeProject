package elements;

import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static constants.WorkoutCalculatorsConstants.*;

public class HunsonsForm {

    public HunsonsForm clickHunsonsButton() {
        $(HUNSONS_BUTTON).click();
        return this;
    }

    public HunsonsForm selectDistanceHunsons(String distanceSelect, String distanceManual, String distanceType) {
        if (distanceSelect != null) {
            new Select($(HANSONS_DISTANCE)).selectByVisibleText(distanceSelect);
        } else {
            $(DISTANCE_MANUAL).val(distanceManual);
            new Select($(DISTANCE_TYPE)).selectByVisibleText(distanceType);
        }
        return this;
    }

    public HunsonsForm selectTemperature(String temperatureManual, String temperatureType) {
        $(TEMPERATURE_MANUAL).val(temperatureManual);
        new Select($(TEMPERATURE_TYPE)).selectByVisibleText(temperatureType);
        return this;
    }

    public HunsonsForm selectHumidity(String humidity) {
        $(HUMIDITY).val(humidity);
        return this;
    }

    public HunsonsForm selectSpeed(String windSpeedManual, String windSpeedTyp) {
        $(SPEED_MANUAL).val(windSpeedManual);
        new Select($(SPEED_TYPE)).selectByVisibleText(windSpeedTyp);
        return this;
    }

    public HunsonsForm clickCalculatePacesButton() {
        $(CALCULATE_PACES_BUTTON).click();
        return this;
    }

    public void checkHunsonsForm() {
        $(byText(CHECK_HUNSONS_FORM)).shouldBe(visible).should(text("Recent Race Information"));
    }

}
