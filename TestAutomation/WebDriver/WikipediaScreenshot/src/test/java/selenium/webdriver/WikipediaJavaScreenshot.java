package selenium.webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * go to the Wikipedia Main page (https://en.wikipedia.org/)
 * take the screenshot of image from the 'In the news' (+6 pix on each image's side)
 *
 */
public class WikipediaJavaScreenshot {

    private WebDriver driver;

    // open the FF Browser and go to Wiki (by link  https://en.wikipedia.org/)
    @BeforeTest
    public void setUp()throws Exception{

        driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);            //waiter (10 seconds)
    }

    // find image element in the 'In the news' by xpath=.//*[@id='mp-itn-img']/div/a/img
    // and take the screenshot of that image only
    @Test
    public void captureScreenshot()throws Exception{

        //locate the img to capture the screenshot
        WebElement image = driver.findElement(By.xpath(".//*[@id='mp-itn-img']//img"));
        // call the method which captures the element screenshot
        captureElementScreenshot(image);
        System.out.println("The image screenshot is done. You can see it in " +
                "C:\\Selenium\\Screenshots as WikiImageScreen.png ");
    }

    //the method which takes the screenshot of the whole page
    // then captures the image screenshot part only and saves it
    public void captureElementScreenshot(WebElement element) throws IOException {

        // captures the whole page screenshot
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // use getSize() Selenium method to get height and width of element.
        int ImageWidth = element.getSize().getWidth();          //retrieves the image width
        int ImageHeight = element.getSize().getHeight();        //retrieves the image height

        // use Point Selenium class to get image coordinates (location)
        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();

        BufferedImage img = ImageIO.read(screen);       //reads the 1st screenshot (in full size)

        // cuts the image using parameters of height, weight and coordinates
        BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth + 6, ImageHeight + 6);
        ImageIO.write(dest, "png", screen);

        // saves the image screenshot to C:\Selenium\Screenshots as WikiImageScreen.png
        FileUtils.copyFile(screen, new File("C:\\Selenium\\Screenshots\\WikiImageScreen.png"));
    }

    // close the browser
    @AfterTest
    public void tearDown() throws Exception{
        driver.quit();
    }
}
