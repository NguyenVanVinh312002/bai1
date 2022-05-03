package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App22 {

	public static void main(String[] args) {
		int soluong,number;
		System.out.println("nhap so luong phan tu arraylist: ");
		Scanner sc= new Scanner(System.in);
		soluong=sc.nextInt();
		ArrayList<Integer> arrL = new ArrayList<>(soluong);
		for (int i = 0; i < soluong; i++) {
			System.out.println("nhap gia tri thu "+(i+1)+":");
			number=sc.nextInt();
			arrL.add(number);
		}
		System.out.println("ArrayList vua nhap la: "+arrL.size());
		int max =arrL.get(0);
		for(int i=0;i<arrL.size();i++)
		{
			if(arrL.get(i).compareTo(max) >0)
			{
				max=arrL.get(i);
			}
		}
		System.out.println("phan tu lon nhat arrayList co gia tri la: "+max);

	}

}
