package Slide54;

import java.util.Scanner;

public class Hinhvuong extends Hcn {
	private float canh;
	public Hinhvuong() {
		ten="Hinh vuong";
	}
	public void nhapCanh() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap canh hinh vuong: ");
		canh=sc.nextFloat();
		sc.close();
	}
	
}
