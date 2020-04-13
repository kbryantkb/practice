package com.practice.json_objects;

import com.google.gson.Gson;
import com.practice.java_objects.PostObject;

public class PostObjectToJSON {
	private static PostObject newPost = new PostObject("What I think About Fruit", "Fruit is pretty good");

	private static Gson gson = new Gson();
	
	public static String postToJSON = gson.toJson(newPost);

}
