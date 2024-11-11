package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {
 WebDriver driver;
	@Test
	public void dropDown() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
         WebElement Element = driver.findElement(By.name("birthday_month"));
         Select  dDown = new Select(Element);
         dDown.selectByVisibleText("Jan");
         
          List<WebElement> Options = dDown.getOptions();
               for(WebElement option : Options) {
            	   System.out.println(option.getText());
               }
       
           driver.quit();
          

	}
  
  
}
