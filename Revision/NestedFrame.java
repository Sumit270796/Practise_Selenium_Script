package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NestedFrame {
WebDriver driver;
@Test
public void nestedFrame() {
	driver = new FirefoxDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	 driver.findElement(By.className("analystic")).click();
	driver.switchTo().frame(1);
	driver.switchTo().frame(0);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sonam jaiswaal");
}




}
