package baithuchanh0103;

import java.util.Scanner;

public class App90 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập vào 1 chuỗi : ");
		String chuoi= sc.nextLine();
		sc.close();
		System.out.println("chuỗi vừa nhập là: ");
		for(int i=0;i<chuoi.length();i++)
		{
			System.out.println(chuoi.charAt(i));
		}
		
		

	}

}
