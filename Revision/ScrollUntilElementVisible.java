package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScrollUntilElementVisible {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();

        
        driver.get("https://www.facebook.com/");

        // Locate the element you want to scroll to
        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Meta © 2024']"));

        // Use JavaScript to scroll until the element is in view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Optionally, add some delay or additional checks if needed
        // Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}


