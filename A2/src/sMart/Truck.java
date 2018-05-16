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
	private List<Item> cargo;
	
	public double calculateCost(double variable, double cost) {
		return cost;
	}
	
	public void cargoCapacity (double cargoCapacity) {

	}
	
	public void cargo() {
		//temp controlled items must be in refrigerated truck
	}

}
