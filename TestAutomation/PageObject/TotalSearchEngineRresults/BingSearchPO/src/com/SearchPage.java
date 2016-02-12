package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
 
public class SearchPage extends Page{
 
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    private WebElement  sb_form_q;      //Search box
    private WebElement sb_form_go;      //Search button
 
    public ResultsPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(_driver, ResultsPage.class);
    }
}