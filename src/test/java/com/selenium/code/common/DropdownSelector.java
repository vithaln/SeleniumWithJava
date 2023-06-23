package com.selenium.code.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelector {
public static void main(String[] args) {
	//launch chrome browser
	System.setProperty("webdriver.chrome.driver", "D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
	//open web page 
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	//go to dropdown page
	WebElement element = driver.findElement(By.tagName("Select"));
	Select dropdown=new Select(element);
	//dropdown.selectByIndex(6);
	//dropdown.selectByValue("ALA");
	dropdown.selectByVisibleText("Angola");
	
	
	
	
	/*
	 * if(dropdown.isMultiple()) {
	 * System.out.println("Dropdown is applicable for multiple options select..");
	 * }else {
	 * System.out.println("Dropdown is not applicable for multiple options select.."
	 * );
	 * 
	 * }
	 * 
	 * //multiple options List<WebElement> options = dropdown.getOptions();
	 * System.out.println("Total options: "+options.size()); //fetch all options
	 * for(WebElement e:options) { System.out.println(e.getText()); }
	 */
	
}
}
