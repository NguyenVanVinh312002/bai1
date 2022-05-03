package LinkedList;

import java.util.LinkedList;

public class App38 {
	public static void showList(LinkedList<String> list)
	{
		for (String string : list) {
			System.out.print(string +", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("java");
		list.add("php");
		list.add("c++");
		list.add("java");
		System.out.println("vi du su dung phuong thuc addAll");
		LinkedList<String> listA =new LinkedList<>();
		listA.addAll(list);
		System.out.println("listA:");
		showList(listA);
		
		System.out.println("vi du su dung phuong thuc retainALl: ");
		LinkedList<String> listB =new LinkedList<>();
		listB.add("java");
		listA.retainAll(listB); //xoa tat ca phan tu ko thuoc listB klhoi listA
		System.out.println("listA:");
		showList(listA);
		
		System.out.println("vi du su duwng phuowng thuc removeAll");
		list.removeAll(listB); // xoa cac phan tu listB khoi list
		System.out.println("list:");
		showList(list);;
		
		

}
}