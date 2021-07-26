package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class RoleSelectorPage extends BasePage {

    private final WebElementLocator
        roleName = new WebElementLocator(Locator.Xpath, "//div[contains(text(), '%s')]");

    public void selectRole() throws InterruptedException {
        Thread.sleep(3000);
        waitForClickableWebElement(driver, roleName.Format("I am a registered director of the company"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, roleName.Format("I am a registered director of the company")).click();
    }
}
