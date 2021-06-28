package element_context_menu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static constants.CalendarPageConstants.*;

public class CopyRunWorkout {

    public CopyRunWorkout clickCopyLink() {
        $(COPY_LINK).click();
        return this;
    }

    public CopyRunWorkout checkCopyHeader() {
        $(CHECK_COPY_HEADER).shouldHave(text("Workout Quick Copy"));
        return this;
    }

    public CopyRunWorkout enterNewDate(String newDate) {
        $(DATE).val(newDate);
        return this;
    }

    public CopyRunWorkout clickCopyWorkoutButton() {
        $(COPY_WORKOUT_BUTTON).click();
        return this;
    }

    public void checkCopyWorkout() {
        $(CHECK_COPY_WORKOUT).shouldHave(visible);
    }

}
