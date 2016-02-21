package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * all the locators and methods of Login Page
 */
public class LogingPage {

    WebDriver driver;

    By username = By.id("user_login");
    By password = By.xpath("//*[@id='user_pass']");
    By loginButton = By.id("wp-submit");

    public LogingPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginToWordpress(String userid, String passw){
        driver.findElement(username).sendKeys(userid);
        driver.findElement(password).sendKeys(passw);
        driver.findElement(loginButton).click();
    }
}
