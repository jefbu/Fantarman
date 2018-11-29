package main.graphics.gameScreen.regimentView.captainDetail.bigTacticPanel;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.battle.tactics.Condition;
import main.components.Colour;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class BigTacticPanel extends JDialog {

	private static final long serialVersionUID = 1L;

	ImageLoader imageLoader;

	BigConditionPanel bigConditionPanel;
	BigTargetPanel bigTargetPanel;
	BigOrderPanel bigOrderPanel;

	int checkboxPanelWidth;
	int checkboxPanelHeight;

	public BigTacticPanel(int width, int height, Colour colour, Boolean dichotomy) {

		super(null, Dialog.ModalityType.APPLICATION_MODAL);

		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(width, height * 5 / 100));
		topPanel.setBackground(decideColour(colour));
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(topPanel);

		JLabel titleLabel = new JLabel();
		titleLabel.setForeground(Colors.vlgrey);
		titleLabel.setText("Choose your tactic by picking a condition, a target and an order.");
		topPanel.add(titleLabel);

		checkboxPanelHeight = height * 35 / 100 * 19 / 100;
		checkboxPanelWidth = width * 19 / 100;

		bigConditionPanel = new BigConditionPanel(width, height * 35 / 100, checkboxPanelHeight);
		bigTargetPanel = new BigTargetPanel(width, height * 25 / 100, checkboxPanelHeight);
		bigOrderPanel = new BigOrderPanel(width, height * 25 / 100, checkboxPanelHeight);

		add(bigConditionPanel);
		add(bigTargetPanel);
		add(bigOrderPanel);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(width, height * 10 / 100));
		bottomPanel.setBackground(decideColour(colour));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(bottomPanel);

	}

	private Color decideColour(Colour colour) {

		switch (colour) {
		case DGREY:
			return Colors.dgrey;
		case VDGREY:
			return Colors.vdgrey;
		default:
			return Colors.lblue;
		}

	}

	public void fillBigTacticPanelComplete(Regiment regiment, int orderNumber) {

		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_100) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_75) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_50) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_25) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_25) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_50) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_75) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_full) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_1_Turn) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_2_Turns) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_3_Turns) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_4_Turns) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_5_Turns) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Target_in_Range) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Any_in_Range) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.ALWAYS) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));	
		}

	}

}
