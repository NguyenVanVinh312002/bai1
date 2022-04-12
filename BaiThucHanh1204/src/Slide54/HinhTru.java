package Slide54;

import java.util.Scanner;

public class HinhTru  extends HinhTron{
	protected float ChieuCao;

	public HinhTru() {
		ten="hinh Tru";
	}
	public void nhapchieuCao() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chieu cao: ");
		ChieuCao=sc.nextFloat();
		sc.close();
	}
	public void TinhThetich() {
		TheTich= ChieuCao*BanKinh*BanKinh;
	}
	
	
}
