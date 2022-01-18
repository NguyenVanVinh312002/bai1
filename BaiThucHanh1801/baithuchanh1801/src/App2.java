import java.util.Scanner;
public class App2 {
    public static void main(String[] args){
        int a1,a2,b1,b2,c1,c2;
        float x1,x2,D,Dx,Dy;
        System.out.println("pt co dang: " );
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a1:");
        a1=sc.nextInt();
        System.out.println("nhap b1: ");
        b1= sc.nextInt();
        System.out.println("nhap c1: ");
        c1= sc.nextInt();
        System.out.println("nhap a2: ");
        a2= sc.nextInt();
        System.out.println("nhap b2: ");
        b2= sc.nextInt();
        System.out.println("nhap c2: ");
        c2= sc.nextInt();
        D= (a1*b2)-(a2*b1);
        Dx=(c1*b2)-(c2*b1);
        Dy=(a1*c2)-(a2*c1);
       if(D==0)
        {
            if(Dx+Dy==0)
            {
                System.out.println("hpt co vo so nghiem! ");
            }
            else 
            {
                System.out.println("hpt vo nghiem! ");
            }
        }
        else
        {
            x1=Dx/D;
            x2=Dy/D;
            System.out.println("hpt co nghiem duy nhat la :" + x1+ "va" + x2);
        }

        



    }
}