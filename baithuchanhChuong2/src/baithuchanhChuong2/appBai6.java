package baithuchanhChuong2;

import java.util.Scanner;

public class appBai6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,giaithua=1;
		do {
			System.out.println("nhập vào số nguyên dương: ");
			n=sc.nextInt();
		}
		while(n<=0);
		for(int i=1;i<=n;i++)
		{
			giaithua=giaithua*i;
		}
		System.out.println("giai thừa số vừa nhập là: "+giaithua);
		
		

	}

}
