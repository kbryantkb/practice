package com.practice.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDetailsPage {
	
	private WebDriver driver;
	
	public UserDetailsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By notification = By.cssSelector("div.flash_notice");
	
	private By pageTitle = By.cssSelector("#page_title");
	
	public String getSuccessMessage() {
		return driver.findElement(notification).getText();
	}
	
	public String getUserDetailsTitle() {
		return driver.findElement(pageTitle).getText();
	}
	
}
