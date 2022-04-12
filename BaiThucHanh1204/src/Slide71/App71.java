package Slide71;

public class App71 {

	public static void main(String[] args) {
		HinhTron ht =new HinhTron();
		ht.setR(10);
		
		float ChuVi=ht.TinhChuVi();
		float DienTich=ht.TinhDienTich();
		System.out.println("chu vi la: "+ChuVi+" dien tich la: " +DienTich);

	}

}
