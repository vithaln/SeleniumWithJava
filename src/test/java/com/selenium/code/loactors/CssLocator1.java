package com.selenium.code.loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator1 {

	public static void main(String[] args) {

		// launch the broweser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		//open web page
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com");
//driver.findElement(By.id("username")).sendKeys("standard_user");
//		locate tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
//		locate password tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
//		locate login tag.classname
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//switch window 
		driver.switchTo().window(driver.getWindowHandle());
		//tag.[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

		//^ ->startsWith and $ endsWith ,*contains in string.
		driver.findElement(By.cssSelector("button[name*=light]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
