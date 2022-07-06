
package com.SamplePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Execution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Maven_Project_Intro\\Driver\\chromedriver.exe");
		String url = "https://www.ajio.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//JavaScript Executor
		JavascriptExecutor aj =(JavascriptExecutor) driver; // narrowing
		//scroll down
		aj.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(4000);
		//scroll up
		aj.executeScript("window.scrollBy(0,-8000)");
		Thread.sleep(4000);
		// to get last page
		WebElement returns = driver.findElement(By.xpath("//a[text()='Returns']"));
		Thread.sleep(4000);
		aj.executeScript("arguments[0].click();", returns);
	
	}

}
