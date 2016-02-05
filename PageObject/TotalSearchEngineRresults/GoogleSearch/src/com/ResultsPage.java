package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ResultsPage extends Page{
 
    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    // find web element which displays the total amount of search engine result
    @FindBy(id = "resultStats")
    private WebElement b_tween;

    // method which retrieves search results
    public String getPagesReturned(){
        return b_tween.getText();
    }
}