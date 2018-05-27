package sMart.CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import sMart.Classes.Store;

/**
 * The CSVSaleslogReader class takes a .csv file and converts it into an object. 
 * 
 * @author Lara de Maroussem
 *
 */
 
public class CSVSaleslogReader {
	
    public static void main(String... args) {
    		
    		/* Creating an Object list to input a file and creating an Object to test the CSV reader*/

    		List<Object[]> sales = null;
		sales = salesCSV("/Users/Lara/Documents/GitHub/CSV/sales_log_0.csv");
	
		for (Object[] b : sales) { 
			System.out.println(asString1(b));
		}
	}
    	
/*---------------------------------------------------------------*/
    	
    	/**
    	   * This method is used to convert the .csv file into an Object. It takes the 
    	   * fileName as a parameter and using BufferedReader it converts each line into an 
    	   * Array index.
    	   * @param fileName This is the file that will be converted into an Object.
    	   * @return List<Object> The return is of the new Object ArrayList.
    	   */
	
    	public static List<Object[]> salesCSV(String fileName){
    		
		List<Object[]> sales = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
				
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
				
			String line = br.readLine();
					
			while (line != null) {			
				String [] properties = line.split(",");
				Object[] sale = createSale(properties);		
				sales.add(sale);		
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			}		
		return sales;
	}  
    	
/*---------------------------------------------------------------*/
    	
 	/**
  	   * This method takes the converted .csv file in the salesCSV method and creates an Object with
  	   * two indexes.
  	   * @param String [] data This parameter is referencing the object created in the salesCSV class.
  	   * @return Item returns an Item object.
  	   */
    	
	public static Object[] createSale(String [] data) {
				
		String name = data[0];
		int numSold = 0;
		
		
		for (int i = 0; i < Store.getInventory().size(); i++) {
			if (Store.getInventory().get(i).name.equals(name)) {
				numSold = Store.getInventory().get(i).quantity - Integer.parseInt(data[1]);
			}
		}
		
		Object[] nameAndNumber = {name, numSold};

		return nameAndNumber;
	}
	
/*---------------------------------------------------------------*/	

	/**
	   * This method takes the converted .csv file in the salesCSV method and creates an Object with
	   * two indexes.
	   * @param String [] data This parameter is referencing the object created in the salesCSV class.
	   * @return Item returns an Item object.
	   */
	
	public static Object[][] saleArray(List<Object[]> list) {
		Object[][] array = new Object[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = list.get(i)[j];
			}
		}
		return array;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method takes the createSale method and converts it into a readable string format.
	   * @param Object entry. This parameter creates an Object referencing the createSale method. 
	   * @return String. Returns object in a string format.
	   */
			
	public static String asString1(Object[] entry) { 
		
		return "[" + entry[0] + "] [" + entry[1] + "]";
	}
			
}
