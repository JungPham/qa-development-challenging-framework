package businessLoans.steps;

import businessLoans.pages.MobileOTPVerificationPage;
import common.steps.BaseSteps;
import org.jbehave.core.annotations.When;
import utils.TestContext;

public class MobileOTPVerificationSteps extends BaseSteps {

    private final MobileOTPVerificationPage mobileOTPVerificationPage = new MobileOTPVerificationPage();

    public MobileOTPVerificationSteps(TestContext testContext) {
        super(testContext);
    }

    @When("User enter fixed OTP $OTP for phone on Mobile OTP Verification Page")
    public void enterPhoneOTP(String OTP) throws InterruptedException {
        mobileOTPVerificationPage.enterPhoneOTP(OTP);
    }
}
