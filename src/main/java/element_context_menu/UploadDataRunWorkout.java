package element_context_menu;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchFrameException;
import utils.PathFileUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.CalendarPageConstants.*;

@Log4j2
public class UploadDataRunWorkout {

    public UploadDataRunWorkout clickUploadDataLink() {
        $(UPLOAD_DATA_LINK).click();
        log.info("Frame {} is loaded", "WorkoutUploadiFrame");
        try {
            switchTo().frame("WorkoutUploadiFrame");
        } catch (NoSuchFrameException ex) {
            System.out.println("Frame doesn't exist.  Continuing anyways.");
        }
        return this;
    }

    public UploadDataRunWorkout chooseUploadInvalidData() {
        log.info("Uploading of the invalid file");
        $(UPLOAD_FILE_INPUT).val(PathFileUtils.getAbsolutePath(MY_FILE_PATH));
        return this;
    }

    public UploadDataRunWorkout clickUploadDataButton() {
        $(UPLOAD_BUTTON).click();
        return this;
    }

    public UploadDataRunWorkout checkUploadInvalidData() {
        $(ALERT_MESSAGE_INVALID_FILE).shouldHave(text("*You must select a valid .TCX or .FIT file to upload."));
        return this;
    }

    public void closeAlert() {
        $(CLOSE_ALERT).click();
        $(ALERT_MESSAGE_INVALID_FILE).shouldNotBe(visible);
    }

    public void checkUploadEmptyData() {
        log.info("Uploading of the empty file");
        $(ALERT_MESSAGE_EMPTY_FILE).shouldHave(text("This field is required."));
    }
}
