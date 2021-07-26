package common.steps;

import org.jbehave.core.annotations.When;
import shared.LoginPage;
import utils.TestContext;

public class LoginSteps extends BaseSteps{

    private final LoginPage loginPage = new LoginPage();

    public LoginSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User click on Register button on Login Page")
    public void clickOnRegister(){
        loginPage.clickRegisterLinkText();
    }
    //end region
}
