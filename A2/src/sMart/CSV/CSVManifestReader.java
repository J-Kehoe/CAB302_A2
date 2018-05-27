package sMart;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * The CSVManifestReader class takes a .csv file and converts it into an object. 
 * 
 * @author James Kehoe
 *
 */
 
public class CSVManifestReader {

    	public static void main(String... args) {
    		
    		// Creating an Object list to input a file and creating an Object to test the CSV reader

    	List<Object[]> sales = null;
		sales = manCSV("Manifest Directory");
	
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
	
    	public static List<Object[]> manCSV(String fileName){
    		
		List<Object[]> manifest = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
				
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
				
			String line = br.readLine();
					
			while (line != null) {			
				String [] properties = line.split(",", -1);
				Object[] man_line = createManLine(properties);		
				manifest.add(man_line);		
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			}
		
		return manifest;
	}  
    	
	public Object[][] TableData(List<Object[]> input) {
		Object[][] asTable = new Object[input.size()][2];
		for (int i = 0; i < input.size(); i++) {
			asTable[i][0] = input.get(i)[0];
			asTable[i][1] = input.get(i)[1];
		}
		
		return asTable;
	}
    	
    	
/*---------------------------------------------------------------*/
    	
 	/**
  	   * This method takes the converted .csv file in the salesCSV method and creates an Object with
  	   * two indexes.
  	   * @param String [] data This parameter is referencing the object created in the salesCSV class.
  	   * @return Item returns an Item object.
  	   */
    	
	public static Object[] createManLine(String [] data) {
				
		Object[] nameAndRestock = new Object[2];
		String name = data[0];
		nameAndRestock[0] = name;
		if (data.length > 1) {
			int restockAmount = Integer.parseInt(data[1]);
			nameAndRestock[1] = restockAmount;
		} else {
			nameAndRestock[1] = null;
		}

		return nameAndRestock;
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
