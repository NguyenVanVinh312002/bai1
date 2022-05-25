package com.na.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Character> treeMap = new TreeMap<>();
		treeMap.put(1, 'a');
		treeMap.put(2, 'b');
		treeMap.put(3, 'c');
		treeMap.put(4, 'd');
		
		Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
		
		System.out.println("cac entry co trong treeMap: ");
		System.out.println(setTreeMap);

	}

}
