package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.regimentDetail.equipPanel.ArmourPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.equipPanel.WeaponPanel;
import main.utility.Colors;

public class EquipPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	JPanel weaponsPanel;
		ArrayList<WeaponPanel> weaponsList;
	JPanel armourPanel;
		ArrayList<ArmourPanel> armoursList;

	public EquipPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		int eqpWidth = (width - 15) / 2;
		int eqpHeight = height - 16;
		weaponsList = new ArrayList<WeaponPanel>();
		armoursList = new ArrayList<ArmourPanel>();

		weaponsPanel = new JPanel();
		weaponsPanel.setPreferredSize(new Dimension(eqpWidth, eqpHeight));
		weaponsPanel.setBackground(Colors.lgreen);
		weaponsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(weaponsPanel);
				
		armourPanel = new JPanel();
		armourPanel.setPreferredSize(new Dimension(eqpWidth, eqpHeight));
		armourPanel.setBackground(Colors.lgreen);
		armourPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		insidePanel.add(armourPanel);
		
			JPanel armourTitlePanel = new JPanel();
			armourTitlePanel.setPreferredSize(new Dimension(eqpWidth - 4, (eqpHeight - 4) / 5));
			armourTitlePanel.setBackground(Colors.lgreen);
			armourTitlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			armourPanel.add(armourTitlePanel);
			
				LabeledPanel titlePanel = new LabeledPanel((eqpWidth - 4) / 4, (eqpHeight - 4) / 5);
				titlePanel.setBackground(Colors.lgreen);
				titlePanel.label.setText("Armour");
				armourTitlePanel.add(titlePanel);
				
				LabeledPanel defencePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				defencePanel.setBackground(Colors.lgreen);
				defencePanel.label.setText("DEF");
				armourTitlePanel.add(defencePanel);
				
				LabeledPanel moralePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				moralePanel.setBackground(Colors.lgreen);
				moralePanel.label.setText("MOR");
				armourTitlePanel.add(moralePanel);
				
				LabeledPanel movePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				movePanel.setBackground(Colors.lgreen);
				movePanel.label.setText("MOV");
				armourTitlePanel.add(movePanel);
				
				LabeledPanel speedPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				speedPanel.setBackground(Colors.lgreen);
				speedPanel.label.setText("SPD");
				armourTitlePanel.add(speedPanel);
				
				LabeledPanel costPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				costPanel.setBackground(Colors.lgreen);
				costPanel.label.setText("Cost");
				armourTitlePanel.add(costPanel);
				
				LabeledPanel upkeepPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				upkeepPanel.setBackground(Colors.lgreen);
				upkeepPanel.label.setText("Upkp");
				armourTitlePanel.add(upkeepPanel);
		
		for (int i = 0; i < 5; i++) {
			weaponsList.add(new WeaponPanel(eqpWidth, eqpHeight));
		}
		
		for (int ii = 0; ii < 4; ii++) {
			armoursList.add(new ArmourPanel(eqpWidth - 4, (eqpHeight - 4) / 5));
		}
		
		fillInitialScreen();		
			
	}
	
	private void fillInitialScreen() {
		for(WeaponPanel panel: weaponsList) {
			weaponsPanel.add(panel);
		}
		for(ArmourPanel panel: armoursList) {
			armourPanel.add(panel);
		}
	}

	public void fillEquipPanel(Regiment regiment) {
		
		for (int i = 0; i < regiment.armours.size(); i++) {
				armoursList.get(i).namePanel.label.setText(regiment.armours.get(i).name);
				armoursList.get(i).defencePanel.label.setText(Integer.toString(regiment.armours.get(i).defenceBonus));
				armoursList.get(i).moralePanel.label.setText(Integer.toString(regiment.armours.get(i).moraleBonus));
				armoursList.get(i).movePanel.label.setText(Integer.toString(regiment.armours.get(i).movPenalty));
				armoursList.get(i).speedPanel.label.setText(Integer.toString(regiment.armours.get(i).spdPenalty));
				armoursList.get(i).costPanel.label.setText(Integer.toString(regiment.armours.get(i).equipCost));
				armoursList.get(i).upkeepPanel.label.setText(Integer.toString(regiment.armours.get(i).upkeep));
		}
		
	}
	
}
