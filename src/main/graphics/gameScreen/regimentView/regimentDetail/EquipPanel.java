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
		
		int weaponWidth = ((width - 15) * 6 / 10);
		int weaponHeight = height - 16;
		int armourWidth = ((width - 15) * 4 / 10);
		int armourHeight = height - 16;
		weaponsList = new ArrayList<WeaponPanel>();
		armoursList = new ArrayList<ArmourPanel>();

		weaponsPanel = new JPanel();
		weaponsPanel.setPreferredSize(new Dimension(weaponWidth, weaponHeight));
		weaponsPanel.setBackground(Colors.green);
		weaponsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));
		insidePanel.add(weaponsPanel);
		
			JPanel weaponTotalPanel = new JPanel();
			weaponTotalPanel.setPreferredSize(new Dimension(weaponWidth - 2, (weaponHeight - 4) / 5));
			weaponTotalPanel.setBackground(Colors.lgreen);
			weaponTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			weaponsPanel.add(weaponTotalPanel);
			
				LabeledPanel weaponTitlePanel = new LabeledPanel((weaponWidth - 4) / 5, (weaponHeight - 4) / 5);
				weaponTitlePanel.setBackground(Colors.lgreen);
				weaponTitlePanel.label.setForeground(Colors.dgreen);
				weaponTitlePanel.label.setText("Weapon");
				weaponTotalPanel.add(weaponTitlePanel);
				
				LabeledPanel weaponAttackPanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponAttackPanel.setBackground(Colors.lgreen);
				weaponAttackPanel.label.setForeground(Colors.dgreen);
				weaponAttackPanel.label.setText("ATT");
				weaponTotalPanel.add(weaponAttackPanel);
				
				LabeledPanel weaponChargePanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponChargePanel.setBackground(Colors.lgreen);
				weaponChargePanel.label.setForeground(Colors.dgreen);
				weaponChargePanel.label.setText("CRG");
				weaponTotalPanel.add(weaponChargePanel);
				
				LabeledPanel weaponRangePanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponRangePanel.setBackground(Colors.lgreen);
				weaponRangePanel.label.setForeground(Colors.dgreen);
				weaponRangePanel.label.setText("RNG");
				weaponTotalPanel.add(weaponRangePanel);
				
				LabeledPanel weaponMissilePanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponMissilePanel.setBackground(Colors.lgreen);
				weaponMissilePanel.label.setForeground(Colors.dgreen);
				weaponMissilePanel.label.setText("MIS");
				weaponTotalPanel.add(weaponMissilePanel);
				
				LabeledPanel weaponDefencePanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponDefencePanel.setBackground(Colors.lgreen);
				weaponDefencePanel.label.setForeground(Colors.dgreen);
				weaponDefencePanel.label.setText("DEF");
				weaponTotalPanel.add(weaponDefencePanel);
				
				LabeledPanel weaponSpeedPanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponSpeedPanel.setBackground(Colors.lgreen);
				weaponSpeedPanel.label.setForeground(Colors.dgreen);
				weaponSpeedPanel.label.setText("SPD");
				weaponTotalPanel.add(weaponSpeedPanel);
				
				LabeledPanel weaponCostPanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponCostPanel.setBackground(Colors.lgreen);
				weaponCostPanel.label.setForeground(Colors.dgreen);
				weaponCostPanel.label.setText("Cost");
				weaponTotalPanel.add(weaponCostPanel);
				
				LabeledPanel weaponUpkeepPanel = new LabeledPanel((weaponWidth - 4) / 10, (weaponHeight - 4) / 5);
				weaponUpkeepPanel.setBackground(Colors.lgreen);
				weaponUpkeepPanel.label.setForeground(Colors.dgreen);
				weaponUpkeepPanel.label.setText("Upkp");
				weaponTotalPanel.add(weaponUpkeepPanel);
				
		armourPanel = new JPanel();
		armourPanel.setPreferredSize(new Dimension(armourWidth, armourHeight));
		armourPanel.setBackground(Colors.green);
		armourPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 1));
		insidePanel.add(armourPanel);
		
		JPanel armourTotalPanel = new JPanel();
		armourTotalPanel.setPreferredSize(new Dimension(armourWidth, (armourHeight - 4) / 5));
		armourTotalPanel.setBackground(Colors.lgreen);
		armourTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		armourPanel.add(armourTotalPanel);
		
			LabeledPanel armourTitlePanel = new LabeledPanel((armourWidth) / 4, (armourHeight - 4) / 5);
			armourTitlePanel.setBackground(Colors.lgreen);
			armourTitlePanel.label.setForeground(Colors.dgreen);
			armourTitlePanel.label.setText("Armour");
			armourTotalPanel.add(armourTitlePanel);
			
			LabeledPanel armourDefencePanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourDefencePanel.setBackground(Colors.lgreen);
			armourDefencePanel.label.setForeground(Colors.dgreen);
			armourDefencePanel.label.setText("DEF");
			armourTotalPanel.add(armourDefencePanel);
			
			LabeledPanel armourMoralePanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourMoralePanel.setBackground(Colors.lgreen);
			armourMoralePanel.label.setForeground(Colors.dgreen);
			armourMoralePanel.label.setText("MOR");
			armourTotalPanel.add(armourMoralePanel);
			
			LabeledPanel armourMovePanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourMovePanel.setBackground(Colors.lgreen);
			armourMovePanel.label.setForeground(Colors.dgreen);
			armourMovePanel.label.setText("MOV");
			armourTotalPanel.add(armourMovePanel);
			
			LabeledPanel armourSpeedPanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourSpeedPanel.setBackground(Colors.lgreen);
			armourSpeedPanel.label.setForeground(Colors.dgreen);
			armourSpeedPanel.label.setText("SPD");
			armourTotalPanel.add(armourSpeedPanel);
			
			LabeledPanel armourCostPanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourCostPanel.setBackground(Colors.lgreen);
			armourCostPanel.label.setForeground(Colors.dgreen);
			armourCostPanel.label.setText("Cost");
			armourTotalPanel.add(armourCostPanel);
			
			LabeledPanel armourUpkeepPanel = new LabeledPanel((armourWidth) / 8, (armourHeight - 4) / 5);
			armourUpkeepPanel.setBackground(Colors.lgreen);
			armourUpkeepPanel.label.setForeground(Colors.dgreen);
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
				bgColor = Colors.dblue;
				txtColor = Colors.backgroundOrange;
			} else {
				bgColor = Colors.lorange;
				txtColor = Colors.dorange;
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
			
			Color bgColor = new Color(70, 65, 55);
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
				bgColor = Colors.dblue;
				txtColor = Colors.backgroundOrange;
			} else {
				bgColor = Colors.lorange;
				txtColor = Colors.dorange;
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
