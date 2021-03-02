package com.quinbay.qa.training.test;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class PageObj
{
    WebDriver driver;

    public PageObj(WebDriver webDriver)
    {
        driver = webDriver;
    }

    public WebDriver Webopen() throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        return driver;
    }

    @FindBy(xpath = "//input[@id=woocommerce-product-search-field-0]")
    WebElement searchbox;










}

