package BaiThucHanh;
import java.util.Scanner;

public class OfflineStudent extends Student {
	protected String phuongTienDiChuyen;

	public OfflineStudent(String ten, long tuoi, String lop, double dtb, String phuongTienDiChuyen) {
		super(ten, tuoi, lop, dtb);
		this.phuongTienDiChuyen = phuongTienDiChuyen;
	}

	public String getPhuongTienDiChuyen() {
		return phuongTienDiChuyen;
	}

	public void setPhuongTienDiChuyen(String phuongTienDiChuyen) {
		this.phuongTienDiChuyen = phuongTienDiChuyen;
	}
	public void nhapPhuongTienDiChuyen() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap phuong tien di chuyen: ");
		phuongTienDiChuyen =sc.nextLine();
	}

	@Override
	public String getLop() {
		// TODO Auto-generated method stub
		return super.getLop();
	}

	@Override
	public void setLop(String lop) {
		// TODO Auto-generated method stub
		super.setLop(lop);
	}

	@Override
	public double getDtb() {
		// TODO Auto-generated method stub
		return super.getDtb();
	}

	@Override
	public void setDtb(double dtb) {
		// TODO Auto-generated method stub
		super.setDtb(dtb);
	}

	@Override
	public void nhapLop() {
		// TODO Auto-generated method stub
		super.nhapLop();
	}

	@Override
	public void nhapDtb() {

		super.nhapDtb();
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("phuong tien di chuyen: "+phuongTienDiChuyen);
	}
	
}
