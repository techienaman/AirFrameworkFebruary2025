package org.air.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    /**
     * Purpose of creating BasePage is that in Test class driver will be instantiated and from test class when object of the page will be created then we have to pass
     * the driver as well then using super keyword in constructor this base
     *
     */


    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
}
