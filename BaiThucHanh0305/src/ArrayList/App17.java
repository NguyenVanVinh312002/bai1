package ArrayList;

import java.util.ArrayList;

public class App17 {

	public static void main(String[] args) {
		ArrayList<String> mangString = new ArrayList<String>();
		mangString.add("phan tu 1");
		mangString.add("phan tu 2");
		mangString.add("phan tu 3");
		mangString.add("phan tu 4");
		mangString.add("phan tu 4");
		System.out.println("ArrayList vua tao la: ");
		for (String string : mangString) {
			System.out.print(string+",");
		}
	}

}
