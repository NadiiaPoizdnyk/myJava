package com.searchengines.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends Page{

    public GooglePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "gsfi")
    private WebElement sb_form_q;
    @FindBy(id = "sblsbb")
    private WebElement sb_form_go;

    public GoogleResultsPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(driver, GoogleResultsPage.class);
    }
}
