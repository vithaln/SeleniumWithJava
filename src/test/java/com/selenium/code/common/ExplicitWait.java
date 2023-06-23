package com.selenium.code.common;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {
	public static void main(String[] args) {

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");

		// create object for webdriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Stopwatch watch = null;
		try {
			watch=Stopwatch.createStarted();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING"))).click();

		} catch (Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println("Total duration take: " + watch.elapsed(TimeUnit.SECONDS) + " seconds");

		}

		// driver.close();
	}
}
