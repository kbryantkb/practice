package com.practice.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.practice.utilities.UIMethods;

public class UsersPage {
	
	
	private WebDriver driver;
	
	public UsersPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By newUserButton = By.cssSelector("#titlebar_right span.action_item > a");
	private By usernameFilter = By.cssSelector("#q_username_input > select");
	private By usernameFilterTypeOptions = By.cssSelector("#q_username_input > select > option");
	private By usernameFilterTextbox = By.cssSelector("#q_username");
	private By filterButton = By.cssSelector("#new_q > div.buttons > input:first-child");
	private By usernameText = By.cssSelector("#index_table_users > tbody > tr:first-child > td:nth-child(3)");
	
	public void clickNewUserButton() {
		driver.findElement(newUserButton).click();
	}
	
	public void clickUsernameFilter() {
		driver.findElement(usernameFilter).click();
	}
	
	public void clickFilterOption(WebDriver driver, String filterOption) {
		UIMethods.selectDropdownItem(driver, filterOption, usernameFilterTypeOptions);
	}
	
	public void enterUsernameFilter(String username) {
		driver.findElement(usernameFilterTextbox).sendKeys(username);
	}
	
	public void clickFilter() {
		driver.findElement(filterButton).click();
	}
	
	public String getUsernameText()	{
		return driver.findElement(usernameText).getText();
	}

}
