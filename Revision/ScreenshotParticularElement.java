package Revision;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
3
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshotParticularElement {
  WebDriver driver;
  @Test
  public void  screenShot() throws IOException {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  WebElement  element = driver.findElements(By.xpath("//input[@name='btnK']")).get(1);
        File src = element.getScreenshotAs(OutputType.FILE);
        File dest =  new File ("C://Users//HP//Desktop//Maven Project//Practical//image.png");
        FileUtils.copyFile(src, dest);
        driver.quit();
  
  
  }
}
