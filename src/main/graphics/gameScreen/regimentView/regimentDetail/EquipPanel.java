package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		weaponsPanel.setBackground(Colors.green);
		weaponsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(weaponsPanel);
				
		armourPanel = new JPanel();
		armourPanel.setPreferredSize(new Dimension(eqpWidth, eqpHeight));
		armourPanel.setBackground(Colors.green);
		armourPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		insidePanel.add(armourPanel);
		
			JPanel armourTitlePanel = new JPanel();
			armourTitlePanel.setPreferredSize(new Dimension(eqpWidth - 4, (eqpHeight - 4) / 5));
			armourTitlePanel.setBackground(Colors.lgreen);
			armourTitlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			armourPanel.add(armourTitlePanel);
			
				LabeledPanel titlePanel = new LabeledPanel((eqpWidth - 4) / 4, (eqpHeight - 4) / 5);
				titlePanel.setBackground(Colors.lgreen);
				titlePanel.label.setForeground(Colors.dgreen);
				titlePanel.label.setText("Armour");
				armourTitlePanel.add(titlePanel);
				
				LabeledPanel defencePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				defencePanel.setBackground(Colors.lgreen);
				defencePanel.label.setForeground(Colors.dgreen);
				defencePanel.label.setText("DEF");
				armourTitlePanel.add(defencePanel);
				
				LabeledPanel moralePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				moralePanel.setBackground(Colors.lgreen);
				moralePanel.label.setForeground(Colors.dgreen);
				moralePanel.label.setText("MOR");
				armourTitlePanel.add(moralePanel);
				
				LabeledPanel movePanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				movePanel.setBackground(Colors.lgreen);
				movePanel.label.setForeground(Colors.dgreen);
				movePanel.label.setText("MOV");
				armourTitlePanel.add(movePanel);
				
				LabeledPanel speedPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				speedPanel.setBackground(Colors.lgreen);
				speedPanel.label.setForeground(Colors.dgreen);
				speedPanel.label.setText("SPD");
				armourTitlePanel.add(speedPanel);
				
				LabeledPanel costPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				costPanel.setBackground(Colors.lgreen);
				costPanel.label.setForeground(Colors.dgreen);
				costPanel.label.setText("Cost");
				armourTitlePanel.add(costPanel);
				
				LabeledPanel upkeepPanel = new LabeledPanel((eqpWidth - 4) / 8, (eqpHeight - 4) / 5);
				upkeepPanel.setBackground(Colors.lgreen);
				upkeepPanel.label.setForeground(Colors.dgreen);
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
			int index = i;
				armoursList.get(i).namePanel.label.setText(regiment.armours.get(i).name);
				armoursList.get(i).defencePanel.label.setText(Integer.toString(regiment.armours.get(i).defenceBonus));
				armoursList.get(i).moralePanel.label.setText(Integer.toString(regiment.armours.get(i).moraleBonus));
				armoursList.get(i).movePanel.label.setText(Integer.toString(regiment.armours.get(i).movPenalty));
				armoursList.get(i).speedPanel.label.setText(Integer.toString(regiment.armours.get(i).spdPenalty));
				armoursList.get(i).costPanel.label.setText(Integer.toString(regiment.armours.get(i).equipCost));
				armoursList.get(i).upkeepPanel.label.setText(Integer.toString(regiment.armours.get(i).upkeep));
				
				armoursList.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						for (ArmourPanel panel: armoursList) {
							panel.namePanel.setBackground(Colors.lred);
							panel.namePanel.label.setForeground(Colors.dred);
							panel.defencePanel.setBackground(Colors.lred);
							panel.defencePanel.label.setForeground(Colors.dred);
							panel.moralePanel.setBackground(Colors.lred);
							panel.moralePanel.label.setForeground(Colors.dred);
							panel.movePanel.setBackground(Colors.lred);
							panel.movePanel.label.setForeground(Colors.dred);
							panel.speedPanel.setBackground(Colors.lred);
							panel.speedPanel.label.setForeground(Colors.dred);
							panel.costPanel.setBackground(Colors.lred);
							panel.costPanel.label.setForeground(Colors.dred);
							panel.upkeepPanel.setBackground(Colors.lred);
							panel.upkeepPanel.label.setForeground(Colors.dred);
						}

						armoursList.get(index).namePanel.setBackground(Colors.dblue);
						armoursList.get(index).namePanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).defencePanel.setBackground(Colors.dblue);
						armoursList.get(index).defencePanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).moralePanel.setBackground(Colors.dblue);
						armoursList.get(index).moralePanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).movePanel.setBackground(Colors.dblue);
						armoursList.get(index).movePanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).speedPanel.setBackground(Colors.dblue);
						armoursList.get(index).speedPanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).costPanel.setBackground(Colors.dblue);
						armoursList.get(index).costPanel.label.setForeground(Colors.vlblue);
						armoursList.get(index).upkeepPanel.setBackground(Colors.dblue);
						armoursList.get(index).upkeepPanel.label.setForeground(Colors.vlblue);
						
						regiment.armour = regiment.armours.get(index);
						System.out.println(regiment.armour.name);
						
					}
				});
		}
		
	}
	
}
