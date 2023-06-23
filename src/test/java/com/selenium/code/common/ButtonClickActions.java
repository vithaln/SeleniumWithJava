package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonClickActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		/*
		 * //double click action WebElement button =
		 * driver.findElement(By.xpath("//button[@id='doubleClickBtn']")); Actions
		 * act=new Actions(driver); act.doubleClick(button).perform();
		 */
//Right click action
		WebElement rightclickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclickButton).perform();

	}

}
