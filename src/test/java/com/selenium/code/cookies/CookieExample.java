package com.selenium.code.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//get all cookies from https://www.amazon.in/
		Set<Cookie> cookies = driver.manage().getCookies();
		//find total no of cookies
		System.out.println("Total no of cookies : "+cookies.size());
		//iterate all cookies on by one
		for(Cookie cookie:cookies) {

			System.out.println("Cookie name : "+cookie.getName()+" Cookie value: "+cookie.getValue());	
		}
		
		//add cookie
		Cookie ck=new Cookie("TestCookiee", "https://www.amazon.in/");
		driver.manage().addCookie(ck);
		
		//get all cookies from https://www.amazon.in/
				Set<Cookie> cookiees = driver.manage().getCookies();
				//find total no of cookies
				System.out.println("Total no of cookies After adding Cookie : "+cookiees.size());
				//iterate all cookies on by one
				for(Cookie cookie:cookiees) {

					System.out.println("Cookie name : "+cookie.getName()+" Cookie value: "+cookie.getValue());	
				}
				//get cookie by name
				Cookie cookieNamed = driver.manage().getCookieNamed("TestCookiee");
				System.out.println("Get cookie by name : "+cookieNamed);
				//delete cookie
				driver.manage().deleteCookie(ck);
				//get all cookies from https://www.amazon.in/
				Set<Cookie> cookiee = driver.manage().getCookies();
				//find total no of cookies
				System.out.println("Total no of cookies After deleting Cookie : "+cookiee.size());
				//iterate all cookies on by one
				for(Cookie cookie:cookiee) {

					System.out.println("Cookie name : "+cookie.getName()+" Cookie value: "+cookie.getValue());	
				}
				//delete cookie by name..
				//driver.manage().deleteCookieNamed("");
				driver.quit();
			
				
	}
}
