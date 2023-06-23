package com.selenium.code.encryptions;

import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PasswordEncoderExample {
public static void main(String[] args) {
	
	String str="secret_sauce";
	//encode password 
	byte[] encodeBase64 = Base64.encodeBase64(str.getBytes());
	System.out.println("Encoded password=> "+new String(encodeBase64));

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.saucedemo.com");
	
	//decode password
	byte[] decodeBase64 = Base64.decodeBase64(encodeBase64);
	driver.findElement(By.id("user-name")).sendKeys("problem_user");
	driver.findElement(By.id("password")).sendKeys(new String(decodeBase64));

	driver.findElement(By.id("login-button")).click();
	
//	driver.quit();
	



}
}
