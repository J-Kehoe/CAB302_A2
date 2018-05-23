package sMart;

/**
 * The Item class represents an item object. Containing name, manufacturing cost, sale price, re-order point, re-order amount
 * and in some cases item temperature. 
 * 
 * @author
 *
 */

public class Item {
	
	String name;
	double mCost;
	double sPrice;
	int reorder;
	int reAmount;
	double temp; 
	boolean tempControlled;

/* Item object */
	
	public Item (String name, double mCost, double sPrice, int reorder, int reAmount, double temp) {
		
		this.name = name; 
		this.mCost = mCost;
		this.sPrice = sPrice;
		this.reorder = reorder;
		this.reAmount = reAmount; 
		this.temp = temp;
		
	}

/* Checks if item has a temperature, sets a boolean value if item is temperature controlled */
	
	public void checkTemp() {
		
		if (temp == 0) {
			tempControlled = false;
		}
		else {
			tempControlled = true;
		}
	}
	
/* Get methods, returning item values */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMCost() {
		return mCost;
	}
	
	public void setMCost(double mCost) {
		this.mCost = mCost;
	}
	
	public double getSPrice() {
		return sPrice;
	}
	
	public void setSPrice(double sPrice) {
		this.sPrice = sPrice;
	}
	
	public int getReorder() {
		return reorder;
	}
	
	public void setReorder(int reorder) {
		this.reorder = reorder;
	}
	
	public int getReAmount() {
		return reAmount;
	}
	
	public void setReAmount(int reAmount) {
		this.reAmount = reAmount;
	}
	
	public String toString() { return "Item [name=" + name + ", price=" + mCost + ", author=" + sPrice + "]"; }

}
