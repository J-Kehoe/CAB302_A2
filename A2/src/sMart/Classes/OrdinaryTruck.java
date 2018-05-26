package sMart.Classes;


/**
 * Ordinary truck is an object which inherits from the abstract class Truck. It contains all the properties of truck.
 * 
 * @author 
 *
 */

public class OrdinaryTruck extends Truck{
	
	double quantity;

/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	
	public OrdinaryTruck() {
		this.cargoCapacity = 1000;
		this.tempControlled = false;
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	public double calculateCost(double variable) {
		this.quantity = variable; 
		
		cost = 750 + (0.25 * variable);
	
		return cost;
	}
	
}
