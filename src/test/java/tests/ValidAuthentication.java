package tests;

import org.testng.annotations.BeforeMethod;

public class ValidAuthentication extends BaseTest{

    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        loginSteps
                .validAuthentication();
    }

}
