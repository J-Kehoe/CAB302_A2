package sMart.Tests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import sMart.Classes.Item;
import sMart.Classes.OrdinaryTruck;

/**
 * Test case for the class OrdinaryTruck. 
 * 
 * @author James Kehoe
 *
 */

public class OrdinaryTruckTest {

	/* Creating variables to be used in test cases */
	
	Item a = new Item ("Bread", 1, 4, 2, 300, 200, "");
	List<Item> testList = new ArrayList<Item> ();
	
	OrdinaryTruck test = new OrdinaryTruck(testList);
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the calculateCost() function in 
	   * the OrdinaryTruck class. In the OrdinaryTruck class this 
	   * method is of type double, with a parameter of List<Item> cargo.
	   */
		
	@Test
	public void testCalculateCost() {
		testList.add(a);
		
		double q = testList.size();
		double cost = 750 + (0.25 * q);
		
		assertEquals(cost,test.calculateCost(testList), 300);
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the addCargo() function in the  
	   * OrdinaryTruck class. In the OrdinaryTruck class this method 
	   * is of List<Item> type, with a parameter of an Item a and 
	   * a return value of List<>.
	   */
		
	@Test
	public void testAddCargo() {
		String temp = a.getTemp();
		
		if(a.checkTemp(temp) == false) {
			testList.add(a);
		}
		
		assertEquals(testList, test.addCargo(a));
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the checkFull() function in the  
	   * OrdinaryTruck class. In the OrdinaryTruck class this method 
	   * is of type boolean, with a parameter of List<item> cargo and 
	   * a return value of a boolean. This test checks for a true 
	   * boolean value; if the size of List<item> cargo exceeds the
	   * cargo capacity.
	   */
		
	@Test
	public void testCheckFullYes () {
		double cargoCap = 1000;
		boolean check;
		
		while (testList.size() >= 1001) {
			testList.add(a);
		}
		
		if (testList.size() > cargoCap) {
			check = true;
		} else {
			check = false;
		}
		
		assertEquals(check, test.checkFull(testList));
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the checkFull() function in the  
	   * OrdinaryTruck class. In the OrdinaryTruck class this method 
	   * is of type boolean, with a parameter of List<item> cargo and 
	   * a return value of a boolean. This test checks for a false
	   * boolean value; if the size of List<item> cargo doesn't reach 
	   * the cargo capacity.
	   */
		
	@Test
	public void testCheckFullNo () {
		double cargoCap = 1000;
		boolean check;
		
		while (testList.size() <= 999) {
			testList.add(a);
		}
		
		if (testList.size() < cargoCap) {
			check = true;
		} else {
			check = false;
		}
		
		assertEquals(check, test.checkFull(testList));
	}

}
