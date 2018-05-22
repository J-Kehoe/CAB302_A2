package sMart;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	public TitlePanel() {
		// Initialise Panel
		Dimension size = getPreferredSize();
		size.height = 25;
		setPreferredSize(size);
		
		// Create components
		JLabel titleLabel = new JLabel("Welcome to SuperMart!");
		
		// Set Layout Manager
		setLayout(new GridBagLayout());
		GridBagConstraints tgc = new GridBagConstraints();
		
		// Add components to panel
		//Container t = getContentPane();
		tgc.gridx = 0;
		tgc.gridy = 0;
		add(titleLabel, tgc);
	}
}
