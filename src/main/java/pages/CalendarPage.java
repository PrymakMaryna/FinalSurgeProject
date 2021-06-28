package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constants.CalendarPageConstants.*;

@Log4j2
public class CalendarPage extends BasePage {

    public void clickFullAddButton() {
        $(FULL_ADD_BUTTON).click();
    }

    public void clickDayContentMenu() {
        $(DAY_CONTENT).click();
    }

    @Override
    public BasePage openPage() {
        log.info("Opening {} page", CALENDAR_PAGE_URN);
        open(CALENDAR_PAGE_URN);
        isComponentLoaded();
        return this;
    }

    @Override
    public void isComponentLoaded() {
        log.info("Loading {} component", FULL_ADD_BUTTON);
        $(FULL_ADD_BUTTON).shouldBe(Condition.visible);
    }
}
