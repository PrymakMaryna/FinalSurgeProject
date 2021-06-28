package element_context_menu;

import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static constants.CalendarPageConstants.CONTAINER;
import static constants.CalendarPageConstants.MY_EVENT;

@Log4j2
public class MoveRaceRunWorkout {

    public void moveRace() {
        log.info("Moving race run workout");
        actions().clickAndHold($(MY_EVENT)).build().perform();
        actions().moveToElement($(CONTAINER)).release($(CONTAINER)).build().perform();
    }
}
