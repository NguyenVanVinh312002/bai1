package Slide110to114;

import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap so luong phan tu cua LinkedList: ");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		LinkedList<Integer> linkedlistInt = new LinkedList<>();
		int number,dem=0,sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("nhap phan tu thu "+(i+1)+": ");
			number=sc.nextInt();
			linkedlistInt.add(number);
		}
		System.out.println("linkedList vua nhap la: ");
		System.out.print(linkedlistInt+" ");
		System.out.println();
		for(int i=1;i<linkedlistInt.size();i++)
		{
			if(linkedlistInt.get(i)%2 == 0)
			{
				
				sum+=linkedlistInt.get(i);
				dem++;
			}
		}
		double tbc=sum/dem;
		System.out.println("trung binh cong cua cac so duong trong linkedList la: "+tbc);
		
		

	}

}
