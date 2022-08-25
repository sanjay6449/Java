package com.SamplePrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	    System.setProperty("webdriver.chrome.driver",
	    		"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\driverr\\chromedriver.exe");
	    
       WebDriver driver = new ChromeDriver();
       driver.get("https://adactinhotelapp.com/index.php");
       driver.manage().window().maximize();
       WebElement username = driver.findElement(By.id("username"));
       username.sendKeys("sanjaymanikandan");
       WebElement password = driver.findElement(By.id("password"));
       password.sendKeys("6W0U9W");
       Thread.sleep(3000);
       WebElement login = driver.findElement(By.id("login"));
       login.click();
       WebElement location = driver.findElement(By.className("search_combobox"));
       location.click();
       Select s1 = new Select(location);
       s1.selectByIndex(6);
       WebElement hotels = driver.findElement(By.id("hotels"));
       hotels.click();
       Select s2 = new Select(hotels);
       s2.selectByIndex(2);
       WebElement roomtype = driver.findElement(By.id("room_type"));
       roomtype.click();
       Select S3 = new Select(roomtype);
       S3.selectByVisibleText("Super Deluxe");
       WebElement roomnumber = driver.findElement(By.name("room_nos"));
       roomnumber.click();
       Select s4 = new Select(roomnumber);
       s4.selectByIndex(4);
       WebElement checkin = driver.findElement(By.name("datepick_in"));
       checkin.clear();
       checkin.sendKeys("15/05/2022");
       WebElement checkout = driver.findElement(By.xpath("//input[@name = 'datepick_out']"));
       checkout.clear();
       checkout.sendKeys("18/05/2022");
       WebElement adults = driver.findElement(By.id("adult_room"));
       adults.click();
       Select s5 = new Select(adults);
       s5.selectByIndex(2);
       WebElement childrens = driver.findElement(By.name("child_room"));
       childrens.click();
       Select s6 = new Select(childrens);
       s6.selectByIndex(3);
       Thread.sleep(3000);
       WebElement search = driver.findElement(By.id("Submit"));
       search.click();
       WebElement select = driver.findElement(By.name("radiobutton_0"));
       select.click();
       Thread.sleep(3000);
       WebElement click = driver.findElement(By.id("continue"));
       click.click();
       WebElement firstname = driver.findElement(By.name("first_name"));
       firstname.sendKeys("sanjay");
       WebElement address = driver.findElement(By.className("txtarea"));
       address.sendKeys("no:58,moorthy nagar, porur,chennnai-600077");
       WebElement cardno = driver.findElement(By.id("cc_num"));
       cardno.sendKeys("4838242077778600");
       WebElement cardtype = driver.findElement(By.name("cc_type"));
       Select s7 =new Select(cardtype);
       s7.selectByIndex(3);
       WebElement expirymonth = driver.findElement(By.name("cc_exp_month"));
       Select s8 =new Select(expirymonth);
       s8.selectByIndex(6);
       WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
       Select s9 = new Select(expiryyear);
       s9.selectByVisibleText("2022");
       WebElement cvv = driver.findElement(By.name("cc_cvv"));
       cvv.sendKeys("699");
       WebElement book = driver.findElement(By.xpath("//input[@onclick=\"book_hotel_validate();\"]"));
       book.click();
       Thread.sleep(3000);
       TakesScreenshot san = (TakesScreenshot)driver;
       File source = san.getScreenshotAs(OutputType.FILE);
       File des = new File ("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\Screenshots\\miniproject1.png");
       FileUtils.copyFile(source, des);
       
       
     
       
       
	}

}
