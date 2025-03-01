package DriverManager;

import org.openqa.selenium.WebDriver;

public interface ExecutionStrategy {
    WebDriver initDriver(String browserName);
}
