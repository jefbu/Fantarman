package main.graphics.gameScreen.armyView;

import java.awt.FlowLayout;
import java.util.ArrayList;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;

public class RegimentListPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	ArrayList<IndividualRegimentPanel> panelList;

	public RegimentListPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		panelList = new ArrayList<IndividualRegimentPanel>();
		
		for (int i = 0; i < 15; i++) {
			panelList.add(new IndividualRegimentPanel(width, height / 15));	
			}
		
		for (IndividualRegimentPanel panel: panelList) {
			insidePanel.add(panel);
		}
				
	}
	
	public void fillRegimentListPanelCombatStats() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(Main.yourArmy.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Integer.toString(Main.yourArmy.roster.get(i).life));
			panelList.get(i).panelList.get(2).label.setText(Integer.toString(Main.yourArmy.roster.get(i).move));
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(Main.yourArmy.roster.get(i).run));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(Main.yourArmy.roster.get(i).speed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(Main.yourArmy.roster.get(i).attack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(Main.yourArmy.roster.get(i).charge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(Main.yourArmy.roster.get(i).defence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(Main.yourArmy.roster.get(i).range));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(Main.yourArmy.roster.get(i).missile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(Main.yourArmy.roster.get(i).morale));
			}
		
	}
	
	public void fillRegimentListPanelGeneralStats() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(Main.yourArmy.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText("1");
			panelList.get(i).panelList.get(2).label.setText("0");
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(Main.yourArmy.roster.get(i).run));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(Main.yourArmy.roster.get(i).speed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(Main.yourArmy.roster.get(i).attack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(Main.yourArmy.roster.get(i).charge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(Main.yourArmy.roster.get(i).defence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(Main.yourArmy.roster.get(i).range));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(Main.yourArmy.roster.get(i).missile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(Main.yourArmy.roster.get(i).morale));
			}
		
	}
	
	public void fillRegimentListPanelHistoryStats() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(Main.yourArmy.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Integer.toString(Main.yourArmy.roster.get(i).value));
			panelList.get(i).panelList.get(2).label.setText(Integer.toString(Main.yourArmy.roster.get(i).move));
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(Main.yourArmy.roster.get(i).run));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(Main.yourArmy.roster.get(i).speed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(Main.yourArmy.roster.get(i).attack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(Main.yourArmy.roster.get(i).charge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(Main.yourArmy.roster.get(i).defence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(Main.yourArmy.roster.get(i).range));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(Main.yourArmy.roster.get(i).missile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(Main.yourArmy.roster.get(i).morale));
			}
		
	}

}
