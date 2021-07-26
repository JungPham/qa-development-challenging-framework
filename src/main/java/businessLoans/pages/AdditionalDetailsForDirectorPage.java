package businessLoans.pages;

import org.openqa.selenium.interactions.Actions;
import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class AdditionalDetailsForDirectorPage extends BasePage {

    private final WebElementLocator
        dropdown = new WebElementLocator(Locator.Xpath, "//div[@url='%s']"),
        dropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label ellipsis') and text()='%s']");

    public void clickOnWhatSolutionsField() throws InterruptedException {
        Thread.sleep(5000);
        waitForVisibleWebElement(driver, dropdown.Format("options"), Constants.LONG_TIMEOUT);
        Actions action = new Actions(driver);
        action.click(getElement(driver, dropdown.Format("options"))).build().perform();
    }

    public void selectWhatSoutionsField(String solution){
        waitForClickableWebElement(driver, dropdownOptions.Format(solution), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(solution)).click();
        getElement(driver, dropdown.Format("options")).click();
    }
}
