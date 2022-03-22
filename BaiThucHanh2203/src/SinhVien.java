import java.sql.Date;
import java.util.Scanner;

public class SinhVien {
	public String msv,hoten,diachi;
	public boolean gioitinh;
	public Date ngaysinh;

	
	void nhap()
	{	Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		msv=sc.next();
		System.out.println("Nhap ho ten: ");
		hoten=sc.next();sc.nextLine();
		System.out.println("nhap dia chi: ");
		diachi=sc.next();
		System.out.println("nhap gioi tinh: ");
		gioitinh=sc.hasNext("nam");
		System.out.println("nhap ngay sinh: ");
		sc.close();
	}
	void in()
	{
		System.out.println("MSV: "+msv);
		System.out.println("Ho ten: "+hoten);
		System.out.println("Dia chi: "+diachi);
		System.out.println("Gioi tinh nam?: "+gioitinh);
		System.out.println("Ngay sinh:"+ngaysinh);
	}
	
	
	
}
