package baithuchanhChuong2;

import java.util.Scanner;

public class appBai11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số lượng phần tử mảng: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("nhập phần tử thứ "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		System.out.println("mảng vừa nhập là: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	//---------------------------------
		for(int i=0;i<n;i++)
		{	for(int j =i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
			}
		}
	//----------------------------------
		System.out.println("mảng sau khi đc sắp xếp là: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
