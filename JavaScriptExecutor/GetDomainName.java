package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetDomainName {
WebDriver driver;
@Test
public void getDomainName() {
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	System.out.println( js.executeScript("return document.domain ;").toString());
      driver.quit();
}


}
