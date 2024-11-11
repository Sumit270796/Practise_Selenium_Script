package EncodePassword;

import java.util.Base64;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class EncodePassword {
WebDriver driver ;

@Test
public void encodePassword() {
	
	
    String password ="admin123" ;
   String encodePassword = Base64.getEncoder().encodeToString(password.getBytes());
     System.out.println(encodePassword);

}}
