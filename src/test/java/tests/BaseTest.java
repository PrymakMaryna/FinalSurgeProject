package tests;

import com.codeborne.selenide.Configuration;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.*;
import utils.Property;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
@Listeners(TestListener.class)
public class BaseTest {

    public LoginSteps loginSteps = new LoginSteps();
    public WorkoutCalculatorsSteps workoutCalculatorsSteps = new WorkoutCalculatorsSteps();
    public CalendarSteps calendarSteps = new CalendarSteps();
    public RunSteps runSteps = new RunSteps();
    public ReportStatisticsSteps reportStatisticsSteps = new ReportStatisticsSteps();
    public PrintWorkoutsSteps printWorkoutsSteps = new PrintWorkoutsSteps();
    public DashboardSteps dashboardSteps = new DashboardSteps();

    @BeforeMethod
    public void setup() {
        log.info("Initialization of the configuration");
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.clickViaJs = true;
        Configuration.baseUrl = Property.getSystemProperty("baseUrl");
        Configuration.pageLoadTimeout = 50000;
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        log.info("Close of the browser");
        getWebDriver().close();
    }
}

