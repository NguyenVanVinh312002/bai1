import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
       double a,b,c, delta,x1,x2;
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap a: ");
       a= sc.nextDouble();
      System.out.println("nhap b: ");
       b= sc.nextDouble();
       System.out.println("nhap c: ");
       c= sc.nextDouble();
      
       delta = b*b - 4*a*c;
       if(delta<0)
        {
            System.out.println("pt vo nghiem! ");
        }
        else if(delta == 0)
            {
                x1= -1*b / (2*a);
                System.out.println("pt co nghiem kep:" + x1);
            }
            else 
            {
                x1=(-b + Math.sqrt(delta))/ (2*a);
                x2=(-b - Math.sqrt(delta))/ (2*a);
                System.out.println("pt co 2 nghiem la: " +x1+ " va " +x2);
            }
    }
}

