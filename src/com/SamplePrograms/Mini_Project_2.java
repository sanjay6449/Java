
package com.SamplePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signinn = driver.findElement(By.xpath("//a[@class='login']"));
		signinn.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mailltosanjay6449@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("sanjay@sanjay");
		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		signin.click();
		WebElement dresses = driver.findElement(By.xpath("(//a[@title = 'Dresses'])[2]"));
		dresses.click();
		JavascriptExecutor aj =(JavascriptExecutor) driver;
		aj.executeScript("window.scrollBy(0,500)");
		WebElement summerdress = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		summerdress.click();
		JavascriptExecutor vj =(JavascriptExecutor) driver;
		vj.executeScript("window.scrollBy(0,500)");
		WebElement selection = driver.findElement(By.xpath("(//a[@title='Printed Chiffon Dress'])[2]"));
		selection.click();
		WebElement size = driver.findElement(By.name("group_1"));
		Select a = new Select(size);
		a.selectByIndex(2);
		WebElement color = driver.findElement(By.name("Green"));
		color.click();
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();
		WebElement checkout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		checkout.click();
		WebElement proceed =driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		proceed.click();
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();
		WebElement procd = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		procd.click();
		JavascriptExecutor gj =(JavascriptExecutor) driver;
		gj.executeScript("window.scrollBy(0,500)");
		WebElement check = driver.findElement(By.xpath("//a[@class='cheque']"));
		check.click();
		WebElement confirm = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		confirm.click();
		TakesScreenshot  mini2 = (TakesScreenshot) driver;
		File src = mini2.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Screenshots\\mini2.png");
        FileUtils.copyFile(src, des);
	}

}
