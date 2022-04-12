package Slide77;

import java.util.Scanner;

public class HinhTron {
	protected float r;
	private Scanner sc;
	public HinhTron() {
		super();
		sc=new Scanner(System.in);
	}
	public void nhapBankinh() {
		System.out.println("ban dung don vi nao:");
		System.out.println("1.Cm");
		System.out.println("2.inch");
		Configs.donvi=sc.nextInt();
		System.out.println("nhap vao ban kinh: ");
		r=sc.nextFloat();
		
	}
	public void inThongtin() {
		if(Configs.donvi == Configs.don_vi_cm) {
			System.out.println("hinh tron co ban kinh "+r+" cm");
			System.out.println("tuong duong voi "+Configs.CmToInch(r)+" inch");
		}
		else {
			System.out.println("hinh tron co ban kinh "+r+" inch");
			System.out.println("tuong duong voi "+Configs.InchToCm(r)+" cm");
		}
	}
}
