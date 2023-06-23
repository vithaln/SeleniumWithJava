package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleToolTip {

	public static void main(String[] args) {


		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		//maximize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open web page
		driver.get("https://www.w3schools.com/howto/howto_css_tooltip.asp");
		String actualTitle = driver.findElement(By.xpath("//a[@href='/java/default.asp']")).getAttribute("title");

		String expectedTitle="Java Tutorial";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test case passed!..");
		}
		else {
			System.out.println("Sorry try again, Test case is failed..");
		}
		driver.quit();
		
		
		///
		/*
		 * WebElement findElement =
		 * driver.findElement(By.xpath("//a[@href='/java/default.asp']")); String
		 * acualResult = findElement.getAttribute("title");
		 */


		
	}

}
