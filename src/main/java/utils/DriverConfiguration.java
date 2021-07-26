package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jbehave.core.annotations.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverConfiguration {

    public static WebDriver driver;

    public static WebDriver configuration() {
                Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
                System.setProperty("webdriver.chrome.silentOutput", "true");
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-plugins", "--disable-extensions", "--disable-popup-blocking");
                options.setCapability("applicationCacheEnabled", false);
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-browser-side-navigation");
                options.addArguments("--disable-gpu");
                options.addArguments("--ignore-certificate-errors");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().pageLoadTimeout(Constants.PAGELOADTIMEOUT, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                return driver;
        }
}
