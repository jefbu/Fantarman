package main.graphics.gameScreen.regimentView.captainDetail.bigOrderPanel;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class BigOrderPanel extends JDialog {

	private static final long serialVersionUID = 1L;
	
	ImageLoader imageLoader;
	
	BigConditionPanel bigConditionPanel;
	BigTargetPanel bigTargetPanel;
	BigTacticPanel bigTacticPanel;

	public BigOrderPanel(int width, int height, Colour colour, Boolean dichotomy) {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);

		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension (width, height * 5 / 100));
		topPanel.setBackground(decideColour(colour));
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(topPanel);
		
		JLabel titleLabel = new JLabel();
		titleLabel.setForeground(Colors.vlgrey);
		titleLabel.setText("Choose your tactic by picking a condition, a target and an order.");
		topPanel.add(titleLabel);
		
		bigConditionPanel = new BigConditionPanel(width, height * 35 / 100);
		bigTargetPanel = new BigTargetPanel(width, height * 25 / 100);
		bigTacticPanel = new BigTacticPanel(width, height * 25 / 100);
		
		add(bigConditionPanel);
		add(bigTargetPanel);
		add(bigTacticPanel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension (width, height * 10 / 100));
		bottomPanel.setBackground(decideColour(colour));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(bottomPanel);
		
		
		
		
	}
	
	
	
	
	
	private Color decideColour(Colour colour) {
		
		switch(colour) {
		case DGREY: return Colors.dgrey;
		case VDGREY: return Colors.vdgrey;
		default: return Colors.lblue;
		}
		
	}
	
	
	

}
