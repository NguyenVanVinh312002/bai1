package com.na.collection.list;

import java.util.ArrayList;

public class slide21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arlString = new ArrayList<String>();
		arlString.add("red");
		arlString.add("blue");
		arlString.add("orange");
		arlString.add("green");
		arlString.remove("green");
		arlString.add("pink");
		arlString.add("yellow");
		
		System.out.println(arlString.get(1));
		System.out.println(arlString.contains("orange"));
		System.out.println(arlString.size());
		System.out.println(arlString);

	}

}
