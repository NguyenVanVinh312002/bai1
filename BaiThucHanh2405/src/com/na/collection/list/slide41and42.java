package com.na.collection.list;

import java.util.LinkedList;
import java.util.Scanner;

public class slide41and42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list= new LinkedList<String>();
		Scanner sc= new Scanner(System.in);
		list.add("thang 1");
		list.add("thang 2");
		list.add("thang 3");
		list.add("thang 4");
		list.add("thang 5");
		list.add("thang 6");
		list.add("thang 7");
		list.add("thang 8");
		list.add("thang 9");
		list.add("thang 10");
		list.add("thang 11");
		list.add("thang 12");
		
		System.out.println("nhap chi so phan tu can lay: ");
		int index = sc.nextInt();
		if(index < 0 || index >(list.size()-1))
		{
			System.out.println("gia tri nhap can phai lon hon 0 va nho hon "+(list.size()-1));
		}
		else
		{
			String node = list.get(index);
			System.out.println("phan tu thu "+index+" co gia tri la: "+node);
		}
		String firstNode = list.getFirst();
		String lastNode = list.getLast();
		
		System.out.println("phan tu dau tien co gia tri la: "+firstNode);
		System.out.println("phan tu cuoi cung co gia tri la: "+lastNode);
		
		
		
	}

}
