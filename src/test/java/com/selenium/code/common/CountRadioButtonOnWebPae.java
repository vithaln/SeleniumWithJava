package com.selenium.code.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtonOnWebPae {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\\\New folder\\\\JAVA Exploring\\\\selenium\\\\FirstTestCase\\\\Driver\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.calculator.net/");
driver.get("https://materializecss.com/radio-buttons.html");
//List<WebElement> elements = driver.findElements(By.xpath("//input[@name='scirdsetting']"));
List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));//type is same for all radio buttons so i used xpath.
System.out.println("Total radio buttons on web page "+elements.size());
driver.close();























}
}
