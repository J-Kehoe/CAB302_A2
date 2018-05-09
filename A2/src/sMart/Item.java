package sMart;

/**
 * The Item class represents an item object. Containing name, manufacturing cost, sale price, re-order point, re-order amount
 * and in some cases item temperature. 
 * 
 * @author Lara de Maroussem 
 *
 */

public class Item {
	
	String name;
	double mCost;
	double sPrice;
	int reorder;
	int reAmount;
	double temp; 
	
	
	public Item (String name, double mCost, double sPrice, int reorder, int reAmount) {
		
		this.name = name; 
		this.mCost = mCost;
		this.sPrice = sPrice;
		this.reorder = reorder;
		this.reAmount = reAmount;
		this.temp = temp; 
		
	}
	
	public Item getName() {
		return name;
	}
	
	public Item getMcost() {
		return name;
	}

}
