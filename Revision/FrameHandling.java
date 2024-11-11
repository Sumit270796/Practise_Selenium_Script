package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameHandling {
WebDriver driver;

@Test
public void frameHandle() {
	driver = new FirefoxDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.switchTo().frame("frm2");
	driver.findElement(By.id("firstName")).sendKeys("Shreya Agrawal");
	
	
	
}
}
