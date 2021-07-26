package businessLoans.steps;

import businessLoans.pages.BusinessRelationshipPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class BusinessRelationshipStep extends BaseSteps {

    private final BusinessRelationshipPage businessRelationshipPage = new BusinessRelationshipPage();

    public BusinessRelationshipStep(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User select $option for company directors or shareholders qualify as Politically Exposed Person (PEP), close family member or close associate of a PEP")
    public void selectOptionForFirstQuestion(String option){
        businessRelationshipPage.selectYesOptionForFirstQuestion(option);
    }

    @When("User select $option for company have corporate shareholders with more than 10% ordinary shares")
    public void selectOptionForSecondQuestion(String option){
        businessRelationshipPage.selectNoOptionForSecondQuestion(option);
    }
    //end Region
}
