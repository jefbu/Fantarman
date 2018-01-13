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
		setBackground(Colors.green);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		int individualWidth = (width / 8);
		int individualHeight = height - 1;
		
		namePanel = new LabeledPanel(individualWidth * 2, individualHeight);
		namePanel.setBackground(Colors.lred);
		namePanel.label.setForeground(Colors.dred);
		add(namePanel);
		
		defencePanel = new LabeledPanel(individualWidth + 1, individualHeight);
		defencePanel.setBackground(Colors.lred);
		defencePanel.label.setForeground(Colors.dred);
		add(defencePanel);
		
		moralePanel = new LabeledPanel(individualWidth, individualHeight);
		moralePanel.setBackground(Colors.lred);
		moralePanel.label.setForeground(Colors.dred);
		add(moralePanel);
		
		movePanel = new LabeledPanel(individualWidth, individualHeight);
		movePanel.setBackground(Colors.lred);
		movePanel.label.setForeground(Colors.dred);
		add(movePanel);
		
		speedPanel = new LabeledPanel(individualWidth, individualHeight);
		speedPanel.setBackground(Colors.lred);
		speedPanel.label.setForeground(Colors.dred);
		add(speedPanel);
		
		costPanel = new LabeledPanel(individualWidth, individualHeight);
		costPanel.setBackground(Colors.lred);
		costPanel.label.setForeground(Colors.dred);
		add(costPanel);
		
		upkeepPanel = new LabeledPanel(individualWidth + 1, individualHeight);
		upkeepPanel.setBackground(Colors.lred);
		upkeepPanel.label.setForeground(Colors.dred);
		add(upkeepPanel);		
		
	}
	
	public void fillArmourPanel(Regiment regiment) {
		
	}

}
