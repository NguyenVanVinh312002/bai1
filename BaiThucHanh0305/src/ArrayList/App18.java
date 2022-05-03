package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class App18 {

	public static void main(String[] args) {
		ArrayList<String> mangString = new ArrayList<String>();
		mangString.add("phan tu 1");
		mangString.add("phan tu 2");
		mangString.add("phan tu 3");
		mangString.add("phan tu 4");
		mangString.add("phan tu 4");
		System.out.println("ArrayList vua tao la: ");
		Iterator<String> iterator=mangString.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
	}

}
