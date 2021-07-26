package common.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import shared.BasePage;
import shared.CommonPage;
import shared.LoginPage;
import utils.TestContext;

public class CommonSteps extends BaseSteps{

    private final CommonPage commonPage = new CommonPage();
    private final BasePage basePage = new BasePage();

    public CommonSteps(TestContext testContext) {
        super(testContext);
    }

    //region Given
    @Given("User goes to Url")
    public void userGoesToUrl(){
        basePage.goToUrl();
    }

    //end Region
    @When("User click on Continue button")
    public void clickOnContinueButton() throws InterruptedException {
        commonPage.clickOnContinueButton();
    }

//    //end Region
}
