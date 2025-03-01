package DriverManager;

import org.openqa.selenium.WebDriver;

public class DriverContext {

    private  ExecutionStrategy executionStrategy;

    public DriverContext(ExecutionStrategy executionStrategy){
        this.executionStrategy=executionStrategy;

    }

    public WebDriver setupDriver(String browserName){
       return executionStrategy.initDriver(browserName);
    }
}
