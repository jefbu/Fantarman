package main.graphics.gameScreen.regimentView.regimentDetail.equipPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;

public class ArmourPanel extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	public LabeledPanel namePanel;
	public LabeledPanel defencePanel;
	public LabeledPanel moralePanel;
	public LabeledPanel movePanel;
	public LabeledPanel speedPanel;
	public LabeledPanel costPanel;
	public LabeledPanel upkeepPanel;
		
	public ArmourPanel(int width, int height) {
		
		super();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.grey);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		namePanel = new LabeledPanel(width / 4, height);
		namePanel.setBackground(Colors.lorange);
		namePanel.label.setForeground(Colors.dorange);
		add(namePanel);
		
		defencePanel = new LabeledPanel(width / 8, height);
		defencePanel.setBackground(Colors.lorange);
		defencePanel.label.setForeground(Colors.dorange);
		add(defencePanel);
		
		moralePanel = new LabeledPanel(width / 8, height);
		moralePanel.setBackground(Colors.lorange);
		moralePanel.label.setForeground(Colors.dorange);
		add(moralePanel);
		
		movePanel = new LabeledPanel(width / 8, height);
		movePanel.setBackground(Colors.lorange);
		movePanel.label.setForeground(Colors.dorange);
		add(movePanel);
		
		speedPanel = new LabeledPanel(width / 8, height);
		speedPanel.setBackground(Colors.lorange);
		speedPanel.label.setForeground(Colors.dorange);
		add(speedPanel);
		
		costPanel = new LabeledPanel(width / 8, height);
		costPanel.setBackground(Colors.lorange);
		costPanel.label.setForeground(Colors.dorange);
		add(costPanel);
		
		upkeepPanel = new LabeledPanel(width / 8 + 6, height);
		upkeepPanel.setBackground(Colors.lorange);
		upkeepPanel.label.setForeground(Colors.dorange);
		add(upkeepPanel);		
		
	}
	
	public void fillArmourPanel(Regiment regiment, int index) {
					
			if(index < regiment.armours.size()) {
				
			namePanel.label.setText(regiment.armours.get(index).name);
			defencePanel.label.setText(Integer.toString(regiment.armours.get(index).defenceBonus));
			moralePanel.label.setText(Integer.toString(regiment.armours.get(index).moraleBonus));
			movePanel.label.setText(Integer.toString(regiment.armours.get(index).movPenalty));
			speedPanel.label.setText(Integer.toString(regiment.armours.get(index).spdPenalty));
			costPanel.label.setText(Integer.toString(regiment.armours.get(index).equipCost));
			upkeepPanel.label.setText(Integer.toString(regiment.armours.get(index).upkeep));
			}
			else {
		
			namePanel.label.setText("");
			defencePanel.label.setText("");
			moralePanel.label.setText("");
			movePanel.label.setText("");
			speedPanel.label.setText("");
			costPanel.label.setText("");
			upkeepPanel.label.setText("");			
			}
		}

}
