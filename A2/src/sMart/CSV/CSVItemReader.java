package sMart.CSV;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import sMart.Classes.Item;
import sMart.Classes.Stock;
import sMart.Exceptions.CSVFormatException;

/**
 * The CSVItemReader class takes a .csv file and converts it into an Item object. 
 * 
 * @author Lara de Maroussem
 *
 */

public class CSVItemReader {
	
/*---------------------------------------------------------------*/
	
	/**
	   * This method is used to convert the .csv file into an Item object. It takes the 
	   * fileName as a parameter and using BufferedReader it converts each line into an 
	   * Array index.
	   * @param fileName This is the file that will be converted into an Item object.
	   * @return List. The return is of the new Item ArrayList.
	   */

	public static List<Item> itemCSV(String fileName){
		
		Path pathToFile = Paths.get(fileName);
		List<Item> properties = new ArrayList<>();
				
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
			
			String line = br.readLine();
				
			while (line != null) {
				
				String [] upload = line.split(",", -1);	
				
				Item myItem = createItem(upload);
				properties.add(myItem);
				line = br.readLine();	
				
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Item[] inv = new Item[properties.size()];
		for (int i = 0; i < inv.length; i++) {
			inv[i] = properties.get(i);
		}
		Stock inv_stock = new Stock(inv);
		//Store.setInventory(inv_stock);
		return properties;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method is creating a table array, therefore allowing the Item
	   * object parsed from the CSV file to display in the GUI.
	   * Array index.
	   * @param input.
	   * @return The return is the multi dimensional table array.
	   */
	
	public Object[][] TableData(List<Item> input) {
		//Item[] inventory = new Item[6];
		Item[] inventory = new Item[input.size()];
		for (int i = 0; i < inventory.length; i++) {
			inventory[i] = input.get(i);
		}
		
		Object[][] asData = new Object[inventory.length][7];
		
		for (int i = 0; i < inventory.length; i++) {
			Item data = inventory[i];
			Object[] dataArray = data.toArray();
			asData[i][0] = dataArray[0];
			//quantity is zero for first import
			asData[i][1] = 0;
			for (int j = 2; j < 7; j++) {
				asData[i][j] = dataArray[j];
			}
		}
		
		return asData;
	}
	
/*---------------------------------------------------------------*/	
	
	/**
	   * This method takes the converted csv file in the itemCSV method and associates each array 
	   * index with the Item object parameters. 
	   * @param String [] data This parameter is referencing the item created in the itemCSV class.
	   * @return Item returns an Item object.
	   * @throws CSVFormatException. An exception is thrown if the values are empty. The errors
	   * are handled in the UserPanel GUI class.
	   */
	
	private static Item createItem(String [] data) throws CSVFormatException {
		
		String name = data[0];
		String temp = data[5];
		int quantity = 0;
		double mCost = Double.parseDouble(data[1]);
		double sPrice = Double.parseDouble(data[2]);
		int reorder = Integer.parseInt(data[3]);
		int reAmount = Integer.parseInt(data[4]);
			
		if (name.length() == 0) { throw new CSVFormatException("Please include an item name."); } 
			
		if (reorder <= 0) { throw new CSVFormatException("Please include an reorder point above 0."); } 
			
		if (reAmount <= 0 ) { throw new CSVFormatException("Please include an reorder amount above 0."); }
			
		else {
		
			Item itemVersion = new Item(name, quantity, mCost, sPrice, reorder, reAmount, temp);
				
			return itemVersion;
		}
	}
}
