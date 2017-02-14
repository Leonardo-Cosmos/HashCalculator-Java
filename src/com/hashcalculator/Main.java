/* 2013/7/9 */
package com.hashcalculator;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.hashcalculator.ui.HashFrame;

public class Main {
	public static void main(String[] args) {
		showFrame();
	}
	
	private static void showFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame frame = new HashFrame();
		frame.setVisible(true);
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}