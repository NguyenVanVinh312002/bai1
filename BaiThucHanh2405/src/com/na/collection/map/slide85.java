package com.na.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hmString = new HashMap<>();
		hmString.put("c++", "ngon ngu lap trinh C");
		hmString.put("java", "ngon ngu lap trinh Java");
		hmString.put("php", "ngon ngu lap trinh PHP");
		hmString.put("python", "ngon ngu lap trinh Python");
		
		Set<Map.Entry<String, String>> setHashMap= hmString.entrySet();
		System.out.println("cac entry co trong setHashMap: ");
		System.out.println(setHashMap);

	}

}
