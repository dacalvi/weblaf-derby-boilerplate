package com.teslasystems.derbyweblaf_boilerplate;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import com.alee.laf.WebLookAndFeel;

/**
 * Hello world!
 *
 */
@SuppressWarnings("serial")
public class App extends JFrame {
	
	public App() {
		setTitle("Web LaF");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 560);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(WebLookAndFeel.class
							.getCanonicalName());
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
