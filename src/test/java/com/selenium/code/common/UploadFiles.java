package com.selenium.code.common;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFiles {
	public static void main(String[] args) throws AWTException {

		// launch chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\JAVA Exploring\\selenium\\FirstTestCase\\Driver\\chromedriver_win32\\chromedriver.exe");

		// open web page
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		WebElement chooseFile = driver.findElement(By.id("uploadFile"));

		Actions act = new Actions(driver);
		act.moveToElement(chooseFile).click().perform();

		Robot rob = new Robot();
		rob.delay(2000);

		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\Dell\\OneDrive\\Desktop\\Vithal_9373579451.pdf");
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);

		// Ctrl + V
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		driver.close();

	}
}
