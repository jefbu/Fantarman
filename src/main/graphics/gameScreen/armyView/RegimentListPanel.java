package main.graphics.gameScreen.armyView;

import java.awt.FlowLayout;
import java.util.ArrayList;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;
import main.entity.armies.Army;

public class RegimentListPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	ArrayList<IndividualRegimentPanel> panelList;

	public RegimentListPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		panelList = new ArrayList<IndividualRegimentPanel>();
		
		for (int i = 0; i < 15; i++) {
			int index = i;
			panelList.add(new IndividualRegimentPanel(width, height / 15, index));	
			}
		
		for (IndividualRegimentPanel panel: panelList) {
			insidePanel.add(panel);
		}
				
	}
	
	public void fillRegimentListPanelCombatStats(Army army) {
		
		for (IndividualRegimentPanel panel: panelList) {
			panel.panelList.get(0).label.setText("");
			panel.panelList.get(1).label.setText("");
			panel.panelList.get(2).label.setText("");
			panel.panelList.get(3).label.setText("");
			panel.panelList.get(4).label.setText("");
			panel.panelList.get(5).label.setText("");
			panel.panelList.get(6).label.setText("");
			panel.panelList.get(7).label.setText("");
			panel.panelList.get(8).label.setText("");
			panel.panelList.get(9).label.setText("");
			panel.panelList.get(10).label.setText("");
		}
		
		for (int i = 0; i < army.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(army.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Integer.toString(army.roster.get(i).totalLife));
			panelList.get(i).panelList.get(2).label.setText(Integer.toString(army.roster.get(i).totalMove));
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(army.roster.get(i).totalRun));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(army.roster.get(i).totalSpeed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(army.roster.get(i).totalAttack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(army.roster.get(i).totalCharge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(army.roster.get(i).totalDefence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(army.roster.get(i).totalRange));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(army.roster.get(i).totalMissile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(army.roster.get(i).totalMorale));
			}
		
	}
	
	public void fillRegimentListPanelGeneralStats() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(Main.yourArmy.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Main.yourArmy.roster.get(i).captain.name);
			panelList.get(i).panelList.get(2).label.setText("0");
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRun));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalSpeed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalAttack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalCharge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalDefence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRange));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMissile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMorale));
			}
		
	}
	
	public void fillRegimentListPanelHistoryStats() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(Main.yourArmy.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Integer.toString(Main.yourArmy.roster.get(i).value));
			panelList.get(i).panelList.get(2).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMove));
			panelList.get(i).panelList.get(3).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRun));
			panelList.get(i).panelList.get(4).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalSpeed));
			panelList.get(i).panelList.get(5).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalAttack));
			panelList.get(i).panelList.get(6).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalCharge));
			panelList.get(i).panelList.get(7).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalDefence));
			panelList.get(i).panelList.get(8).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRange));
			panelList.get(i).panelList.get(9).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMissile));
			panelList.get(i).panelList.get(10).label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMorale));
			}
		
	}

}
