package sMart.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Refrigerated truck is an object which inherits from the abstract class Truck. It contains the properties of Truck, 
 * with the addition of the property temperature.
 * 
 * @author Lara de Maroussem
 *
 */

public class RefrigeratedTruck extends Truck {

/*---------------------------------------------------------------*/	
	
	/**
	   * The RefrigeratedTruck object.
	   * @param List cargo. The cargo of RefrigeratedTruck. 
	   */
	
	public RefrigeratedTruck(List<Item> cargo) {}

/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method calculates the cost of 
	   * a RefrigeratedTruck based on the variable cargo quantity.
	   * @param double variable. Checks cost based on cargo quantity.
	   * @return cost. Returns cost of RefrigeratedTruck.
	   */
	
	public double calculateCost(Item a) {
		String temperature = a.getTemp();
		double temp = Double.parseDouble(temperature);
		
		cost = 900 + (200 * (java.lang.Math.pow(0.7,(temp/5))));
		
		return cost;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method adds an Item to 
	   * RefrigeratedTruck cargo if item is not temperature controlled.
	   * @param Item a. Method uses getTemp() and checkTemp() from
	   * the Item class to check if item a is temperature controlled. 
	   * @return Cargo. 
	   */
	
	public List<Item> addCargo (Item a) {
		List<Item> cargo = new ArrayList <Item> ();
		String temp = a.getTemp();
			
			if (a.checkTemp(temp) == true) {
				cargo.add(a);
			}
		
		return cargo;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method returns a boolean value to
	   * check if RefrigeratedTruck is full. OrdinaryTruck's capacity 
	   * is 1000.
	   * @param List cargo. OrdinaryTruck's cargo.
	   * @return checkFull. Return boolean checkFull value.
	   */
	
	public Boolean checkFull (List<Item> cargo) {
		Boolean checkFull = null;
		cargoCapacity = 800;
		
		if (cargo.size() > cargoCapacity) {
			checkFull = true;
		} else {
			checkFull = false;
		}
		
		return checkFull;
	}
	
}
	
