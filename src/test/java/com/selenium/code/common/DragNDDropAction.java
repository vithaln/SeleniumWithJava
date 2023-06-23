package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDDropAction {
public static void main(String[] args) {
	
	//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		//open web page 
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		WebElement source = driver.findElement(By.id("box3"));
		WebElement target = driver.findElement(By.id("box103"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
	//	driver.close();
}
}
