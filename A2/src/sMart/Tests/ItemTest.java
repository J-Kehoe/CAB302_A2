package sMart.Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import sMart.Classes.Item;

public class ItemTest {
	
	private Item test2 = new Item("Cheese", 0, 2.0, 6.0, 1, 4,-2.0);
	
	@Test
	public void testTemp() {
		Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, 2.0);
		Item test2 = new Item("Bread", 0, 2.0, 6.0, 1, 4, 0);
		double temp = 2.0;
		
		assertEquals (temp, test.checkTemp(), 3.0);
		assertEquals (temp, test2.checkTemp(), 3.0);
		
	}
	
}
