package pages;

import com.codeborne.selenide.Condition;
import constants.Environment;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static constants.LoginConstants.*;

@Log4j2
public class LoginPage extends BasePage {

    private final String usernameFinalSurge = Environment.VALID_EMAIL;
    private final String passwordFinalSurge = Environment.VALID_PASSWORD;

    public LoginPage inputValidEmail() {
        log.info("Validating {}", usernameFinalSurge);
        $(EMAIL).val(usernameFinalSurge);
        return this;
    }

    public LoginPage inputValidPassword() {
        log.info("Validating {}", passwordFinalSurge);
        $(PASSWORD).val(passwordFinalSurge);
        return this;
    }

    public LoginPage clickLoginButton() {
        $(byText(LOGIN_BUTTON)).click();
        return this;
    }

    public LoginPage checkSuccessAuthentication() {
        $(DASHBOARD_MENU).shouldBe(visible);
        return this;
    }

    public LoginPage inputEmptyPassword() {
        log.info("Please enter a password {}", passwordFinalSurge);
        $(PASSWORD).val();
        return this;
    }

    public void checkMessageEmptyPassword() {
        $(byText(MESSAGE_EMPTY_PASSWORD)).shouldBe(visible);
    }

    public LoginPage inputEmptyEmail() {
        log.info("Please enter your e-mail address {}", usernameFinalSurge);
        $(EMAIL).val();
        return this;
    }

    public LoginPage checkMessageEmptyEmail() {
        $(byText(MESSAGE_EMPTY_EMAIL)).shouldBe(visible);
        return this;
    }

    public LoginPage inputInvalidPassword() {
        log.info("Invalid login credentials. Please try again");
        $(PASSWORD).val(INVALID_PASSWORD);
        return this;
    }

    public void checkMessageInvalidPassword() {
        $(byText(MESSAGE_INVALID_PASSWORD)).shouldBe(visible);
    }

    public LoginPage inputInvalidEmail() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(INVALID_EMAIL);
        return this;
    }

    public void checkMessageInvalidEmail() {
        $(byText(MESSAGE_INVALID_EMAIL)).shouldBe(visible);
    }

    public LoginPage inputInvalidEmailScript() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(INVALID_EMAIL_SCRIPT);
        return this;
    }

    public LoginPage inputInvalidEmailHTMLTag() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(INVALID_EMAIL_HTML_TAG);
        return this;
    }

    public LoginPage inputInvalidEmailDifferentSymbols() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(INVALID_EMAIL_DIFFERENT_SYMBOLS);
        return this;
    }

    public LoginPage inputInvalidEmailWithSeveralWhiteSpaces() {
        log.info("Please enter your e-mail address {}", usernameFinalSurge);
        $(EMAIL).val(INVALID_EMAIL_SEVERAL_WHITESPACES);
        return this;
    }

    public LoginPage inputWhiteSpacesAndCorrectEmail() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(WHITESPACES_AND_CORRECT_EMAIL);
        return this;
    }

    public LoginPage inputCorrectEmailAndSeveralWhiteSpaces() {
        log.info("Please enter a valid email address {}", usernameFinalSurge);
        $(EMAIL).val(CORRECT_EMAIL_AND_WHITESPACES);
        return this;
    }

    public LoginPage inputPasswordWithDifferentCaseLetters() {
        log.info("Invalid login credentials. Please try again.");
        $(PASSWORD).val(PASSWORD_WITH_DIFFERENT_CASE_LETTERS);
        return this;
    }

    public LoginPage clickLogout() {
        $(LOGOUT_BUTTON).click();
        return this;
    }

    public void checkLogout() {
        log.info("Executing of the logout {}", CHECK_LOGOUT);
        $(CHECK_LOGOUT).shouldBe(visible);
    }

    public LoginPage clickForgotPasswordButton() {
        log.info("Receiving of the new password");
        $(FORGOT_PASSWORD_BUTTON).click();
        return this;
    }

    public LoginPage inputEmailForNewPassword(){
        $(EMAIL_FOR_NEW_PASSWORD).val(usernameFinalSurge);
        return this;
    }

    public LoginPage clickRequestNewPasswordButton() {
        $(REQUEST_NEW_PASSWORD_BUTTON).click();
        return this;
    }

    public void checkMessagePasswordReset(){
        $(byText(CHECK_MASSAGE_PASSWORD_RESET)).shouldBe(visible);
    }

    @Override
    public LoginPage openPage() {
        log.info("Opening {} page", LOGIN_PAGE_URN);
        open(LOGIN_PAGE_URN);
        isComponentLoaded();
        return this;
    }

    @Override
    public void isComponentLoaded() {
        log.info("Loading {} component", LOGIN_BUTTON);
        $(byText(LOGIN_BUTTON)).shouldBe(Condition.visible);
    }
}
