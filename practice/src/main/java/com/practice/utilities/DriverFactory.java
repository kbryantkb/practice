package com.practice.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		
	//Firefox driver
		
	if(browserType.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver.exe");
		return new FirefoxDriver();
	}
	
	//MS Edge driver
	
	else if (browserType.equals("edge")){
		System.setProperty("webdriver.safari.driver", System.getProperty("user.dir")+"/msedgedriver.exe");
		return new SafariDriver();
	}
		
	//Opera driver
	
	else if(browserType.equals("opera")) {
		System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"/operadriver.exe");
		return new OperaDriver();
	}
	
	//Chrome driver
	
	else {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		return new ChromeDriver();
	}
	
}

}