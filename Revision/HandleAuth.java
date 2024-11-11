package Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleAuth {
 WebDriver driver;
@Test
public void handleAu() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	
	

	}

}
