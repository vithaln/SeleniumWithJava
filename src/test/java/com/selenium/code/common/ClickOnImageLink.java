package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImageLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\JAVA Exploring\\\\selenium\\\\FirstTestCase\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/");
	//for Image link we cannot use linkText() and partialLinkTesxt()...
	
	// we can use cssSelector and xpath
//	by using xpath selector
	//driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
	
	//by usig cssSelector
	driver.findElement(By.cssSelector("img[title*=OpenCart]")).click();
	//verify the current page with expected page title
	if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
		System.out.println("Test case passed..");
	}else {
		System.out.println("Sorry Test case is failed...");
	}
	//browser close
	driver.close();
}
}
