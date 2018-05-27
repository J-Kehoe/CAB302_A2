package sMart.Classes;

import java.util.ArrayList;
import java.util.List;

import sMart.CSV.CSVWriter;
import sMart.Classes.Item;
import sMart.Classes.Stock

/**
 * The Store class represents a store object. It contains Capital, Inventory and Name. 
 * 
 * @author
 *
 */

public class Store {
	
	private static double capital = 100000;
	private static Stock inventory;
	
	private String name;
	
	private static final Store instance = new Store();
	
	private Store() {}
	
	public static Store getInstance() {
		return instance;
	}
	
	public static double getCapital () {
		return capital;
		
	}
	
	public static void setCapital (double newCapital) {
		capital = newCapital;
	}
	
	public static Stock getInventory () {
		return inventory; 
	}
	
	public static void setInventory (Stock input) {
		inventory = input;
	}
	
	public String name (String name) {
		this.name = name;
		return name; 
	}
	
	public static List<Item> GenerateManifest() {
		List<Item> manifest = new ArrayList<Item>();
		CSVWriter writer = new CSVWriter();
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).quantity < inventory.get(i).reorder) {
				//if temp controlled add name and reorder amount to r_string
				//else add name and reorder amount to o_string
				manifest.add(inventory.get(i));
			}
		}
		return manifest;
	}
	
	public static Stock ReadManifest(Object[][] manifest) {
		Stock man_stock = new Stock(new Item[inventory.size()]);
		for (int i = 0; i < manifest.length; i++) {
			for (int j = 0; j < inventory.size(); j++) {
				if (manifest[i][0] == inventory.get(j).name) {
					man_stock.add(inventory.get(j));
				}
			}
		}
		
		return man_stock;
	}
	
	public static void UpdateInventory(Object[][] items, Boolean plusminus) {
		//This will run after a manifest is ordered
		//capital- , inventory+
		for (int i = 0; i < items.length; i++) {
			if (items[i][0].equals(inventory.get(i).name)) {
				if (plusminus == true) {
					inventory.get(i).quantity = inventory.get(i).quantity + (int)items[i][1];
				} else {
					inventory.get(i).quantity = inventory.get(i).quantity - (int)items[i][1];
				}
			}
		}
	}

	public static Object[][] InventorytoArray() {
		Object[][] inv_array = new Object[inventory.size()][7];
		for (int i = 0; i < inventory.size(); i++) {
			inv_array[i][0] = inventory.get(i).name;
			inv_array[i][1] = inventory.get(i).quantity;
			inv_array[i][2] = inventory.get(i).mCost;
			inv_array[i][3] = inventory.get(i).sPrice;
			inv_array[i][4] = inventory.get(i).reorder;
			inv_array[i][5] = inventory.get(i).reAmount;
			inv_array[i][6] = inventory.get(i).temp;
		}
		
		return inv_array;
	}

}
