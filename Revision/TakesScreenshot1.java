package Revision;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakesScreenshot1 {
WebDriver driver;
 @Test
public void screenShot() throws IOException {
	 driver = new FirefoxDriver();
	 driver.get("https://www.google.com/");
	 TakesScreenshot  abc = (TakesScreenshot)driver;
	  File src = abc.getScreenshotAs(OutputType.FILE);
	  File  dest = new File ("C://Users//HP//Desktop//Maven Project//Practical//image.png");
	  FileUtils.copyFile(src, dest);
	  driver.quit();
 }
} 
