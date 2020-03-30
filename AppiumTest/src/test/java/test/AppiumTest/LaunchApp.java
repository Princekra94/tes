package test.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {

	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "motorola");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("id", "36cd9beb");
		capabilities.setCapability("appPackage", "com.appypie.snappy");
		capabilities.setCapability("appActivity", "com.appypie.snappy.HomeActivity");
		capabilities.setCapability("app", "/Users/prince/Downloads/APK/17b01ac5ccb4.apk");
		capabilities.setCapability("recreatechromedriversession", "yes");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("autoGrantPermission", "true");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);

		LaunchApp.changeDriverContextToWeb(driver);

		Thread.sleep(3000);

		
		WebElement about =	driver.findElement(By.xpath("//a[@data-productid='loyaltycard']"));
		if (about !=null && about.isDisplayed()) {

			about.click();
		}	
		
		
		
		

	}
	
	
	
	public static boolean changeDriverContextToNative(AppiumDriver<MobileElement> driver) {
		boolean nativeA=false;

		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			if (contextName.contains("NATIVE"))
				driver.context(contextName);
			nativeA=true;
		}
		return nativeA;
	}


	public static boolean changeDriverContextToWeb(AppiumDriver<MobileElement> driver) {
		boolean web=false;
		Set<String> allContext = driver.getContextHandles();
		for (String context : allContext) {
			if (context.contains("WEBVIEW"))
				driver.context(context);
			web=true;
		}
		return web;
	}
	
	
	
	

}