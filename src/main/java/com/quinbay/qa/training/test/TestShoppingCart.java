package com.quinbay.qa.training.test;

import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class
TestShoppingCart {
    public static void main (String []args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        HomePageActions actions= new HomePageActions(driver);
        actions.clickOnTab("Shop");
        Thread.sleep(10000);
        actions.clickOnTab("Home");


        Thread.sleep(10000);
        actions.searchForAnItem("Tshirt");
        driver.close();
    }
}
