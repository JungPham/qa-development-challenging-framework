package common.steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import utils.DriverConfiguration;

public class LifecycleSteps {
    public final WebDriver driver;

    public LifecycleSteps() {
        DriverConfiguration.configuration();
        this.driver = DriverConfiguration.driver;
    }

    @BeforeScenario
    public void deleteAllCookies() {
        try {
            driver.manage().deleteAllCookies();;
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
    }
}
