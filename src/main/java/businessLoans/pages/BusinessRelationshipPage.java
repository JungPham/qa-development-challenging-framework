package businessLoans.pages;

import shared.BasePage;
import utils.Constants;
import utils.Locator;
import utils.WebElementLocator;

import static utils.SearchContextExtensions.getElement;
import static utils.SearchContextExtensions.waitForClickableWebElement;

public class BusinessRelationshipPage extends BasePage {

    private final WebElementLocator
        optionForFirstQuestion = new WebElementLocator(Locator.Xpath, "(//div[contains(@aria-label, '%s')])[1]"),
        optionForSecondQuestion = new WebElementLocator(Locator.Xpath, "(//div[contains(@aria-label, '%s')])[2]");

    public void selectYesOptionForFirstQuestion(String option){
        waitForClickableWebElement(driver, optionForFirstQuestion.Format(option), Constants.LONG_PAGELOADTIMEOUT);
        getElement(driver, optionForFirstQuestion.Format(option)).click();
    }

    public void selectNoOptionForSecondQuestion(String option){
        waitForClickableWebElement(driver, optionForSecondQuestion.Format(option), Constants.MEDIUM_TIMEOUT);
        getElement(driver, optionForSecondQuestion.Format(option)).click();
    }
}
