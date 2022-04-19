import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class VIPCustomer extends Person {
	private String id;
	private String soThich;
	public VIPCustomer(String ten, long tuoi, String id, String soThich) {
		super(ten, tuoi);
		this.id = id;
		this.soThich = soThich;
	}
	
	public void nhapId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap id: ");
		id=sc.nextLine();
	}
	public void nhapsoThich() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so thich khach hang: ");
		soThich=sc.nextLine();
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Id: "+id);
		System.out.println("So thich: "+soThich);
	}
	
}
