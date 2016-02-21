package com.searchengines.TestCases;


import com.searchengines.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTotalSearchEngineResults {
    String searchedText = "Nadiia Poizdnyk";

    @Test
    public void getTotalSearchEngineResultsOnFF() throws Exception{
        System.out.println("\n" + searchedText + " search. Verification on the FireFox Browser.");

        WebDriver driver = BrowserFactory.startBrowser("firefox", "http://bing.com/");

        BingPage bingHome = PageFactory.initElements(driver, BingPage.class);
        BingResultPage bingResultPage = bingHome.search(searchedText);
        System.out.println("Bing SE: " + bingResultPage.getPagesReturned());

        driver.get("https://www.google.com.ua");
        GooglePage googleHome = PageFactory.initElements(driver, GooglePage.class);
        GoogleResultsPage googleResultsPage = googleHome.search(searchedText);
        System.out.println("Google SE: " + googleResultsPage.getPagesReturned());

        driver.get("https://www.yahoo.com/");
        YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
        YahooResultsPage yahooResultsPage = yahooPage.search(searchedText);
        System.out.println("Yahoo SE: " + yahooResultsPage.getPagesReturned());

        driver.get("https://www.yandex.ua/");
        YandexPage yandexPage = PageFactory.initElements(driver, YandexPage.class);
        YandexResultsPage yandexResultsPage = yandexPage.search(searchedText);
        System.out.println("Yandex SE " + yandexResultsPage.getPagesReturned());

        driver.close();

    }

    @Test
    public void getTotalSearchEngineResultsOnChrome() throws Exception{

        WebDriver driver = BrowserFactory.startBrowser("chrome", "http://bing.com/");

        System.out.println("\n" + searchedText + " search. Verification on the GoogleChrome Browser.");

        BingPage bingHome = PageFactory.initElements(driver, BingPage.class);
        BingResultPage bingResultPage = bingHome.search(searchedText);
        System.out.println("Bing SE: " + bingResultPage.getPagesReturned());

        driver.get("https://www.google.com.ua");
        GooglePage googleHome = PageFactory.initElements(driver, GooglePage.class);
        GoogleResultsPage googleResultsPage = googleHome.search(searchedText);
        System.out.println("Google SE: " + googleResultsPage.getPagesReturned());

        driver.get("https://www.yahoo.com/");
        YahooPage yahooPage = PageFactory.initElements(driver, YahooPage.class);
        YahooResultsPage yahooResultsPage = yahooPage.search(searchedText);
        System.out.println("Yahoo SE: " + yahooResultsPage.getPagesReturned());

        driver.get("https://www.yandex.ua/");
        YandexPage yandexPage = PageFactory.initElements(driver, YandexPage.class);
        YandexResultsPage yandexResultsPage = yandexPage.search(searchedText);
        System.out.println("Yandex SE " + yandexResultsPage.getPagesReturned());

        driver.close();

    }
}
