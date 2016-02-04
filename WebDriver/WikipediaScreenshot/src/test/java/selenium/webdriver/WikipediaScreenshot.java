package selenium.webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * go to the Wikipedia Main page (https://en.wikipedia.org/)
 * take the page screenshot if image from the 'In the news' is provided
 *
 */
public class WikipediaScreenshot {

    private WebDriver driver;
    private String url;
    boolean elementPresent = false;

    // open the FF Browser and go to Wiki (by link  https://en.wikipedia.org/)
    @BeforeTest
    public void setUp()throws Exception{

        driver = new FirefoxDriver();
        driver.get(url = "https://en.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);        //waiter (30 seconds)
    }

    @Test
    public void screenshotTaking()throws Exception{

        // verify if image is provided in the 'In the news'
        elementPresent = isElementPresent(By.xpath(".//*[@id='mp-itn-img']/div/a/img"));

        //if the image is provided, then print out the message and take the page screenshot
        if (elementPresent == true){
            System.out.println("The image is provided in the 'In the news' block.");
            screenshot();
        } else {
            //if the image is  not provided, then print out the warning message
            System.out.println("Sorry. The image is not provided in the 'In the news' block.");
        }
    }

    // the method which is called while searching of element (image)
    // elementPresent verification
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    // the method which is called for screenshot taking
    public void screenshot(){
            File screenshot = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("C:\\Selenium\\Screenshots\\ScreenWiki.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    // close the browser
    @AfterTest
    public void tearDown() throws Exception{
        driver.quit();
    }

}
