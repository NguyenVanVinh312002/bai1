package baithuchanhChuong2;

import java.util.Scanner;

public class appBai5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,n;
		do {
			System.out.println("nhập số nguyên: ");
			n=sc.nextInt();
			sum+=n;
		}
		while(sum<100);
		System.out.println("tổng các số vừa nhập là: "+sum);
			

	}

}
