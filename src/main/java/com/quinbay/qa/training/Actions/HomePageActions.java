package com.quinbay.qa.training.Actions;

import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
    public HomePage homePage;

    public HomePageActions(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    public void searchForAnItem(String item){
        homePage.setSearchText(item);
        homePage.pressReturnToSearch();
    }

    public void clickOnTab(String tab){
        String tabName = tab;

        switch(tabName){
            case "Shop":homePage.clickOnShopTab();
            break;
            case "Home": homePage.clickOnHomeTab();
            break;

        }
    }

}
