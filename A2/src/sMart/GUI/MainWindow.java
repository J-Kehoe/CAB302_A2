package sMart.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

/**
 * Main window is the main GUI class, this class groups all the GUI classes together and displays
 * them as one GUI.
 * 
 * @author James Kehoe
 *
 */

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private TitlePanel titlePanel;
	private DisplayPanel displayPanel;
	private UserPanel userPanel;
	private FileChooser fc;
	
	
	public MainWindow(String title) throws HeadlessException {
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		//Create Swing component
		
		displayPanel = new DisplayPanel();
		titlePanel = new TitlePanel();
		userPanel = new UserPanel();
		fc = new FileChooser();
		
		// Add Listeners
		userPanel.addUserListener(new UserListener() {
			public void userEventHappened(UserEvent event) {
				
				Object[][] content = event.getTable();
				displayPanel.setTableContents(content);
			}
		});
		
		// Add Swing components to pane
		Container c = getContentPane();
		
		c.add(titlePanel, BorderLayout.NORTH);
		c.add(userPanel, BorderLayout.CENTER);
		c.add(displayPanel, BorderLayout.WEST);
		
		// Add Behaviour
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				capital.append("Hello\n");
//				
//			}
//			
//		});
	}

}
