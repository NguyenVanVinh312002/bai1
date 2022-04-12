package Slide79;

public class NhanvienFullTime extends NhanVien {
	private int gioLamViec;

	public NhanvienFullTime(String ten,int gioLamViec) {
	this.gioLamViec=gioLamViec;
	this.ten=ten;
	}

	@Override
	protected String loainhanVien() {
		return "nhan vien full time";
	}
	public void tinhLuongSep() {
		luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP*gioLamViec;
	}
	public void TinhLuongLinh() {
		luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH*gioLamViec;
	}


	
	
}
