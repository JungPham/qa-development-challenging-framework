package businessLoans.steps;

import businessLoans.pages.EmailOTPVerificationPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class EmailOTPVerificationStep extends BaseSteps {

    private final EmailOTPVerificationPage emailOTPVerificationPage = new EmailOTPVerificationPage();

    public EmailOTPVerificationStep(TestContext testContext) {
        super(testContext);
    }

    @When("User enter fixed OTP $OTP for email on Email OTP Verification Page")
    public void enterEmailOTP(String OTP) throws InterruptedException {
        emailOTPVerificationPage.enterEmailOTP(OTP);
    }
}
