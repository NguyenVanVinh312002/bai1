import java.util.Scanner;

public class Person {
	public String Id,Name,Address;
	public boolean gender;
	void nhap() 
	{	Scanner sc= new Scanner(System.in);
		System.out.println("nhap id: ");
		Id=sc.next();
		System.out.println("nhap ten: ");
		Name=sc.next();
		System.out.println("nhap dia chi: ");
		Address=sc.next();
		System.out.println("Nhap gioi tinh: ");
		gender=sc.hasNext("nam");
		sc.close();
	}
	
	void in()
	{
		System.out.println("Id: "+Id);
		System.out.println("Ten: "+Name);
		System.out.println("gioi tinh nam?:"+gender);
		System.out.println("Dia chi: "+Address);
	}
	
}
