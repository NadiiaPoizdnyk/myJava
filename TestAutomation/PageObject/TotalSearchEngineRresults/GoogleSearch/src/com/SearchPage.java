package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
 
public class SearchPage extends Page{
 
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //Search box
    @FindBy(xpath = ".//*[@id='sb_ifc0']")
    private WebElement  sb_form_q;

    //Search button
    @FindBy(id = "sblsbb")
    private WebElement sb_form_go;
 
    public ResultsPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(_driver, ResultsPage.class);
    }
}