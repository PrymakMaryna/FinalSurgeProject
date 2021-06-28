package constants;

import org.openqa.selenium.By;

public class CalendarPageConstants {

    public static final String CALENDAR_PAGE_URN = "https://log.finalsurge.com/Calendar.cshtml";
    public static final String FULL_ADD_BUTTON = "#FullAddBtn";
    public static final String DAY_CONTENT = ".fc-event-activity-title";
    public static final String VIEW_LINK = ".full-view";
    public static final String CHECK_VIEW_RUN = ".w-box-content";
    public static final String UPDATE_LINK = ".full-edit";
    public static final String UPDATE_WORKOUT_BUTTON = "#saveButton";
    public static final String WORKOUT_NAME = "#Name";
    public static final String CHECK_UPDATED_RUN = "[style='clear: both; padding-top: 10px;']";
    public static final String COMMENTS_LINK = ".quick-comment";
    public static final String COMMENTS_DESCRIPTION = "#CommentDesc";
    public static final String ADD_COMMENT_BUTTON = "#saveButtonComment";
    public static final String CHECK_COMMENT = ".ch-content";
    public static final String DELETE_COMMENT = ".icon-trash";
    public static final By CONFIRMATION_DELETE_COMMENT = By.xpath("//a[contains(text(),'OK')]");
    public static final String UPLOAD_DATA_LINK = "li:nth-child(4) > .quick-upload";
    public static final String UPLOAD_FILE_INPUT = "#TCXFile";
    public static final String MY_FILE_PATH = "src/test/resources/My file.txt";
    public static final String UPLOAD_BUTTON = "#saveButton";
    public static final String ALERT_MESSAGE_INVALID_FILE = ".alert";
    public static final String CLOSE_ALERT = ".close";
    public static final String ALERT_MESSAGE_EMPTY_FILE = ".error";
    public static final String DATE = "#WorkoutDate";
    public static final String MY_EVENT = "[data-title='My run is updated']";
    public static final String CONTAINER = "[data-day='15']";
    public static final String COPY_LINK = ".quick-copy";
    public static final String CHECK_COPY_HEADER = "#WorkoutAddHeader";
    public static final String COPY_WORKOUT_BUTTON = "[value='Copy Workout']";
    public static final String CHECK_COPY_WORKOUT = "[data-date='6/6/2021']";
    public static final String DELETE_WORKOUT = ".quick-delete";
    public static final String APPROVE_OK_BUTTON = "[data-handler='1']";
    public static final String CHECK_DELETE_WORKOUT = ".fc-event-workouttag";
    public static final String PRINT_WORKOUT_BUTTON = ".quick-print";
    public static final String TITLE_PRINT_PAGE = "Final Surge - Print Workout";
    public static final String TITLE_CALENDAR_PAGE = "Final Surge - Training Calendar";
}
