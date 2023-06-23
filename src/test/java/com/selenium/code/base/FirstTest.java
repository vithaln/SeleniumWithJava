package com.selenium.code.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {

		// 1:launch chrome browser..
		System.setProperty("webdriver.chrome.driver", "D:\\Selemium-Tutorials\\chromedriver_win32\\chromedriver.exe");
		//instatiate webdriver
		WebDriver wd = new ChromeDriver();
		// 2:launch chrome web page..
		wd.navigate().to("https://www.google.com"); 
		// 3:capture title of the web page..
		String title = wd.getTitle();
		System.out.println("Web Title " + title);
		// 4:capure URL of web page.
		String currentUrl = wd.getCurrentUrl();
		System.out.println("URL of the Web Page " + currentUrl);
		Thread.sleep(4000);
		wd.close();
		
		/*
		 * use of navigate 
		 * wd.navigate().to("google");//google
		 * wd.navigate().to("fb");
		 * //fb wd.navigate().back();//google
		 * wd.navigate().forward();//fb
		 * 
		 * isDisplayed(),isEnabled(),isSelected();
		 */		
		/*
		 * // launch chrome browser System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selemium-Tutorials\\chromedriver_win32\\chromedriver.exe"); // create
		 * object of webDriver
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * driver.navigate().to("http://google.com"); //capture title String title =
		 * driver.getTitle(); System.out.println("Title " + title); //capture url String
		 * currentUrl = driver.getCurrentUrl(); System.out.println("URL " + currentUrl);
		 */
	}

}
