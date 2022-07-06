 package com.SamplePrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe"	);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		//mouse events
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		
		Actions aj = new Actions(driver);
		aj.dragAndDrop(src, des).build().perform();
		aj.dragAndDropBy(src, 20,120).build().perform();
		Thread.sleep(2000);
		aj.clickAndHold(src).moveToElement(des).build().perform();
		
		//keyboard events -----> Robot
		driver.navigate().to("https://www.google.com/");
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		Robot rj = new Robot();
		aj.contextClick(images).build().perform();
		rj.keyPress(KeyEvent.VK_DOWN);
		rj.keyRelease(KeyEvent.VK_DOWN);
		rj.keyPress(KeyEvent.VK_ENTER);
		rj.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Robot vj = new Robot();
		aj.contextClick(gmail).build().perform();
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
		
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
		
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
		
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
		
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
		
		vj.keyPress(KeyEvent.VK_DOWN);
		vj.keyRelease(KeyEvent.VK_DOWN);
	
		vj.keyPress(KeyEvent.VK_ENTER);
		vj.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
