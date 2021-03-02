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

public class PageObjectModel
{

    public WebDriver Webopen() throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        return driver;
    }

    public void Searchbox(WebDriver driver)
    {
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);

    }

    public void imagesearch(WebDriver driver)
    {
        WebElement img = driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        img.click();
    }

    public void Addcart (WebDriver driver)
    {
        WebElement addCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
        addCart.click();
    }

    public void Viewcart (WebDriver driver)
    {
        WebElement ViewCart = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/'][@class='button wc-forward']"));
        ViewCart.click();
    }

    public void Checkout (WebDriver driver)
    {
        WebElement checkOut = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']"));
        checkOut.click();
    }

    public void Form (WebDriver driver)
    {
        WebElement firstName = driver.findElement(By.id("billing_first_name"));
        firstName.sendKeys("Renga");

        WebElement lastName = driver.findElement(By.id("billing_last_name"));
        lastName.sendKeys("S");

        WebElement companyName = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
        companyName.sendKeys("QB");

        WebElement companyName1 = driver.findElement(By.xpath("//input[@id='billing_address_2']"));
        companyName1.sendKeys("Blr");

        WebElement city = driver.findElement(By.id("billing_city"));
        city.sendKeys("Bengaluru");

        Select selectStateElement = new Select(driver.findElement(By.id("billing_state")));
        selectStateElement.selectByVisibleText("Tamil Nadu");

        WebElement postCode = driver.findElement(By.id("billing_postcode"));
        postCode.sendKeys("560013");



        WebElement phone = driver.findElement(By.id("billing_phone"));
        phone.sendKeys("1234567890");

        WebElement email = driver.findElement(By.id("billing_email"));
        email.sendKeys("aaa23@gmail.com");
    }

    public void Cod (WebDriver driver)
    {
        WebElement cod = driver.findElement(By.id("payment_method_cod"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked=true;", cod);
    }

    public void Placeorder(WebDriver driver)
    {
        WebElement order = driver.findElement(By.id("place_order"));
        order.submit();

        System.out.println("Success");
    }
}
