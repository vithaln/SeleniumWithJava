package com.selenium.code.common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// open web page
		driver.get("https://demoqa.com/alerts");
		/*
		 * simple alert.. //click alert/click me
		 * driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		 * 
		 * //wait 2 sec try { Thread.sleep(2000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } //accept ok button
		 * clicked. 
		 * driver.switchTo().alert().accept();
		 */

		// conformation alert..
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();

		
		/*
		 * //prompt alert driver.findElement(By.id("promtButton")).click();
		 * driver.switchTo().alert().sendKeys("Hey Vithal");
		 * driver.switchTo().alert().accept();
		 */
		
		
	}
}
