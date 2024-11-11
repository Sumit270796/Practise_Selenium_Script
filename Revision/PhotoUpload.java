package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PhotoUpload {
WebDriver driver;

@Test
public void uploadPhoto() {
	driver = new FirefoxDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Desktop\\Pihu.jpg");
	
}
}
