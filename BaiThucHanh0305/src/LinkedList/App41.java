package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class App41 {

	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<>();
		list.add("thang 1");
		list.add("thang 2");
		list.add("thang 3");
		list.add("thang 4");
		list.add("thang 5");
		list.add("thang 6");
		list.add("thang 7");
		list.add("thang 8");
		list.add("thang 9");
		list.add("thang 10");
		list.add("thang 11");
		list.add("thang 12");
		
		System.out.println("nhap so phan tu can lay ra: ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0 || (num > (list.size()-1)))
		{
			System.out.println("so can lay phai lon hon 0 va nho hon "+( (list.size()-1)) );
		}
		else
		{
			String node=list.get(num);
			System.out.println("phan tu co chi so "+num+" co gia tri la: "+node);
		}
		String FirstNode= list.getFirst();
		String LastNode=list.getLast();
		System.out.println("phan tu dau tien la: "+FirstNode);
		System.out.println("phan tu cuoi cung la: "+LastNode);
	}

}
