package steps;

import elements.PrintWorkoutsForm;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static elements.PrintWorkoutsForm.CHECK_CONTENT_PRINT_RUN_WORKOUT;

@Log4j2
public class PrintWorkoutsSteps {

    PrintWorkoutsForm printWorkoutsForm = new PrintWorkoutsForm();

    @Step("Choosing of the day for print")
    public void receivePrint() {
        log.info("Printing {} form", CHECK_CONTENT_PRINT_RUN_WORKOUT);
        printWorkoutsForm.openPrintWorkoutsForm()
                .enterStartingDay()
                .enterEndingDay()
                .clickPrintButton()
                .switchToWindowPrint()
                .checkContentPrintWorkout();
    }
}
