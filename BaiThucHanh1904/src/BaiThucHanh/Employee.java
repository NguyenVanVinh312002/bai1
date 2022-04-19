package BaiThucHanh;
import java.util.Scanner;

public class Employee extends Person{
	protected String tenCuaHangLamViec;
	protected int luong,gioLam;
	public Employee(String ten, long tuoi, String tenCuaHangLamViec, int luong, int gioLam) {
		super(ten, tuoi);
		this.tenCuaHangLamViec = tenCuaHangLamViec;
		this.luong = luong;
		this.gioLam = gioLam;
	}
	public String getTenCuaHangLamViec() {
		return tenCuaHangLamViec;
	}
	public void setTenCuaHangLamViec(String tenCuaHangLamViec) {
		this.tenCuaHangLamViec = tenCuaHangLamViec;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public int getGioLam() {
		return gioLam;
	}
	public void setGioLam(int gioLam) {
		this.gioLam = gioLam;
	}
	public void nhapTenCuaHangLamViec() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten cua hang lam viec: ");
		tenCuaHangLamViec=sc.nextLine();
	}
	public void nhapGioLam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so gio lam viec: ");
		gioLam=sc.nextInt();
	}
	public void tinhluong() {
		
	}
	@Override
	public void inTT() {
		super.inTT();
		System.out.println("ten cua hang lam viec: "+tenCuaHangLamViec);
		System.out.println("so gio lam viec: "+gioLam);
	}
	
}
