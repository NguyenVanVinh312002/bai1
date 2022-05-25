package com.na.collection.set;

import java.util.HashSet;
import java.util.Scanner;

public class slide53and55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> setInt = new HashSet<Integer>();
		setInt.add(0);
		setInt.add(1);
		setInt.add(2);
		setInt.add(4);
		setInt.add(5);
		
		System.out.println("cac phan tu trong setInt la: ");
		System.out.println(setInt);
		System.out.println("nhap phan tu muon them vao setInt: ");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		if(setInt.contains(number)==false)
		{
			setInt.add(number);
			System.out.println("da them phan tu "+number+" vao setInt");
			System.out.println("setInt hien tai: ");
			System.out.println(setInt);
		}
		else
		{
			System.out.println("them ko thanh cong do "+number+" da ton tai trong setInt");
		}
		System.out.println("nhap phan tu muon xoa khoi setInt: ");
		int number2= sc.nextInt();
		if(setInt.contains(number2)==true)
		{
			setInt.remove(number2);
			System.out.println("da xoa phan tu "+number2+" khoi setInt");
			System.out.println("setInt hien tai: ");
			System.out.println(setInt);
		}
	}

}
