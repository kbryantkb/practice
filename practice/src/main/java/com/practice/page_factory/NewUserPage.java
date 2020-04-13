package com.practice.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserPage {
	
	private WebDriver driver;
	String username, password, emailAddress;
	
	public NewUserPage(WebDriver driver, String username, String password, String emailAddress) {
		super();
		this.driver = driver;
		this.username = username;
		this.password = password;
		this.emailAddress = emailAddress;
	}
	
	private By usernameTextbox = By.cssSelector("#user_username");
	private By passwordTextbox = By.cssSelector("#user_password");
	private By emailAddressTextbox = By.cssSelector("#user_email");
	private By submitButton = By.name("commit");
	
	public void enterUsername() {
		driver.findElement(usernameTextbox).sendKeys(username);
	}
	
	public void enterPassword()	{ 
		driver.findElement(passwordTextbox).sendKeys(password);
	}
	
	public void enterEmailAddress()	{
		driver.findElement(emailAddressTextbox).sendKeys(emailAddress);
	}
	
	public void clickSubmit()	{
		driver.findElement(submitButton).click();
	}

}
