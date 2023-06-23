package com.selenium.code.loactors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_XPath_Locator {

	public static void main(String[] args) {

		//Basic locator concepts....
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		//create object of webdriver
		
		WebDriver driver=new ChromeDriver();
		//open saucedemo.com web page
		driver.get("https://www.saucedemo.com");
		//locate username By id , for this we need to check in html elements.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.tagName("input")).sendKeys("standard_user");
		//locate password By name...
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//driver.findElement(By.tagName("input")).sendKeys("secret_sauce"); Invalid due to having same tag name for usename and password

		driver.findElement(By.name("login-button")).click();
		//linking concepts...> LinkText and PartialLinktext...
		//switch to product page
		driver.switchTo().window(driver.getWindowHandle());
		//driver.findElement(By.linkText("Sauce Labs Bike Light")).click();//here we need to type full text like Sauce Labs Bike Light
		driver.findElement(By.partialLinkText("Sauce")).click();//it will show first product which is starting with Sauce.
		
	}

}
