package sMart.Classes;

/**
 * The Store class represents a store object. It contains Capital, Inventory and Name. 
 * 
 * @author
 *
 */

public class Store {
	
	private static double capital = 100000;
	private static Stock inventory;
	private static Stock cargo;
	//inventory.items = Food;
	
	private String name;
	
	private static final Store instance = new Store();
	
	private Store() {}
	
	public static Store getInstance() {
		return instance;
	}
	
	public static double getCapital () {
		return capital;
		
	}
	
	public Stock inventory (Stock inventory) {
		this.inventory = inventory;
		return inventory; 
	}
	
	public Stock cargo (Stock cargo) {
		this.cargo = cargo;
		return cargo; 
	}
	
	public String name (String name) {
		this.name = name;
		return name; 
	}
	
	public static String GenerateManifest() {
		String manifest = "";
		String r_string = "";
		String o_string = "";
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).quantity < inventory.get(i).reorder) {
				//if temp controlled add name and reorder amount to r_string
				//else add name and reorder amount to o_string
			}
		}
		manifest = ">Refrigerated,\n" + r_string + ",>Ordinary,\n" + o_string;
		
		return manifest;
	}
	
	private void inputSales(Object[][] saleslog) {
		//this will run after a saleslog is processed
		//capital+ , inventory-
	}
	
	private void UpdateCapitalAndInventory(int cost, Stock items) {
		//This will run after a manifest is ordered
		//capital- , inventory+
	}

}
