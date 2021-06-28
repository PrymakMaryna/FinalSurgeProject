package tests;

import io.qameta.allure.*;
import model.objectsWorkoutCalculators.HunsonsModel;
import model.objectsWorkoutCalculators.IntensityModel;
import model.objectsWorkoutCalculators.McMillanModel;
import model.objectsWorkoutCalculators.TinmanModel;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("WorkoutCalculatorsTest")
public class WorkoutCalculatorsTest extends ValidAuthentication {

    @Test(description = "Calculating of the intensity calculator form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void calculateIntensityForm() {
        workoutCalculatorsSteps
                .calculateIntensityForm(IntensityModel.builder().build());
    }

    @Test(description = "Calculating of the hunsons calculator form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void calculateHunsonsForm() {
        workoutCalculatorsSteps
                .calculateHunsonsForm(HunsonsModel.builder().build());
    }

    @Test(description = "Calculating of the mcMillan calculator form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void calculateMcMillanForm() {
        workoutCalculatorsSteps
                .calculateMcMillanForm(McMillanModel.builder().build());
    }

    @Test(description = "Calculating of the Tinman calculator form")
    @Severity(value = SeverityLevel.BLOCKER)
    public void calculateTinmanForm() {
        workoutCalculatorsSteps
                .calculateTinmanForm(TinmanModel.builder().build());
    }
}
