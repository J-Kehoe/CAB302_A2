package sMart;

import java.util.ArrayList;
import java.util.List;

/**
 * The stock class is a collection of the object Item. The class contains functions representing store inventory, stock orders
 * sales log and truck cargo. 
 * 
 * @author 
 *
 */

/* Needs to be a collection of Item object */
// Functions needed to represent store inventory (number of items in the hash map
// Need to represent stock orders, sales log and truck cargo

public class Stock {
	
	private int length;
	private Item[] data;
	private List<Item> datalist;
	
	
	public Stock (Item[] input) {
		this.data = input;
		length = input.length;
		for (int i = 0; i < length + 1; i++) {
			datalist.add(input[i]);
		}
	}
	
	public int getLength () {
		return length;
	}
	
	public void addItem (Item entry) {
		datalist.add(entry);
	}
	
	public void formatStockCSV () {
		
	}
	//private List<Item> items;
	
	
	
}


