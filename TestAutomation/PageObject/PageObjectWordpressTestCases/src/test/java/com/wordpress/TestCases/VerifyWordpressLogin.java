package com.wordpress.TestCases;

import com.wordpress.Pages.LogingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class VerifyWordpressLogin {

    @Test
    public void verifyValidLogin(){
        WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("http://demosite.center/wordpress/wp-login.php");

        LogingPage login = new LogingPage(driver);
        login.loginToWordpress("admin", "demo123");

        driver.quit();

    }
}
