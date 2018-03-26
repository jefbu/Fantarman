package main.graphics.gameScreen.armyView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.Main;
import main.components.Colour;
import main.components.Popup;
import main.graphics.Screen;

public class ViewChoicePopup extends Popup {
	
	private static final long serialVersionUID = 1L;

	public ViewChoicePopup(int width, int height, Colour colour, boolean dichotomy) {
		
		super(width, height, colour, dichotomy);
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 5));
		
		JButton combatStatsButton = new JButton("Combat Stats");
		combatStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		combatStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				dispose();
			}
		});
		mainPanelTopPanel.add(combatStatsButton);
		
		JButton generalStatsButton = new JButton("General Stats");
		generalStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		generalStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelGeneralStats();
				dispose();
			}
		});
		mainPanelTopPanel.add(generalStatsButton);
		
		JButton historyStatsButton = new JButton("History Stats");
		historyStatsButton.setPreferredSize(new Dimension(width - 4, height / 5));
		historyStatsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelHistoryStats();
				dispose();
			}
		});
		mainPanelTopPanel.add(historyStatsButton);
		
	}

}
