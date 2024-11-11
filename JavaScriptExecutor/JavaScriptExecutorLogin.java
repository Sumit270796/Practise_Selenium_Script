package JavaScriptExecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorLogin {
 @Test
 public void login() {
        
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Navigate to the login page
            driver.get("https://www.facebook.com/");

            // Initialize JavaScriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;


            js.executeScript("document.getElementById('email').value='Sunil';");
            js.executeScript("document.getElementById('pass').value='45952154';");

            // Locate the login button and click it using JavaScript
            js.executeScript("document.getElementByname('login').click();");
            
            // Optional: Wait for the page to load or verify login
            Thread.sleep(3000);  // Replace with explicit waits for a more robust solution

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}