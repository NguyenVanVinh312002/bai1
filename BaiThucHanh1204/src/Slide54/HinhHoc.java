package Slide54;

public class HinhHoc {
	protected final float Pi=3.14f;
	protected String ten;
	protected float ChuVi,DienTich,TheTich;
	public HinhHoc(String ten, float chuVi, float dienTich, float theTich) {
		this.ten = ten;
		ChuVi = chuVi;
		DienTich = dienTich;
		TheTich = theTich;
	}
	public HinhHoc() {
	}
	public void xuatTen() {
		System.out.println("ten: "+ten);
	}
	public void inCV() {
		System.out.println("Chu vi: "+ChuVi);
	}
	public void inDt() {
		System.out.println("dien tich: "+DienTich);
	}
	public void inTT() {
		System.out.println("The tich: "+TheTich);
	}
	
	
	
}
