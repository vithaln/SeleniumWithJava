package com.selenium.code.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//without Page factory
public class LoginPage {

	//POM-> Page Object Model is Design pattern 
	//it helps us code readability and loose coupling.
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Identify web elements
	//without page factory
	
	By userName=By.id("user-name");
	By password=By.id("password");
	By loginButton=By.id("login-button");
	
	//operation on the web elements
	
	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnButton() {
		driver.findElement(loginButton).click();
	}
	
	
}
