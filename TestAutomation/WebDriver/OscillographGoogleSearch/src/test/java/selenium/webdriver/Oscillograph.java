package selenium.webdriver;

/**
 * В поисковой строке гугла ввести слово «осциллограф»
 Найти страницу, на которой содержится vit.ua по данному поисковому запросу
 Вывести в консоль номер страницы, где найдено vit.ua
 Сделать скриншот данной страницы
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Oscillograph {

    private WebDriver driver;
    boolean elementPresent;
    private int pageIndex = 1;

    @BeforeTest
    // open the FF browser and go to Google search engine (https://www.google.com.ua/)
    public void setUp()throws Exception{

        driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        //driver.manage().window().maximize();                              //maximize the browser window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    //waiter for each search/element
    }

    @Test
    public void googleSearch()throws Exception {

        // clear the Search edit box (by id="lst-ib") and enter "осциллограф"
        driver.findElement(By.id("lst-ib")).clear();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("осциллограф");
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();     // click on Go button


        // find element which contains text "vit.ua"
        while (elementPresent != true) {
            elementPresent = isElementPresent(By.xpath(".//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]"));

            // if element is provided on the search engine page, then print out the page number
            if (elementPresent == true) {

                System.out.println("VIT.ua is provided on page:" + pageIndex);
                screenShot();
            } else if (elementPresent == false) {       // if element is not provided, then click on Next button
                pageIndex++;
                System.out.println("Navigating on page " + pageIndex);  // print out the page# where the navigating was done


                // exception
                try {
                    driver.findElement(By.xpath(".//*[@id='pnnext']/span[1]")).click();     //click on Next button
                } catch (NoSuchElementException e) {
                    System.out.println("Sorry. VIT.ua not found!");     //warning window, when element is not provided at all
                    return;
                }
            }
        }
    }
        // the method which is called while searching of element which contains text "vit.ua"
        // elementPresent verification
        private boolean isElementPresent(By by){
            try{
                driver.findElement(by);
                return true;
            }catch (NoSuchElementException e){
                return false;
            }
        }

        // the method which is called for screenshot taking
        public void screenShot() {
            File screenshot = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File(
                        "C:\\Selenium\\Screenshots\\Screen01.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    @AfterClass     // close the browser
    public void tearDown() throws Exception {
        driver.quit();
    }

    }


