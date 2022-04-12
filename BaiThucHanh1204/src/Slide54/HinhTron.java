package Slide54;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
	protected float BanKinh;

	public HinhTron() {
		ten="Hinh Tron";
	}
	public void nhapBK() {
		System.out.println("Nhap ban kinh: ");
		Scanner sc= new Scanner(System.in);
		BanKinh=sc.nextFloat();
		
	}
	public void TinhChuVi() {
		ChuVi= 2*BanKinh*Pi;
	}
	public void TinhDienTich() {
		DienTich= Pi*BanKinh*BanKinh;
	}
	
}
