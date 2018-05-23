package sMart;
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
	private Item[] data; // Temporary
	private Stock cargo = new Stock(data);
	
	private RefrigeratedTruck test = new RefrigeratedTruck();
	private OrdinaryTruck test2 = new OrdinaryTruck();
	
	
	public double calculateCost(double variable) {
		return cost;
	}
	
	public void cargo() {
		if (tempControlled = true) {
			
			
		} else if (tempControlled = false) {
			
		}
	}

}
