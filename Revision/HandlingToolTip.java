package Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
*
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingToolTip {
	WebDriver driver;
	@Test
	public void  toolTip() {
		driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String element = driver.findElement(By.name("firstname")).getAttribute("title");
		
		System.out.println(element);
		driver.quit();
	}
}