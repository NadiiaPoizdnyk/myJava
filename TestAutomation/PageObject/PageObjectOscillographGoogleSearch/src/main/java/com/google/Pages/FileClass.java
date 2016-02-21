package com.google.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class FileClass extends Page{

    public FileClass(WebDriver driver){
        super(driver);
    }

    public void captureScreenshot(String filePathAndName) {
        File screenshot = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(filePathAndName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
