import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số thứ nhất: ");
        int a=sc.nextInt();
        System.out.println("nhập số thứ 2: ");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("só lớn nhất trong 2 số là: "+a);
        }
        else
        {
            System.out.println("số lớn nhất trong 2 số là: "+b);
        }


    }
}
