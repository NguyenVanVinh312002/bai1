package shape;

import java.io.IOException;
import java.util.Scanner;

public class Quadrilateral extends Point {
	protected char tenDiem2,tenDiem3,tenDiem4;
	protected float tungDo2,tungDo3,tungDo4,hoanhDo2,hoanhDo3,hoanhDo4;
	public Quadrilateral(char tenDiem,char tenDiem2, char tenDiem3, char tenDiem4, float tungDo,float tungDo2, float tungDo3, float tungDo4,
			float hoanhDo,float hoanhDo2, float hoanhDo3, float hoanhDo4) {
		super(tenDiem, tungDo, hoanhDo);
		this.tenDiem2 = tenDiem2;
		this.tenDiem3 = tenDiem3;
		this.tenDiem4 = tenDiem4;
		this.tungDo2 = tungDo2;
		this.tungDo3 = tungDo3;
		this.tungDo4 = tungDo4;
		this.hoanhDo2 = hoanhDo2;
		this.hoanhDo3 = hoanhDo3;
		this.hoanhDo4 = hoanhDo4;
	}
	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		try {
			System.out.println("nhap ten diem 2 : ");
			tenDiem2=(char) System.in.read();
		} catch (IOException e) {
			System.out.println("nhap gia tri sai");
		}
		System.out.println("nhap tung do 2: ");
		tungDo2=sc.nextFloat();
		System.out.println("nhap hoanh do 2: ");
		hoanhDo2=sc.nextFloat();	
		try {
			System.out.println("nhap ten diem 3 : ");
			tenDiem3=(char) System.in.read();
		} catch (IOException e) {
			System.out.println("nhap gia tri sai");
		}
		System.out.println("nhap tung do 3: ");
		tungDo3=sc.nextFloat();
		System.out.println("nhap hoanh do 3: ");
		hoanhDo3=sc.nextFloat();	
		try {
			System.out.println("nhap ten diem 4 : ");
			tenDiem3=(char) System.in.read();
		} catch (IOException e) {
			System.out.println("nhap gia tri sai");
		}
		System.out.println("nhap tung do 4: ");
		tungDo3=sc.nextFloat();
		System.out.println("nhap hoanh do 4: ");
		hoanhDo3=sc.nextFloat();
		sc.close();
	}
	public void CheckTuGiac() {
		 float ab=hoanhDo2-hoanhDo, ab2=tungDo2-tungDo; //tung độ và hoành độ các vector
		 float ac=hoanhDo3-hoanhDo, ac2=tungDo3-tungDo;
		 float ad=hoanhDo4-hoanhDo, ad2=tungDo4-tungDo;
		 float bc=hoanhDo3-hoanhDo2, bc2=tungDo3-tungDo2;
		 float dc=hoanhDo4-hoanhDo3, dc2=tungDo4-tungDo3;
		 
		 double AB=Math.sqrt(ab*ab+ab2*ab2); // độ dài đoạn ab
		 double AD=Math.sqrt(ad*ad+ad2*ad2);
		 double BC=Math.sqrt(bc*bc+bc2*bc2);
		 double CD=Math.sqrt(dc*dc+dc2*dc2);
		 
		 float n=ab/ac;   
		 float n2=ab/ad;
		 
		 if(ab2/ac2==n || ab2/ad2==n2) // ktra 3 điểm có thẳng hàng k
		 {
			 System.out.println("4 diem k tao thanh tu giac");
		 }
		 else {
			 if(AB==AD && AB==BC && ab*ad+ab2*ad2==0)
			 {
				 System.out.println("hinh vuong");
			 }
			 else if(AD==BC&& ab*ad+ab2*ad2==0)
			 {
				 System.out.println("hinh chu nhat");
			 }
			 else if(AB==BC &&AB==CD&& AB==AD)
			 {
				 System.out.println("hinh thoi");
			 }
			 else 
			 {
				 System.out.println("tu giac b.thg");
			 }
		 }
		 
		 
	}
	
	
}
