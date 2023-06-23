package com.selenium.code.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFormInSinleAction {

	public static void main(String[] args) {
		//launch browser
		WebDriverManager.chromedriver().setup();
		//instantiate web driver
		WebDriver driver=new ChromeDriver();
		//open web page..
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		//use Actions class
		Actions act=new Actions(driver);
		Action action = act.moveToElement(driver.findElement(By.id("user-name"))).click()
		.sendKeys("problem_user",Keys.TAB)
		.sendKeys("secret_sauce",Keys.ENTER).build();
		action.perform();
		
	}
}
