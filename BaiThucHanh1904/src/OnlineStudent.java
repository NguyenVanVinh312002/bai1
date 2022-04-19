import java.util.Scanner;

public class OnlineStudent extends Student {
	protected String phuongTienHocOnl;

	public OnlineStudent(String ten, long tuoi, String lop, double dtb, String phuongTienHocOnl) {
		super(ten, tuoi, lop, dtb);
		this.phuongTienHocOnl = phuongTienHocOnl;
	}

	public String getPhuongTienHocOnl() {
		return phuongTienHocOnl;
	}

	public void setPhuongTienHocOnl(String phuongTienHocOnl) {
		this.phuongTienHocOnl = phuongTienHocOnl;
	}
	public void nhapPhuongTienhocOnl() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap phuong tien hoc online: ");
		phuongTienHocOnl=sc.nextLine();
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
		// TODO Auto-generated method stub
		super.nhapDtb();
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("phuong tien hoc onl: "+phuongTienHocOnl);
	}
	
}
