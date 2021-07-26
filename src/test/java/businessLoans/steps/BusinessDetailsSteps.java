package businessLoans.steps;

import businessLoans.pages.BusinessDetailsPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class BusinessDetailsSteps extends BaseSteps {

    private final BusinessDetailsPage businessDetailsPage = new BusinessDetailsPage();

    public BusinessDetailsSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User enter $businessLegalName as Business legal name on Business Details Page")
    public void enterBusinessLegalName(String businessLegalName){
        businessDetailsPage.enterBusinessLegalName(businessLegalName);
    }

    @When("User select $entityCategory as Entity category")
    public void selectEntityCategory(String entityCategory) throws InterruptedException {
        businessDetailsPage.selectEntityCategory(entityCategory);
    }

    @When("User select $entityCategory as Entity type")
    public void selectEntityType(String entityType) throws InterruptedException {
        businessDetailsPage.selectEntityType(entityType);
    }

    @When("Generate a random Business number")
    public void generateRandomBusinessNumber(){
        String randomBusinessNumber = businessDetailsPage.generatedBusinessUENNumber();
        testContext.setGeneratedBusinessUENNumber(randomBusinessNumber);
    }

    @When("User enter a random Business registration number (UEN)")
    public void selectBusinessUENNumber(){
        String businessUENNumber = testContext.getGeneratedBusinessUENNumber();
        businessDetailsPage.selectBusinessRegistrationNumber(businessUENNumber);
    }

    @When("User select $industry as Industry")
    public void selectIndustry(String industry){
        businessDetailsPage.selectIndustry(industry);
    }

    @When("User select $subIndustry as Sub-Industry")
    public void selectSubIndustry(String subIndustry){
        businessDetailsPage.selectSubIndustry(subIndustry);
    }
    //end Region
}
