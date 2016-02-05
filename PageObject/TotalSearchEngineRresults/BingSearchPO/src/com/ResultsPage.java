package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class ResultsPage extends Page{
 
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
 
    private WebElement b_tween;

    //method which retrieves search results
    public String getPagesReturned(){
        return b_tween.getText();
    }
}