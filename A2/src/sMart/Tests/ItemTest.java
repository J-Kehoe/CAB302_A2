package sMart.Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import sMart.Classes.Item;

/**
 * Test case for class Item. 
 * 
 * @author James Kehoe
 *
 */

public class ItemTest {
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the testTemp function 
	   * in the Item class. In the Item class, this method returns
	   * a boolean value tempControlled; true or false depending on
	   * if the item is temperature controlled. 
	   */
	
	@Test
	public void testTemp() {
		Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, "2.0");
		String tempValue = test.getTemp();
		
		boolean result;
			
		if(tempValue == " ") {
			result = false;
		} else {
			result = true;
		}
		
		assertEquals (result, test.checkTemp(tempValue));
	}
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to convert a Item object to a string. 
	   * Using the get methods from the Item class, this test class places
	   * the Item object 'test' into a string comparing that value with 
	   * the test.toString() output. 
	   */
	
	@Test
	public void testToString() {
		Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, "2.0");
		
		String name = test.getName();
		int quantity = test.getQuantity();
		double mCost = test.getMCost();
		double sPrice = test.getSPrice();
		int reorder = test.getReorder();
		int reAmount = test.getReAmount();
		String temp = test.getTemp();
		
		String itemToString = "Item [" + name + "] [" + quantity + "] [" + mCost + "] [" + sPrice + "] "
				+ "[" + reorder + "] [" + reAmount + "] [" + temp + "]"; 
		
		
		assertEquals (itemToString, test.toString());
	}
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to move an Item object into an array. 
	   * Using the get methods from the Item class, this test class places
	   * the Item object 'test' into an array comparing that value with 
	   * the test.toArray() output. 
	   */
	
	@Test
	public void testToArray() {
		Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, "2.0");
		
		String name = test.getName();
		int quantity = test.getQuantity();
		double mCost = test.getMCost();
		double sPrice = test.getSPrice();
		int reorder = test.getReorder();
		int reAmount = test.getReAmount();
		String temp = test.getTemp();
		
		Object [] arrayTest = {name, quantity, mCost, sPrice, reorder, reAmount, temp};
	
		assertEquals (arrayTest, test.toArray());
	}
}
