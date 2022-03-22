import java.util.Scanner;

public class HinhChuNhat {
	double dai,rong;
	void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		dai=sc.nextDouble();
		System.out.println("nhap chieu rong: ");
		rong=sc.nextDouble();
		sc.close();
	}
	double chuvi()
	{
		return (dai+rong)*2;
	}
	double dientich()
	{
		return dai*rong;
	}
	void in()
	{
		System.out.println("chieu dai la: "+dai);
		System.out.println("chieu rong la: "+rong);
		System.out.println("chu vi: "+chuvi());
		System.out.println("dien tich: "+dientich());
	}
}
