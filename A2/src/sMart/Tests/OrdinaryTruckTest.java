package sMart.Tests;
import static org.junit.Assert.*;
import org.junit.Test;

import sMart.Classes.OrdinaryTruck;

public class OrdinaryTruckTest {
	
	OrdinaryTruck test = new OrdinaryTruck();
	
	
	@Test
	public void testCalculateCost() {
		
		assertEquals(200,test.calculateCost(3000), 10);
	}

}
