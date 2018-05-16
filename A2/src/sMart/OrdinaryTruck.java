package sMart;

/**
 * Ordinary truck is an object which inherits from the abstract class Truck. It contains all the properties of truck.
 * 
 * @author 
 *
 */

public class OrdinaryTruck extends Truck{
	
	double quantity;
	
	public double calculateCost(double variable, double cost) {
		this.quantity = variable; 
		this.cost = cost;
		
		cost = 750 + (0.25 * variable);
	
		return cost;
	}
	
	public void cargoCapacity (double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
		cargoCapacity = 1000;
	}
	
}
