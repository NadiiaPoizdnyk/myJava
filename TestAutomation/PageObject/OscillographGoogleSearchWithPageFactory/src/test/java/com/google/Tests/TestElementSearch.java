package com.google.Tests;

import com.google.Pages.BrowserFactory;
import com.google.Pages.Screenshot;
import com.google.Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestElementSearch {

    @Test
    public void verifySearchElemenPresentOnFF() throws Exception{
        WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.google.com.ua/");
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        Screenshot screenshot = new Screenshot(driver);
        screenshot.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenFF.png");

        driver.quit();
    }

    @Test
    public void verifySearchElemenPresentOnChrome() throws Exception{
        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.google.com.ua/");
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        Screenshot screenshot = new Screenshot(driver);
        screenshot.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenChrome.png");

        driver.quit();
    }

    @Test
    public void verifySearchElemenPresentOnIE() throws Exception{
        WebDriver driver = BrowserFactory.startBrowser("ie", "https://www.google.com.ua/");
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        Screenshot screenshot = new Screenshot(driver);
        screenshot.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenIE.png");

        driver.quit();
    }

}
