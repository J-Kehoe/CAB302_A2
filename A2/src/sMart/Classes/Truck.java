package sMart.Classes;

import java.util.*;  

/**
 * An abstract class for ordinary truck and refrigerated truck. It contains the properties cost, cargo capacity and cargo.
 * 
 * @author 
 *
 */

public abstract class Truck {
	
	double cost;
	double cargoCapacity;
	boolean tempControlled;
	private Item[] data;
	private Stock stock = new Stock (data);
	
	private RefrigeratedTruck test = new RefrigeratedTruck();
	private OrdinaryTruck test2 = new OrdinaryTruck();

/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	
	public double calculateCost(double variable) {
		return cost;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	
	public Stock cargo (Stock cargo) {
		
		this.stock = cargo;
		
		Item temp = data[6];
		
		if (tempControlled = true) {
			
			
		} else if (tempControlled = false) {
			
		}
		return cargo;
	}

}
