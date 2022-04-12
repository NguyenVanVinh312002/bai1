package Slide72;

public class App72 {

	public static void main(String[] args) {
		SinhVien sv1 =new SinhVien();
		SinhVien sv2= new SinhVien();
		
		
		sv1.setTen("");
		sv1.setTuoi(10);
		
		sv2.setTen("Vinh");
		sv2.setTuoi(20);
		
		System.out.println("sinh vien 1: "+sv1.getTen()+", "+sv1.gettuoi()+" tuoi");
		System.out.println("sinh vien 2: "+sv2.getTen()+", "+sv2.gettuoi()+" tuoi");
	}

}
