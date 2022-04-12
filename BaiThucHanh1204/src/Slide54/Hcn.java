package Slide54;

import java.util.Scanner;

public class Hcn extends HinhHoc {
	private float dai,rong;

	public Hcn() {
		ten="Hinh chu nhat";
	}
	public void nhapChieuDaiChieurong() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		dai=sc.nextFloat();
		System.out.println("Nhap chieu rong: ");
		rong=sc.nextFloat();
	
	}
	public void TinhChuVi() {
		ChuVi=(dai+rong)*2;
	}
	public void TinhDienTich() {
		DienTich=dai*rong;
	}
	
	
	
	
}
