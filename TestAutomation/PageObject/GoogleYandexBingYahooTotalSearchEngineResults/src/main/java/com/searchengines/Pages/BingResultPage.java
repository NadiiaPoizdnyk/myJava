package com.searchengines.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BingResultPage extends Page{

    public BingResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.ID, using = "b_tween")
    private WebElement b_tween;

    public String getPagesReturned(){
        return b_tween.getText();
    }
}