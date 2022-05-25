package Slide110to114;

import java.util.ArrayList;
import java.util.Scanner;

public class slide110 {

	public static void main(String[] args) {
		// ý 1
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap vao so phan tu cua arrayList: ");
		int n = sc.nextInt();
		ArrayList<Integer> arlInt = new ArrayList<Integer>(n);
		int number;
		for(int i=0;i<n;i++)
		{
			System.out.println("nhap gia ti cho phan tu "+(i+1)+": ");
			number = sc.nextInt();
			arlInt.add(number);
		}
		System.out.println("arrayList vua nhap la: ");
		System.out.print(arlInt+" ");
		
		int max=arlInt.get(0);
		for(int i=1;i< arlInt.size();i++)
		{
			if(arlInt.get(i).compareTo(max) > 0)
			{
				max= arlInt.get(i);
			}
		}
		System.out.println("phan tu lon nhat cua arrayList vua nhap la: "+ max);
		// ý 2
		System.out.println("nhap vao so nguyen muon xoa: ");
		int number2=sc.nextInt();
		ArrayList<Integer> DeleteNumber2= new ArrayList<Integer>();
		DeleteNumber2.add(number2);
		for(int i=1;i<arlInt.size();i++)
		{
			if(arlInt.get(i).compareTo(number2) == 0)
			{
				arlInt.removeAll(DeleteNumber2);
				System.out.println("da xoa toan bo phan tu "+number2+" khoi arrayList ");
				System.out.println("arrayList hien tai");
				System.out.print(arlInt);
			}
		}
		// ý 3
		System.out.println();
		System.out.println("arrayList sau sap xep tang dan");
		arlInt.sort((o1, o2) ->(o1-o2));
		System.out.println(arlInt);
		
	}

}
