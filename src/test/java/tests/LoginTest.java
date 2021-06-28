package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

@Owner("Prymak Maryna")
@Epic("Smoke test")
@Feature("LoginTest")
public class LoginTest extends BaseTest {

    @Test(description = "Filling of the login form with valid date")
    @Severity(value = SeverityLevel.BLOCKER)
    public void validAuthentication() {
        loginSteps
                .validAuthentication();
    }

    @Test(description = "Authentication with empty password")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterEmptyPassword() {
        loginSteps
                .enterEmptyPassword();
    }

    @Test(description = "Authentication with empty email")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterEmptyEmail() {
        loginSteps
                .enterEmptyEmail();
    }

    @Test(description = "Authentication with empty email and with empty password")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterEmptyEmailAndEmptyPassword() {
        loginSteps
                .enterEmptyEmailAndEmptyPassword();
    }

    @Test(description = "Authentication with invalid password")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidPassword() {
        loginSteps
                .enterInvalidPassword();
    }

    @Test(description = "Authentication with invalid email")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmail() {
        loginSteps
                .enterInvalidEmail();
    }

    @Test(description = "Authentication with invalid email and with invalid password")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmailAndInvalidPassword() {
        loginSteps
                .enterInvalidEmailAndInvalidPassword();
    }

    @Test(description = "Authentication with invalid email with script")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmailScript() {
        loginSteps
                .enterInvalidEmailScript();
    }

    @Test(description = "Authentication with invalid email with html tag")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmailHTMLTag() {
        loginSteps
                .enterInvalidEmailHTMLTag();
    }

    @Test(description = "Authentication with invalid email with different symbols")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmailDifferentSymbols() {
        loginSteps
                .enterInvalidEmailDifferentSymbols();
    }

    @Test(description = "Authentication with invalid email with several whitespaces")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterInvalidEmailWithSeveralWhiteSpaces() {
        loginSteps
                .enterInvalidEmailWithSeveralWhiteSpaces();
    }

    @Test(description = "Authentication with at first whitespaces and correct email then")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterWhiteSpacesAndCorrectEmail() {
        loginSteps
                .enterWhiteSpacesAndCorrectEmail();
    }

    @Test(description = "Authentication with at first correct email and several whitespaces then")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterCorrectEmailAndSeveralWhiteSpaces() {
        loginSteps
                .enterCorrectEmailAndSeveralWhiteSpaces();
    }

    @Test(description = "Authentication with password with different case letters")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterPasswordWithDifferentCaseLetters() {
        loginSteps
                .enterPasswordWithDifferentCaseLetters();
    }

    @Test(description = "Executing of the logout")
    @Severity(value = SeverityLevel.BLOCKER)
    public void enterLogout() {
        loginSteps
                .clickLogout();
    }

    @Test(description = "Clicking on the forgot button")
    @Severity(value = SeverityLevel.BLOCKER)
    public void clickForgotPassword() {
        loginSteps
                .clickForgotPassword();
    }

}
