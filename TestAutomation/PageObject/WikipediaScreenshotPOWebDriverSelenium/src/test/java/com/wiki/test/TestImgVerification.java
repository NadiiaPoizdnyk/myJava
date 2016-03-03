package com.wiki.test;


import actions.ScreenshotCapturing;
import com.wiki.pages.LandingPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



public class TestImgVerification {
    static WebDriver driver;
    LandingPageElements landingPageElements;

    @BeforeTest
    public void setUp()throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        landingPageElements = PageFactory.initElements(driver, LandingPageElements.class);
        }

    @AfterTest
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void verifyAndCaptureScreenshotOfInTheNewsImg() throws Exception{
        landingPageElements.inTheNewsImg.isDisplayed();
        ScreenshotCapturing screenshot = new ScreenshotCapturing(driver);
        WebElement element = landingPageElements.inTheNewsImg;
        screenshot.captureElementScreenshot(element, "C:\\Selenium\\Screenshots\\WikiInTheNewsImg.png");
    }

    @Test
    public void verifyAndCaptureScreenshotOnThisDayImg() throws Exception{
        landingPageElements.inTheNewsImg.isDisplayed();
        ScreenshotCapturing screenshot = new ScreenshotCapturing(driver);
        WebElement element = landingPageElements.onThisDayImg;
        screenshot.captureElementScreenshot(element, "C:\\Selenium\\Screenshots\\WikiOnThisDayImg.png");
    }
}
