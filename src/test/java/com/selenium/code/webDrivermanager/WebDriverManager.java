package com.selenium.code.webDrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	public static void main(String[] args) {

		/* Edge browser
		 * 
		 * io.github.bonigarcia.wdm.WebDriverManager.edgedriver().setup(); WebDriver
		 * driver=new EdgeDriver();
		 */
		/*firefox browser
		 * 
		 * io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup(); WebDriver
		 * driver = new FirefoxDriver();
		 * 
		 */
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println("Title-> " + driver.getTitle());
		System.out.println("Current URL: " + driver.getCurrentUrl());

	}
}
