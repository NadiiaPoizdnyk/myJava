package com.wordpress.TestCases;

import com.wordpress.Pages.BrowserFactory;
import com.wordpress.Pages.LoginPageNewWithFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLoginWithPageFactory {

    @Test
    public void checkValidUserOnFirefox(){

        //launch browser and specific url
        WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
        //create Page Object using Page Factory
        LoginPageNewWithFindBy login_page = PageFactory.initElements(driver, LoginPageNewWithFindBy.class);
        //call the method
        login_page.loginToWordpress("admin", "demo123");
        driver.close();
    }

    @Test
    public void checkValidUserOnGoogleChrome(){

        //launch browser and specific url
        WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
        //create Page Object using Page Factory
        LoginPageNewWithFindBy login_page = PageFactory.initElements(driver, LoginPageNewWithFindBy.class);
        //call the method
        login_page.loginToWordpress("admin", "demo123");
        driver.close();
    }


    @Test
    public void checkValidUserOnIE(){

        //launch browser and specific url
        WebDriver driver = BrowserFactory.startBrowser("ie", "http://demosite.center/wordpress/wp-login.php");
        //create Page Object using Page Factory
        LoginPageNewWithFindBy login_page = PageFactory.initElements(driver, LoginPageNewWithFindBy.class);
        //call the method
        login_page.loginToWordpress("admin", "demo123");
        driver.close();
    }
}
