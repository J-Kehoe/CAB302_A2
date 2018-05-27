package sMart.Classes;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * The Stock class represents a collection of Items.
 * 
 * @author James Kehoe
 *
 */

public class Stock extends AbstractList<Item> {
	
	private final Item[] a;
	
/*---------------------------------------------------------------*/	
	
	/**
	   * Public Stock creates an object Stock.
	   * @param Item[] array. This represents a collection of items.
	   */
	
	public Stock(Item[] array) {
		// TODO Auto-generated constructor stub
		a = array;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method gets the index of an item.
	   * @param int index. Represents the index of an Item.
	   * @return Returns the index of Item a.
	   */
	
	@Override
	public Item get(int index) {
		return a[index];
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method sets a new value to an index of a collection of Items.
	   * @param int index. Represents the index of an Item and Item element,
	   * represents new value.
	   * @return Returns the variable oldValue.
	   */
		
	public Item set(int index, Item element) {
		Item oldValue = a[index];
		a[index] = element;
		return oldValue;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method finds the length of an Item.
	   * @return Returns the length of an Item.
	   */
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return a.length;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method adds an Item to a List of type List<Items>. This
	   * represents the Stock class. 
	   * @return Returns the List asList.
	   */
	
	public static List<Item> asList(Item[] a) {
		List<Item> asList = new ArrayList<>();
		for (int i = 0; i <= a.length - 1; i++) {
			asList.add(a[i]);
		}
		
		return asList;
	}

}


