package sMart.Tests;
import org.junit.Test;

import sMart.Classes.Item;
import sMart.Classes.Stock;

import static org.junit.Assert.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StockTest {
	
	
	private Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, 2.0);
	private Item test2 = new Item("Cheese", 0, 2.0, 6.0, 1, 4,-2.0);
	
	Item[] itemArray = new Item[2];
	Stock itemStock = new Stock(itemArray);
	Item item;
	
	@Test
	public void testGet() {
		itemArray[0] = test;
		itemArray[1] = test2;
		
		assertEquals(itemArray[1], itemStock.get(1));
	}
	
	@Test
	public void testSet() {
		Item test1 = new Item("Grapes", 0, 2.0, 6.0, 1, 4,-2.0);
		Item test = itemArray[1];
		itemArray[1] = test1;

		assertEquals(itemArray[1], itemStock.set(1, test1));
	}
	
	@Test
	public void testSize() {
		assertEquals(itemArray.length, itemStock.size());
	}
	
	@Test 
	public void testAsList() {
		List<Item> newList = null;
		Item[] a = new Item [2];
			
		for (int i = 0; i <= a.length - 1; i++) {
			newList.add(a[i]);
		}
		
		assertEquals(newList, Stock.asList(a));
	}
	
}
