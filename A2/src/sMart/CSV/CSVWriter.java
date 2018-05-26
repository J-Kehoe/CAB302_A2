package sMart.CSV;


import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * 
 * @author
 *
 */

public class CSVWriter {
	
/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	
	
	public static void generateCSVFile(String fileName) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(fileName);
			writer.append("Truck"); //insert manifest.truck etc.
			writer.append("\n");
	        writer.append("Item"); //insert manifest.item etc.
	        writer.append(",");
	        	writer.append("Order"); //insert manifest.order etc.
	            	
	            	//might need a for loop to iterate through all the items
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}

/*---------------------------------------------------------------*/	
	
	/**
	   * 
	   * @param 
	   */
	
	public static void main(String[] args) throws IOException{
		
		String location = "E:\\newManifest.csv";
		generateCSVFile(location);
		
	}
}
