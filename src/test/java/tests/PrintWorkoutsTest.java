package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("PrintWorkoutsTest")
public class PrintWorkoutsTest extends ValidAuthentication {

    @Test(description = "Printing of the run workout")
    @Severity(value = SeverityLevel.CRITICAL)
    public void printRunWorkout() {
        printWorkoutsSteps
                .receivePrint();
    }
}
