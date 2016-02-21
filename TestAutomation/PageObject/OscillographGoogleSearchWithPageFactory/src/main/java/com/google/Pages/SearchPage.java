package com.google.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends Page {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (how = How.ID, using = "lst-ib")
    WebElement searchBox;
    @FindBy(how = How.NAME, using = "q")
    WebElement q;
    @FindBy (how = How.XPATH, using = "//*[@id='sblsbb']/button")
    WebElement goButton;
    //@FindBy (how = How.XPATH, using = "//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]")
    //WebElement element;
    By element = By.xpath("//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]");
    @FindBy (how = How.XPATH, using = "//*[@id='pnnext']/span[1]")
    WebElement nextButton;


    public void searchWord(String searchWord) {
        searchBox.clear();
        q.sendKeys(searchWord);
        goButton.click();
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
                    nextButton.click();
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
