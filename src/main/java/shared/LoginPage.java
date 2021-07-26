package shared;

import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;
import static utils.SearchContextExtensions.getElement;

public class LoginPage extends BasePage{

    private final WebElementLocator
        button = new WebElementLocator(Locator.Xpath, "//a[@href='/sg/register']");

    public void clickRegisterLinkText(){
        waitForClickableWebElement(driver, button, Constants.PAGELOADTIMEOUT);
        waitForPageLoaded(driver, Constants.PAGELOADTIMEOUT);
        getElement(driver, button).click();
    }
}
