package ArrayList;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> mangString = new ArrayList<String>();
		mangString.add("phan tu 1");
		mangString.add("phan tu 2");
		mangString.add("phan tu 3");
		mangString.add("phan tu 4");
		mangString.add("phan tu 4");
		int soLuongPhanTu =mangString.size();
		System.out.println("so luong phan tu : "+soLuongPhanTu);
		for(int i=0;i< mangString.size();i++)
		{
			System.out.print(mangString.get(i)+", ");
		}
		mangString.set(4, "phan tu 5");
		System.out.println();
		System.out.println("arrayList sau chinh sua:");
		for(int i=0;i< mangString.size();i++)
		{
			System.out.print(mangString.get(i)+", ");
		}
		mangString.remove(4);
		System.out.println();
		System.out.println("arrayList sau chinh sua:");
		for (String string : mangString) {
			System.out.print(string+", ");
		}
		

}
}