package sMart.Classes;

import java.util.*;  

/**
 * An abstract class for ordinary truck and refrigerated truck. It contains the properties cost, cargo capacity and cargo.
 * 
 * @author Lara de Maroussem
 *
 */

public abstract class Truck {
	
	double cost;
	double cargoCapacity;

/*---------------------------------------------------------------*/	
	
	/**
	   * This method returns the calculated cost of truck. The
	   * full functionality of this class is implemented in both
	   * Refrigerated and Ordinary truck.
	   * @return cost.
	   */
	
	public double calculateCost() {
		return cost;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * This method adds an Item to the truck cargo, cargo is 
	   * represented in a List format. 
	   * @param a.
	   * @return Cargo. Returns truck cargo.
	   */
	
	public List<Item> addCargo (Item a) {
		List<Item> cargo = new ArrayList <Item> ();
		cargo.add(a);
		
		return cargo;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * This method returns a boolean and checks if truck is full.
	   * @param cargo.
	   * @return checkFull, boolean to check if truck is full.
	   */
	
	public Boolean checkFull (List<Item> cargo) {
		
		Boolean checkFull = null;
		
		if (cargo.size() > cargoCapacity) {
			checkFull = true;
		} else {
			checkFull = false;
		}
		return checkFull;
	}
	
}
