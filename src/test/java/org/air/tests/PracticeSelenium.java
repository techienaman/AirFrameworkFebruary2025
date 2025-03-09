package org.air.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.*;


/*
Select By Visible Text
Select By Value
Select by Index
 */


public class PracticeSelenium {
    private static WebDriver driver;

    public static void main(String[] args) throws Exception{
        setupDriver();
        checkingDropdown();
        selectDropdownPractice();
        dynamicDropDown();
        windowhandles();
    }

    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static void checkingDropdown(){
        driver.findElement(By.xpath("//*[@value=\"radio2\"]")).click();

    }

    public static void selectDropdownPractice(){
        Select select=new Select(driver.findElement(By.id("dropdown-class-example")));
        //Select By Value
        //Select By Index
        //Select By Visible text
        select.selectByValue("option1");
        select.selectByIndex(1);
        select.selectByVisibleText("Option2");

    }

    public static void dynamicDropDown() throws  Exception{
        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
        Thread.sleep(3000);
        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
        List<WebElement> list=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        for(WebElement elemnt:list){
            String country=elemnt.getText();
            if(country.equalsIgnoreCase("India")){
                elemnt.click();
            }
        }
    }



    public static void windowhandles(){
        driver.findElement(By.id("openwindow")).click();
        String parentID=driver.getWindowHandle();
        Set<String> handler=driver.getWindowHandles();
        Iterator<String> set=handler.iterator();
        while (set.hasNext()){
            String childWindow=set.next();
            driver.switchTo().window(childWindow);
            System.out.println(driver.getCurrentUrl());
        }
        driver.switchTo().window(parentID);
        System.out.println(driver.getCurrentUrl());
    }


    public static void alertException() throws Exception{
        driver.findElement(By.id("name")).sendKeys("Mayank");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }


    public static void actionsTutorial(){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("mousehover")));
        //actions.contextClick();
        //actions.doubleClick();

    }
}
