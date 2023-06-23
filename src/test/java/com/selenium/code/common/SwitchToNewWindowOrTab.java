package com.selenium.code.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindowOrTab {

	public static void main(String[] args) {

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");

		// instaanciate webdriver
		WebDriver driver = new ChromeDriver();
		// open web page
		driver.get("https://www.google.com");
		System.out.println("First Title of Gooogle " + driver.getTitle());

		// switch to new window
		driver.switchTo().newWindow(WindowType.TAB);
		// open new web page
		driver.get("https://www.facebook.com");
		System.out.println("Second page Title of Facebook " + driver.getTitle());

		// get window handles
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);

		//driver.close();

		// switch to google page
		driver.switchTo().window(list.get(0));
		System.out.println("First Page Title of Gooogle " + driver.getTitle());
		
		driver.quit();

	}

}
