package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import pages.LoginPage;

@Log4j2
public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Step("Authentication with valid date")
    public void validAuthentication() {
        log.info("Authentication with valid date");
        loginPage.openPage()
                .inputValidEmail()
                .inputValidPassword()
                .clickLoginButton()
                .checkSuccessAuthentication();
    }

    @Step("Authentication with empty password")
    public void enterEmptyPassword() {
        log.info("Authentication with empty password");
        loginPage.openPage()
                .inputValidEmail()
                .inputEmptyPassword()
                .clickLoginButton()
                .checkMessageEmptyPassword();
    }

    @Step("Authentication with empty email")
    public void enterEmptyEmail() {
        log.info("Authentication with empty email");
        loginPage.openPage()
                .inputEmptyEmail()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageEmptyEmail();
    }

    @Step("Authentication with empty email and with empty password")
    public void enterEmptyEmailAndEmptyPassword() {
        log.info("Authentication with empty email and with empty password");
        loginPage.openPage()
                .inputEmptyEmail()
                .inputEmptyPassword()
                .clickLoginButton()
                .checkMessageEmptyEmail()
                .checkMessageEmptyPassword();
    }

    @Step("Authentication with invalid password")
    public void enterInvalidPassword() {
        log.info("Authentication with invalid password");
        loginPage.openPage()
                .inputValidEmail()
                .inputInvalidPassword()
                .clickLoginButton()
                .checkMessageInvalidPassword();
    }

    @Step("Authentication with invalid email")
    public void enterInvalidEmail() {
        log.info("Authentication with invalid email");
        loginPage.openPage()
                .inputInvalidEmail()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with invalid email and with invalid password")
    public void enterInvalidEmailAndInvalidPassword() {
        log.info("Authentication with invalid email and with invalid password");
        loginPage.openPage()
                .inputInvalidEmail()
                .inputInvalidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with invalid email with script")
    public void enterInvalidEmailScript() {
        log.info("Authentication with invalid email with script");
        loginPage.openPage()
                .inputInvalidEmailScript()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with invalid email with html tag")
    public void enterInvalidEmailHTMLTag() {
        log.info("Authentication with invalid email with html tag");
        loginPage.openPage()
                .inputInvalidEmailHTMLTag()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with invalid email with different symbols")
    public void enterInvalidEmailDifferentSymbols() {
        log.info("Authentication with invalid email with different symbols");
        loginPage.openPage()
                .inputInvalidEmailDifferentSymbols()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with invalid email with several whitespaces")
    public void enterInvalidEmailWithSeveralWhiteSpaces() {
        log.info("Authentication with invalid email with several whitespaces");
        loginPage.openPage()
                .inputInvalidEmailWithSeveralWhiteSpaces()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageEmptyEmail();
    }

    @Step("Authentication with at first whitespaces and correct email then")
    public void enterWhiteSpacesAndCorrectEmail() {
        log.info("Authentication with at first whitespaces and correct email then");
        loginPage.openPage()
                .inputWhiteSpacesAndCorrectEmail()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with at first correct email and several whitespaces then")
    public void enterCorrectEmailAndSeveralWhiteSpaces() {
        log.info("Authentication with at first correct email and several whitespaces then");
        loginPage.openPage()
                .inputCorrectEmailAndSeveralWhiteSpaces()
                .inputValidPassword()
                .clickLoginButton()
                .checkMessageInvalidEmail();
    }

    @Step("Authentication with password with different case letters")
    public void enterPasswordWithDifferentCaseLetters() {
        log.info("Authentication with password with different case letters");
        loginPage.openPage()
                .inputValidEmail()
                .inputPasswordWithDifferentCaseLetters()
                .clickLoginButton()
                .checkMessageInvalidPassword();
    }

    @Step("Executing of the logout")
    public void clickLogout() {
        log.info("Executing of the logout");
        loginPage.openPage()
                .inputValidEmail()
                .inputValidPassword()
                .clickLoginButton()
                .checkSuccessAuthentication()
                .clickLogout()
                .checkLogout();
    }

    @Step("Clicking on the forgot button")
    public void clickForgotPassword() {
        log.info("Clicking on the forgot button");
        loginPage.openPage()
                .clickForgotPasswordButton()
                .inputEmailForNewPassword()
                .clickRequestNewPasswordButton()
                .checkMessagePasswordReset();
    }

}
