import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class App69 {

	public static void main(String[] args) {
	TreeSet<Integer> treeInt =new TreeSet<>();
	Scanner sc =new Scanner(System.in);
	treeInt.add(1);
	treeInt.add(2);
	treeInt.add(4);
	treeInt.add(3);
	
	System.out.println("treeSet hien tai: ");
	System.out.println(treeInt);
	System.out.println("nhap phan tu muon them vao treeInt: ");
	//them 1 phan tu vao tree
	int phanTu =sc.nextInt();
	if(treeInt.contains(phanTu)==false)
	{
		treeInt.add(phanTu);
		System.out.println("treeInt sau update");
		System.out.println(treeInt);
	}
	else
	{
		System.out.println("phan tu vua nhap da co trong treeInt");
	}
	System.out.println("nhap phan tu muon xoa khoi treeInt");
	// xoa 1 phan tu khoi tree
	int xoaPhanTu=sc.nextInt();
	if(treeInt.contains(xoaPhanTu)==true)
	{
		treeInt.remove(xoaPhanTu);
		System.out.println("da xoa phan tu "+xoaPhanTu+" khoi treeInt");
		System.out.println("treeInt sau chinh sua");
		System.out.println(treeInt);
	}
	else
	{
		System.out.println("so vua nhap ko co trong treeInt");
	}
	
	
	
}

}
