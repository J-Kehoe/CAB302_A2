package sMart.CSV;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import sMart.Classes.Item;



public class CSVWriter {
	
	public static void generateCSVFile(String fileName, List<Item> data) {
		
		FileWriter writer = null;
		
		try {
				writer = new FileWriter(fileName);
				writer.append("Refrigerated"); //insert manifest.truck etc.
            	writer.append("\n");
            	
            	for (int i = 0; i < data.size(); i++) {
            		if (data.get(i).checkTemp(data.get(i).getTemp()) == true) {
            			writer.append(data.get(i).getName()); //insert manifest.item etc.
                    	writer.append(",");
                    	writer.append(Integer.toString(data.get(i).getReAmount())); //insert manifest.order etc.
                    	writer.append("\n");
            		}
            	}
            	
            	writer.append("Ordinary");
            	writer.append("\n");
            	
            	for (int i = 0; i < data.size(); i++) {
            		if (data.get(i).checkTemp(data.get(i).getTemp()) == false) {
            			writer.append(data.get(i).getName()); //insert manifest.item etc.
                    	writer.append(",");
                    	writer.append(Integer.toString(data.get(i).getReAmount())); //insert manifest.order etc.
                    	writer.append("\n");
            		}
            	}
				
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

	
	public static void main(String[] args) throws IOException{
		
		String location = "C:\\Users\\jkkeh\\Downloads";
		//generateCSVFile(location);
		
	}
}
