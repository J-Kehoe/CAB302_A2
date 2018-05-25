package sMart.Classes;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Stock extends AbstractList<Item> {
	
	private final Item[] a;
	
	public Stock(Item[] array) {
		// TODO Auto-generated constructor stub
		a = array;
	}

	@Override
	public Item get(int index) {
		return a[index];
	}
	
	public Item set(int index, Item element) {
		Item oldValue = a[index];
		a[index] = element;
		return oldValue;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return a.length;
	}
	
	public static List<Item> asList(Item[] a) {
		List<Item> asList = new ArrayList<>();
		for (int i = 0; i <= a.length - 1; i++) {
			asList.add(a[i]);
		}
		
		return asList;
	}

}


