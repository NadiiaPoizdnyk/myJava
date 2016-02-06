package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchRunner {
 
    public static void main(String[] args) {

        // open the FF browser
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //waiter for each search/element

        // open the Google Search page and input "Page Object Pattern" search request
        driver.get("https://www.google.com.ua");

        // create the object of SearchPage class "googleHome"
        SearchPage googleHome = PageFactory.initElements(driver, SearchPage.class);
        ResultsPage searchResults = googleHome.search("Page Object Pattern");

        // prints out total search engine results
        System.out.println(searchResults.getPagesReturned());

        // close the browser
        driver.close();
    }
}