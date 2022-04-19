import java.util.Scanner;

public class Student extends Person{
	
	protected String lop;
	protected double dtb;

	public Student(String ten, long tuoi, String lop, double dtb) {
		super(ten, tuoi);
		this.lop = lop;
		this.dtb = dtb;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public void nhapLop() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ten lop: ");
		lop=sc.next();
	}
	public void nhapDtb() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap dtb: ");
		dtb=sc.nextDouble();
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("ten lop: "+lop);
		System.out.println("Diem trung binh: "+dtb);
	}
	
}
