package com.practice.api_test_cases;

import io.restassured.*;
import io.restassured.http.ContentType;
import com.practice.json_objects.CommentObjectToJSON;

import org.junit.Test;

public class PostCommentAPITest {

	@Test
	public void test() {
		RestAssured.given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(CommentObjectToJSON.commentToJSON)
			.post("http://qainterview.merchante-solutions.com:3030/comments/")
		.then()
			.statusCode(201)
			.log()
			.all();
		
		
		//fail("Not yet implemented");
	}

}
