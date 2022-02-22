package bt;

import java.util.Scanner;

public class App2 {
	public static void check(float a, float b,float c)
	{
		if(a==b && a==c)
		{
			System.out.println("đây là tam giác đều");
		}
		else 
		{
			if(a==b || a==c|| b==c)
			{
				if(a*a==b*b+c*c || b*b==a*a+c*c||c*c==a*a+b*b)
				{
					System.out.println("đây là tam giác vuông cân");
				}
				else
				{
					System.out.println("đây là tam giác cân");
				}
			}
			else
			{
				if(a*a==b*b+c*c || b*b==a*a+c*c||c*c==a*a+b*b)
				{
					System.out.println("đây là tam giác vuông");
				}
				else
				{
					System.out.println("đây là tam giác thường");
				}
			}
			
		}		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập cạnh thứ nhất");
		float a=sc.nextFloat();
		System.out.println("nhập cạnh thứ 2");
		float b=sc.nextFloat();
		System.out.println("nhập cạnh thứ 3");
		float  c=sc.nextFloat();
		sc.close();
		check(a,b,c);
		
		

	}

}
