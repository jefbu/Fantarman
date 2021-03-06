package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import main.components.ContentPanel;
import main.entity.armies.Army;

public class RegimentListPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	ArrayList<IndividualRegimentPanel> panelList;

	public RegimentListPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		panelList = new ArrayList<IndividualRegimentPanel>();
		
		for (int i = 0; i < 15; i++) {
			panelList.add(new IndividualRegimentPanel(width, height / 15));	
			}
		
		for (IndividualRegimentPanel panel: panelList) {
			insidePanel.add(panel);
		}
				
	}
	
	public void fillRegimentListPanelCombatStats(Army army) {
		
		int index = 0;
		for (IndividualRegimentPanel panel: panelList) {
			panel.fillIndividualRegimentPanel(army, index);
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
			index++;
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
	
	public void fillRegimentListPanelGeneralStats(Army army) {
		
		int index = 0;
		for (IndividualRegimentPanel panel: panelList) {
			panel.fillIndividualRegimentPanel(army, index);
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
			index++;
		}
		
		for (int i = 0; i < army.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(army.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(army.roster.get(i).captain.name);
			panelList.get(i).panelList.get(2).label.setText("0");
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
	
	public void fillRegimentListPanelHistoryStats(Army army) {
		
		int index = 0;
		for (IndividualRegimentPanel panel: panelList) {
			panel.fillIndividualRegimentPanel(army, index);
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
			index++;
		}
		
		for (int i = 0; i < army.roster.size(); i++) {
			panelList.get(i).panelList.get(0).label.setText(army.roster.get(i).name);
			panelList.get(i).panelList.get(1).label.setText(Integer.toString(army.roster.get(i).value));
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

}
