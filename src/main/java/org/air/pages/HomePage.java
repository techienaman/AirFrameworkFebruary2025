package org.air.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private WebDriver driver;


    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id='menu-item-1227'] //a[contains(text(),'Store')]")
    private WebElement headerStore;



    public void clickOnStoreLink(){
        headerStore.click();
    }
}
