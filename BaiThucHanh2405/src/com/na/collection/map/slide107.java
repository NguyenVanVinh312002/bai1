package com.na.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class slide107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Double> treeMap = new TreeMap<Integer, Double>();
		treeMap.put(1, 9d);
		treeMap.put(2, 10.1d);
		treeMap.put(3, 7.2d);
		treeMap.put(4, 20.28d);
		
		System.out.println("cac phan tu co trong treeMap: ");
		Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
		System.out.println(setTreeMap);
		treeMap.replace(2, 10.1d, 11.1d);
		
		System.out.println("cac phan tu sau khi thay the: ");
		setTreeMap= treeMap.entrySet();
		System.out.println(setTreeMap);
		
	}

}
