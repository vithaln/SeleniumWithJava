package com.selenium.code.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapatureScreeshot {

	public static void main(String[] args) throws IOException {
		/*
		 * full page screenshot==>
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("https://demoqa.com/buttons");
		 * 
		 * TakesScreenshot screenShot=(TakesScreenshot)driver; 
		 * File src = screenShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destination=new
		 * File("D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\screenshots\\first.png"
		 * );
		 * 
		 * FileUtils.copyFile(src, destination);
		 */

		// section wise sceenshot
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement element = driver.findElement(By.xpath("// div[@class='main-header']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\screenshots\\second.png");
		
		FileUtils.copyFile(src, target);
	}

}
