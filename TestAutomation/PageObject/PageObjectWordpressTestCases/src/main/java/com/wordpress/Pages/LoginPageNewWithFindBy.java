package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNewWithFindBy {

    WebDriver driver;

    public LoginPageNewWithFindBy(WebDriver ldriver){  //ldriver = local driver
        this.driver = ldriver;
    }

    @FindBy(id = "user_login")
    //@CacheLookup
    WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id='user_pass']")
    WebElement password;

    @FindBy(how = How.ID, using = "wp-submit")
    WebElement submit_button;

    @FindBy(how = How.LINK_TEXT, using = "Lost your password?")
    WebElement forget_password_link;

    public void loginToWordpress(String uid, String pas){
        username.sendKeys(uid);
        password.sendKeys(pas);
        submit_button.click();
    }

}
