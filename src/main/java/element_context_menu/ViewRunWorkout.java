package element_context_menu;

import model.objectFullAdd.Run;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static constants.CalendarPageConstants.CHECK_VIEW_RUN;
import static constants.CalendarPageConstants.VIEW_LINK;

public class ViewRunWorkout {

    public ViewRunWorkout clickViewLink() {
        $(VIEW_LINK).click();
        return this;
    }

    public void checkWorkoutName(Run run){
        $(CHECK_VIEW_RUN).shouldBe(visible).should((text(run.getWorkoutName())));
    }
}
