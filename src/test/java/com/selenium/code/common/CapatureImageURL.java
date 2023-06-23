package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapatureImageURL {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//by xpath
	//WebElement imgeElement = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//by classname
	WebElement imgeElement = driver.findElement(By.className("fb_logo"));

	String attributeValue = imgeElement.getAttribute("src");
	System.out.println("Value of Image: "+attributeValue);
	driver.quit();
}
}
