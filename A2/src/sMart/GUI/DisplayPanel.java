package sMart.GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sMart.CSV.CSVReaderItem;
import sMart.Classes.Store;

/**
 * Display panel contains capital and inventory controls. 
 * 
 * @author James Kehoe
 *
 */

public class DisplayPanel extends JPanel {
	
	CSVReaderItem propertiesData = new CSVReaderItem();
	
	private static final long serialVersionUID = 1L;
	String test = "test";
	
	//List<Item> p_list = propertiesData.itemCSV("C:/Users/jkkeh/OneDrive/Pictures/item_properties.csv");
	//Object[][] t_data_init = propertiesData.TableData(p_list);
	Object[][] testinput = new Object[0][0];
	String[] columns = {"Name", "Quantity", "Man. Cost", 
			"Sell Price", "Reorder Point", "Reorder Amount", "Temp."};
	JTable inventoryTable = new JTable(new DefaultTableModel (testinput, columns));
	JScrollPane scrollPane = new JScrollPane(inventoryTable);
	
	public DisplayPanel() {
		Dimension size = getPreferredSize();
		size.width = 900;
		setPreferredSize(size);
		DecimalFormat df2 = new DecimalFormat(".##");
		
		JLabel capitalLabel = new JLabel("Capital: ");
		JTextField capitalField = new JTextField(10);
		capitalField.setText(df2.format(Store.getCapital()));
		capitalField.setEditable(false);
		
		inventoryTable.setPreferredScrollableViewportSize(new Dimension(600, 300));
		inventoryTable.setFillsViewportHeight(true);
		inventoryTable.setEnabled(false);
		inventoryTable.getModel();
		

		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		//// Top Row - Capital //////////////////////
		
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 0;
		gc.gridy = 0;
		add(capitalLabel, gc);
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(capitalField, gc);
		
		//// Bottom Row - Inventory /////////////////
		
		gc.weighty = 10;
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridheight = 2;
		gc.gridwidth = 2;
		gc.fill = GridBagConstraints.BOTH;
		add(scrollPane, gc);
		
		//// Add Listener for Updates ///////////////
//		UserPanel.addUserListener(new UserListener() {
//			public void userEventHappened(UserEvent event) {
//				
//			}
//		});
		
	}
	
	public void setTableContents(Object[][] contents) {
		DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
		int rows = model.getRowCount();
		if (rows != 24) { 
			for (int i = 0; i < contents.length; i++) {
					model.addRow(contents[i]);
			}
		UpdateInventory();	
		} else {
			for (int i = 0; i < contents.length; i++) {
				for (int j = 0; j < 24; j++) {
					if (model.getValueAt(j, 0).equals(contents[i][0])) {
						
						model.setValueAt(contents[i][1], j, 1);
					}
				}
			}
			UpdateInventory();
		}
		//this.remove(inventoryTable);
	}
	
	public void UpdateInventory() {
		DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
		for (int i = 0; i < Store.getInventory().size(); i++) {
			Store.getInventory().get(i).quantity = (int) model.getValueAt(i, 1);
		}
	}
}
