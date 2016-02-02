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
import java.lang.String;
import java.util.concurrent.TimeUnit;


public class Oscillograph {

    private WebDriver driver;
    boolean elementPresent = false;
    private int pageIndex = 1;
    private String url;

    @BeforeTest
    public void setUp()throws Exception{

        driver = new FirefoxDriver();
        driver.get(url="https://www.google.com.ua/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void googleSearch()throws Exception {

        driver.findElement(By.id("lst-ib")).clear();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("осциллограф");
        driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        while (elementPresent != true) {
            elementPresent = isElementPresent(By.xpath(".//div[@class=\"f kv _SWb\"]/cite[contains(text(),\"vit.ua\")]"));


            if (elementPresent == true) {

                System.out.println("VIT.ua is on page:" + pageIndex);
                screenShot();
            } else if (elementPresent == false) {
                pageIndex++;
                System.out.println("Navigating on page " + pageIndex);
                try {
                    driver.findElement(By.xpath(".//*[@id='pnnext']/span[1]")).click();
                } catch (NoSuchElementException e) {
                    System.out.println("Sorry. VIT.ua not found!");
                    return;
                }
            }
        }
    }

        private boolean isElementPresent(By by){
            try{
                driver.findElement(by);
                return true;
            }catch (NoSuchElementException e){
                return false;
            }
        }
        public void screenShot() {
            File screenshot = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File(
                        "C:\\Selenium\\Screenshots\\Screen01.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    }


