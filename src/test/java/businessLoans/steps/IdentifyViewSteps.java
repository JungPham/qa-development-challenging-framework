package businessLoans.steps;

import businessLoans.pages.IdentifyViewPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class IdentifyViewSteps extends BaseSteps {

    IdentifyViewPage indentifyViewPage = new IdentifyViewPage();

    public IdentifyViewSteps(TestContext testContext) {
        super(testContext);
    }

    //region When
    @When("User select $identifyMethod as Please be ready to provide the following documents for identity verification")
    public void selectIdentifyMethod(String identifyMethod){
        indentifyViewPage.selectIdentifyMethod(identifyMethod);
    }
    //end Region
}
