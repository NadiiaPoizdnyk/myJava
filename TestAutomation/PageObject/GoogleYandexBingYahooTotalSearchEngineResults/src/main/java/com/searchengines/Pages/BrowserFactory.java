package com.searchengines.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory{
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){
        if (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            System.out.println(driver.getTitle());
        }else if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\WebDrivers\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println(driver.getTitle());
        }else if (browserName.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver", "D:\\Program Files\\WebDrivers\\IE\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            System.out.println(driver.getTitle());
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        return driver;

    }
}