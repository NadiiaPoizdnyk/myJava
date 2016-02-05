package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchRunner {
 
    public static void main(String[] args) {

        // open the FF browser
        WebDriver driver = new FirefoxDriver();

        // open the Yandex Search page and input "Page Object Pattern" search request
        driver.get("https://www.yandex.ua/");

        // create the object of SearchPage class "yandexHome"
        SearchPage yandexHome = PageFactory.initElements(driver, SearchPage.class);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ResultsPage searchResults = yandexHome.search("Page Object Pattern");

        // prints out total search engine results
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Total search engine results for 'Page Object Pattern' "+ searchResults.getPagesReturned());

        // close the browser
        driver.close();
    }
}