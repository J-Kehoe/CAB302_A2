package sMart;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Main window is the main GUI class, this class groups all the GUI classes together and displays
 * them as one GUI.
 * 
 * @author James Kehoe
 *
 */

public class MainWindow extends JFrame {

	private TitlePanel titlePanel;
	private DisplayPanel displayPanel;
	private UserPanel userPanel;
	
	
	public MainWindow(String title) throws HeadlessException {
		super(title);
		
		// Set layout manager
		setLayout(new BorderLayout());
		
		//Create Swing component
		JTextArea capital = new JTextArea();
		
		displayPanel = new DisplayPanel();
		titlePanel = new TitlePanel();
		userPanel = new UserPanel();
		
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
