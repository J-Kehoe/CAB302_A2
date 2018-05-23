package sMart;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StockTest {
	
	private Item [] new2;
	
	Stock test = new Stock(new2);
	
	@Test
	public void testGetLength() {
		int length = 5;
		assertEquals(length, test.getLength());
	}
	
}
