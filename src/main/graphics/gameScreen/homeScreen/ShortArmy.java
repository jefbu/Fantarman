package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;

public class ShortArmy extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ContentPanel titlePanel;
	private ContentPanel titleBarPanel;
	private ContentPanel regimentsPanel;
	private ArrayList<RegimentPanel> regimentPanels;

	public ShortArmy(int width, int height) {
		
			super();
			setPreferredSize(new Dimension(width, height));
			setBackground(Colors.backgroundOrange);
			setLayout(new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			
			regimentPanels = new ArrayList<RegimentPanel>();

			/*titlePanel = new ContentPanel(width / 2, height / 10, Colour.DRED,
					new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			titlePanel.contentLabel.setForeground(Colors.textyellow);
			titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
			titlePanel.contentLabel.setText("ARMY");
			add(titlePanel);*/

			titleBarPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.RED,
					new FlowLayout(FlowLayout.LEADING, 0, 0));
				LabeledPanel namePanel = new LabeledPanel(width * 3 / 10, height / 10);
					namePanel.setBackground(Colors.orange);
					namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
					namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					namePanel.label.setForeground(Colors.textyellow);
					namePanel.label.setText("Army");
				titleBarPanel.insidePanel.add(namePanel);
				/*
				LabeledPanel rolePanel = new LabeledPanel(width * 15 / 100, height / 10);
					rolePanel.setBackground(Colors.red);
					rolePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
					rolePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					rolePanel.label.setForeground(Colors.textyellow);
					rolePanel.label.setText("Role");
				titleBarPanel.insidePanel.add(rolePanel);
				LabeledPanel valuePanel = new LabeledPanel(width * 2 / 10, height / 10);
					valuePanel.setBackground(Colors.red);
					valuePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
					valuePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					valuePanel.label.setForeground(Colors.textyellow);
					valuePanel.label.setText("Value");
				titleBarPanel.insidePanel.add(valuePanel);
				LabeledPanel captainPanel = new LabeledPanel(width * 2 / 10, height / 10);
					captainPanel.setBackground(Colors.red);
					captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
					captainPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					captainPanel.label.setForeground(Colors.textyellow);
					captainPanel.label.setText("Captain");
				titleBarPanel.insidePanel.add(captainPanel);*/
			add(titleBarPanel);

			regimentsPanel = new ContentPanel(width * 9 / 10, height * 8 / 10, Colour.LRED,
					new FlowLayout(FlowLayout.LEFT, 1, 0));
			add(regimentsPanel);
			
			for (int i = 0; i < 13; i++) {
				regimentPanels.add(new RegimentPanel(width * 9 / 10, height / 20));
			}
			
			for (RegimentPanel regimentPanel: regimentPanels) {
				regimentsPanel.insidePanel.add(regimentPanel);
			}

		}
	
	public void fillShortArmy() {
		
		for (Regiment regiment: Main.yourArmy.roster) {
			regiment.calculateValue();
		}
		
		Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.value - p1.value;
			}
		});
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			regimentPanels.get(i).fillRegimentPanel(i);
		}
		
	}

}
