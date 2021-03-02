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

public class FirstSeleniumExample
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");


        WebElement searchBox=driver.findElement(By.xpath("//input[@id='woocommerce-product-search-field-0']"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(30000);



        List<WebElement> elements = driver.findElements(By.xpath("//img[@src=\"https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg\"]"));
        if(elements.isEmpty())
        {
            System.out.println("\n\nelement not found");
        }
        else
        {
            System.out.println("\n\nelement found");
        }



        WebElement img = driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        img.click();

        WebElement addCart = driver.findElement(By.xpath("//button[@name='add-to-cart']"));
        addCart.click();

        WebElement ViewCart = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/'][@class='button wc-forward']"));
        ViewCart.click();

        WebElement checkOut = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']"));
        checkOut.click();

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

        Thread.sleep(5000);

        WebElement phone = driver.findElement(By.id("billing_phone"));
        phone.sendKeys("1234567890");

        WebElement email = driver.findElement(By.id("billing_email"));
        email.sendKeys("aaa23@gmail.com");

        WebElement cod = driver.findElement(By.id("payment_method_cod"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].checked=true;", cod);
        WebElement order = driver.findElement(By.id("place_order"));
        order.submit();
        Thread.sleep(30000);
        System.out.println("Success");




        driver.close();
    }
}
