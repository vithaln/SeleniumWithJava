package com.selenium.code.scrolls;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScroll {
public static void main(String[] args) {
	
//launch chrome browser
	WebDriverManager.chromedriver().setup();
	
	//open web page
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.calculator.net/");
	
	//maximize screen
	driver.manage().window().maximize();
	//horizontal scroll
	//driver.get("different url");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

	JavascriptExecutor excutor=(JavascriptExecutor)driver;
	
	//scroll vertically down by 500 pixels
	//excutor.executeScript("window.scrollBy(0,500)");
	
	//scroll till visibility of element.
	
	//WebElement element=driver.findElement(By.linkText("BMI Calculator"));
	//excutor.executeScript("arguments[0].scrollIntoView();", element);
	
	//to scroll down the web page at the bottom of the page
	excutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	//horizontal scroll on the web page
	//till any element
	//WebElement element = driver.findElement(By.id("a7"));
	//excutor.executeScript("arguments[0].scrollIntoView();", element);
}
}
