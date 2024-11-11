package Revision;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CountRadioButton {
     WebDriver driver;
	@Test
    public void radiobutton() {
    	driver = new FirefoxDriver();
    	driver.get("https://www.facebook.com/r.php");
    	List<WebElement> element = driver.findElements(By.xpath("//input[@type='radio']"));
    	System.out.println(element.size());
        driver.close();
	}
}
