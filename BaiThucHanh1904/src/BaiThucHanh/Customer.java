package BaiThucHanh;
import java.util.Scanner;

public class Customer extends Person {
	private String id;

	public Customer(String ten, long tuoi, String id) {
		super(ten, tuoi);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void nhapId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap id khach hang: ");
		id=sc.nextLine();
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("id: "+id);
	}
	
	
	
}
