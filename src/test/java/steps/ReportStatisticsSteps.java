package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import pages.ReportStatisticsPage;

@Log4j2
public class ReportStatisticsSteps {

    ReportStatisticsPage reportStatisticsPage = new ReportStatisticsPage();

    @Step("Choosing of the date for the report")
    public void receiveReport() {
        reportStatisticsPage.openPage();
        log.info("Choosing of the date for the report");
        reportStatisticsPage.clickReportButton()
                .clickIconCalendar()
                .enterStartDayCalendar()
                .selectActivityType()
                .selectReportView()
                .clickViewReport()
                .checkContentReport();
    }

}
