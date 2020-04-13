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
import com.practice.page_factory.NewUserPage;
import static com.practice.utilities.StringMethods.stringRandomizer;
import com.practice.page_factory.UserDetailsPage;



public class CreateUserTest {
	
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
		
		//Fill in user form with random data in order to test the user forms and ensure that data is accurate on user details page
		String username = stringRandomizer(12,"alphanumeric");
		
		String password = stringRandomizer(12, "alphanumericCase");
		
		String emailNoDomain = stringRandomizer(8, "alphabetic") ;
		
		//creating instances of page factory objects given the driver used
		NavLinks navLinks = new NavLinks(driver);
		
		UsersPage usersPage = new UsersPage(driver);
		
		String expectedSuccessMessage = "User was successfully created.";
		
		NewUserPage newUserPage = new NewUserPage(driver, username, password, emailNoDomain + "@mailinator.com");
		
		UserDetailsPage userDetails = new UserDetailsPage(driver);
		
		//page factory methods used in test
		navLinks.clickUsersLink();
		
		usersPage.clickNewUserButton();
		
		newUserPage.enterUsername();
		
		newUserPage.enterPassword();
		
		newUserPage.enterEmailAddress();
		
		newUserPage.clickSubmit();
		
		String actualSuccessMessage = userDetails.getSuccessMessage();
		
		String actualUserDetailTitle = userDetails.getUserDetailsTitle();
		
		//generating an assertion based on the proper user details page being returned 
		Assert.assertEquals("Ensure that the correct success message returns", expectedSuccessMessage, actualSuccessMessage);
		
		Assert.assertEquals("Ensure that the correct username is returned as the title of user details page", username, actualUserDetailTitle);
		
		//fail("Not yet implemented");
	}
	
	@After
	public void tearDown() {
		//closing driver
		driver.close();
	}

}
