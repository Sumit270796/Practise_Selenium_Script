package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FramesHnadling {
	WebDriver driver;
	@Test
	public void noOfIframes() {
		driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		List<WebElement> element = driver.findElements(By.tagName("iframe"));
		System.out.println("No of iframe    "+element.size());
		driver.switchTo().frame("moneyiframe");
		WebElement element1 =    driver.findElement(By.className("sensex"));
		System.out.println(element1.getText());
		driver.switchTo().defaultContent();
		WebElement element2 = driver.findElement(By.className("mailicon"));
		System.out.println(element2.getText());
		driver.quit();
		driver.quit();



	}



}
