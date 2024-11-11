package Revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LinkText {
	WebDriver driver;
	@BeforeTest
	public void Init() {

		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
	} 

	@Test
	public void testing() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");	
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	List<WebElement> Element =	driver.findElements(By.partialLinkText("Sauce"));
 
System.out.println(Element.size());
driver.quit();

	}



}
