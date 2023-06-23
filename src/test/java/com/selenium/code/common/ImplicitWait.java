package com.selenium.code.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");

		// create object for webdriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");

		Stopwatch watch = null;
		try {
			watch=Stopwatch.createStarted();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			// correct text
			// driver.findElement(By.linkText("START SELLING")).click();
			// wrong text
			driver.findElement(By.linkText("wrongElement")).click();
		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println("Total duration take: " + watch.elapsed(TimeUnit.SECONDS) + " seconds");

		}

		// driver.close();
	}

}
