package businessLoans.steps;

import businessLoans.pages.BusinessDetailsEditPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class BusinessDetailsEditStep extends BaseSteps {

    private final BusinessDetailsEditPage businessDetailsEditPage = new BusinessDetailsEditPage();

    public BusinessDetailsEditStep(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User enter $businessActivities as Business activity on Business Details Edit Page")
    public void enterBusinessActivities(String businessActivities){
        businessDetailsEditPage.enterBusinessActivity(businessActivities);
    }

    @When("User enter $detailedProductService as detailed example of product/services")
    public void enterDetailedProductServices(String detailedProductService){
        businessDetailsEditPage.enterDetailedProductServices(detailedProductService);
    }

    @When("User enter $website as Live business website")
    public void enterLiveBusinessWebsite(String website){
        businessDetailsEditPage.enterLiveBusinessWebsite(website);
    }

    @When("User select $number as Number of employees")
    public void selectNumberOfEmployees(String number) {
        businessDetailsEditPage.selectNumberOfEmployees(number);
    }

    @When("User select $annualTurnover as Annual turnover")
    public void selectAnnualTurnOver(String annualTurnover) throws InterruptedException {
        businessDetailsEditPage.selectAnnualTurnOver(annualTurnover);
    }
    //end Region
}
