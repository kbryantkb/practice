package com.practice.api_test_cases;

import org.junit.Test;
import com.practice.json_objects.PostObjectToJSON;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutPostAPITest {

	@Test
	public void test() {
		RestAssured.given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(PostObjectToJSON.postToJSON)
		.put("http://qainterview.merchante-solutions.com:3030/posts/2")
	.then()
		.statusCode(200)
		.log()
		.all();
		//fail("Not yet implemented");
	}

}
