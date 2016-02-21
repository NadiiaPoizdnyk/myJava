package com.searchengines.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexPage extends Page {
    public YandexPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "text")
    private WebElement sb_form_q;
    @FindBy(className = "search2__button")
    private WebElement sb_form_go;


    public YandexResultsPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(driver, YandexResultsPage.class);
    }
}
