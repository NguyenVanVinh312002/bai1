package BaiThucHanh;
import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	private int soNgayLam;

	public PartTimeEmployee(String ten, long tuoi, String tenCuaHangLamViec, int luong, int gioLam, int soNgayLam) {
		super(ten, tuoi, tenCuaHangLamViec, luong, gioLam);
		this.soNgayLam = soNgayLam;
	}

	public int getSoNgayLam() {
		return soNgayLam;
	}

	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}
	public void nhapSoNgayLam()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so ngay lam viec moi ngay: ");
		soNgayLam=sc.nextInt();
	}
	@Override
	public void tinhluong() {
		luong=gioLam*20000*soNgayLam;
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("luong: "+luong+" vnd");
	};
	
}
