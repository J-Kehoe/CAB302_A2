package sMart.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Ordinary truck is an object which inherits from the abstract class Truck. It contains all the properties of truck.
 * 
 * @author Lara de Maroussem
 *
 */

public class OrdinaryTruck extends Truck{

/*---------------------------------------------------------------*/	
	
	/**
	   * The OrdinaryTruck object. 
	   * @param List<Items> cargo. The cargo of OrdinaryTruck. 
	   */
	
	public OrdinaryTruck(List<Item> cargo) {

	}

/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method calculates the cost of 
	   * an OrdinaryTruck based on the variable cargo quantity.
	   * @param double variable. Checks cost based on cargo quantity.
	   * @return cost. Returns cost of OrdinaryTruck.
	   */
	
	public double calculateCost(List<Item> cargo) {

		double quantity = cargo.size();
		
		cost = 750 + (0.25 * quantity);
	
		return cost;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method adds an Item to 
	   * OrdinaryTruck cargo if item is not temperature controlled.
	   * @param Item a. Method uses getTemp() and checkTemp() from
	   * the Item class to check if item a is temperature controlled. 
	   * @return Cargo. 
	   */
	
	public List<Item> addCargo (Item a) {
		List<Item> cargo = new ArrayList <Item> ();
		String temp = a.getTemp();
			
			if (a.checkTemp(temp) == false ) {
				cargo.add(a);
			}
		
		return cargo;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * Inherited from Truck, this method returns a boolean value to
	   * check if OrdinaryTruck is full. OrdinaryTruck's capacity is 
	   * 1000.
	   * @param List<Item> cargo. OrdinaryTruck's cargo.
	   * @return checkFull. Return boolean checkFull value.
	   */
	
	public Boolean checkFull (List<Item> cargo) {
		boolean checkFull;
		cargoCapacity = 1000;
		
		if (cargo.size() < cargoCapacity) {
			checkFull = true;
		} else {
			checkFull = false;
		}
		
		return checkFull;
	}
	
}
