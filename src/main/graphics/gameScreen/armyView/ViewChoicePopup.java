package main.graphics.gameScreen.armyView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.components.Colour;
import main.components.Popup;
import main.entity.armies.Army;
import main.graphics.Screen;

public class ViewChoicePopup extends Popup {
	
	private static final long serialVersionUID = 1L;
	
	JButton combatStatsButton;
	JButton generalStatsButton;
	JButton historyStatsButton;

	public ViewChoicePopup(int width, int height, Colour colour, boolean dichotomy) {
		
		super(width, height, colour, dichotomy);
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 5));
		
		combatStatsButton = new JButton("Combat Stats");
		combatStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		mainPanelTopPanel.add(combatStatsButton);
		
		generalStatsButton = new JButton("General Stats");
		generalStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		mainPanelTopPanel.add(generalStatsButton);
		
		historyStatsButton = new JButton("History Stats");
		historyStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		mainPanelTopPanel.add(historyStatsButton);
		
	}
	
	public void fillViewChoicePopup(Army army) {
		
		try {
			combatStatsButton.removeActionListener(combatStatsButton.getActionListeners()[0]);
		} catch (Exception e) {}
		try {
			generalStatsButton.removeActionListener(generalStatsButton.getActionListeners()[0]);
		} catch (Exception e) {}
		try {
			historyStatsButton.removeActionListener(historyStatsButton.getActionListeners()[0]);
		} catch (Exception e) {}
		
		combatStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(army);
				dispose();
			}
		});
		
		generalStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelGeneralStats(army);
				dispose();
			}
		});
		
		historyStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelHistoryStats(army);
				dispose();
			}
		});
		
	}

}
