package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IncreaseSizeOfPage {
WebDriver driver;

@Test
public void pageSize() throws InterruptedException {
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	JavascriptExecutor js  = (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom ='150%'");
    Thread.sleep(10000);
    driver.close();

}
}

