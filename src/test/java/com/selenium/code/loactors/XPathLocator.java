package com.selenium.code.loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.util.internal.logging.Log4J2LoggerFactory;

public class XPathLocator {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.saucedemo.com");
	
	//relative path //tagName
	//locate user-name By single xPath locator
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//locate user-name By single xPath locator
	driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();

	//switch to product page
	driver.switchTo().window(driver.getWindowHandle());
	//locate username by using and , or. add cart button
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
	
	
	//locate password by using or.
//log.info("locate password by using XPath locator or-operation..add to cart,,..");
//System.out.println("======================");
//	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']")).click();

	//xpath -> contains(),text(),position(),last(). used for dynamic changing values of attributes.+
//driver.findElement(By.xpath("//*[contains(@id,'add-to-cart')]")).click(); //valid..
//driver.findElement(By.xpath("//*[text(),'Accepted usernames are:']")).click();

	
}
}
