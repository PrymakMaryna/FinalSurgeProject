package element_context_menu;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchFrameException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static constants.CalendarPageConstants.*;

@Log4j2
public class CommentsRunWorkout {

    public CommentsRunWorkout clickCommentsLink() {
        $(COMMENTS_LINK).click();
        log.info("Frame {} is loaded", "WorkoutCommentsiFrame");
        try {
            switchTo().frame("WorkoutCommentsiFrame");
        } catch (NoSuchFrameException ex) {
            System.out.println("Frame doesn't exist.  Continuing anyways.");
        }
        return this;
    }

    public CommentsRunWorkout enterCommentsDescription() {
        log.info("Enter {} into description", "My text");
        $(COMMENTS_DESCRIPTION).val("My text");
        return this;
    }

    public CommentsRunWorkout clickAddCommentButton() {
        $(ADD_COMMENT_BUTTON).click();
        $(CHECK_COMMENT).shouldBe(visible).should((text("My text")));
        return this;
    }

    public CommentsRunWorkout deleteComment() {
        log.info("Delete comment");
        $(DELETE_COMMENT).click();
        $(CONFIRMATION_DELETE_COMMENT).click();
        return this;
    }

    public void checkDeleteComment() {
        $(CHECK_COMMENT).shouldNotBe(visible);
    }
}
