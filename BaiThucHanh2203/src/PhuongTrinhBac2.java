import java.util.Scanner;

public class PhuongTrinhBac2 {
	double a,b,c;
	void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap a: ");
		a = sc.nextDouble();
	    System.out.print("nhap b: ");
	    b = sc.nextDouble();
	    System.out.print("nhap c: ");
	    c = sc.nextDouble();
	    sc.close();
	}
	void TimNghiem() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vô nghiệm!");
            } else {
                System.out.println("Pt có một nghiệm: "+(-c/b) );                  
            }
       
        }

        Double  x1,x2,delta = b * b - 4 * a * c; 
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("pt co 2 nghiem: "+x1+" va "+x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("pt co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("pt vo nghiem");
        }

    }

}
