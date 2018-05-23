package sMart;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Display panel contains capital and inventory controls. 
 * 
 * @author James Kehoe
 *
 */

public class DisplayPanel extends JPanel {
	public DisplayPanel() {
		Dimension size = getPreferredSize();
		size.width = 900;
		setPreferredSize(size);
		String[] columns = {"Name", "Quantity", "Man. Cost", 
				"Sell Price", "Reorder Point", "Reorder Amount", "Temp."};
		Object[][] testinput = {
				{"Test", "Test", "Test", "Test", "Test", "Test", "Test"},
				{"Test", "Test", "Test", "Test", "Test", "Test", "Test"},
				{"Test", "Test", "Test", "Test", "Test", "Test", "Test"},
				{"Test", "Test", "Test", "Test", "Test", "Test", "Test"},
		};
		DecimalFormat df2 = new DecimalFormat(".##");
		
		JLabel capitalLabel = new JLabel("Capital: ");
		JButton tableButton = new JButton("Inventory");
		JTextField capitalField = new JTextField(10);
		capitalField.setText(df2.format(Store.getCapital()));
		capitalField.setEditable(false);
		
		JTable inventoryTable = new JTable(testinput, columns);
		inventoryTable.setPreferredScrollableViewportSize(new Dimension(600, 300));
		inventoryTable.setFillsViewportHeight(true);
		inventoryTable.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane(inventoryTable);
		
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
		
		
	}
}
