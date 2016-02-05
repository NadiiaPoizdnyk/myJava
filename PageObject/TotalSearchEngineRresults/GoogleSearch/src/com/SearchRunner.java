package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchRunner {
 
    public static void main(String[] args) {

        // open the FF browser
        WebDriver driver = new FirefoxDriver();

        // open the Google Search page and input "Page Object Pattern" search request
        driver.get("https://www.google.com.ua");

        // create the object of SearchPage class "googleHome"
        SearchPage googleHome = PageFactory.initElements(driver, SearchPage.class);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ResultsPage searchResults = googleHome.search("Page Object Pattern");

        // prints out total search engine results
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(searchResults.getPagesReturned());

        // close the browser
        driver.close();
    }
}