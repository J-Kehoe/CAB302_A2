package sMart;

/**
 * Refrigerated truck is an object which inherits from the abstract class Truck. It contains the properties of Truck, 
 * with the addition of the property temperature.
 * 
 * @author
 *
 */

public class RefrigeratedTruck extends Truck {

	double temperature;
	
	public RefrigeratedTruck() {
		this.cargoCapacity = 800;
		this.tempControlled = true;
	}
	
	public double calculateCost(double variable, double cost) {
		this.temperature = variable; 
		this.cost = cost;
		
		cost = 900 + (200 * (java.lang.Math.pow(0.7,(temperature/5))));
		
		return cost;
	}
	
	public void temperature () {
		//the temperature of the truck, must be the temp of the coldest item in cargo
		// range from -20c to 10c
	}
	
}
	
