package businessLoans.pages;

import org.openqa.selenium.interactions.Actions;
import shared.BasePage;
import utils.Constants;
import utils.Extensions;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class BusinessDetailsPage extends BasePage {

    private final WebElementLocator
        fields = new WebElementLocator(Locator.Xpath, "//div[contains(text(),'%s')]/parent::div/following-sibling::label"),
        dropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label') and text()='%s']");

    public void enterBusinessLegalName(String businessLegalName){
        waitForVisibleWebElement(driver, fields.Format("Business legal name"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, fields.Format("Business legal name")).sendKeys(businessLegalName);
    }

    public void selectEntityCategory(String entityCategory) throws InterruptedException {
        Thread.sleep(5000);
        waitForClickableWebElement(driver, fields.Format("Entity category"), Constants.LONG_TIMEOUT);
        getElement(driver, fields.Format("Entity category")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(entityCategory), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(entityCategory)).click();
    }

    public void selectEntityType(String entityType) throws InterruptedException {
        waitForClickableWebElement(driver, fields.Format("Entity type"), Constants.LONG_TIMEOUT);
        getElement(driver, fields.Format("Entity type")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(entityType), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(entityType)).click();
    }

    public String generatedBusinessUENNumber(){
        String randomBusinessNumber = Extensions.generateRandomNumber() + Extensions.generateRandomACharater();
        return randomBusinessNumber;
    }

    public void selectBusinessRegistrationNumber(String businessUENNumber){
        waitForVisibleWebElement(driver, fields.Format("Business registration number (UEN)"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, fields.Format("Business registration number (UEN)")).sendKeys(businessUENNumber);
    }

    public void selectIndustry(String industry){
        waitForClickableWebElement(driver, fields.Format("Industry"), Constants.LONG_TIMEOUT);
        getElement(driver, fields.Format("Industry")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(industry), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(industry)).click();
    }

    public void selectSubIndustry(String subIndustry){
        waitForClickableWebElement(driver, fields.Format("Sub-Industry"), Constants.LONG_TIMEOUT);
        getElement(driver, fields.Format("Sub-Industry")).click();
        waitForClickableWebElement(driver, dropdownOptions.Format(subIndustry), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(subIndustry)).click();
    }
}
