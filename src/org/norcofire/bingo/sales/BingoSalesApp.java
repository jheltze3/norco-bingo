package org.norcofire.bingo.sales;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BingoSalesApp {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame();
				
				BingoSalesPanel bingoSalesPanel = new BingoSalesPanel();
				BingoSalesSetupPanel bingoSalesSetupPanel = new BingoSalesSetupPanel();
				
				frame.getContentPane().add(bingoSalesPanel);
				frame.getContentPane().add(bingoSalesSetupPanel);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
				BingoSales.setUpGame();
				
			}
		});
	}

}
