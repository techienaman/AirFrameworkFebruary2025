package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution implements ExecutionStrategy {

    private static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();

    private static HeadlessExecution headlessExecution;

    public WebDriver initDriver(String browserName) {
        if (tldriver == null) {
            switch (browserName) {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless");
                    tldriver.set(new ChromeDriver());
                    break;
            }
        }
        return tldriver.get();
    }
}
