package org.air.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    protected WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(css=".checkout-button")
    private WebElement btnCheckoutButton;


    public void clickOnCheckoutButton(){
        btnCheckoutButton.click();
    }

}



