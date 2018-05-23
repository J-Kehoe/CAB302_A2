package sMart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class CSVReaderSales {

    	public static void main(String... args) {

	        //Get scanner instance
			List<Object[]> sales = salesCSV("/Users/Lara/Documents/GitHub/CSV/sales_log_0.csv");
			
			for (Object[] b : sales) { 
				System.out.println(asString(b));
			}
	
	}
			private static List<Object[]> salesCSV(String fileName){
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
			
			private static Object[] createSale(String [] metadata) {
				
				String name = metadata[0];
				int numSold = Integer.parseInt(metadata[1]);
				
				Object[] nameAndNumber = {name, numSold};

				return nameAndNumber;
			}
			
			public static String asString(Object[] entry) { 
				return "Saleslog [name=" + entry[0] + ", number sold=" + entry[1] + "]";
			}

}
