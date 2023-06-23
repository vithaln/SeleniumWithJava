package com.selenium.code.datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {

		// launch Browser
		WebDriverManager.chromedriver().setup();
		// create object of Webdriver
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// open web page
		driver.get("https://jqueryui.com/datepicker/");
		// switch to iframe because Date elemet is present inside iframe.
		driver.switchTo().frame(0);
		// find Date element
		driver.findElement(By.id("datepicker")).click();
		
		// Expected Year,Month and Day.
		String expectedYear = "2023";
		String expectedMonth = "June";
		String expectedDay = "16";

		while (true) {

			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if (calenderYear.equals(expectedYear) && calenderMonth.equals(expectedMonth)) {

				List<WebElement> dayLists = driver.findElements(By.xpath("//table/tbody/tr/td"));//35 elements matches

				// iterate by using for each loop
				for (WebElement e : dayLists) {

					String calenderDay = e.getText();

					//it will iterate until we get correct day
					if (calenderDay.equals(expectedDay))
					{
						e.click();
						break;
					}
				}
				break;
			} 
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
	}

}
