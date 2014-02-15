package org.norcofire.bingo.sales;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BingoSalesPanel extends JPanel {
	private int panelWidth = 1570-200;
	private int panelHeight = 820-300;
	private int buttonWidth = 100;
	private int buttonHeight = 25;
	
	/**
	 * Create the panel.
	 */
	public BingoSalesPanel() {
		setPreferredSize(new Dimension(panelWidth, panelHeight));
		setLayout(null);
		
		//BingoSales bingoSales = new BingoSales();
		
		JButton exitButton = new JButton("Exit");
		
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
