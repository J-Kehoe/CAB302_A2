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

/* Item object */
	
	public Item (String name, double mCost, double sPrice, int reorder, int reAmount, double temp) {
		
		this.name = name; 
		this.mCost = mCost;
		this.sPrice = sPrice;
		this.reorder = reorder;
		this.reAmount = reAmount; 
		this.temp = temp;
		
	}

/* Checks if item has a temperature, returns message or temperature */
	
	public double checkTemp() {
		
		if (temp == 0) {
			System.out.println("Item does not have a temperature");
		}
		return temp;
	}
	
/* Get methods, returning item values */
	
	public String getName() {
		return name;
	}
	
	public double getMCost() {
		return mCost;
	}
	
	public double getSPrice() {
		return sPrice;
	}
	
	public int getReorder() {
		return reorder;
	}
	
	public int getReAmount() {
		return reAmount;
	}

}
