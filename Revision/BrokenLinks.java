package Revision;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrokenLinks {
	WebDriver driver;
	    public static void main(String[] args) {
	       

	        
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("https://www.facebook.com/r.php");

	        // Find all links on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        int brokenLinksCount = 0;

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url == null || url.isEmpty()) {
	                System.out.println("URL is either not configured or it is empty");
	                continue;
	            }

	            try {
	                // Create a connection to the URL
	                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();

	                // Check the HTTP response code
	                int responseCode = connection.getResponseCode();
	                if (responseCode >= 400) {
	                    System.out.println(url + " is a broken link.");
	                    brokenLinksCount++;
	                }
	            } catch (IOException e) {
	                System.out.println("Error checking link: " + url);
	                brokenLinksCount++;
	            }
	        }

	        System.out.println("Total broken links: " + brokenLinksCount);
	        
	        // Close the driver
	        driver.quit();
	    }
	}
