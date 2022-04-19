import java.util.Scanner;

public class FullTimeEmployee extends Employee{
	private int soNgayLamViec;

	public FullTimeEmployee(String ten, long tuoi, String tenCuaHangLamViec, int luong, int gioLam, int soNgayLamViec) {
		super(ten, tuoi, tenCuaHangLamViec, luong, gioLam);
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public void nhapSoNgayLamViec() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so ngay lam viec: ");
		soNgayLamViec=sc.nextInt();
	}

	@Override
	public void tinhluong() {
	 luong=soNgayLamViec*500000;
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("So ngay lam viec trong tuan: "+soNgayLamViec);
		System.out.println("luong: "+luong);
	}
	
	
}
