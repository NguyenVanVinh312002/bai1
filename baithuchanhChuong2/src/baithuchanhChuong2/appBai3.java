package baithuchanhChuong2;

import java.util.Scanner;

public class appBai3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập tên: ");
		String ten = sc.nextLine();
		System.out.println("nhập năm: ");
		int n=sc.nextInt();
		if(2022-n <16)
		{
			System.out.println(" bạn "+ten+" ở độ tuổi vị thành niên.");
		}
		else if(2022-n >=16 &&2022-n<18)
				{
					System.out.println("bạn "+ten+" ở tuổi trưởng thành");
				}		
		      else
		      {
		    	  System.out.println("bạn "+ten+" đã già");
		      }
	}

}
