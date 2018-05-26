package sMart;

import java.awt.Cursor;

/**
 * The GUI settings class controls the width, height, title, 
 * visibility and runs the thread the GUI operates on.
 * 
 * @author James Kehoe
 *
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUISettings {
	
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 500;

	public GUISettings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame GUI = new MainWindow("Super Mart");
				GUI.setSize(WIDTH, HEIGHT);
				GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GUI.setVisible(true);
			}
		});
	}

}
