package org.norcofire.bingo.sales;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BingoSalesSetupPanel extends JPanel {
	private int panelWidth = 1570-200;
	private int panelHeight = 820-300;
	private int buttonWidth = 100;
	private int buttonHeight = 25;
	
	/**
	 * Create the panel.
	 */
	public BingoSalesSetupPanel() {
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setLayout(null);
		
		//BingoSales bingoSales = new BingoSales();
		
		JButton exitButton = new JButton("Finished Setup");
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Exit");
				System.exit(ABORT);
			}
		});
		
		exitButton.setBounds(panelWidth-buttonWidth, panelHeight-buttonHeight, buttonWidth, buttonHeight);
		exitButton.setBackground(Color.RED);
		
		add(exitButton);
	}	
}
