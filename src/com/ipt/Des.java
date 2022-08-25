package com.ipt;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Des {
	
	public static void main(String[] args) {
		
		Integer	 price = 899;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Programs\\driverr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		
		List<WebElement> product = driver.findElements(By.xpath("//li[@class='product-base']"));
	    
		List<WebElement> dprices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		for (WebElement disprice:dprices) {
			
			String productprice = disprice.getText().replace("Rs. ", "");
			System.out.println(productprice);
			
			int parseInt = Integer.parseInt(productprice);
			if (parseInt == price) {
				
				WebElement productname = disprice.findElement(By.xpath("//ancestor::div[@class='product-price']//preceding-sibling::h3"));
				
				String productdetails = productname.getText();

				System.out.println(productdetails);
			}
		}
}


}
