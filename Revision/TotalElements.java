package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TotalElements {
WebDriver driver;

@Test
public void noOfWebElement() {
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php");
	List<WebElement> Totalelement = driver.findElements(By.xpath("//*"));
	System.out.println("Total no of elements"+ Totalelement.size());
   
	
	
	
	
	driver.close();
}



}
