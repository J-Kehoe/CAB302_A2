package sMart;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
 
public class CSVReader {

    	public static void main(String... args) {

	        //Sales
			List<Object[]> sales = null;
			try {
				sales = salesCSV("/Users/Lara/Documents/GitHub/CSV/sales_log_0.csv");
			} catch (IOException e) {
				System.out.println("File not read correctly.");
			}
			
			//Sales
			for (Object[] b : sales) { 
				System.out.println(asString(b));
			}
			
			//Item
			List<Item> items = itemCSV("/Users/Lara/Documents/GitHub/CSV/item_properties.csv");
			
			//item
			for (Item b : items) { 
				System.out.println(asString(b));
			}
	
	}
	
    	private static List<Object[]> salesCSV(String fileName) throws IOException{
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

		} catch (CSVFormatException ex) {
			System.out.println("File was not read correctly, check file name.");
		}
				
		return sales;
	}         
			
	private static Object[] createSale(String [] metadata) {
				
		String name = metadata[0];
		int numSold = Integer.parseInt(metadata[1]);
				
		Object[] nameAndNumber = {name, numSold};

		return nameAndNumber;
	}
			
	public static String asString(Object[] entry) { 
		return "Saleslog [name=" + entry[0] + ", number sold=" + entry[1] + "]";
	}
			
	private static List<Item> itemCSV(String fileName){
		List<Item> items = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
				
			try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
						
				String line = br.readLine();
						
				while (line != null) {
							
					String [] properties = line.split(",");
							
					Item item = createItem(properties);
							
					items.add(item);
							
					line = br.readLine();
				}

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
					
			return items;
	}
			
	private static Item createItem(String [] metadata) {
				
		String name = metadata[0];
		double mCost = Double.parseDouble(metadata[1]);
		double sPrice = Double.parseDouble(metadata[2]);
		int reorder = Integer.parseInt(metadata[3]);
		int reAmount = Integer.parseInt(metadata[4]);
		double temp = Double.parseDouble(metadata[5]);
				
		return new Item(name, mCost, sPrice, reorder, reAmount, temp);
	}
			
	public static String asString(Item entry) { 
		return "Item [name=" + entry.name + ", manufacturing cost=" + entry.mCost + ", sale price=" + entry.sPrice + ", "
				+ "reorder point=" + entry.reorder + ", reorder amount=" + entry.reAmount + ", temperature=" + entry.temp + "]"; 
	}

}
