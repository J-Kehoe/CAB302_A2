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
			
			for (Object[] b : sales) { 
				System.out.println(asString1(b));
			}
			
			//Item
			List<Item> items = itemCSV("/Users/Lara/Documents/GitHub/CSV/item_properties.csv");
			
			for (Item b : items) { 
				System.out.println(asString(b));
			}
			
			//Manifest
			List<Object [] []> manifest = manifestCSV("/Users/Lara/Documents/GitHub/CSV/manifest.csv");
			
			for (Object [] []  b : manifest) { 
				System.out.println(asString1(b));
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
			
	public static String asString1(Object[] entry) { 
		return "[" + entry[0] + "] [" + entry[1] + "]";
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
		return "[" + entry.name + "] [" + entry.mCost + "] [" + entry.sPrice + "] ["
				+ entry.reorder + "] [" + entry.reAmount + "] [" + entry.temp + "]"; 
	}

	//Manifest
	private static List<Object[] []> manifestCSV(String fileName){
		List<Object [] []> manifest = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
				
			try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
						
				String line = br.readLine();
						
				while (line != null) {
							
					String [] properties = line.split(",");
							
					Object [] [] manifests = createManifest(properties);
							
					manifest.add(manifests);
							
					line = br.readLine();
				}

			} catch (IOException ioe) {
				
				ioe.printStackTrace();
			}
					
			return manifest;
	}
			
	private static Object [] [] createManifest(String [] metadata) {
				
		String truck = metadata[0];
		String name = metadata[1];
		double order = Double.parseDouble(metadata[2]);
				
		Object[] [] manifesT = {
					{truck} , 
					{name, order}
		};

		return manifesT;
	}
			
	public static String asString( Object [] [] entry) { 
		return "Item [name=" + entry[0][0] + ", manufacturing cost=" + entry[1][0] + ", sale price=" + entry[2][0] + "]"; 
	}

}
