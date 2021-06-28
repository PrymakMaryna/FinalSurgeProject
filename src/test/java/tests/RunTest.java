package tests;

import io.qameta.allure.*;
import model.objectFullAdd.Run;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("RunTest")
public class RunTest extends ValidAuthentication {

    @Test(description = "Filling Run form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void fillingRunForm() {
        runSteps
                .createRunWorkout(Run.builder().build());
    }
}
