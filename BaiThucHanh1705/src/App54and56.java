import java.util.HashSet;
import java.util.Scanner;

public class App54and56 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	HashSet<Integer>  hashSetInt = new HashSet<>();
	hashSetInt.add(1);
	hashSetInt.add(2);
	hashSetInt.add(3);
	hashSetInt.add(4);
	hashSetInt.add(5);
	
	System.out.println("cac phan tu cua hashSetInt: ");
	System.out.println(hashSetInt);
	System.out.println("nhap so muon them vao hashSetInt: ");
	int n=sc.nextInt();
	if(hashSetInt.contains(n)==false)
	{
		hashSetInt.add(n);
		System.out.println("da them phan tu "+n +" vao hashSetInt");
		System.out.println("hashSetInt hien tai: ");
		System.out.println(hashSetInt);
	}
	else
	{
		System.out.println(n+" da co trong hashSetInt");
		
	}
	System.out.println("nhap so muon xoa khoi hashSet: ");
	int m= sc.nextInt();
	if(hashSetInt.contains(m)==true)
	{
		hashSetInt.remove(m);
		System.out.println("xoa thanh cong");
		System.out.println("hashSetInt hien tai: ");
		System.out.println(hashSetInt);
	}
	else
	{
		System.out.println("so vua nhap ko co trong hashSetInt");
	}	

	
	
}
}
