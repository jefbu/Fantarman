package main.graphics.gameScreen.regimentView.regimentDetail.equipPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;

public class WeaponPanel extends JButton {

	private static final long serialVersionUID = 1L;
	
	public LabeledPanel namePanel;
	public LabeledPanel attackPanel;
	public LabeledPanel chargePanel;
	public LabeledPanel rangePanel;
	public LabeledPanel missilePanel;
	public LabeledPanel defencePanel;
	public LabeledPanel speedPanel;
	public LabeledPanel costPanel;
	public LabeledPanel upkeepPanel;

	public WeaponPanel(int width, int height) {
		
		super();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.grey);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		namePanel = new LabeledPanel(width / 5, height);
		namePanel.setBackground(Colors.vlgrey);
		namePanel.label.setForeground(Colors.dorange);
		add(namePanel);
		
		attackPanel = new LabeledPanel(width / 10, height);
		attackPanel.setBackground(Colors.vlgrey);
		attackPanel.label.setForeground(Colors.dorange);
		add(attackPanel);
		
		chargePanel = new LabeledPanel(width / 10, height);
		chargePanel.setBackground(Colors.vlgrey);
		chargePanel.label.setForeground(Colors.dorange);
		add(chargePanel);
		
		rangePanel = new LabeledPanel(width / 10, height);
		rangePanel.setBackground(Colors.vlgrey);
		rangePanel.label.setForeground(Colors.dorange);
		add(rangePanel);
		
		missilePanel = new LabeledPanel(width / 10, height);
		missilePanel.setBackground(Colors.vlgrey);
		missilePanel.label.setForeground(Colors.dorange);
		add(missilePanel);
		
		defencePanel = new LabeledPanel(width / 10, height);
		defencePanel.setBackground(Colors.vlgrey);
		defencePanel.label.setForeground(Colors.dorange);
		add(defencePanel);
		
		speedPanel = new LabeledPanel(width / 10, height);
		speedPanel.setBackground(Colors.vlgrey);
		speedPanel.label.setForeground(Colors.dorange);
		add(speedPanel);
		
		costPanel = new LabeledPanel(width / 10, height);
		costPanel.setBackground(Colors.vlgrey);
		costPanel.label.setForeground(Colors.dorange);
		add(costPanel);
		
		upkeepPanel = new LabeledPanel(width / 10, height);
		upkeepPanel.setBackground(Colors.vlgrey);
		upkeepPanel.label.setForeground(Colors.dorange);
		add(upkeepPanel);
		
	}
	
	public void fillWeaponPanel(Regiment regiment, int index) {
		
		if(index < regiment.weapons.size()) {
			
		namePanel.label.setText(regiment.weapons.get(index).name);
		attackPanel.label.setText(Integer.toString(regiment.weapons.get(index).attackBonus));
		chargePanel.label.setText(Integer.toString(regiment.weapons.get(index).chargeBonus));
		rangePanel.label.setText(Integer.toString(regiment.weapons.get(index).rangeBonus));
		missilePanel.label.setText(Integer.toString(regiment.weapons.get(index).missileBonus));
		defencePanel.label.setText(Integer.toString(regiment.weapons.get(index).defenceBonus));
		speedPanel.label.setText(Integer.toString(regiment.weapons.get(index).spdPenalty));
		costPanel.label.setText(Integer.toString(regiment.weapons.get(index).equipCost));
		upkeepPanel.label.setText(Integer.toString(regiment.weapons.get(index).upkeep));
		}
		else {
	
		namePanel.label.setText("");
		attackPanel.label.setText("");
		chargePanel.label.setText("");
		rangePanel.label.setText("");
		missilePanel.label.setText("");
		defencePanel.label.setText("");
		speedPanel.label.setText("");
		costPanel.label.setText("");
		upkeepPanel.label.setText("");			
		}
	}

}
