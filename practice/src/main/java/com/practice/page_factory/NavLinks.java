package com.practice.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavLinks {
	
	private WebDriver driver;
	
	public NavLinks(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By usersLink = By.cssSelector("#users > a");
	
	public void clickUsersLink() {
		driver.findElement(usersLink).click();
	}
	

}
