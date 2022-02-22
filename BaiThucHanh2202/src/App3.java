package bt;

import java.util.Scanner;

public class App3 {
	public static boolean check(int n) {
		if(n<2)
		{
			return false;
		}
		for(int i=2;i< n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n;
		do
		{
			System.out.println("nhập số nguyên dương: ");
			n=sc.nextInt();
			
		}
		while(n<=0);
		sc.close();
		if(check(n))
		{
			System.out.println(n+" là SNT");
		}
		else
		{
			System.out.println(n+" ko là SNT");
		}
	}

}
