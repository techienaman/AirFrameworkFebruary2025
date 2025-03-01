package org.air.tests;

import DriverManager.DriverContext;
import DriverManager.LocalExecution;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    /**Logic of creating BaseTest is that it will initialize driver using DriverManager Package
     And all other Test class will extends this Base test so that code duplication will be less
     otherwise what would have happened is that in every Test I had to crete driver instance
     *
     */


    protected WebDriver driver;


    @BeforeTest
    @Parameters("browserName")
    public void initializeDriver(String browserName){
        DriverContext driverContext=new DriverContext(new LocalExecution());
        driver=driverContext.setupDriver(browserName);
    }


//
//    @AfterTest
//    public void quitDriver(){
//        driver.quit();
//    }
}
