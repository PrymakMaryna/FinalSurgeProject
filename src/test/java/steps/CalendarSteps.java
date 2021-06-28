package steps;

import element_context_menu.*;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.objectFullAdd.Run;
import pages.CalendarPage;

import static constants.CalendarPageConstants.*;

@Log4j2
public class CalendarSteps {

    CalendarPage calendarPage = new CalendarPage();
    ViewRunWorkout viewRunWorkout = new ViewRunWorkout();
    UpdateRunWorkout updateRunWorkout = new UpdateRunWorkout();
    CommentsRunWorkout commentsRunWorkout = new CommentsRunWorkout();
    UploadDataRunWorkout uploadDataRunWorkout = new UploadDataRunWorkout();
    PainInjuryRunWorkout painInjuryHeadacheRunWorkout = new PainInjuryRunWorkout();
    MoveRaceRunWorkout moveRaceRunWorkout = new MoveRaceRunWorkout();
    CopyRunWorkout copyRunWorkout = new CopyRunWorkout();
    DeleteRunWorkout deleteRunWorkout = new DeleteRunWorkout();
    PrintRunWorkout printRunWorkout = new PrintRunWorkout();

    @Step("Viewing of the run workout")
    public void viewRunWorkout(Run run) {
        calendarPage.clickDayContentMenu();
        log.info("Viewing of the {} form", run);
        viewRunWorkout.clickViewLink()
                .checkWorkoutName(Run.builder().build());
    }

    @Step("Updating of the run workout")
    public void updateRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Updating of the form");
        updateRunWorkout.clickUpdateLink()
                .clickUpdateButton()
                .checkUpdateRun();
    }

    @Step("Adding of the comment to the run workout")
    public void commentsRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Entering {} comments", "My text");
        commentsRunWorkout.clickCommentsLink()
                .enterCommentsDescription()
                .clickAddCommentButton()
                .deleteComment()
                .checkDeleteComment();
    }

    @Step("Uploading of the invalid file to the run workout")
    public void uploadDataWithInvalidFileRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Uploading of the invalid file to the run workout");
        uploadDataRunWorkout.clickUploadDataLink()
                .chooseUploadInvalidData()
                .clickUploadDataButton()
                .checkUploadInvalidData()
                .closeAlert();
    }

    @Step("Uploading of the empty file to the run workout")
    public void uploadDataWithEmptyFileRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Uploading of the empty file to the run workout");
        uploadDataRunWorkout.clickUploadDataLink()
                .clickUploadDataButton()
                .checkUploadEmptyData();
    }

    @Step("Choosing of the type of pane")
    public void painInjuryHeadacheRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Filling of the pain injury headache run workout form");
        painInjuryHeadacheRunWorkout.openOfThePainInjuryFrame()
                .clickHeadacheDot()
                .moveRatingPainLevel(3)
                .moveRatingPainDuration(90)
                .moveRatingPainTrend(1)
                .enterPainNotesText()
                .clickAddButton()
                .checkPainLevel();
    }

    @Step("Moving of the race")
    public void moveRace() {
        moveRaceRunWorkout.moveRace();
    }

    @Step("Coping of the workout")
    public void copyRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Copping of the {} record", CHECK_COPY_WORKOUT);
        copyRunWorkout.clickCopyLink()
                .checkCopyHeader()
                .enterNewDate("6/6/2021")
                .clickCopyWorkoutButton()
                .checkCopyWorkout();
    }

    @Step("Deleting of the workout")
    public void deleteRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Deleting of the {} record", DELETE_WORKOUT);
        deleteRunWorkout.clickDeleteLink()
                .approveOkButton()
                .checkDeleteWorkout();
    }

    @Step("Printing of the workout")
    public void printRunWorkout() {
        calendarPage.clickDayContentMenu();
        log.info("Printing of the {} form", TITLE_PRINT_PAGE);
        printRunWorkout.clickPrintWorkoutLink()
                .checkPrintForm()
                .checkBackToCalendarPage();
    }
}
