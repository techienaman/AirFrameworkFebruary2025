package org.air.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BasePage {

    public StorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "woocommerce-product-search-field-0")
    private WebElement searchTextBOX;

    @FindBy(xpath = "//*[@value='Search']")
    private WebElement btnSearch;


    @FindBy(xpath = "//*[@class='woocommerce-products-header__title page-title']")
    private WebElement titleOfStorePage;

    @FindBy(xpath = "//*[@title='View cart']")
    private WebElement linkViewCart;

    public void enterInSearchBoxText(String text) {
        searchTextBOX.sendKeys(text);
    }
    public void clickOnSearchButton() {
        btnSearch.click();

    }

    //Here we are handling dynamic WebElement
    private By getAddToCartLocator(String productName) {
        By addToCartBtn = By.xpath("//*[@aria-label='Add “Blue Shoes” to your cart']");
        return addToCartBtn;

    }

    public void clickAddTocartButton(String productName) {
        driver.findElement(getAddToCartLocator(productName)).click();
    }

    public String getTitleOfStorePage() {
        return titleOfStorePage.getText();
    }

    public void clickViewCartBtn() {
        linkViewCart.click();
    }
}