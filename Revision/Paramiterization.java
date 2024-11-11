package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class Paramiterization {

WebDriver driver;
@BeforeTest
public void Init() {
	
	driver = new FirefoxDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
} 
  
@Test
@Parameters({"UID", "PWD"})
public void loginWithInvalidCredential(String UID ,String PWD) {
driver.findElement(By.name("email")).sendKeys(UID);	
driver.findElement(By.name("pass")).sendKeys(PWD);
driver.findElement(By.name("login")).click();


}
//@AfterTest
public void tearDown() {
	driver.quit();
}

}




