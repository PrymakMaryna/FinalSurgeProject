package element_context_menu;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.CalendarPageConstants.*;

public class PrintRunWorkout {

    public PrintRunWorkout clickPrintWorkoutLink() {
        $(PRINT_WORKOUT_BUTTON).click();
        return this;
    }

    public PrintRunWorkout checkPrintForm() {
        String titlePrintPage = switchTo().window(1).getTitle().concat(TITLE_PRINT_PAGE);
        System.out.println(titlePrintPage);
        return this;
    }

    public void checkBackToCalendarPage() {
        String titleCalendarPage = switchTo().window(0).getTitle().concat(TITLE_CALENDAR_PAGE);
        System.out.println(titleCalendarPage);
    }

}
