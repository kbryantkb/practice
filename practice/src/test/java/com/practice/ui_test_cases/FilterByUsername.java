package com.practice.ui_test_cases;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import com.practice.utilities.DriverFactory;
import com.practice.page_factory.NavLinks;
import com.practice.page_factory.UsersPage;


public class FilterByUsername {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		// initializing the driver, navigating to test page and maximizing window
		driver = DriverFactory.open("chrome");
		
		driver.get("http://qainterview.merchante-solutions.com/admin");
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		String username = "Simone.Tremblay";
		
		NavLinks navLinks = new NavLinks(driver);
		
		UsersPage usersPage = new UsersPage(driver);
		
		navLinks.clickUsersLink();
		
		usersPage.clickUsernameFilter();
		
		usersPage.clickFilterOption(driver, "Equals");
		
		usersPage.enterUsernameFilter(username);
		
		usersPage.clickFilter();
		
		String actualUsernameReturned = usersPage.getUsernameText();
		
		Assert.assertEquals("Ensure that the usernamed returned in the search matches the username entered in search bar", username, actualUsernameReturned);
		//fail("Not yet implemented");
	}
	
	@After
	public void tearDown() {
		//closing driver
		driver.close();
	}

}
