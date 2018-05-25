package sMart.Tests;
import org.junit.Test;

import sMart.Classes.Item;
import sMart.Classes.Stock;

import static org.junit.Assert.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test case for the class Stock. 
 * 
 * @author Lara de Maroussem
 *
 */

public class StockTest {
	
	/* Initializing variables to be used in test cases */
	
	private Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, "2.0");
	private Item test2 = new Item("Cheese", 0, 2.0, 6.0, 1, 4,"-2.0");
	
	Item[] itemArray = new Item[2];
	Stock itemStock = new Stock(itemArray);
	Item item;

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the get() function in the Stock 
	   * class. In the Stock class this method is of Object Item and 
	   * uses an index integer as a parameter. 
	   */
	
	@Test
	public void testGet() {
		itemArray[0] = test;
		itemArray[1] = test2;
		
		assertEquals(itemArray[1], itemStock.get(1));
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the set() function in the Stock 
	   * class. In the Stock class this method is of Object Item and 
	   * uses an index integer and an Item object as a parameter. 
	   * This method changes the value of a particular index.
	   */
	
	@Test
	public void testSet() {
		Item test1 = new Item("Grapes", 0, 2.0, 6.0, 1, 4, "-2.0");
		Item test = itemArray[1];
		itemArray[1] = test1;

		assertEquals(itemArray[1], itemStock.set(1, test1));
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the size() function in the Stock 
	   * class. It returns the length of an Item array.
	   */
	
	@Test
	public void testSize() {
		assertEquals(itemArray.length, itemStock.size());
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method tests the output of the asList method in the 
	   * Stock class. The asList method has an Item object as a parameter,
	   * takes it and inputs it into a new ArrayList. 
	   */
	
	@Test 
	public void testAsList() {
		Item[] a = new Item [2];
		a[0] = test;
		a[1] = test2;
		List<Item> newList = new ArrayList<>();
			
		for (int i = 0; i <= a.length - 1; i++) {
			newList.add(a[i]);
		}
		
		assertEquals(newList, Stock.asList(a));
	}
	
}
