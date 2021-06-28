package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("DashboardTest")
public class DashboardTest extends ValidAuthentication {

    @Test(description = "Viewing of the training volume")
    @Severity(value = SeverityLevel.CRITICAL)
    public void viewTrainingVolume() {
        dashboardSteps
                .viewTrainingVolume();
    }
}
