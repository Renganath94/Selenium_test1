package com.quinbay.qa.training.test;

import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;
import org.openqa.selenium.JavascriptExecutor;
//import sun.jvm.hotspot.runtime.Threads;

//import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageTest
{
    public static void main(String[] args) throws InterruptedException
    {
        PageObjectModel Pom = new PageObjectModel();
        WebDriver driver = Pom.Webopen();


        Pom.Searchbox(driver);
        Pom.imagesearch(driver);
        Pom.Addcart(driver);
        Pom.Viewcart(driver);
        Pom.Checkout(driver);
        Pom.Form(driver);
        Pom.Cod(driver);
        Pom.Placeorder(driver);
    }
}
