package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
 
public class SearchRunner {
 
    public static void main(String[] args) {
        // open the FF browser
        WebDriver driver = new FirefoxDriver();

        // open the Bing Search page and input "Page Object Pattern" search request
        driver.get("http://bing.com/");
        SearchPage bingHome = PageFactory.initElements(driver, SearchPage.class);
        ResultsPage searchResults = bingHome.search("Page Object Pattern");

        // prints out total search engine results
        System.out.println(searchResults.getPagesReturned());

        // close the browser
        driver.close();
    }
}