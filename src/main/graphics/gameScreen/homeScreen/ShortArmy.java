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
			setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
			
			regimentPanels = new ArrayList<RegimentPanel>();

			/*titlePanel = new ContentPanel(width / 2, height / 10, Colour.DRED,
					new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			titlePanel.contentLabel.setForeground(Colors.textyellow);
			titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
			titlePanel.contentLabel.setText("ARMY");
			add(titlePanel);*/
			
			JPanel emptyTopPanel = new JPanel();
			emptyTopPanel.setPreferredSize(new Dimension(width * 9 / 10, height * 2 / 100));
			emptyTopPanel.setBackground(Colors.backgroundOrange);
			add(emptyTopPanel);

			titleBarPanel = new ContentPanel(width * 9 / 10, height * 8 / 100, Colour.RED,
					new FlowLayout(FlowLayout.LEADING, 0, 0));
			
				LabeledPanel namePanel = new LabeledPanel(width * 9 * 2 / 100, height / 10);
					namePanel.setBackground(Colors.orange);
					namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					namePanel.label.setForeground(Colors.textyellow);
					namePanel.label.setText("Regiment Name");
				titleBarPanel.insidePanel.add(namePanel);
				
				LabeledPanel captainPanel = new LabeledPanel(width * 9 * 2 / 100, height / 10);
					captainPanel.setBackground(Colors.orange);
					captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					captainPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					captainPanel.label.setForeground(Colors.textyellow);
					captainPanel.label.setText("Captain Name");
				titleBarPanel.insidePanel.add(captainPanel);
				
				LabeledPanel lieutenantsPanel = new LabeledPanel(width * 9 * 5 / 1000, height / 10);
					lieutenantsPanel.setBackground(Colors.orange);
					lieutenantsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					lieutenantsPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					lieutenantsPanel.label.setForeground(Colors.textyellow);
					lieutenantsPanel.label.setText("Lts");
				titleBarPanel.insidePanel.add(lieutenantsPanel);
				
				LabeledPanel lifePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					lifePanel.setBackground(Colors.orange);
					lifePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					lifePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					lifePanel.label.setForeground(Colors.textyellow);
					lifePanel.label.setText("HP");
				titleBarPanel.insidePanel.add(lifePanel);
				
				LabeledPanel movePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					movePanel.setBackground(Colors.orange);
					movePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					movePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					movePanel.label.setForeground(Colors.textyellow);
					movePanel.label.setText("Mov");
				titleBarPanel.insidePanel.add(movePanel);
				
				LabeledPanel runPanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					runPanel.setBackground(Colors.orange);
					runPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					runPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					runPanel.label.setForeground(Colors.textyellow);
					runPanel.label.setText("Run");
				titleBarPanel.insidePanel.add(runPanel);
				
				LabeledPanel speedPanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					speedPanel.setBackground(Colors.orange);
					speedPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					speedPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					speedPanel.label.setForeground(Colors.textyellow);
					speedPanel.label.setText("Spd");
				titleBarPanel.insidePanel.add(speedPanel);
				
				LabeledPanel attackPanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					attackPanel.setBackground(Colors.orange);
					attackPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					attackPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					attackPanel.label.setForeground(Colors.textyellow);
					attackPanel.label.setText("Atk");
				titleBarPanel.insidePanel.add(attackPanel);
				
				LabeledPanel chargePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					chargePanel.setBackground(Colors.orange);
					chargePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					chargePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					chargePanel.label.setForeground(Colors.textyellow);
					chargePanel.label.setText("Crg");
				titleBarPanel.insidePanel.add(chargePanel);
				
				LabeledPanel defencePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					defencePanel.setBackground(Colors.orange);
					defencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					defencePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					defencePanel.label.setForeground(Colors.textyellow);
					defencePanel.label.setText("Def");
				titleBarPanel.insidePanel.add(defencePanel);
				
				LabeledPanel rangePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					rangePanel.setBackground(Colors.orange);
					rangePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					rangePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					rangePanel.label.setForeground(Colors.textyellow);
					rangePanel.label.setText("Rng");
				titleBarPanel.insidePanel.add(rangePanel);
				
				LabeledPanel missilePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					missilePanel.setBackground(Colors.orange);
					missilePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					missilePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					missilePanel.label.setForeground(Colors.textyellow);
					missilePanel.label.setText("Msl");
				titleBarPanel.insidePanel.add(missilePanel);
				
				LabeledPanel moralePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					moralePanel.setBackground(Colors.orange);
					moralePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					moralePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					moralePanel.label.setForeground(Colors.textyellow);
					moralePanel.label.setText("Mrl");
				titleBarPanel.insidePanel.add(moralePanel);
				
				LabeledPanel upkeepPanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					upkeepPanel.setBackground(Colors.orange);
					upkeepPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					upkeepPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					upkeepPanel.label.setForeground(Colors.textyellow);
					upkeepPanel.label.setText("Upk");
				titleBarPanel.insidePanel.add(upkeepPanel);
				
				LabeledPanel valuePanel = new LabeledPanel(width * 9 * 4 / 1000, height / 10);
					valuePanel.setBackground(Colors.orange);
					valuePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					valuePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					valuePanel.label.setForeground(Colors.textyellow);
					valuePanel.label.setText("Val");
				titleBarPanel.insidePanel.add(valuePanel);
				
				LabeledPanel rolePanel = new LabeledPanel(width * 9 * 6 / 1000, height / 10);
					rolePanel.setBackground(Colors.orange);
					rolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					rolePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					rolePanel.label.setForeground(Colors.textyellow);
					rolePanel.label.setText("Role");
				titleBarPanel.insidePanel.add(rolePanel);
				
				
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

			regimentsPanel = new ContentPanel(width * 9 / 10, height * 84 / 100, Colour.LRED,
					new FlowLayout(FlowLayout.LEFT, 0, 0));
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
