package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderPractise {

WebDriver driver;	
	
@Test
public void handleSlider() {
	driver = new FirefoxDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
	WebElement element = driver.findElement(By.id("ageInputId"));
	Actions act = new Actions(driver);
	act.clickAndHold(element).moveByOffset(100, 0).release().build().perform();
	System.out.println("Slider value    "+element.getAttribute("value"));
	
	
}


}
