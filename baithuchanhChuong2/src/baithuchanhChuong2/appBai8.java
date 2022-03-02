package baithuchanhChuong2;

import java.util.Scanner;

public class appBai8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số lượng phần tử: ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		double sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("nhập số thứ "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("trung bình cộng các số vừa nhập là: "+(sum/n));
	
		
	}

}
