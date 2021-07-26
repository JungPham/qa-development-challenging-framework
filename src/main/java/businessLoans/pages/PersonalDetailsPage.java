package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.*;

public class PersonalDetailsPage extends BasePage {

    private final WebElementLocator
        dateOfBirthField = new WebElementLocator(Locator.Xpath, "//input[@placeholder='%s']"),
        year = new WebElementLocator(Locator.Xpath, "(//button[contains(@class,'q-btn--rectangle q-btn--actionable q-focusable q-hoverable q-btn--no-uppercase')])[2]"),
        backYearButton = new WebElementLocator(Locator.Xpath, "//i[@class = 'fas fa-chevron-left q-icon notranslate']"),
        yearInList = new WebElementLocator(Locator.Xpath, "(//div[contains(@class,'q-date__years')]//span[@class='block'])[14]"),
        dayInList = new WebElementLocator(Locator.Xpath, "(//div[contains(@class, 'q-date__calendar-days fit')]//span[@class='block'])[1]"),
        nationalityDropdown = new WebElementLocator(Locator.Xpath, "(//div[@placeholder-field='%s'])[2]"),
        nationalityDropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label') and text()='%s']"),
        genderDropdown = new WebElementLocator(Locator.Xpath, "//input[@placeholder='%s']"),
        genderDropdownOptions = new WebElementLocator(Locator.Xpath, "//div[contains(@class,'q-item__label') and text()='%s']"),
        submitButton = new WebElementLocator(Locator.Xpath, "//span[contains(@class,'block') and text()='%s']");

    public void clickOnDateOfBirth(){
        waitForClickableWebElement(driver, dateOfBirthField.Format("Set your date of birth"), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, dateOfBirthField.Format("Set your date of birth")).click();
    }

    public void selectYear() throws InterruptedException {
        waitForClickableWebElement(driver, year, Constants.LONG_TIMEOUT);
        getElement(driver, year).click();
        Thread.sleep(5000);
        waitForClickableWebElement(driver, backYearButton, Constants.LONG_TIMEOUT);
        getElement(driver, backYearButton).click();
        Thread.sleep(5000);
        getElement(driver, backYearButton).click();
        waitForClickableWebElement(driver, yearInList, Constants.LONG_TIMEOUT);
        getElement(driver, yearInList).click();
    }

    public void selectDay(){
        waitForClickableWebElement(driver, dayInList, Constants.LONG_TIMEOUT);
        getElement(driver, dayInList).click();
    }

    public void selectNationality(String nationality){
        waitForClickableWebElement(driver, nationalityDropdown.Format("Nationality"), Constants.LONG_TIMEOUT);
        getElement(driver, nationalityDropdown.Format("Nationality")).click();
        waitForClickableWebElement(driver, nationalityDropdownOptions.Format(nationality), Constants.MEDIUM_TIMEOUT);
        getElement(driver, nationalityDropdownOptions.Format(nationality)).click();
    }

    public void selectGender(String gender){
        waitForClickableWebElement(driver, genderDropdown.Format("Set your gender"), Constants.LONG_TIMEOUT);
        getElement(driver, genderDropdown.Format("Set your gender")).click();
        waitForClickableWebElement(driver, genderDropdownOptions.Format(gender), Constants.MEDIUM_TIMEOUT);
        getElement(driver, genderDropdownOptions.Format(gender)).click();
    }

    public void clickOnSubmitButton() throws InterruptedException {
        waitForClickableWebElement(driver, submitButton.Format("Submit"), Constants.PAGELOADTIMEOUT);
        getElement(driver, submitButton.Format("Submit")).click();
        Thread.sleep(10000);
    }
}
