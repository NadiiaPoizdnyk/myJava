package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ResultsPage extends Page{
 
    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    // find web element which displays the total amount of search engine result
    @FindBy(xpath = ".//span/div[@class='input__found input__found_visibility_visible']")
    private WebElement b_tween;

    // method which retrieves search results
    public String getPagesReturned(){
        return b_tween.getText();
    }
}