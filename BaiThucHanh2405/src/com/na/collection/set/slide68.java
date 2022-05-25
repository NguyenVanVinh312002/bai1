package com.na.collection.set;

import java.util.Scanner;
import java.util.TreeSet;

public class slide68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeInt = new TreeSet<Integer>();
		treeInt.add(0);
		treeInt.add(1);
		treeInt.add(2);
		treeInt.add(3);
		treeInt.add(4);
		treeInt.add(5);
		
		System.out.println("treeSet hien tai: ");
		System.out.println(treeInt);
		
		System.out.println("nhap phan tu muon xoa khoi treeInt: ");
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
		
		if(treeInt.contains(number)==true)
		{
			treeInt.remove(number);
			System.out.println("da xoa phan tu "+number+"khoi treeInt");
			System.out.println("treeInt hien tai: ");
			System.out.println(treeInt);
		}
		else
		{
			System.out.println("xoa khong thanh cong do "+number+" khong ton tai trong treeInt");
		}
	}

}
