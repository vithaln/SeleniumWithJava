package com.selenium.code.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithPageFactory {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.saucedemo.com");
		LoginPageWithPageFactory factory=new LoginPageWithPageFactory(driver);
		
		factory.enterUsername("standard_user");
		factory.enterPassword("secret_sauce");
		factory.clickOnLoginBtn();
	
	
	
	}
	
	
	
}
