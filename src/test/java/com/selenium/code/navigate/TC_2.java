package com.selenium.code.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://ultimateqa.com/dummy-automation-websites/#SauceDemo_E-Commerce");


	driver.findElement(By.linkText("API documentation here")).click();

//	Thread.sleep(2000);
	//driver.close();
	//driver.quit();
	
	
	
}
}
