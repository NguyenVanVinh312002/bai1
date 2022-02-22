package bt;

import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập sô: ");
		int n=sc.nextInt();
		int daoso=0;
		sc.close();
		while(n>0)
		{
			daoso=daoso*10+(n%10);
			n=n/10;
		}
		System.out.println("số vừa nhập khi đảo ngược là: "+daoso);
		
		
	}

}
