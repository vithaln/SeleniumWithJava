package com.selenium.code.autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	// upload file by using(Invoke) AutoIT finder and AutoIT-script Editor .
	//AutoIT is used to work with window based applications.
	/**
	 * 1:write script to upload file (open AutoIt and script use finder tool to drag
	 * and use controlFocus and controlText and controlClick)
	 * 
	 * ControlFocus("Open","","Edit1")
	 * ControlSetText("Open","","Edit1",$CmdLine[1])
	 * ControlClick("Open","","Button1")
	 * 
	 * then save it, compile it through tools compile.
	 * 
	 * 2:compile script and create exe-->save->tools->compile->select prosesser 64
	 * 3:use exe in selenium code, by using RunTime class
	 
	 Note: intially we have to open Au3Info_x64 and SciTE
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {

		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		// open web page
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");

		// maximize window
		driver.manage().window().maximize();
		// find choose element
		WebElement chooseFile = driver.findElement(By.id("uploadFile"));
		// click on choose button
		Actions act = new Actions(driver);
		act.moveToElement(chooseFile).click().perform();

		
		
		try {
			Thread.sleep(3000);
			// integrate with AutoIt script .
			Runtime.getRuntime()
					.exec("C://Users//Dell//OneDrive//Desktop//UploadFiles.exe" + " " + "D:\\Vithal_Notes.java");
						//this path is after compile we get .exe file that file path.     this is choose file any pdf of text with full path.
			Thread.sleep(2000);
		
		} catch 
		(IOException e) {
			e.printStackTrace();
		}

	}

}
