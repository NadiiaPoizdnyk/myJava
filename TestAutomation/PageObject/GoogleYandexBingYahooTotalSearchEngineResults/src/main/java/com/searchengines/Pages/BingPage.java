package com.searchengines.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BingPage extends Page{

    public BingPage(WebDriver driver){super(driver);}

    @FindBy (how = How.ID, using = "sb_form_q")
    private WebElement sb_form_q;      //Search box
    @FindBy (how = How.ID, using = "sb_form_go")
    private WebElement sb_form_go;      //Search button

    public BingResultPage search(String searchStatement){
        sb_form_q.sendKeys(searchStatement);
        sb_form_go.click();
        return PageFactory.initElements(driver, BingResultPage.class);
    }

}
