package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JPanel;

import main.Main;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;

public class ShortArmy extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ContentPanel titleBarPanel;
	private ContentPanel regimentsPanel;
	private ArrayList<RegimentPanel> regimentPanels;

	public ShortArmy(int width, int height) {
		
			super();
			setPreferredSize(new Dimension(width, height));
			setBackground(Colors.dgrey);
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
			emptyTopPanel.setBackground(Colors.dgrey);
			add(emptyTopPanel);

			titleBarPanel = new ContentPanel(width * 9 / 10, height * 8 / 100, Colors.grey,
					new FlowLayout(FlowLayout.LEADING, 0, 0));
			
				/*
				LabeledPanel namePanel = new LabeledPanel(width * 9 * 2 / 100, height / 10);
					namePanel.setBackground(Colors.orange);
					namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					namePanel.label.setForeground(Colors.textyellow);
					namePanel.label.setText("Regiment Name");
				titleBarPanel.insidePanel.add(namePanel);*/
				
				LabeledPanel captainPanel = new LabeledPanel(width * 9 * 20 / 1000, height / 10);
					captainPanel.setBackground(Colors.grey);
					captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					captainPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					captainPanel.label.setForeground(Colors.vlgrey);
					captainPanel.label.setText("Captain");
				titleBarPanel.insidePanel.add(captainPanel);
				
				/*LabeledPanel regimentNamePanel = new LabeledPanel(width * 9 * 15 / 1000, height / 10);
					regimentNamePanel.setBackground(Colors.orange);
					regimentNamePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					regimentNamePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					regimentNamePanel.label.setForeground(Colors.textyellow);
					regimentNamePanel.label.setText("Regiment");
				titleBarPanel.insidePanel.add(regimentNamePanel);*/
				
				LabeledPanel regimentTypePanel = new LabeledPanel(width * 9 * 20 / 1000, height / 10);
					regimentTypePanel.setBackground(Colors.grey);
					regimentTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 2 / 100));
					regimentTypePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					regimentTypePanel.label.setForeground(Colors.vlgrey);
					regimentTypePanel.label.setText("Type");
				titleBarPanel.insidePanel.add(regimentTypePanel);
				
				LabeledPanel meleeOffensePanel = new LabeledPanel(width * 9 * 9 / 1000, height / 10);
					meleeOffensePanel.setBackground(Colors.grey);
					meleeOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					meleeOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					meleeOffensePanel.label.setForeground(Colors.vlgrey);
					meleeOffensePanel.label.setText("Melee");
				titleBarPanel.insidePanel.add(meleeOffensePanel);
				
				LabeledPanel rangedOffensePanel = new LabeledPanel(width * 9 * 9 / 1000, height / 10);
					rangedOffensePanel.setBackground(Colors.grey);
					rangedOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					rangedOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					rangedOffensePanel.label.setForeground(Colors.vlgrey);
					rangedOffensePanel.label.setText("Ranged");
				titleBarPanel.insidePanel.add(rangedOffensePanel);
				
				LabeledPanel defencePanel = new LabeledPanel(width * 9 * 9 / 1000, height / 10);
					defencePanel.setBackground(Colors.grey);
					defencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					defencePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					defencePanel.label.setForeground(Colors.vlgrey);
					defencePanel.label.setText("Defence");
				titleBarPanel.insidePanel.add(defencePanel);
				
				LabeledPanel mobilityPanel = new LabeledPanel(width * 9 * 9 / 1000, height / 10);
					mobilityPanel.setBackground(Colors.grey);
					mobilityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					mobilityPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					mobilityPanel.label.setForeground(Colors.vlgrey);
					mobilityPanel.label.setText("Mobility");
				titleBarPanel.insidePanel.add(mobilityPanel);
				
				LabeledPanel combatRolePanel = new LabeledPanel(width * 9 * 7 / 1000, height / 10);
					combatRolePanel.setBackground(Colors.grey);
					combatRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					combatRolePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					combatRolePanel.label.setForeground(Colors.vlgrey);
					combatRolePanel.label.setText("Battle");
				titleBarPanel.insidePanel.add(combatRolePanel);
				
				LabeledPanel trainigRolePanel = new LabeledPanel(width * 9 * 7 / 1000, height / 10);
					trainigRolePanel.setBackground(Colors.grey);
					trainigRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					trainigRolePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					trainigRolePanel.label.setForeground(Colors.vlgrey);
					trainigRolePanel.label.setText("Practice");
				titleBarPanel.insidePanel.add(trainigRolePanel);
			
				LabeledPanel marketingRolePanel = new LabeledPanel(width * 9 * 7 / 1000, height / 10);
					marketingRolePanel.setBackground(Colors.grey);
					marketingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 2 / 100));
					marketingRolePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
					marketingRolePanel.label.setForeground(Colors.vlgrey);
					marketingRolePanel.label.setText("Fundraise");
				titleBarPanel.insidePanel.add(marketingRolePanel);
				
				
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

			regimentsPanel = new ContentPanel(width * 9 / 10, height * 84 / 100, Colors.lgrey,
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
