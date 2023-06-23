package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
public static void main(String[] args) {
	//launch chrome browser
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
			//open web page 
			WebDriver driver =new ChromeDriver();
			driver.get("https://pages.ebay.in/photocenter/");
			WebElement element = driver.findElement(By.linkText("My eBay"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
}
}
