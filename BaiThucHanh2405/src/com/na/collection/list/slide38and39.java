package com.na.collection.list;

import java.util.LinkedList;

public class slide38and39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("C++");
		list.add("python");
		list.add("php");
		
		System.out.println("vi du addAll");
		LinkedList<String> listA = new LinkedList<String>();
		listA.addAll(list);
		System.out.println("listA");
		System.out.println(listA);
		System.out.println("vi du retainAll");
		
		LinkedList<String> listB= new LinkedList<String>();
		listB.add("java");
		listA.retainAll(listB);
		System.out.println("listA sau khi retainAll(listB): ");
		System.out.println(listA);
		
		System.out.println("vi du removeAll");
		list.removeAll(listB);
		System.out.println("list sau khi removeAll(listB): ");
		System.out.println(list);
		
		
	}

}
