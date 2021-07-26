package businessLoans.steps;

import businessLoans.pages.RegisterPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import shared.CommonPage;
import utils.TestContext;

public class RegisterSteps extends BaseSteps {

    private final RegisterPage registerPage = new RegisterPage();

    public RegisterSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User enter $fullName as full Name as per ID")
    public void enterFullName(String fullName){
        registerPage.enterFullName(fullName);
    }

    @When("Generate a random number used for email address and mobile number")
    public void generateRandomEmailAddress(){
        String email = registerPage.generateRandomEmail();
        String phone = registerPage.generateRandomPhone();
        testContext.setGeneratedEmailAddress(email);
        testContext.setGeneratedMobileNumber(phone);
    }

    @When("User enter a random email address")
    public void enterEmailAddress(){
        String emailAddress = testContext.getGeneratedEmailAddress();
        registerPage.enterEmailAddress(emailAddress);
    }

    @When("User enter a random mobile number")
    public void enterPhone(){
        String phoneNumber = testContext.getGeneratedMobileNumber();
        registerPage.enterMobilePhone(phoneNumber);
    }

    @When("User click on Where did you hear about us dropdown")
    public void clickOnWhereDidYouHearField(){
        registerPage.clickOnWhereDidYouHearField();
    }

    @When("User select $channel as Where did you hear about us")
    public void selectWhereDidYouHearField(String channel){
        registerPage.selectWhereDidYouHearField(channel);
    }

    @When("User check read and agree Policy checkbox")
    public void checkReadAndAgreePolicy(){
        registerPage.clickOnCheckbox();
    }
    //end region
}