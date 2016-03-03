package com.wiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPageElements extends Page {

    @FindBy(how = How.XPATH, using = "//*[@id='mp-itn-img']//img")
    public WebElement inTheNewsImg;

    @FindBy(how = How.XPATH, using = "//*[@id='mp-tfa-img']/a/img")
    public WebElement fromTFAImg;

    @FindBy(how = How.XPATH, using = "//*[@id='mp-dyk-img']/div/a/img" )
    public WebElement didYouKnowImg;

    @FindBy(how = How.XPATH, using = "//*[@id='mp-otd-img']/div/a/img" )
    public WebElement onThisDayImg;


    public LandingPageElements(WebDriver driver) {
        super(driver);
    }
}
