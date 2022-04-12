package Slide79;

public class NhanVien {
	protected String ten;
	protected long luong;
	public NhanVien() {
	}
	public NhanVien(String ten) {
		this.ten = ten;
	}
	protected String loainhanVien()
	{	//class con  override lai
		return "";
	}
	public void xuatThongTin() {
		System.out.println("ten nhan vien: "+ten);
		System.out.println("loai nhan vie: "+loainhanVien());
		System.out.println("luong: "+luong);
	}
	
	
}
