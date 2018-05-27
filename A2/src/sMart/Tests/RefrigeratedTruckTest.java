package sMart.Tests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import sMart.Classes.Item;
import sMart.Classes.RefrigeratedTruck;

/**
 * Test case for the class RefridgeratedTruck. 
 * 
 * @author James Kehoe
 *
 */

public class RefrigeratedTruckTest {
	
	/* Creating variables to be used in test cases */
	
	Item a = new Item ("IceCream", 1, 4, 2, 300, 200, "-10");
	List<Item> testList = new ArrayList<Item> ();
	
	RefrigeratedTruck test = new RefrigeratedTruck(testList);
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the calculateCost() function in 
	   * the RefrigeratedTruck class. In the RefrigeratedTruck class this 
	   * method is of type double, with a parameter of Item a and return 
	   * of cost.
	   */
		
	@Test
	public void testCalculateCost() {
		String temp = a.getTemp();
		double temperature = Double.parseDouble(temp);
		
		double cost = 900 + (200 * (java.lang.Math.pow(0.7,(temperature/5))));
		
		assertEquals(cost, test.calculateCost(a), 300);
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the addCargo() function in the  
	   * RefrigeratedTruck class. In the RefrigeratedTruck class this method 
	   * is of List<Item> type, with a parameter of an Item a and 
	   * a return value of List<>.
	   */
		
	@Test
	public void testAddCargo() {
		String temp = a.getTemp();
		
		if(a.checkTemp(temp) == true) {
			testList.add(a);
		}
		
		assertEquals(testList, test.addCargo(a));
	}

/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to test the checkFull() function in the  
	   * RefrigeratedTruck class. In the RefrigeratedTruck class this
	   * method is of type boolean, with a parameter of List<item> 
	   * cargo and a return value of a boolean. This test checks for a true 
	   * boolean value; if the size of List<item> cargo exceeds the
	   * cargo capacity.
	   */
		
	@Test
	public void testCheckFullYes () {
		double cargoCap = 800;
		boolean check;
		
		while (testList.size() >= 801) {
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
	   * RefrigeratedTruck class. In the RefrigeratedTruck class this method 
	   * is of type boolean, with a parameter of List<item> cargo and 
	   * a return value of a boolean. This test checks for a false
	   * boolean value; if the size of List<item> cargo doesn't reach 
	   * the cargo capacity.
	   */
		
	@Test
	public void testCheckFullNo () {
		double cargoCap = 800;
		boolean check;
		
		while (testList.size() <= 799) {
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
