package BaiThucHanh;
import java.util.Scanner;

public class Person {
	public String ten;
	public long tuoi;
	public Person(String ten, long tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public void nhapTen() {
		System.out.println("nhap ten: ");
		Scanner sc= new Scanner(System.in);
		ten=sc.next();
	}
	public void nhapTuoi() {
		System.out.println("Nhap tuoi: ");
		Scanner sc= new Scanner(System.in);
		tuoi=sc.nextLong();
	}
	public void inTT() {
		System.out.println("Ten: "+ten);
		System.out.println("Tuoi: "+tuoi);
	}
}
