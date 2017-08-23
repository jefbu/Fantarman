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
	private JPanel mainPanel;
	private JPanel mainPanelTopPanel;
	private JPanel mainPanelBottomLeftPanel;
	private JPanel mainPanelBottomRightPanel;
	
	public JButton acceptButton;
	public JButton cancelButton;
	public JButton confirmButton;
	
	
	public Popup(int width, int height, Colour colour, boolean dichotomy) {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);
		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		
		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension (width, height));
		bottomPanel.setBackground(applyColour(colour, 0));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));
		
		middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension (width - 6, height - 6));
		middlePanel.setBackground(applyColour(colour, 40));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));
		
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(width - 12, height - 12));
		mainPanel.setBackground(applyColour(colour, 80));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		add(bottomPanel);
		bottomPanel.add(middlePanel);
		middlePanel.add(mainPanel);
		
		mainPanelTopPanel = new JPanel();
		mainPanelTopPanel.setPreferredSize(new Dimension (width - 12, (height - 12) * 3 / 4));
		mainPanelTopPanel.setBackground(applyColour(colour, 80));
		
		mainPanel.add(mainPanelTopPanel);
		
		mainPanelBottomLeftPanel = new JPanel();
		mainPanelBottomLeftPanel.setPreferredSize(new Dimension ((width - 12) * 2 / 3, (height - 12) / 4));
		mainPanelBottomLeftPanel.setBackground(applyColour(colour, 80));
		
		mainPanel.add(mainPanelBottomLeftPanel);
		
		mainPanelBottomRightPanel = new JPanel();
		mainPanelBottomRightPanel.setPreferredSize(new Dimension((width - 12) / 3, (height - 12) / 4));
		mainPanelBottomRightPanel.setBackground(applyColour(colour, 80));
		mainPanelBottomRightPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 2));
		
		mainPanel.add(mainPanelBottomRightPanel);
		
		if (dichotomy) {
			confirmButton = new JButton();
			confirmButton.setPreferredSize(new Dimension ((width - 12) / 6, (height - 12) / 4 - 4));
			confirmButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(confirmButton);
			cancelButton = new JButton();
			cancelButton.setPreferredSize(new Dimension ((width - 12) / 6, (height - 12) / 4 - 4));
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(cancelButton);
		} else {
			acceptButton = new JButton();
			acceptButton.setPreferredSize(new Dimension((width - 12) / 3, ((height - 12) / 4)-4));
			acceptButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});	
			mainPanelBottomRightPanel.add(acceptButton);			
		}		
	}
	
	
	private Color applyColour(Colour colour, int modifier) {
		
		switch (colour) {
		case RED: return new Color(160 + modifier, 60 + modifier, 40 + modifier / 2);
		case GREEN: return new Color(100 + modifier, 160 + modifier, 60 + modifier / 2);
		case BLUE: return new Color(60 + modifier / 2, 120 + modifier, 160 + modifier);
		}
		return new Color(0,0,0);
		
	}

	
	
	
}
