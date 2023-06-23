package com.selenium.code.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println("Title: "+driver.getTitle());
	driver.navigate().to("https://facebook.com");
	System.out.println("Title : "+driver.getTitle());
	driver.navigate().back();//navigate to google.com
	System.out.println("Title: "+driver.getTitle());
	driver.navigate().forward();//fb
	System.out.println("Title: "+driver.getTitle());
	driver.navigate().refresh();//refreshes the page.
	
}
}
