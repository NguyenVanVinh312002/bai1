import java.util.Scanner;
public class App47 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int sum=0;
        do{
            System.out.println("nhập 1 số bất kì: ");
            int n=sc.nextInt();
            sum+=n;
            System.out.println("tổng các số vừa nhập là: "+sum);
             

        }while(sum<=100);
        


    }
}
