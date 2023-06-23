package com.selenium.code.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {

	
	WebDriver driver;
	
	public LoginPageWithPageFactory(WebDriver driver) {
		
		this.driver=driver;
		//this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	//Identify web elements with pageFactory approach we can't use findElemet instead we use @FindBy()
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//operations on web elements
	
	public void enterUsername(String uName) {
		userName.sendKeys(uName);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
}
