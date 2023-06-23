package com.selenium.code.loactors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
	public static void main(String[] args) {

		// launch browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		// open web page
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.saucedemo.com");
		
		System.out.println("Before Login Title " + driver.getTitle());
		System.out.println("Before Login URL " + driver.getCurrentUrl());
		// locate username By id
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		// locate password By name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		// locate login By tag
		driver.findElement(By.id("login-button")).click();
		System.out.println("After Login Title " + driver.getTitle());
		System.out.println("After Login URL " + driver.getCurrentUrl());

		// switch window
		//driver.switchTo().window(driver.getWindowHandle());
		// link to the product
		// by xpath //button[@id='add-to-cart-sauce-labs-backpack']
		//driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		//driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		//driver.findElement(By.cssSelector("button[name*=light]")).click();

	}
}
