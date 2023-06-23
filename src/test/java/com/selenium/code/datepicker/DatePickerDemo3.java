package com.selenium.code.datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo3 {
	public static void main(String[] args) {

		// 31-Mar-2024;

		String expectedDay = "31";
		String expectedMonthYear = "March 2024";
		

		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.goibibo.com/");

		// find date picker webelement to perform click action

 driver.findElement(By.xpath("//p[@class='sc-12foipm-18 dxLXYg fswWidgetTitle']")).click();


		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("//div[text()='March 2024']")).getText();
				

			if (calenderMonthYear.equals(expectedMonthYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));

				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
						break;

					}
				}

				break;
			} else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
	}
}
