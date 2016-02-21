package com.searchengines.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooPage extends Page {

    public YahooPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id='uh-search-box']")
    private WebElement  sb_form_q;
    @FindBy(xpath = "//*[@id='uh-search-button']")
    private WebElement sb_form_go;


    public YahooResultsPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(driver, YahooResultsPage.class);
    }
}
