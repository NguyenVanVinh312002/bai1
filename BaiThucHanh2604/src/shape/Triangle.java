package shape;

import java.io.IOException;
import java.util.Scanner;

public class Triangle extends Point {
	protected char tenDiem2,tenDiem3;
	protected float tungDo2,tungDo3,hoanhDo2,hoanhDo3;
	public Triangle(char tenDiem, float tungDo, float hoanhDo, char tenDiem2, char tenDiem3, float tungDo2,
			float tungDo3, float hoanhDo2, float hoanhDo3) {
		super(tenDiem, tungDo, hoanhDo);
		this.tenDiem2 = tenDiem2;
		this.tenDiem3 = tenDiem3;
		this.tungDo2 = tungDo2;
		this.tungDo3 = tungDo3;
		this.hoanhDo2 = hoanhDo2;
		this.hoanhDo3 = hoanhDo3;
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
		sc.close();
	}
	public void checkTamGiac() {
		double canh1=Math.sqrt((hoanhDo-hoanhDo2)*(hoanhDo-hoanhDo2)+(tungDo-tungDo2)*(tungDo-tungDo2));
		double canh2=Math.sqrt((hoanhDo3-hoanhDo2)*(hoanhDo3-hoanhDo2)+(tungDo3-tungDo2)*(tungDo3-tungDo2));
		double canh3=Math.sqrt((hoanhDo-hoanhDo3)*(hoanhDo-hoanhDo3)+(tungDo-tungDo3)*(tungDo-tungDo3));
		if(canh1==0||canh2==0||canh3==0||canh1>canh2+canh3||canh2>canh1+canh3||canh3>canh1+canh2)
		{
			System.out.println("3 diem k tao thanh 1 tam giac");
		}
		else
		{
			if(canh1==canh2&&canh1==canh3)
			{
				System.out.println("day la tam giac deu");
			}
			else if(canh1==canh2 &&canh1*canh1+canh2*canh2==canh3*canh3|| canh1==canh3 &&canh1*canh1+canh3*canh3==canh2*canh2|| canh3==canh2 &&canh3*canh3+canh2*canh2==canh1*canh1)
			{
				System.out.println("tam giac vuong can ");
			}
			else if(canh1==canh2 ||canh1==canh3||canh2==canh3)
			{
				System.out.println("tam giac can");
			}
			else if(canh1*canh1==canh2*canh2+canh3*canh3 || canh2*canh2==canh1*canh1+canh3*canh3|| canh3*canh3==canh2*canh2+canh1*canh1)
			{
				System.out.println("tam giac vuong");
			}
			else
			{
				System.out.println("tam giac thuong");
			}
		}
	
	}
	
	

}
