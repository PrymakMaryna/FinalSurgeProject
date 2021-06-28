package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class DashboardPage extends BasePage {

    private static final String DASHBOARD_URN = "https://log.finalsurge.com/Default.cshtml";
    private static final String DASHBOARD_MENU = ".icsw16-home";
    private static final String SHOW_WORKING_SELECT = "#PastDays";
    private static final String CHECK_SHOW_HIGHCHARTS_TITLE = ".highcharts-title";
    private static final String BY_DISTANCE_BUTTON = "#ChartByDistanceBtn";

    public DashboardPage progressShowWorkingDuration(){
        log.info("Viewing of the training duration");
        new Select($(SHOW_WORKING_SELECT)).selectByVisibleText("This Month");
        return this;
    }

    public DashboardPage checkShowDurationTitle(){
        $(CHECK_SHOW_HIGHCHARTS_TITLE).shouldBe(Condition.visible).shouldHave(Condition.text("Duration by Activity"));
        return this;
    }

    public DashboardPage clickProgressWorkingDistance(){
        log.info("Viewing of the training distance");
        $(BY_DISTANCE_BUTTON).click();
        return this;
    }

    public void checkShowDistanceTitle(){
        $(CHECK_SHOW_HIGHCHARTS_TITLE).shouldBe(Condition.visible).shouldHave(Condition.text("Distance by Activity"));
    }

    @Override
    public BasePage openPage() {
        log.info("Opening {} page", DASHBOARD_URN);
        open(DASHBOARD_URN);
        isComponentLoaded();
        return this;
    }

    @Override
    public void isComponentLoaded() {
        log.info("Loading {} component", DASHBOARD_MENU);
        $(DASHBOARD_MENU).shouldBe(Condition.visible);
    }
}
