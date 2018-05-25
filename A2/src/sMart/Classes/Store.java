package sMart.Classes;

/**
 * The Store class represents a store object. It contains Capital, Inventory and Name. 
 * 
 * @author
 *
 */

public class Store {
	
	private static double capital = 100000;
	private Stock inventory;
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
	
	public String name (String name) {
		this.name = name;
		return name; 
	}

}
