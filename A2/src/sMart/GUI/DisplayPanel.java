package sMart.GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import sMart.CSV.CSVReaderItem;
import sMart.Classes.Item;

/**
 * Display panel contains capital and inventory controls. 
 * 
 * @author James Kehoe
 *
 */

public class DisplayPanel extends JPanel {
	
	CSVReaderItem propertiesData = new CSVReaderItem();
	
	private static final long serialVersionUID = 1L;
	
	
	List<Item> p_list = propertiesData.itemCSV("/Users/Lara/Documents/GitHub/CSV/sales_log_0.csv");
	Object[][] t_data_init = propertiesData.TableData(p_list);
	
	public DisplayPanel() {
		Dimension size = getPreferredSize();
		size.width = 900;
		setPreferredSize(size);
		DecimalFormat df2 = new DecimalFormat(".##");
		
		JLabel capitalLabel = new JLabel("Capital: ");
		JTextField capitalField = new JTextField(10);
		capitalField.setText(df2.format(Store.getCapital()));
		capitalField.setEditable(false);
		
		JScrollPane scrollPane = RefreshTable(t_data_init);
		
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
	
	public JScrollPane RefreshTable(Object[][] input) {
		String[] columns = {"Name", "Quantity", "Man. Cost", 
				"Sell Price", "Reorder Point", "Reorder Amount", "Temp."};
		JTable inventoryTable = new JTable(input, columns);
		inventoryTable.setPreferredScrollableViewportSize(new Dimension(600, 300));
		inventoryTable.setFillsViewportHeight(true);
		inventoryTable.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane(inventoryTable);
		
		return scrollPane;
	}
	
	public void setTableContents(Object[][] contents) {
		Object[][] input = contents;
		
		/*JScrollPane newTable = RefreshTable(input);
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.weighty = 10;
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.gridheight = 2;
		gc.gridwidth = 2;
		gc.fill = GridBagConstraints.BOTH;
		add(newTable, gc);*/
		
	}
}
