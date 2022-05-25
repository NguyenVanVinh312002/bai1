package com.na.collection.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class slide59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhsInt = new LinkedHashSet<>();
		lhsInt.add(0);
		lhsInt.add(1);
		lhsInt.add(2);
		lhsInt.add(3);
		lhsInt.add(4);
		lhsInt.add(5);
		System.out.println("LinkHashSet:");
		System.out.print(lhsInt+",");
		System.out.println();
		System.out.println("nhap phan tu muon xoa khoi linkedHashSet: ");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		 if(lhsInt.contains(number)==true)
		 {
			 lhsInt.remove(number);
			 System.out.println("da xoa phan tu "+number+" khoi LinkedHashSet");
			 System.out.println("LinkHashSet hien tai: ");
			 System.out.print(lhsInt+",");
			 
		 }
		 else
		 {
			 System.out.println("xoa ko thanh cong do phan tu "+number+" khong ton tai trong LinkedHashSet ");
		 }
		
	}

}
