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
import sMart.Classes.Store;

public class CSVReaderItem {
	
	public static List<Item> itemCSV(String fileName){
		//List<ArrayList<String>> items = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		List<Item> properties = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
			
			String line = br.readLine();
			
			
			while (line != null) {
				String[] upload = line.split(",", -1);
				Item myItem = CreateItem(upload);
				
				properties.add(myItem);
				//String item = createItem(properties);
				
				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} 
		Item[] inv = new Item[properties.size()];
		for (int i = 0; i < inv.length; i++) {
			inv[i] = properties.get(i);
		}
		Stock inv_stock = new Stock(inv);
		//Store.setInventory(inv_stock);
		return properties;
	}
	
///////////////////////////////////////////////////////////////////	
	
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
	
///////////////////////////////////////////////////////////////////////
	
	/*public TableModel asTable(Object[][] table) {
		TableModel model
		return 
	}
	*/
///////////////////////////////////////////////////////////////////////
	
	private static Item CreateItem(String[] metadata) {
		
		String name = metadata[0];
		int quantity = 0;
		double mCost = Double.parseDouble(metadata[1]);
		double sPrice = Double.parseDouble(metadata[2]);
		int reorder = Integer.parseInt(metadata[3]);
		int reAmount = Integer.parseInt(metadata[4]);
		String temp = metadata[5];
		
		Item itemVersion = new Item(name, quantity, mCost, sPrice, reorder, reAmount, temp);
		
		return itemVersion;
	}
	
	
		
			
		/*	String[][] itemList = new String[items.size()][];
			for (int i = 0; i < items.size(); i++) {
			    ArrayList<String> row = items.get(i);
			    itemList[i] = row.toArray(new String[row.size()]);
			}*/
			
			//Testing Idea
			
			//dummy inventory Item[]
			
			
			
			//Done testing Idea
			
			//String[] itemList = new String[items.size()];
			//itemList = items.toArray(itemList);
					
//			Object[][] table = {
//					{itemList[0]}, {itemList[1]}, {itemList[2]}, {itemList[3]}, 
//					{itemList[4]}, {itemList[5]}, {itemList[6]}, 
//					{itemList[7]}, {itemList[8]}, {itemList[9]}, 
//					{itemList[10]}, {itemList[11]}, {itemList[12]}, 
//					{itemList[13]}, {itemList[14]}, {itemList[15]}, 
//					{itemList[16]}, {itemList[17]}, {itemList[18]}, 
//					{itemList[19]}, {itemList[20]}, {itemList[21]}, 
//					{itemList[22]}, {itemList[23]}, 
//			};	

	public static void main(String... args) {
	
	    //Get scanner instance
		//List<Item> items = itemCSV("C:/Users/jkkeh/OneDrive/Pictures/item_properties.csv");
		
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 24; j++) {
				System.out.println(items[j][i]);
			}
		}*/	
	}
}