package com.na.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {

	public static void main(String[] args) {
		ArrayList<Float> arlFloat = new ArrayList<Float>();
		arlFloat.add(0.7f);
		arlFloat.add(7.26f);
		arlFloat.add(1.02f);
		arlFloat.add(9.3f);
		
		Iterator<Float> iterator = arlFloat.iterator();
		System.out.println("cac phan tu co trong arlFoat la: ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
		
	}

}
