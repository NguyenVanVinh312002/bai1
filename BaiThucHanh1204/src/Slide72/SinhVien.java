package Slide72;

public class SinhVien {
	private String ten,tuoi;


	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if(ten==null || ten.isEmpty())
		{
			this.ten="khong biet";
		}
		else
		{
			this.ten=ten;
		}
	}

	public String gettuoi() {
		if(Integer.valueOf(tuoi) != -1) {
			return tuoi;
		}
		else return "khong hop le";
	}

	public void setTuoi(int tuoi) {
		if(tuoi> 18) {
			this.tuoi=String.valueOf(tuoi);
		} else {
			this.tuoi=String.valueOf(-1);
		}
	}
	
}
