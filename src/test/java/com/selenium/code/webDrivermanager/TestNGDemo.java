package com.selenium.code.webDrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {

	/*
	 * Some Important rules :- 
	 * 
	 * 1:TestNG does not require main(). 
	 * 2:Method should
	 * not be static. 
	 * 3:@Test need to be declare method 
	 * 4:import annotation
	 * org.testng.annotations.Test.
	 * 5:Use Assert class to verify actual results with
	 * expected result.
	 */
	

@Test
public void verifyTitlePage() {
	
	//launch chrome browser
	WebDriverManager.chromedriver().setup();
	
	//create Webdrive object
	WebDriver driver=new ChromeDriver();
	
	//open web page https://www.google.com
	driver.get("https://www.google.com");
	
	//fetch title 
	String actualResult = driver.getTitle();
	
	//Expected Result
	String expectedResult="Google";
	
	Assert.assertEquals(actualResult, expectedResult);
}
	
	
}
