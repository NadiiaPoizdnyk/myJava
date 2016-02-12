package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchRunner {
 
    public static void main(String[] args) {

        // open the FF browser
        WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //waiter for each search/element

        // open the Yahoo Search page and input "Page Object Pattern" search request
        driver.get("https://www.yahoo.com/");
        // create the object of SearchPage class "yahooHome"
        SearchPage yahooHome = PageFactory.initElements(driver, SearchPage.class);
        ResultsPage searchResults = yahooHome.search("Page Object Pattern");

        // prints out total search engine results
        System.out.print("Total search engine results for 'Page Object Pattern': ");
        System.out.print(searchResults.getPagesReturned());

        // close the browser
        driver.close();
    }
}