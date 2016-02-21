package com.google.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Page {

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    By searchBox = By.id("lst-ib");
    By q = By.name("q");
    By goButton = By.xpath("//*[@id='sblsbb']/button");
   // By linkToFind = By.xpath("//div[@class=\"f kv _SWb\"]/cite");
    By element = By.xpath("//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]");
    By nextButton = By.xpath("//*[@id='pnnext']/span[1]");

    public void searchWord(String searchWord) {
        driver.findElement(searchBox).clear();
        driver.findElement(q).sendKeys(searchWord);
        driver.findElement(goButton).click();
    }

    public void searchLinkForWordSearch() {
        int pageIndex = 1;
        boolean elementPresent = false;

        while (elementPresent != true) {
            driver.findElements(element);
            elementPresent = isElementPresent(element);

            if (elementPresent == true) {
                System.out.println("The search element is provided on page:" + pageIndex);


            } else if (elementPresent == false) {
                pageIndex++;
                System.out.println("Navigating on page " + pageIndex);
                try {
                    driver.findElement(nextButton).click();
                } catch (NoSuchElementException e) {
                    System.out.println("Sorry. The search element not found!");
                    return;
                }
            }
        }
    }


    private boolean isElementPresent(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}