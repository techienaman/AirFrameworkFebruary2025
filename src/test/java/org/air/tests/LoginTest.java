package org.air.tests;
import POJO.ProductDetails;
import Utlities.JacksonUtils;
import POJO.OmBillingDetails;
import org.air.pages.CartPage;
import org.air.pages.CheckoutPage;
import org.air.pages.HomePage;
import org.air.pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.*;
import Listeners.RetryAnalyzer;

import java.io.IOException;
import java.io.InputStream;


public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void launchURL () throws InterruptedException, IOException {
        load();
       // driver.get("https://askomdch.com/");
        HomePage homePage =new HomePage(driver);
        StorePage storePage=new StorePage(driver);
        CartPage cartPage=new CartPage(driver);
        CheckoutPage checkoutPage=new CheckoutPage(driver);
        OmBillingDetails omBillingDetails=new OmBillingDetails();
        InputStream inputStream=getClass().getClassLoader().getResourceAsStream("myBilling.json");
        OmBillingDetails omBillingDetails1=JacksonUtils.genericdeserializeJson(inputStream,omBillingDetails.getClass());

        ProductDetails productDetails=new ProductDetails(1215);
        Assert.fail();

        homePage.clickOnStoreLink();
        Thread.sleep(5000);
        storePage.enterInSearchBoxText("Blue");
        storePage.clickOnSearchButton();
        Thread.sleep(5000);
        Assert.assertEquals(storePage.getTitleOfStorePage(),"Search results: “Blue”");
        storePage.clickAddTocartButton(productDetails.getName());
        Thread.sleep(5000);
        storePage.clickViewCartBtn();
        Thread.sleep(5000);
        cartPage.clickOnCheckoutButton();
        Thread.sleep(5000);
        //BillingDetails billingDetails=new BillingDetails.builderBillingAddress("Kumar","Mayank","khao gali","patna","123","kumar@gmail.com").build();
        checkoutPage.enterBillingDetails(omBillingDetails1);
    }



    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void parametrizedTest(){
        Assert.fail();
        load();
        // driver.get("https://askomdch.com/");
        HomePage homePage =new HomePage(driver);

    }




}
