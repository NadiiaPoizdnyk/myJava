package com.google.TestCases;

import com.google.Pages.FileClass;
import com.google.Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestElementSearch{

    @Test
    public void verifySearchElemenPresentOnFF() throws Exception{

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        FileClass fileClass = new FileClass(driver);
        fileClass.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenFF.png");

        driver.quit();
    }
    @Test
    public void verifySearchElemenPresentOnChrome() throws Exception{

        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        FileClass fileClass = new FileClass(driver);
        fileClass.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenChrome.png");

        driver.quit();
    }
    @Test
    public void verifySearchElemenPresentOnIE() throws Exception{

        System.setProperty("webdriver.ie.driver", "D:\\Program Files\\WebDrivers\\IE\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchWord("осциллограф");
        searchPage.searchLinkForWordSearch();

        FileClass fileClass = new FileClass(driver);
        fileClass.captureScreenshot("C:\\Selenium\\Screenshots\\ScreenIE.png");

        driver.quit();
    }
}
