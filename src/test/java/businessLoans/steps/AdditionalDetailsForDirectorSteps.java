package businessLoans.steps;

import businessLoans.pages.AdditionalDetailsForDirectorPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class AdditionalDetailsForDirectorSteps extends BaseSteps {

    private final AdditionalDetailsForDirectorPage additionalDetailsForDirectorPage = new AdditionalDetailsForDirectorPage();

    public AdditionalDetailsForDirectorSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User click on What solutions are you looking for")
    public void clickOnSolutions() throws InterruptedException {
        additionalDetailsForDirectorPage.clickOnWhatSolutionsField();
    }

    @When("User select $solution as What solutions are you looking for")
    public void selectSolutionsOption(String solution){
        additionalDetailsForDirectorPage.selectWhatSoutionsField(solution);
    }
    //end Region
}
