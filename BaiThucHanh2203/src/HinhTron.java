import java.util.Scanner;

class hinh{
	final float pi=3.14f;
	float r,cv,dt;
void nhapBanKinh() 
{
	System.out.println("nhap ban kinh: ");
	Scanner sc=new Scanner(System.in);
	r=sc.nextFloat();
	sc.close();
}
void tinhChuvi() 
{
	cv= pi*r*2;
}
void tinhDienTich() 
{
	dt=pi*r*r;
}
void in() 
{
	System.out.println("Ban kinh la: "+r);
	System.out.println("Chu vi la: "+cv);
	System.out.println("Den tich la: "+dt);
}
}
//---------------------------------------------------//
public class HinhTron {

	public static void main(String[] args) {
		hinh ht=new hinh();
		ht.nhapBanKinh();
		ht.tinhChuvi();
		ht.tinhDienTich();
		ht.in();
	}

}
