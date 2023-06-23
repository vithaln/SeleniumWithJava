package com.selenium.code.common;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_oR_DeadLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> linklists = driver.findElements(By.tagName("a"));
		System.out.println("TOTAL LINKS " + linklists.size());

		int countBrokenRes = 0;
		int responseCode = 200;
		for (WebElement e : linklists) {
			String url = e.getAttribute("href");

			try {
				URL urllink = new URL(url);
				HttpURLConnection urlConnection = (HttpURLConnection) urllink.openConnection();
				urlConnection.setRequestMethod("HEAD");
				urlConnection.connect();

				responseCode = urlConnection.getResponseCode();
				if (responseCode >= 400) {
					System.out.println("Broken Links==>  " + url);
					countBrokenRes++;
				}
			} catch (MalformedURLException e2) {
				e2.printStackTrace();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
		System.out.println("Broken links " + countBrokenRes);

	}
}
