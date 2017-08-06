package main.components;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import main.graphics.battleScreen.BattleScreen;

public class Popup extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JPanel bottomPanel;
	private JPanel middlePanel;
	public JPanel mainPanel;
	
	public JButton closeButton;
	
	
	public Popup(int width, int height, Colour colour) {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);
		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		
		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension (width, height));
		bottomPanel.setBackground(applyColour(colour, 0));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 2, 2));
		
		middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension (width - 4, height - 4));
		middlePanel.setBackground(applyColour(colour, 20));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 2, 2));
		
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(width - 8, height - 8));
		mainPanel.setBackground(applyColour(colour, 40));
		
		add(bottomPanel);
		bottomPanel.add(middlePanel);
		middlePanel.add(mainPanel);
		
		closeButton = new JButton();
		closeButton.setPreferredSize(new Dimension(width - 20, height - 20));
		
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});	
		
		mainPanel.add(closeButton);		
		
	}
	
	
	private Color applyColour(Colour colour, int modifier) {
		
		switch (colour) {
		case RED: return new Color(160 + modifier, 60 + modifier / 2, 120 + modifier);
		case GREEN: return new Color(120 + modifier, 160 + modifier, 60 + modifier / 2);
		case BLUE: return new Color(60 + modifier / 2, 120 + modifier, 160 + modifier);
		}
		return new Color(0,0,0);
		
	}

	
	
	
}
