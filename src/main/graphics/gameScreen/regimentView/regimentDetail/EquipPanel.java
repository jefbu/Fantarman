package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
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
		armourPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(armourPanel);
		
		for (int i = 0; i < 5; i++) {
			weaponsList.add(new WeaponPanel(eqpWidth, eqpHeight));
		}
		
		for (int ii = 0; ii < 5; ii++) {
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
			armoursList.get(i).namePanel.setBackground(Colors.dblue);
			armoursList.get(i).defencePanel.setBackground(Colors.dblue);
			armoursList.get(i).moralePanel.setBackground(Colors.dblue);
			armoursList.get(i).movePanel.setBackground(Colors.dblue);
			armoursList.get(i).speedPanel.setBackground(Colors.dblue);
			armoursList.get(i).costPanel.setBackground(Colors.dblue);
			armoursList.get(i).upkeepPanel.setBackground(Colors.dblue);
		}
		
	}
	
}
