package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutor {
public static void main(String[] args) {
	
	//launch chrome browser
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
	//open web page 
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/V4/");
	
	
    //Login to Guru99 		
    driver.findElement(By.name("uid")).sendKeys("mngr34926");					
    driver.findElement(By.name("password")).sendKeys("amUpenu");	
    
    JavascriptExecutor js = (JavascriptExecutor) driver;  
	//js.executeScript(Script,Arguments); syntax..
    
	WebElement button =driver.findElement(By.name("btnLogin"));			
    //Perform Click on LOGIN button using JavascriptExecutor		
    js.executeScript("arguments[0].click();", button);
                           
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //To generate Alert window using JavascriptExecutor. Display the alert message 			
    js.executeScript("alert('Welcome to Vithal Nivargi's website..');");   
	
}
}
