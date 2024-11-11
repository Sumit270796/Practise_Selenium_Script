package Revision;
1
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleWindow {
WebDriver driver;
@Test
public void handleWindowTab() {
   driver = new FirefoxDriver();
   driver.get("https://www.google.com/");
   driver.switchTo().newWindow(WindowType.TAB);
   driver.get("https://www.flipkart.com/");
   System.out.println("Url of page  "+driver.getCurrentUrl());
   System.out.println("Title of page    "+driver.getTitle());
   
   Set<String> windowHandles = driver.getWindowHandles();
   List<String> Handles =  new ArrayList<String>();
   Handles.addAll(windowHandles);
   driver.close();
   driver.switchTo().window(Handles.get(0));
   System.out.println("Titel of page   "+driver.getTitle());
   driver.quit();
}


}
