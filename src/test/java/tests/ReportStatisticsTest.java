package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("ReportStatisticsTest")
public class ReportStatisticsTest extends ValidAuthentication {

    @Test(description = "Filling Report form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void fillingReportForm() {
        reportStatisticsSteps
                .receiveReport();
    }
}
