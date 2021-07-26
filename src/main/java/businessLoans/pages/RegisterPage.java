package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Extensions;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class RegisterPage extends BasePage {

    private final WebElementLocator
        textbox = new WebElementLocator(Locator.Xpath, "//input[@name='%s']"),
        dropdown = new WebElementLocator(Locator.Xpath,"//input[@placeholder='%s']"),
        dropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label') and text()='%s']"),
        checkbox = new WebElementLocator(Locator.Xpath, "//div[@class='%s']");

    public void enterFullName(String fullName){
        waitForVisibleWebElement(driver, textbox.Format("full_name"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, textbox.Format("full_name")).sendKeys(fullName);
    }

    public String generateRandomEmail(){
        String email = Extensions.generateRandomNumber() + "@gmail.com";
        return email;
    }

    public String generateRandomPhone(){
        String phone = Extensions.generateRandomNumber();
        return phone;
    }

    public void enterEmailAddress(String email){
        waitForVisibleWebElement(driver, textbox.Format("email"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, textbox.Format("email")).sendKeys(email);
    }

    public void enterMobilePhone(String phone){
        waitForVisibleWebElement(driver, textbox.Format("phone"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, textbox.Format("phone")).sendKeys(phone);
    }

    public void clickOnWhereDidYouHearField(){
        waitForClickableWebElement(driver, dropdown.Format("Type to Search or Select any of the following"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdown.Format("Type to Search or Select any of the following")).click();
    }

    public void selectWhereDidYouHearField(String channel){
        waitForClickableWebElement(driver, dropdownOptions.Format(channel), Constants.MEDIUM_TIMEOUT);
        getElement(driver, dropdownOptions.Format(channel)).click();
    }

    public void clickOnCheckbox(){
        waitForClickableWebElement(driver, checkbox.Format("q-checkbox__bg absolute"), Constants.MEDIUM_TIMEOUT);
        getElement(driver, checkbox.Format("q-checkbox__bg absolute")).click();
    }
}
