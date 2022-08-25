package com.ipt;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_All_Data {

	static int countryIndex ;
	public static void main(String[] args) {
		
		String given_country  ="India";
		
		System.setProperty("webdriver.chrome.driver",".\\driverr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id =\"main_table_countries_today\"]/tbody[1]/tr"));
		for (int i = 0; i < allrows.size(); i++) {
			 List<WebElement> alldata = allrows.get(i).findElements(By.xpath("td"));
			 for (int j = 0; j < alldata.size(); j++) {
				 if (j==countryIndex) {
					 if ( alldata.get(j).getText()==given_country) {
						 System.out.println(alldata.get(j).getText());
					}
					
				}
				 
				
			}
			
		}
	}
}
