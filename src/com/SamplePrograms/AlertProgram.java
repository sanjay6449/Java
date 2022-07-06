
package com.SamplePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertProgram {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		//simple alert
		WebElement simple = driver.findElement(By.xpath("//button[@onclick= 'normalAlert()']"));
        simple.click();
        Thread.sleep(4000);
        Alert simplealert = driver.switchTo().alert();
        simplealert.accept();
        //confirm alert
        WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
        confirm.click();
        Thread.sleep(4000);
        Alert confirmalert = driver.switchTo().alert();
        confirmalert.accept();
        //prompt alert
        WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
        prompt.click();
        Thread.sleep(4000);
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("image");
        String text = promptalert.getText();
        System.out.println(text);
        promptalert.accept();
        //TakeScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        //getScreenshotAs
        File src = ts.getScreenshotAs(OutputType.FILE);
        //Location
        File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Screenshots\\alert.png");
        FileUtils.copyFile(src, des);
        
		
	}

}
