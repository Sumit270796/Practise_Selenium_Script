package Revision;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*
;

public class AlertHandling {
WebDriver driver;
Alert salert;
Alert calert;
Alert palert;
@BeforeMethod
public void init() {
	driver = new FirefoxDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	driver.manage().window().maximize();
}
@Test(priority=1)
public void simpleAlert() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
	 Thread.sleep(5000);
	salert = driver.switchTo().alert();
	String MSG = salert.getText();
	System.out.println(MSG);
	salert.accept();
	
}
	@Test(priority =2)
public void confirmationAlert() {
 driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
 calert = driver.switchTo().alert();
 String  MSG1 = calert.getText();
 System.out.println(MSG1);
 calert.dismiss();
 
}
			
@Test(priority=3)
public void promptAlert() {
	driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
	palert = driver.switchTo().alert();
	String MSG2 = palert.getText();
	System.out.println(MSG2);
    palert.sendKeys("Sumit Kumar verma");
    palert.accept();
}
@AfterMethod
public void tearDown() {
	driver.quit();
	
}
}
