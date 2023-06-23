package com.selenium.code.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinksOnWebPage {
public static void main(String[] args) {
	
	//launch browser like chrome
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
	//instanciate webdriver
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.calculator.net/");
	List<WebElement> listElements = driver.findElements(By.tagName("a"));

	System.out.println("Total webElements present on web page : "+listElements.size());
	listElements.forEach(e->System.out.println(e.getText()));
	driver.close();
}
}
