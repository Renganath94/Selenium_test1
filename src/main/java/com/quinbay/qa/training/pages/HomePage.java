package com.quinbay.qa.training.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver webDriver){
        driver=webDriver;

    }
    @FindBy(id = "woocommerce-product-search-field-0")
    WebElement searchBox;

    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement shopTab;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeTab;

    public void setSearchText(String item) {
        searchBox.sendKeys(item);
    }

    public void pressReturnToSearch() {
        searchBox.sendKeys(Keys.RETURN);
    }

    public void clickOnShopTab(){
        shopTab.click();
    }

    public void clickOnHomeTab(){
        homeTab.click();
    }

}
