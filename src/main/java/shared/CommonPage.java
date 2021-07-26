package shared;

import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.getElement;
import static utils.SearchContextExtensions.waitForClickableWebElement;

public class CommonPage extends BasePage{

    private final WebElementLocator
        button = new WebElementLocator(Locator.Xpath, "//span[contains(@class,'block') and text()='%s']");

    public void clickOnContinueButton() throws InterruptedException {
        waitForClickableWebElement(driver, button.Format("Continue"), Constants.PAGELOADTIMEOUT);
        getElement(driver, button.Format("Continue")).click();
    }
}
