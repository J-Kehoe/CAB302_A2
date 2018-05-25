package sMart.Classes;

/**
 * The Item class represents an item object. Containing name, manufacturing cost, sale price, re-order point, re-order amount
 * and in some cases item temperature. 
 * 
 * @author
 *
 */

public class Item {
	
	String name;
	int quantity;
	double mCost;
	double sPrice;
	int reorder;
	int reAmount;
	String temp; 
	boolean tempControlled;

/*---------------------------------------------------------------*/	
	
	/**
	   * Public Item creates an object Item.
	   * @param String name, int quantity, double mCost, 
	   * double sPrice, int reorder, int reAmount, String temp 
	   * These parameters are the variables of the Item object.
	   */
	
	public Item (String name, int quantity, double mCost, double sPrice, int reorder, int reAmount, String temp) {
		
		this.name = name;
		this.quantity = quantity;
		this.mCost = mCost;
		this.sPrice = sPrice;
		this.reorder = reorder;
		this.reAmount = reAmount; 
		this.temp = temp;
		
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * This method checks if an item is refrigerated or ordinary.
	   * @return Returns temperature value;
	   */
	
	public String checkTemp() {
		
		return temp;
	}

/*---------------------------------------------------------------*/	
/* Get methods, returning item values */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

/*---------------------------------------------------------------*/	
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

/*---------------------------------------------------------------*/	
	
	public double getMCost() {
		return mCost;
	}
	
	public void setMCost(double mCost) {
		this.mCost = mCost;
	}

/*---------------------------------------------------------------*/	
	
	public double getSPrice() {
		return sPrice;
	}
	
	public void setSPrice(double sPrice) {
		this.sPrice = sPrice;
	}
	
/*---------------------------------------------------------------*/		
	public int getReorder() {
		return reorder;
	}
	
	public void setReorder(int reorder) {
		this.reorder = reorder;
	}
	
/*---------------------------------------------------------------*/	
	public int getReAmount() {
		return reAmount;
	}
	
	public void setReAmount(int reAmount) {
		this.reAmount = reAmount;
	}
	
/*---------------------------------------------------------------*/		
	
	public String toString() { 
		return "Item [" + name + "] [" + quantity + "] [" + mCost + "] [" + sPrice + "] "
				+ "[" + reorder + "] [" + reAmount + "] [" + temp + "]"; 
	}

/*---------------------------------------------------------------*/	
	
	public Object[] toArray() {
		Object[] itemArray = {name, quantity, mCost, sPrice, reorder, reAmount, temp};
		return itemArray;
	}

}
