package bt;

public class App11 {

	public static void main(String[] args) {
		int a=10,b=20,c=50;
		int dem=0;
		for(int i=0;i<=20;i++)
			{
			for(int j=0;j<=10;j++)
			{
				for(int k=0;k<=4;k++)
					if(i*10 + j*20 + k*50==200)
					{	System.out.println(i+" tờ 10k   "+ j +" tờ 20k   "+k+"  tờ 50k" );
						dem++;
					}
			}
			}
		
		System.out.println("có "+dem+" phương án");
		
		

	}

}
