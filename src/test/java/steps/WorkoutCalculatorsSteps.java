package steps;

import elements.*;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.objectsWorkoutCalculators.HunsonsModel;
import model.objectsWorkoutCalculators.IntensityModel;
import model.objectsWorkoutCalculators.McMillanModel;
import model.objectsWorkoutCalculators.TinmanModel;

@Log4j2
public class WorkoutCalculatorsSteps {

    WorkoutCalculatorsForm workoutCalculatorsForm = new WorkoutCalculatorsForm();
    IntensityForm intensityForm = new IntensityForm();
    HunsonsForm hunsonsForm = new HunsonsForm();
    McMillanForm mcMillanForm = new McMillanForm();
    TinmanForm tinmanForm = new TinmanForm();

    @Step("Calculating of the intensity calculator form")
    public void calculateIntensityForm(IntensityModel intensityModel) {
        log.info("Calculating {} form", intensityModel);
        workoutCalculatorsForm.openOfTheWorkoutCalculatorsForm();
        intensityForm.selectEvent(intensityModel.getEvent());
        workoutCalculatorsForm.selectTime(intensityModel.getHours(), intensityModel.getMinutes(), intensityModel.getSeconds());
        intensityForm.clickCalculatePaceButton()
                .checkIntensityForm();
    }

    @Step("Calculating of the hunsons calculator form")
    public void calculateHunsonsForm(HunsonsModel hunsonsModel) {
        log.info("Calculating {} form", hunsonsModel);
        workoutCalculatorsForm.openOfTheWorkoutCalculatorsForm();
        hunsonsForm.clickHunsonsButton()
                .selectDistanceHunsons(hunsonsModel.getDistanceSelect(), hunsonsModel.getDistanceManual(), hunsonsModel.getDistanceType());
        workoutCalculatorsForm.selectTime(hunsonsModel.getHours(), hunsonsModel.getMinutes(), hunsonsModel.getSeconds());
        hunsonsForm.selectTemperature(hunsonsModel.getTemperatureManual(), hunsonsModel.getTemperatureType())
                .selectHumidity(hunsonsModel.getHumidity())
                .selectSpeed(hunsonsModel.getWindSpeedManual(), hunsonsModel.getWindSpeedType())
                .clickCalculatePacesButton()
                .checkHunsonsForm();
    }

    @Step("Calculating of the mcMillan calculator form")
    public void calculateMcMillanForm(McMillanModel mcMillanModel) {
        log.info("Calculating {} form", mcMillanModel);
        workoutCalculatorsForm.openOfTheWorkoutCalculatorsForm();
        mcMillanForm.clickMcMillanButton()
                .selectDistanceMcMillan(mcMillanModel.getRaceDistance());
        workoutCalculatorsForm.selectTime(mcMillanModel.getHours(), mcMillanModel.getMinutes(), mcMillanModel.getSeconds());
        mcMillanForm.selectGoalDistanceMcMillan(mcMillanModel.getRaceGoalDistance())
                .selectGoalTime(mcMillanModel.getGoalHours(), mcMillanModel.getGoalMinutes(), mcMillanModel.getGoalSeconds())
                .clickCalculatePacesButton()
                .checkMcMillanForm()
                .clickReCalculateMyPaces();
    }

    @Step("Calculating of the Tinman calculator form")
    public void calculateTinmanForm(TinmanModel tinmanModel) {
        log.info("Calculating {} form", tinmanModel);
        workoutCalculatorsForm.openOfTheWorkoutCalculatorsForm();
        tinmanForm.clickTinmanButton()
                .selectDistanceTinman(tinmanModel.getRaceDistance());
        workoutCalculatorsForm.selectTime(tinmanModel.getHours(), tinmanModel.getMinutes(), tinmanModel.getSeconds());
        tinmanForm.selectGender(tinmanModel.getGender())
                .clickReCalculateMyPaces()
                .checkTinmanForm();
    }
}
