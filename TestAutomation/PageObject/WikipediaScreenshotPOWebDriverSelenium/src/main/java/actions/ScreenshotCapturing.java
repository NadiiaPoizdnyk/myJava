package actions;



import com.wiki.pages.Page;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotCapturing extends Page{
    public ScreenshotCapturing(WebDriver driver) {
        super(driver);
    }

    public void captureElementScreenshot(WebElement element, String filePath) throws IOException {


        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        int ImageWidth = element.getSize().getWidth();
        int ImageHeight = element.getSize().getHeight();

        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();

        BufferedImage img = ImageIO.read(screen);
        BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth + 6, ImageHeight + 6);
        ImageIO.write(dest, "png", screen);
        FileUtils.copyFile(screen, new File(String.valueOf(filePath)));

    }
}
