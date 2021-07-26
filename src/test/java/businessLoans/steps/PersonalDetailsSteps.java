package businessLoans.steps;

import businessLoans.pages.PersonalDetailsPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class PersonalDetailsSteps extends BaseSteps {

    private final PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();

    public PersonalDetailsSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User click on Date of birth on Personal Details Page")
    public void clickOnDateOfBirth(){
        personalDetailsPage.clickOnDateOfBirth();
    }

    @When("User select any Date of birth")
    public void selectDateOfBirth() throws InterruptedException {
        personalDetailsPage.selectYear();
        personalDetailsPage.selectDay();
    }

    @When("User select $nationality as Nationality")
    public void selectNationality(String nationality){
        personalDetailsPage.selectNationality(nationality);
    }

    @When("User select $gender as Gender")
    public void selectGender(String gender){
        personalDetailsPage.selectGender(gender);
    }

    @When("User click on Submit button")
    public void clickOnSubmitButton() throws InterruptedException {
        personalDetailsPage.clickOnSubmitButton();
    }
    //end Region
}
