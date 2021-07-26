package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;
import static utils.SearchContextExtensions.waitForClickableWebElement;

public class BusinessDetailsEditPage extends BasePage {

    private final WebElementLocator
        fields = new WebElementLocator(Locator.Xpath, "//div[contains(text(),'%s')]/parent::div/following-sibling::label"),
        dropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label') and text()='%s']");

    public void enterBusinessActivity(String businessActivity){
        waitForVisibleWebElement(driver, fields.Format("Business activity"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, fields.Format("Business activity")).sendKeys(businessActivity);
    }

    public void enterDetailedProductServices(String detailedProductService){
        waitForVisibleWebElement(driver, fields.Format("Tell us a detailed example of product/services you provide"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, fields.Format("Tell us a detailed example of product/services you provide")).sendKeys(detailedProductService);
    }

    public void enterLiveBusinessWebsite(String website){
        waitForVisibleWebElement(driver, fields.Format("Live business website"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, fields.Format("Live business website")).sendKeys(website);
    }

    public void selectNumberOfEmployees(String number) {
        waitForClickableWebElement(driver, fields.Format("Number of employees"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, fields.Format("Number of employees")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(number), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, dropdownOptions.Format(number)).click();
    }

    public void selectAnnualTurnOver(String annualTurnover) throws InterruptedException {
        waitForClickableWebElement(driver, fields.Format("Annual turnover"), Constants.LONG_TIMEOUT);
        getElement(driver, fields.Format("Annual turnover")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(annualTurnover), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(annualTurnover)).click();
    }
}
