package businessLoans.steps;

import businessLoans.pages.RegisterSelectMethodPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class RegisterSelectMethodSteps extends BaseSteps {

    private final RegisterSelectMethodPage registerSelectMethodPage = new RegisterSelectMethodPage();

    public RegisterSelectMethodSteps(TestContext testContext) {
        super(testContext);
    }

    @When("User choose $registrationMethod as a registration method")
    public void chooseRegistrationMethod(String registrationMethod) throws InterruptedException {
        registerSelectMethodPage.clickOnGetStarted(registrationMethod);
    }
}
