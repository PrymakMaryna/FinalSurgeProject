package element_context_menu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static constants.CalendarPageConstants.*;

public class UpdateRunWorkout {

    public UpdateRunWorkout clickUpdateLink() {
        $(UPDATE_LINK).click();
        $(WORKOUT_NAME).val("My run is updated");
        return this;
    }

    public UpdateRunWorkout clickUpdateButton() {
        $(UPDATE_WORKOUT_BUTTON).click();
        return this;
    }

    public void checkUpdateRun() {
        $(CHECK_UPDATED_RUN).shouldBe(visible).should((text("My run is updated")));
    }
}
