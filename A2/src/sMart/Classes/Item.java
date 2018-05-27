package sMart.Classes;

/**
 * The Item class represents an item object. Containing name, manufacturing cost, sale price, re-order point, re-order amount
 * and in some cases item temperature. 
 * 
 * @author Lara de Maroussem 
 *
 */

public class Item {
	
	public String name;
	public int quantity;
	public double mCost;
	public double sPrice;
	public int reorder;
	public int reAmount;
	public String temp; 
	public boolean tempControlled;

/*---------------------------------------------------------------*/	
	
	/**
	   * Public Item creates an object Item.
	   * These parameters are the variables of the Item object.
	   * @param name.
	   * @param quantity.
	   * @param mCost.
	   * @param sPrice.
	   * @param reorder.
	   * @param reAmount.
	   * @param temp.
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
	   * @param temp.
	   * @return Returns temperature value;
	   */
	
	public Boolean checkTemp(String temp) {
		this.temp = temp;
		
		if (temp == "") {
			tempControlled = false;
		} else {
			tempControlled = true;
		}
		return tempControlled;
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
	
	public String getTemp() {
		return temp;
	}
	
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
/*---------------------------------------------------------------*/		
	/**
	   * This method takes an Item object and displays it as a string.
	   * @return Returns String value.
	   */
	
	public String toString() { 
		return "Item [" + name + "] [" + quantity + "] [" + mCost + "] [" + sPrice + "] "
				+ "[" + reorder + "] [" + reAmount + "] [" + temp + "]"; 
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * This method takes an Item object and inputs it into an array.
	   * @return Returns Array.
	   */
	
	public Object[] toArray() {
		Object[] itemArray = {name, quantity, mCost, sPrice, reorder, reAmount, temp};
		return itemArray;
	}

}
