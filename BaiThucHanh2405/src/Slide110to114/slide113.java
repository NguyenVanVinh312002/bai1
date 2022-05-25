package Slide110to114;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class slide113 {

	public static void main(String[] args) {
		HashSet<String> hsFruit = new HashSet<String>();
		boolean choose=true;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("menu");
			System.out.println("1.nhap ten hoa qua");
			System.out.println("2. nhập số khác để thoát khỏi vòng nhập ");
			
			int number=sc.nextInt();
			if(number == 1)
			{
				System.out.println("nhap ten loai hoa qua: ");
				String name= sc.next();
				sc.nextLine();
				if(hsFruit.contains(name)==false)
				{
					hsFruit.add(name);
				}
				else
				{
					System.out.println("them ko thanh cong do ten da ton tai");
				}
			}
			else
			{
				choose=false;
			}
			
		}while(choose);
		System.out.println("danh sach vua nhap");
		System.out.println(hsFruit);
		
		// tìm kiếm tên trái cây 
		System.out.println("nhap ten trai cay can tim: ");
		String searchName = sc.nextLine();
		sc.nextLine();
		if(hsFruit.contains(searchName)==true)
		{
			System.out.println(" ten vua nhap co trong hashSet Fruit");
		}
		else
		{
			System.out.println("ten vua nhap k co trong hashSet Fruit");
		}
		
		// xóa 1 trái cây và hiển thị các phần tử còn lại 
		System.out.println("nhap ten trai cay muon xoa khoi hashSet Fruit:");
		String DeleteName = sc.nextLine();
		if(hsFruit.contains(DeleteName)==true)
		{
			hsFruit.remove(DeleteName);
			System.out.println("da xoa thanh cong");
			System.out.println("hashSet sau khi xoa");
			System.out.println(hsFruit);
		}
		else
		{
			System.out.println("ten vua nhap k ton tai trong hashSet Fruit");
		}
		
		List<String> list = new ArrayList<String>();
		list.add("lemon");
		list.add("Apple");
		list.add("kiwi");
		list.add("watermelon");
		list.add("banana");
		
		hsFruit.addAll(list);
		Iterator<String> iterator = hsFruit.iterator();
		System.out.println("cac phan tu cua hashSet Fruit sau khi addAll list la: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		hsFruit.removeAll(list);
		System.out.println("hashSet Fruit sau khi removeAll list: ");
		iterator=hsFruit.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
			
	
		

	

}
}