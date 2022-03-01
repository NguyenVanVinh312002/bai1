package baithuchanh0103;

import java.util.Scanner;

public class App74 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so luong phan tu mang: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("nhập phần tử thứ "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		System.out.println("các phần tử vừa nhập là: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("tổng các số chẵn trong mảng là: "+sum);

	}

}
