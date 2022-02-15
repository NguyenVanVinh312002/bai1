import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập sô ngày: ");
        int ngay=sc.nextInt();
        switch(ngay){
            case 2: System.out.println("thứ 2");
            break;
            case 3: System.out.println("thứ 3");
            break;
            case 4: System.out.println("thứ 4");
            break;
            case 5: System.out.println("thứ 5");
            break;
            case 6: System.out.println("thứ 6");
            break;
            case 7: System.out.println("thứ 7");
            break;
            case 8: System.out.println("chủ nhật");
            break;
            default: System.out.println("số ngày nhập sai");

        }


    }
}
