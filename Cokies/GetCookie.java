package Cokies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

public class GetCookie {
WebDriver driver;
@BeforeTest
public void Init() {
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}	

@Test (priority =1)
 public void addCookie() {
	Cookie abc = new Cookie("Output", "123");
	driver.manage().addCookie(abc);


}
@Test (priority =2)
 public void getCookie() {	
Set<Cookie> CookieList = driver.manage().getCookies();
	for (Cookie Clist : CookieList) {
		System.out.println("Cookie name   "+Clist.getName()+"   CookieValue    "+Clist.getValue());

	}}
@Test 
public void deleteCookie() {
driver.manage().deleteCookieNamed("Output");
}

@AfterTest
public void tearDown() {
	driver.quit();
}



}
