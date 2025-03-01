package org.air.tests;
import POJO.JacksonUtils;
import POJO.OmBillingDetails;
import org.air.pages.CartPage;
import org.air.pages.CheckoutPage;
import org.air.pages.HomePage;
import org.air.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.*;
import  POJO.BillingDetails;

import java.io.IOException;
import java.io.InputStream;


public class LoginTest extends BaseTest {

    @Test
    public void launchURL () throws InterruptedException, IOException {
        driver.get("https://askomdch.com/");
        HomePage homePage =new HomePage(driver);
        StorePage storePage=new StorePage(driver);
        CartPage cartPage=new CartPage(driver);
        CheckoutPage checkoutPage=new CheckoutPage(driver);
        OmBillingDetails omBillingDetails=new OmBillingDetails();
        InputStream inputStream=getClass().getClassLoader().getResourceAsStream("myBilling.json");
        OmBillingDetails omBillingDetails1=JacksonUtils.deserializeJson(inputStream,omBillingDetails);


        homePage.clickOnStoreLink();
        Thread.sleep(5000);
        storePage.enterInSearchBoxText("Blue");
        storePage.clickOnSearchButton();
        Thread.sleep(5000);
        Assert.assertEquals(storePage.getTitleOfStorePage(),"Search results: “Blue”");
        storePage.clickAddTocartButton("Blue Shoes");
        Thread.sleep(5000);
        storePage.clickViewCartBtn();
        Thread.sleep(5000);
        cartPage.clickOnCheckoutButton();
        Thread.sleep(5000);
        //BillingDetails billingDetails=new BillingDetails.builderBillingAddress("Kumar","Mayank","khao gali","patna","123","kumar@gmail.com").build();
        checkoutPage.enterBillingDetails(omBillingDetails1);
    }
}
