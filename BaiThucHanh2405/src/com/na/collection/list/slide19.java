package com.na.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {

	public static void main(String[] args) {
		ArrayList<Character> arlChar = new ArrayList<>();
		arlChar.add('a');
		arlChar.add('e');
		arlChar.add('b');
		arlChar.add('c');
		
		ListIterator<Character> listiterator= arlChar.listIterator();
		System.out.println("cac phan tu co trong arlChar la: ");
		while(listiterator.hasNext())
		{
			System.out.print(listiterator.next()+", ");
		}
		

	}

}
