package com.practice.api_test_cases;

import io.restassured.RestAssured;

import org.junit.Test;

public class GetUsersAPITest {

	@Test
	public void test() {
		
		RestAssured.get("http://qainterview.merchante-solutions.com:3030/users")
		.then()
			.statusCode(200)
			.log()
			.all();
		
		//fail("Not yet implemented");
	}

}
