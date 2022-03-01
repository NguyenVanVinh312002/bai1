package baithuchanh0103;

import java.util.Scanner;

public class App81 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("nhập số dòng: ");
		a=sc.nextInt();
		System.out.println("nhập số cột: ");
		b=sc.nextInt();
		int arr[][]=new int[a][b];
		int max =0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println("nhập phần tử vị trí "+(i+1)+" "+(j+1)+" :");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("ma trận vừa nhập là: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(arr[i][j] > max)
				{
					max =arr[i][j];
				}
			}
		}
		System.out.println("giá trị lớn nhất của mảng 2 chiều vừa nhập là: "+max);
	}

}
