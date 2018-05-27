package sMart.GUI;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;

import sMart.CSV.CSVItemReader;

import sMart.Classes.Item;
import sMart.Exceptions.CSVFormatException;



/**
 * User panel contains all the buttons and the labels on the right side of the GUI.
 * 
 * @author James Kehoe
 *
 */

public class UserPanel extends JPanel {
	
	private EventListenerList listenerList = new EventListenerList();
	
	public UserPanel() {
		Dimension size = getPreferredSize();
		size.width = 300;
		setPreferredSize(size);
		//CSVReaderItem read = new CSVReaderItem();
		JFileChooser fc = new JFileChooser();
		
		JLabel StepOneLabel = new JLabel("Step One: Initialise Item Properties");
		JButton propertiesButton = new JButton("Import Properties");
		
		propertiesButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				fc.setCurrentDirectory(new java.io.File("."));
				fc.setDialogTitle("Choose Properties File");
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (fc.showOpenDialog(propertiesButton) == JFileChooser.APPROVE_OPTION) {
					CSVItemReader propertiesData = new CSVItemReader();
					
					try {
					List<Item> p_list = propertiesData.itemCSV(fc.getSelectedFile().getAbsolutePath());
					Object[][] t_data_init = propertiesData.TableData(p_list);

					fireUserEvent(new UserEvent(this, t_data_init));
					
					} catch (CSVFormatException error) {
						JOptionPane.showMessageDialog (null, error.toString());
					} catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog (null, "Please check file, values are missing");
					}
				}
				
			}
		});
		
		JLabel StepTwoLabel = new JLabel("Step Two: Export Manifest");
		JButton exportButton = new JButton("Export Manifest");
		
		exportButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Prompt filechooser
				List<Item> manifest = Store.GenerateManifest();
				CSVWriter writer = new CSVWriter();
				
				fc.setCurrentDirectory(new java.io.File("."));
				fc.setDialogTitle("Choose Save Location");
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fc.showSaveDialog(exportButton) == JFileChooser.APPROVE_OPTION) {
					//File is saved
					writer.generateCSVFile(fc.getSelectedFile().getAbsolutePath() + "/manifest.csv", manifest);
				}
				
				//String manifest = Store.GenerateManifest();
			}
		});
		
		JLabel StepThreeLabel = new JLabel("Step Three: Import Manifest");
		JButton importButton = new JButton("Import Manifest");
		
		importButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Prompt filechooser
				fc.setCurrentDirectory(new java.io.File("."));
				fc.setDialogTitle("Choose Manifest File");
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (fc.showOpenDialog(importButton) == JFileChooser.APPROVE_OPTION) {
					CSVManifestReader manifestReader = new CSVManifestReader();
					
					List<Object[]> man_array = CSVManifestReader.manCSV(fc.getSelectedFile().getAbsolutePath());
					Object[][] man_table = manifestReader.TableData(man_array);
					Stock man_as_stock = Store.ReadManifest(man_table);
					Manifest man = new Manifest(man_as_stock);
					//double cost = man.AssignTrucks();
					double cost = 40000;
					Store.setCapital(Store.getCapital() - cost);
					
					System.out.println(man_table);
					
					//fireUserEvent(new UserEvent(this, man_table));
					//update capital on gui
					
					//update inventory where name = name
					

				}
			}
		});
		
		JLabel StepFourLabel = new JLabel("Step Four: Upload Sales Log");
		JButton salesButton = new JButton("Upload Sales Log");
		
		salesButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Prompt filechooser
				fc.setCurrentDirectory(new java.io.File("."));
				fc.setDialogTitle("Choose Sales Log File");
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (fc.showOpenDialog(salesButton) == JFileChooser.APPROVE_OPTION) {
					CSVSaleslogReader salesData = new CSVSaleslogReader();
					  
					//List<Object[]> p_list = salesData.salesCSV(fc.getSelectedFile().getAbsolutePath());
					//Object[] nameNumber = salesData.createSale(p_list.get(0));
				}
			}
		});
		
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
	
	public void fireUserEvent(UserEvent event) {
		Object[] listeners = listenerList.getListenerList();
		
		for (int i = 0; i < listeners.length; i += 2) {
			if (listeners[i] == UserListener.class) {
				((UserListener)listeners[i+1]).userEventHappened(event);
			}
		}
	}
	
	public void addUserListener(UserListener listener) {
		listenerList.add(UserListener.class, listener);
	}
	
	public void removeUserListener(UserListener listener) {
		listenerList.remove(UserListener.class, listener);		
	}
		
	
}
