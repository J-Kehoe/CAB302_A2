package sMart.Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import sMart.Classes.Item;

public class ItemTest {
	
	
	@Test
	public void testTemp() {
		Item test = new Item("Bread", 0, 2.0, 6.0, 1, 4, "2.0");
		Item test2 = new Item("Bread", 0, 2.0, 6.0, 1, 4, "");
		String temp = "2.0";
		
		assertEquals (temp, test.checkTemp());
		assertEquals (temp, test2.checkTemp());
	}
	
}
