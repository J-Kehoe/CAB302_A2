package sMart.Classes;

/**
 * Manifest is a collection of trucks
 * 
 * @author James Kehoe
 *
 */

public class Manifest {
	
	private Object[][] manifest;
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method has not been implemented. 
	   * @param manifest.
	   */
	
	public Manifest (Object [][] manifest) {
		this.manifest = manifest;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method has not been implemented. 
	   * @return Total cost.
	   */
	
	public double AssignTrucks() {
		//total is 
		double totalcost = 0;
		int r_truck_needed = 0;
		int o_truck_needed = 0;
		
		return totalcost;
		
		/*for (int o = 0; o < manifest.length; o++) {
			if (manifest[o][6] != null) {
				if (CheckFull(r_truck) == true) {
					AddtoTruck(truck, cargo);
				} else {
					NewTruck(r_truck);
				}
			} else {
				boolean need_fridge = false;
				for (int r = 0; r < manifest.length; r++) {
					if (manifest[r][6] == temp_controlled) {
						need_fridge = true;
					} else {
						return;
					}
				}
				if (need_fridge == true) {
					if (CheckFull(r_truck) == true) {
						AddtoTruck(truck, cargo);
					} else {
						NewTruck(r_truck);
					}
				} else {
					if (CheckFull(o_truck) == true) {
						AddtoTruck(truck, cargo);
					} else {
						NewTruck(o_truck);
					}
				}
			}
		}*/
		/*
		For item in report {
			if temp_controlled {
				if open space in current r_truck {
					item in current r_truck
				} else {
					item in new r_truck
				}
			} else {
				if open space in o_truck {
					item in o_truck
				} else {
					bool need_fridge = false;
					for (r = report[i]; r < report.length; r++) {
						if r == temp_controlled {
							need_fridge = true
						} else {
							return
						}
					}
					if need_fridge == true {
						item in new r_truck
					} else {
						item in new o_truck
					}
				}
			}
		}
		*/
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method has not been implemented. 
	   */
	
	public void ExportManifest() {
		
	}
}
