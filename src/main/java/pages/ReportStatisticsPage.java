package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constants.ReportStatisticsConstants.*;

@Log4j2
public class ReportStatisticsPage extends BasePage {

    public ReportStatisticsPage clickReportButton() {
        $(REPORT_STATISTICS_BUTTON).click();
        $(VIEW_REPORT).shouldBe(Condition.visible);
        return this;
    }

    public ReportStatisticsPage clickIconCalendar() {
        $(ICON_CALENDAR).click();
        return this;
    }

    public ReportStatisticsPage enterStartDayCalendar() {
        $(DAY_CALENDAR).val("1/5/2021").click();
        return this;
    }

    public ReportStatisticsPage selectActivityType() {
        new Select($(ACTIVITY_TYPE)).selectByVisibleText(DROPDOWN_ITEM);
        return this;
    }

    public ReportStatisticsPage selectReportView() {
        $(REPORT_VIEW).selectRadio("4");
        return this;
    }

    public ReportStatisticsPage clickViewReport() {
        $(VIEW_REPORT).click();
        return this;
    }

    public void checkContentReport() {
        $(byText(CHECK_CONTENT_REPORT)).shouldBe(Condition.visible);
    }

    @Override
    public BasePage openPage() {
        log.info("Opening {} page", REPORT_STATISTICS_URN);
        open(REPORT_STATISTICS_URN);
        isComponentLoaded();
        return this;
    }

    @Override
    public void isComponentLoaded() {
        log.info("Loading {} component", VIEW_REPORT);
        $(VIEW_REPORT).shouldBe(Condition.visible);
    }
}
