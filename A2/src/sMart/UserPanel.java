package sMart;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * User panel contains all the buttons and the labels on the right side of the GUI.
 * 
 * @author James Kehoe
 *
 */

public class UserPanel extends JPanel {
	public UserPanel() {
		Dimension size = getPreferredSize();
		size.width = 300;
		setPreferredSize(size);
		
		JLabel StepOneLabel = new JLabel("Step One: Initialise Item Properties");
		JButton propertiesButton = new JButton("Import Properties");
		
		JLabel StepTwoLabel = new JLabel("Step Two: Export Manifest");
		JButton exportButton = new JButton("Export Manifest");
		
		JLabel StepThreeLabel = new JLabel("Step Three: Import Manifest");
		JButton importButton = new JButton("Import Manifest");
		
		JLabel StepFourLabel = new JLabel("Step Four: Upload Sales Log");
		JButton salesButton = new JButton("Upload Sales Log");
		
		JLabel procedure = new JLabel("Repeat Steps Two to Four Until Complete");
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		//// Add Labels and Buttons to Column //////////////////////
		
		
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		//// Step One ///////////////////////////////////
		
		gc.anchor = GridBagConstraints.SOUTH; 
		gc.gridx = 0;
		gc.gridy = 0;
		add(StepOneLabel, gc);
		
		gc.anchor = GridBagConstraints.NORTH;
		gc.gridx = 0;
		gc.gridy = 1;
		add(propertiesButton, gc);
		
		//// Step Two ////////////////////////////////////
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.gridx = 0;
		gc.gridy = 2;
		add(StepTwoLabel, gc);
				
		gc.anchor = GridBagConstraints.NORTH;
		gc.gridx = 0;
		gc.gridy = 3;
		add(exportButton, gc);
		
		//// Step Three ///////////////////////////////////
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.gridx = 0;
		gc.gridy = 4;
		add(StepThreeLabel, gc);
		
		gc.anchor = GridBagConstraints.NORTH;
		gc.gridx = 0;
		gc.gridy = 5;
		add(importButton, gc);
		
		//// Step Four ////////////////////////////////////
		
		gc.anchor = GridBagConstraints.SOUTH;
		gc.gridx = 0;
		gc.gridy = 6;
		add(StepFourLabel, gc);
				
		gc.anchor = GridBagConstraints.NORTH;
		gc.gridx = 0;
		gc.gridy = 7;
		add(salesButton, gc);
		
		//// Final Label /////////////////////////////////
		
		gc.gridx = 0;
		gc.gridy = 8;
		add(procedure, gc);
		
	}
}
