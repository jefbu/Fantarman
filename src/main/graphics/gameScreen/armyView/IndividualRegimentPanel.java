package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.entity.armies.Army;
import main.graphics.Screen;

public class IndividualRegimentPanel extends JPanel {
	

	private static final long serialVersionUID = 1L;
	Color backgroundColorOwnArmy = new Color(70, 140, 210);
	Color backgroundColorOpponentArmy = new Color(255, 240, 220);
	ArrayList<ButtonedPanel> panelList;

	public IndividualRegimentPanel(int width, int height, int index) {
		
		super();
		panelList = new ArrayList<ButtonedPanel>();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(backgroundColorOwnArmy);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		ButtonedPanel namePanel = new ButtonedPanel(width / 6, height, new Color(40, 40, 40));
		namePanel.setBackground(new Color(80, 155, 240));
		namePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.setVisible(false);
				Screen.gameScreen.mainPanel.regimentView.fillRegimentView(Main.yourArmy.roster.get(index));
				Screen.gameScreen.mainPanel.regimentView.setVisible(true);
			}
		});
		panelList.add(namePanel);
		
		for (int i = 0; i < 10; i++) {
			ButtonedPanel panel = new ButtonedPanel(width / 12, height, new Color(40, 40, 40));
			panel.setBackground(new Color(80, 160 + i * 5, 240));
			panel.button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Screen.gameScreen.mainPanel.armyView.setVisible(false);
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(Main.yourArmy.roster.get(index));
					Screen.gameScreen.mainPanel.regimentView.setVisible(true);
				}
			});
			panelList.add(panel);
		}
		
		for (ButtonedPanel panel: panelList) {
			add(panel);
		}		
	}
	
	public void fillIndividualRegimentPanel(Army army) {
		if (army == Main.yourArmy) { setBackground(backgroundColorOwnArmy); }
		else { setBackground(backgroundColorOpponentArmy); }
	}

}
