package Slide79;

public class NhanVienPartTime extends NhanVien{
	private int gioLamviec;

	public NhanVienPartTime(String ten,int gioLamviec) {
		this.ten=ten;
		this.gioLamviec = gioLamviec;
	}

	@Override
	protected String loainhanVien() {	
		return "nhan vien thoi vu";
	}
	public void tinhLuong() {
		luong=Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO *gioLamviec;
	}
	

}
