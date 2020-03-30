package com.intervi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDER {
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/Users/prince/Downloads/Driver/chromedriver");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@DataProvider(name="TestData")
	
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		data[0][0] ="Userr";
		data[0][1] = "kk";
		data[1][0] = "lop";
		data[1][1] = "kli"; 
		return data; 
		
	}
	
	
	
	
	
	@Test(dataProvider = "TestData")
	public void run(String usern, String pwf) throws InterruptedException {
	
		driver.findElement(By.name("email")).sendKeys(usern);
		driver.findElement(By.name("pass")).sendKeys(pwf);
		Thread.sleep(4000);
		
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	
}
