package businessLoans.steps;

import businessLoans.pages.RoleSelectorPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class RoleSelectorSteps extends BaseSteps {

    private final RoleSelectorPage roleSelectorPage = new RoleSelectorPage();

    public RoleSelectorSteps(TestContext testContext) {
        super(testContext);
    }

    @When("User select I am a registered director of the company on Role Selector Page")
    public void selectRole() throws InterruptedException {
        roleSelectorPage.selectRole();
    }
}
