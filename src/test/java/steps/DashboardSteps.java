package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import pages.DashboardPage;

@Log4j2
public class DashboardSteps {

    DashboardPage dashboardPage = new DashboardPage();

    @Step("Viewing of the training volume")
    public void viewTrainingVolume() {
        dashboardPage.openPage();
        log.info("Showing of the progress working");
        dashboardPage.progressShowWorkingDuration()
                .checkShowDurationTitle()
                .clickProgressWorkingDistance()
                .checkShowDistanceTitle();
    }
}
