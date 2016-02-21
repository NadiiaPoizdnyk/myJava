package com.searchengines.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YahooResultsPage extends Page{

    public YahooResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = 'compPagination']/span")
    private WebElement b_tween;

    public String getPagesReturned(){
        return b_tween.getText();
    }
}