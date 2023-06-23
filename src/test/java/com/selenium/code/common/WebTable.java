package com.selenium.code.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		//find total row size
		 List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		 int rowSize = rowElements.size();
		 System.out.println("Total Row elements size => "+rowSize);
		 
		 //find total column size
		 List<WebElement> columnElements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		 int columnSize = columnElements.size();
		 System.out.println("Total Column size => "+columnSize);
		 
		 
		 
		 
	}

}
