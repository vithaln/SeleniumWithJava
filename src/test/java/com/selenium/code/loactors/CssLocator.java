package com.selenium.code.loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
public static void main(String[] args) {
	
	
	/**
	//In selenium there are two type of locators.
	1:Basic Locators-->By Id,name,className,tagName,linkText and partialLinkext.
	2:Customized Locator-->CssSelector and xPath.
	
	In this class will see CssSelector.
	*/
	//launch browser
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
	//instantiate webDriver
	WebDriver driver=new ChromeDriver();
	//open web page
	driver.get("http://www.saucedemo.com");
	//maximize window
	driver.manage().window().maximize();
	//find user name element and locate tag#id
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	//find password element and locate tag[attribute=value]
	driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
	//find login element and do click action on login.
	driver.findElement(By.cssSelector("input.submit-button")).click();

	//switch to product page
	String currentWindowHandle = driver.getWindowHandle();
	driver.switchTo().window(currentWindowHandle);
	
	//tag.valueOfClass[attribute=value]
	//add to cart
	//driver.findElement(By.cssSelector("button.btn[id=add-to-cart-sauce-labs-backpack]")).click();

	//add to cart another product
	driver.findElement(By.cssSelector("button.btn[id*=add-to]")).click();


	
	
}

}
