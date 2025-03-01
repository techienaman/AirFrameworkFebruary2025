package DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalExecution implements ExecutionStrategy {

    private static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
    public WebDriver initDriver(String browserName) {
        System.out.println("Executed how many times");
        if (tlDriver.get() == null) {
            switch (browserName) {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    tlDriver.set(new ChromeDriver());
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    tlDriver.set(new FirefoxDriver());
                    break;
            }
        }
        return tlDriver.get();
    }


    public void quitDriver(){
        if(tlDriver.get()!=null){
            tlDriver.get().quit();
        }
    }
}
