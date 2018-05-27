package sMart.Tests;

import org.junit.Test;

import sMart.Classes.Item;
import sMart.Classes.Stock;
import sMart.Classes.Store;

/**
 * Test case for the class Store. 
 * 
 * @author Lara de Maroussem
 *
 */


public class StoreTest {
	
	Item item1 = new Item ("Test1", 0, 0.0, 0.0, 0, 0, "0.0");
	Item item2 = new Item ("Test2", 1, 1.0, 1.0, 1, 1, "1.0");
	Item item3 = new Item ("Test3", 2, 2.0, 2.0, 2, 2, "2.0");
	
	Item [] testArray = new Item[3];
	
	public static Store getInstance() {
		return null;
	}
	
	
	
	double captial = 10000;
	
	@Test
	public void testGetSet() {
		
		//store = Store.getInstance();
		
		//asssertEquals(captial, );
	}
	
	@Test
	public void testGenerateManifest() {
		testArray[0] = item1;
		testArray[1] = item2;
		testArray[3] = item3;
		
		Stock test = new Stock(testArray);
		//Store test1 = new Store();
		
		//assertEquals(testArray, test.inventory());
	}

}
