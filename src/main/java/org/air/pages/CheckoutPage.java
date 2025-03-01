package org.air.pages;

import POJO.OmBillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import POJO.BillingDetails;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends  BasePage {
    public CheckoutPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="billing_first_name")
    private WebElement firstName;

    @FindBy(id="billing_last_name")
    private WebElement lastName;


    @FindBy(id="billing_address_1")
    private WebElement streetAddress1;

    @FindBy(id="billing_city")
    private WebElement cityName;

    @FindBy(id="billing_postcode")
    private WebElement zipCode;

    @FindBy(id="billing_email")
    private WebElement emailAddress;


    public void enterBillingDetails(OmBillingDetails billingDetails){
        firstName.sendKeys(billingDetails.getFirstName());
        lastName.sendKeys(billingDetails.getLastName());
        streetAddress1.sendKeys(billingDetails.getStreetAddress());
        cityName.sendKeys(billingDetails.getTown());
        zipCode.sendKeys(billingDetails.getZipCode());
        emailAddress.sendKeys(billingDetails.getEmailAddress());

    }
//
//
//    private void enterFirstname(){
//        firstName.sendKeys(billingDetails.getFirstName());
//    }
//
//    private void enterlastName(){
//        lastName.sendKeys(billingDetails.getLastName());
//    }
//
//    private void enterStreetAddress(){
//        streetAddress1.sendKeys(billingDetails.getStreetAddress());
//    }
//
//    private void enterCityName(){
//        cityName.sendKeys(billingDetails.getTown());
//    }
//
//    private void enterZipCode(){
//        zipCode.sendKeys(billingDetails.getZipCode());
//    }
//
//    private void enterEmailAddress(){
//        emailAddress.sendKeys(billingDetails.getEmailAddress());
//    }

}
