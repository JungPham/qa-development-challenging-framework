package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.getElement;
import static utils.SearchContextExtensions.waitForClickableWebElement;

public class IdentifyViewPage extends BasePage {

    private final WebElementLocator
        option = new WebElementLocator(Locator.Xpath, "//div[text()='%s']");

    public void selectIdentifyMethod(String identifyMethod){
        waitForClickableWebElement(driver, option.Format("Identity documents"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, option.Format("Identity documents")).click();
    }
}
