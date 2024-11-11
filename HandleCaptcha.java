import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class HandleCaptcha {
 WebDriver driver;
 @Test
 public void handlingCaptcha() throws InterruptedException {
	 driver = new FirefoxDriver();
	 driver.get("https://www.irctc.co.in/nget/train-search");
	 driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Ghyut123");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Dfgd1335");
	 Thread.sleep(30000);
	 driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
	 
 }  
}
