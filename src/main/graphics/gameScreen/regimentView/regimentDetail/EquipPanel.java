package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.Main;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
import main.graphics.gameScreen.regimentView.regimentDetail.equipPanel.ArmourPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.equipPanel.WeaponPanel;
import main.utility.Colors;

public class EquipPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	JPanel weaponsPanel;
		ArrayList<WeaponPanel> weaponsList;
	JPanel armourPanel;
		ArrayList<ArmourPanel> armoursList;

	public EquipPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		int weaponWidth = insidePanelWidth * 6 / 10;
		int weaponHeight = insidePanelHeight;
		int armourWidth = insidePanelWidth * 4 / 10;
		int armourHeight = insidePanelHeight;
		weaponsList = new ArrayList<WeaponPanel>();
		armoursList = new ArrayList<ArmourPanel>();

		weaponsPanel = new JPanel();
		weaponsPanel.setPreferredSize(new Dimension(weaponWidth, weaponHeight));
		weaponsPanel.setBackground(Colors.dgrey);
		weaponsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		insidePanel.add(weaponsPanel);
		
			JPanel weaponTotalPanel = new JPanel();
			weaponTotalPanel.setPreferredSize(new Dimension(weaponWidth, weaponHeight / 5));
			weaponTotalPanel.setBackground(Colors.vdgrey);
			weaponTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			weaponsPanel.add(weaponTotalPanel);
			
				LabeledPanel weaponTitlePanel = new LabeledPanel(weaponWidth / 5, weaponHeight / 5);
				weaponTitlePanel.setBackground(Colors.lgrey);
				weaponTitlePanel.label.setForeground(Colors.vdgrey);
				weaponTitlePanel.label.setText("Weapon");
				weaponTotalPanel.add(weaponTitlePanel);
				
				LabeledPanel weaponAttackPanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponAttackPanel.setBackground(Colors.lgrey);
				weaponAttackPanel.label.setForeground(Colors.vdgrey);
				weaponAttackPanel.label.setText("ATT");
				weaponTotalPanel.add(weaponAttackPanel);
				
				LabeledPanel weaponChargePanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponChargePanel.setBackground(Colors.lgrey);
				weaponChargePanel.label.setForeground(Colors.vdgrey);
				weaponChargePanel.label.setText("CRG");
				weaponTotalPanel.add(weaponChargePanel);
				
				LabeledPanel weaponRangePanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponRangePanel.setBackground(Colors.lgrey);
				weaponRangePanel.label.setForeground(Colors.vdgrey);
				weaponRangePanel.label.setText("RNG");
				weaponTotalPanel.add(weaponRangePanel);
				
				LabeledPanel weaponMissilePanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponMissilePanel.setBackground(Colors.lgrey);
				weaponMissilePanel.label.setForeground(Colors.vdgrey);
				weaponMissilePanel.label.setText("MIS");
				weaponTotalPanel.add(weaponMissilePanel);
				
				LabeledPanel weaponDefencePanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponDefencePanel.setBackground(Colors.lgrey);
				weaponDefencePanel.label.setForeground(Colors.vdgrey);
				weaponDefencePanel.label.setText("DEF");
				weaponTotalPanel.add(weaponDefencePanel);
				
				LabeledPanel weaponSpeedPanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponSpeedPanel.setBackground(Colors.lgrey);
				weaponSpeedPanel.label.setForeground(Colors.vdgrey);
				weaponSpeedPanel.label.setText("SPD");
				weaponTotalPanel.add(weaponSpeedPanel);
				
				LabeledPanel weaponCostPanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponCostPanel.setBackground(Colors.lgrey);
				weaponCostPanel.label.setForeground(Colors.vdgrey);
				weaponCostPanel.label.setText("Cost");
				weaponTotalPanel.add(weaponCostPanel);
				
				LabeledPanel weaponUpkeepPanel = new LabeledPanel(weaponWidth / 10, weaponHeight / 5);
				weaponUpkeepPanel.setBackground(Colors.lgrey);
				weaponUpkeepPanel.label.setForeground(Colors.vdgrey);
				weaponUpkeepPanel.label.setText("Upkp");
				weaponTotalPanel.add(weaponUpkeepPanel);
				
		armourPanel = new JPanel();
		armourPanel.setPreferredSize(new Dimension(armourWidth, armourHeight));
		armourPanel.setBackground(Colors.dgrey);
		armourPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		insidePanel.add(armourPanel);
		
		JPanel armourTotalPanel = new JPanel();
		armourTotalPanel.setPreferredSize(new Dimension(armourWidth, armourHeight / 5));
		armourTotalPanel.setBackground(Colors.vdgrey);
		armourTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		armourPanel.add(armourTotalPanel);
		
			LabeledPanel armourTitlePanel = new LabeledPanel((armourWidth) / 4, armourHeight / 5);
			armourTitlePanel.setBackground(Colors.lgrey);
			armourTitlePanel.label.setForeground(Colors.vdgrey);
			armourTitlePanel.label.setText("Armour");
			armourTotalPanel.add(armourTitlePanel);
			
			LabeledPanel armourDefencePanel = new LabeledPanel((armourWidth) / 8, armourHeight / 5);
			armourDefencePanel.setBackground(Colors.lgrey);
			armourDefencePanel.label.setForeground(Colors.vdgrey);
			armourDefencePanel.label.setText("DEF");
			armourTotalPanel.add(armourDefencePanel);
			
			LabeledPanel armourMoralePanel = new LabeledPanel((armourWidth) / 8, armourHeight / 5);
			armourMoralePanel.setBackground(Colors.lgrey);
			armourMoralePanel.label.setForeground(Colors.vdgrey);
			armourMoralePanel.label.setText("MOR");
			armourTotalPanel.add(armourMoralePanel);
			
			LabeledPanel armourMovePanel = new LabeledPanel((armourWidth) / 8, armourHeight / 5);
			armourMovePanel.setBackground(Colors.lgrey);
			armourMovePanel.label.setForeground(Colors.vdgrey);
			armourMovePanel.label.setText("MOV");
			armourTotalPanel.add(armourMovePanel);
			
			LabeledPanel armourSpeedPanel = new LabeledPanel((armourWidth) / 8, armourHeight / 5);
			armourSpeedPanel.setBackground(Colors.lgrey);
			armourSpeedPanel.label.setForeground(Colors.vdgrey);
			armourSpeedPanel.label.setText("SPD");
			armourTotalPanel.add(armourSpeedPanel);
			
			LabeledPanel armourCostPanel = new LabeledPanel((armourWidth) / 8, armourHeight / 5);
			armourCostPanel.setBackground(Colors.lgrey);
			armourCostPanel.label.setForeground(Colors.vdgrey);
			armourCostPanel.label.setText("Cost");
			armourTotalPanel.add(armourCostPanel);
			
			LabeledPanel armourUpkeepPanel = new LabeledPanel((armourWidth) / 8 + 6, armourHeight / 5);
			armourUpkeepPanel.setBackground(Colors.lgrey);
			armourUpkeepPanel.label.setForeground(Colors.vdgrey);
			armourUpkeepPanel.label.setText("Upkp");
			armourTotalPanel.add(armourUpkeepPanel);

	
		for (int i = 0; i < 4; i++) {
			weaponsList.add(new WeaponPanel(weaponWidth, weaponHeight / 5));
			weaponsPanel.add(weaponsList.get(i));
		}
		
		for (int ii = 0; ii < 4; ii++) {
			armoursList.add(new ArmourPanel(armourWidth, armourHeight / 5));
			armourPanel.add(armoursList.get(ii));
		}
					
	}
	


	public void fillEquipPanel(Regiment regiment, boolean editable) {
		
		for (int i = 0; i < weaponsList.size(); i++) {
			
			Color bgColor = Colors.emptyPanelColor;
			Color txtColor = new Color(0, 0, 0);
						
			try {
				weaponsList.get(i).removeActionListener(weaponsList.get(i).getActionListeners()[0]);
			} catch(Exception e) {}
			
			weaponsList.get(i).namePanel.label.setText("");
			weaponsList.get(i).namePanel.setBackground(bgColor);
			weaponsList.get(i).attackPanel.label.setText("");
			weaponsList.get(i).attackPanel.setBackground(bgColor);
			weaponsList.get(i).chargePanel.label.setText("");
			weaponsList.get(i).chargePanel.setBackground(bgColor);
			weaponsList.get(i).rangePanel.label.setText("");
			weaponsList.get(i).rangePanel.setBackground(bgColor);
			weaponsList.get(i).missilePanel.label.setText("");
			weaponsList.get(i).missilePanel.setBackground(bgColor);
			weaponsList.get(i).defencePanel.label.setText("");
			weaponsList.get(i).defencePanel.setBackground(bgColor);
			weaponsList.get(i).speedPanel.label.setText("");
			weaponsList.get(i).speedPanel.setBackground(bgColor);
			weaponsList.get(i).costPanel.label.setText("");
			weaponsList.get(i).costPanel.setBackground(bgColor);
			weaponsList.get(i).upkeepPanel.label.setText("");
			weaponsList.get(i).upkeepPanel.setBackground(bgColor);
			
		if (editable) {
			
			if(i < regiment.weapons.size()) {
			if(regiment.weapon == regiment.weapons.get(i)) { 
				bgColor = Colors.vdgrey;
				txtColor = Colors.vlgrey;
			} else {
				bgColor = Colors.vlgrey;
				txtColor = Colors.dgrey;
			}
			}
			int index = i;
			weaponsList.get(i).fillWeaponPanel(regiment, index);
			
			if(i < regiment.weapons.size()) {

			weaponsList.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					regiment.weapon = regiment.weapons.get(index);
					Main.yourArmy.money = Main.yourArmy.money - regiment.weapons.get(index).equipCost;
					regiment.calculateTotalStats();
					regiment.calculateValue();
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment, editable);
				}
			});
			}
			
			weaponsList.get(i).namePanel.setBackground(bgColor);
			weaponsList.get(i).namePanel.label.setForeground(txtColor);
			weaponsList.get(i).attackPanel.setBackground(bgColor);
			weaponsList.get(i).attackPanel.label.setForeground(txtColor);
			weaponsList.get(i).chargePanel.setBackground(bgColor);
			weaponsList.get(i).chargePanel.label.setForeground(txtColor);
			weaponsList.get(i).rangePanel.setBackground(bgColor);
			weaponsList.get(i).rangePanel.label.setForeground(txtColor);
			weaponsList.get(i).missilePanel.setBackground(bgColor);
			weaponsList.get(i).missilePanel.label.setForeground(txtColor);
			weaponsList.get(i).defencePanel.setBackground(bgColor);
			weaponsList.get(i).defencePanel.label.setForeground(txtColor);
			weaponsList.get(i).speedPanel.setBackground(bgColor);
			weaponsList.get(i).speedPanel.label.setForeground(txtColor);
			weaponsList.get(i).costPanel.setBackground(bgColor);
			weaponsList.get(i).costPanel.label.setForeground(txtColor);
			weaponsList.get(i).upkeepPanel.setBackground(bgColor);
			weaponsList.get(i).upkeepPanel.label.setForeground(txtColor);
			
		}
		}
		
		for (int ii = 0; ii < armoursList.size(); ii++) {
			
			Color bgColor = Colors.emptyPanelColor;
			Color txtColor = new Color(0, 0, 0);
			
			try {
				armoursList.get(ii).removeActionListener(armoursList.get(ii).getActionListeners()[0]);
			} catch(Exception e) {}
			
			armoursList.get(ii).namePanel.label.setText("");
			armoursList.get(ii).namePanel.setBackground(bgColor);
			armoursList.get(ii).defencePanel.label.setText("");
			armoursList.get(ii).defencePanel.setBackground(bgColor);
			armoursList.get(ii).moralePanel.label.setText("");
			armoursList.get(ii).moralePanel.setBackground(bgColor);
			armoursList.get(ii).movePanel.label.setText("");
			armoursList.get(ii).movePanel.setBackground(bgColor);
			armoursList.get(ii).speedPanel.label.setText("");
			armoursList.get(ii).speedPanel.setBackground(bgColor);
			armoursList.get(ii).costPanel.label.setText("");
			armoursList.get(ii).costPanel.setBackground(bgColor);
			armoursList.get(ii).upkeepPanel.label.setText("");
			armoursList.get(ii).upkeepPanel.setBackground(bgColor);
			
		if (editable) {
			
			if(ii < regiment.armours.size()) {
			if(regiment.armour == regiment.armours.get(ii)) { 
				bgColor = Colors.vdgrey;
				txtColor = Colors.vlgrey;
			} else {
				bgColor = Colors.vlgrey;
				txtColor = Colors.dgrey;
			}
			}
				
			int index = ii;
			armoursList.get(ii).fillArmourPanel(regiment, index);
			
			if(ii < regiment.armours.size()) {

			armoursList.get(ii).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					regiment.armour = regiment.armours.get(index);
					Main.yourArmy.money = Main.yourArmy.money - regiment.armours.get(index).equipCost;
					regiment.calculateTotalStats();
					regiment.calculateValue();
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment, editable);
				}
			});
			}
			
			armoursList.get(ii).namePanel.setBackground(bgColor);
			armoursList.get(ii).namePanel.label.setForeground(txtColor);
			armoursList.get(ii).defencePanel.setBackground(bgColor);
			armoursList.get(ii).defencePanel.label.setForeground(txtColor);
			armoursList.get(ii).moralePanel.setBackground(bgColor);
			armoursList.get(ii).moralePanel.label.setForeground(txtColor);
			armoursList.get(ii).movePanel.setBackground(bgColor);
			armoursList.get(ii).movePanel.label.setForeground(txtColor);
			armoursList.get(ii).speedPanel.setBackground(bgColor);
			armoursList.get(ii).speedPanel.label.setForeground(txtColor);
			armoursList.get(ii).costPanel.setBackground(bgColor);
			armoursList.get(ii).costPanel.label.setForeground(txtColor);
			armoursList.get(ii).upkeepPanel.setBackground(bgColor);
			armoursList.get(ii).upkeepPanel.label.setForeground(txtColor);
			
			}
		}
	
		
	}
	
}
