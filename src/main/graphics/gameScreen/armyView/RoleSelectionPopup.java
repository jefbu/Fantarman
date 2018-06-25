package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.Popup;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;
import main.utility.Colors;
import main.utility.ImageLoader;

public class RoleSelectionPopup extends Popup {

	private static final long serialVersionUID = 1L;

	Color panelColour;
	JButton marketingButton;
	JButton trainingButton;
	JButton combatButton;
	
	public RoleSelectionPopup(int width, int height) {
		
		super(width, height, Colour.DRED, false);
		ImageLoader imageLoader = new ImageLoader();
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		JPanel combatPanel = new JPanel();
		combatPanel.setPreferredSize(new Dimension(width, height * 23 / 100));
		combatPanel.setBackground(Colors.vlorange);
		combatPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			combatButton = new JButton();
			combatButton.setPreferredSize(new Dimension(width, height * 23 / 100));
			combatButton.setIcon(imageLoader.loadImageIcon("/icons/combatButton.png", width, height * 23 / 100));
			combatPanel.add(combatButton);
		mainPanelTopPanel.add(combatPanel);
		
		JPanel marketingPanel = new JPanel();
		marketingPanel.setPreferredSize(new Dimension(width, height * 23 / 100));
		marketingPanel.setBackground(Colors.blue);
		marketingPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			marketingButton = new JButton();
			marketingButton.setPreferredSize(new Dimension(width, height * 23 / 100));
			marketingButton.setIcon(imageLoader.loadImageIcon("/icons/marketingButton.png", width, height * 23 / 100));
			marketingPanel.add(marketingButton);
		mainPanelTopPanel.add(marketingPanel);
		
		JPanel trainPanel = new JPanel();
		trainPanel.setPreferredSize(new Dimension(width, height * 23 / 100));
		trainPanel.setBackground(Colors.green);
		trainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));		
			trainingButton = new JButton();
			trainingButton.setPreferredSize(new Dimension(width, height * 23 / 100));
			trainingButton.setIcon(imageLoader.loadImageIcon("/icons/trainingButton.png", width, height * 23 / 100));
			trainPanel.add(trainingButton);
		mainPanelTopPanel.add(trainPanel);
			
	}
	
	public void fillIndex(int index) {
		
		try {
			marketingButton.removeActionListener(marketingButton.getActionListeners()[0]);
		} catch (Exception e){ }
		try {
			trainingButton.removeActionListener(trainingButton.getActionListeners()[0]);
		} catch (Exception e){ }
		try {
			combatButton.removeActionListener(combatButton.getActionListeners()[0]);
		} catch (Exception e){ }
		
		marketingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy.roster.get(index).role = Role.MARKETING;
				dispose();
			}
		});
		
		trainingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy.roster.get(index).role = Role.TRAINING;
				dispose();
			}
		});
		
		combatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int combattants = 0;
				for (Regiment regiment: Main.yourArmy.roster) {
					if (regiment.role == Role.COMBAT) combattants++;
				}
				if (combattants < 8) {
				Main.yourArmy.roster.get(index).role = Role.COMBAT;
				}
				dispose();
			}
		});
		
	}

}
