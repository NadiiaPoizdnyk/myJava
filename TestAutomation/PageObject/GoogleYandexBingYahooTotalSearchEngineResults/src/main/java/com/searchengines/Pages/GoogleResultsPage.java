package com.searchengines.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultsPage extends Page {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "resultStats")
    private WebElement b_tween;


    public String getPagesReturned(){
        return b_tween.getText();
    }
}
