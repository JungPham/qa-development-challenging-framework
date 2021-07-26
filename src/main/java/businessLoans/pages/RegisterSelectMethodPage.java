package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.getElement;
import static utils.SearchContextExtensions.waitForClickableWebElement;

public class RegisterSelectMethodPage extends BasePage {

    private final WebElementLocator
        getStartedButton = new WebElementLocator(Locator.Xpath, "//div[contains(text(),'%s')]/parent::div/following-sibling::button");

    public void clickOnGetStarted(String registrationMethod) throws InterruptedException {
//        Thread.sleep(5000);
        waitForClickableWebElement(driver, getStartedButton.Format(registrationMethod), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, getStartedButton.Format(registrationMethod)).click();
    }
}
