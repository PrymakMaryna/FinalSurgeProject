package element_context_menu;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constants.CalendarPageConstants.*;

public class DeleteRunWorkout {

    public DeleteRunWorkout clickDeleteLink() {
        $(DELETE_WORKOUT).click();
        return this;
    }

    public DeleteRunWorkout approveOkButton() {
        $(APPROVE_OK_BUTTON).click();
        return this;
    }

    public void checkDeleteWorkout() {
        $$(CHECK_DELETE_WORKOUT).shouldHave(size(1));
    }

}
