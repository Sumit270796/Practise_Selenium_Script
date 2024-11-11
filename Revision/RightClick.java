package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
    WebDriver driver;
	@Test 
	public void rClick() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement element = driver.findElement(By.name("firstname"));
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	  
	  
  }
}
