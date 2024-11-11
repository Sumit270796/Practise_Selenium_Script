package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
WebDriver driver;
@Test
  public void draganddrop() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	  driver.switchTo().frame(0);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement from = driver.findElement(By.xpath("//h5[normalize-space()='High Tatras 4']"));
	  WebElement to = driver.findElement(By.id("trash"));
	  Actions act = new Actions(driver);
	  act.dragAndDrop(from, to).build().perform();
	  
	 
	  
  }


}
