package com.selenium.code.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//08-July-2023;

//				String expectedDay = "8";
//				String expectedMonth = "June";
				String expectedYear="2023";
				//maximise browser
				driver.manage().window().maximize();

				//open url
				driver.get("https://demo.automationtesting.in/Datepicker.html");

				
				//find date picker webelement to perform click action
				WebElement datepicker = driver.findElement(By.id("datepicker2"));
				datepicker.click();

				WebElement calenderMonth = driver.findElement(By.xpath("//select[@title='Change the month']"));
				Select dropDownMonth=new Select(calenderMonth);
				dropDownMonth.selectByIndex(5);
				
				WebElement calenderYear = driver.findElement(By.xpath("//select[@title='Change the year']"));
				Select dropDownYear=new Select(calenderYear);
				dropDownYear.selectByIndex(10);
				
				driver.findElement(By.xpath("//a[@class='dp1654583400000  datepick-selected']")).submit();
	
	driver.close();
	
	
	}

}
