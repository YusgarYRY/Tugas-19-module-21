package Step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks extends driver{


    @Before
    public void beforeScenario() {
        // Setup ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @After
    public void afterScenario() {
        // Close WebDriver after scenario
        if (driver != null) {
            driver.quit();
        }
    }
}
