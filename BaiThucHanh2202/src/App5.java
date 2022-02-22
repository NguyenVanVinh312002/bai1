package bt;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số muốn ktra: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" là số hoàn hảo");
		}
		else
		{
			System.out.println(n+" không là số hoàn hảo");
		}

	}

}
