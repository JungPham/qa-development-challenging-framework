package businessLoans.pages;

import org.openqa.selenium.interactions.Actions;
import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class MobileOTPVerificationPage extends BasePage {

    private final WebElementLocator
        otpField = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'%s')]//div[contains(@class,'%s')]");

    public void enterPhoneOTP(String OTP) throws InterruptedException {
        Thread.sleep(10000);
        waitForClickableWebElement(driver, otpField.Format("verify-otp-form", "digit-input__input"), Constants.PAGELOADTIMEOUT);
        Actions action = new Actions(driver);
        action.sendKeys(OTP).perform();
    }
}
