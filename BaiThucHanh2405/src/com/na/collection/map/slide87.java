package com.na.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashMapCiTy = new HashMap<String, String>();
		hashMapCiTy.put("QN", "quang ninh");
		hashMapCiTy.put("QN", "quang nam");
		hashMapCiTy.put("QNg", "quang ngai");
		hashMapCiTy.put("HCM", "ho chi minh");
		Set<Map.Entry<String, String>> setCiTy= hashMapCiTy.entrySet();
		System.out.println("cac thanh pho trong hashMapCiTy:");
		System.out.println(hashMapCiTy);
		System.out.println("QNg: "+ hashMapCiTy.get("QNg"));
	
		System.out.println("NT: "+hashMapCiTy.get("NT"));
		
		if(hashMapCiTy.containsValue("ho chi minh"))
		{
			System.out.println("co thanh pho ho chi minh trong hashMapCiTy");
		}
		else
		{
			System.out.println("khong co thanh pho ho chi minh trong hashMapCiTy");
		}
	}

}
