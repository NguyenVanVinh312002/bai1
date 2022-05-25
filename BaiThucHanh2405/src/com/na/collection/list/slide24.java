package com.na.collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class slide24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlInt = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int n,number;
		System.out.println("nhap so phan tu cua arrayList:");
		n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("nhap gia tri cho phan tu thu "+(i+1)+":");
			number =sc.nextInt();
			arlInt.add(number);
		}
		int max = arlInt.get(0);
		for(int i=1;i< arlInt.size();i++)
		{
			if(arlInt.get(i).compareTo(max) > 0)
				max=arlInt.get(i);
		}
		System.out.println("phan tu lon nhat arrayList la : "+max);

	}

}
