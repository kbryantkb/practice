package com.practice.json_objects;

import com.google.gson.Gson;
import com.practice.java_objects.CommentObject;

public class CommentObjectToJSON {
	
	private static CommentObject newComment = new CommentObject("keith", "kbryant@mailinator.com", " I wonder if I can truly be ok");

	private static Gson gson = new Gson();
	
	public static String commentToJSON = gson.toJson(newComment);
}
