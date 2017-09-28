package main.graphics.gameScreen.regimentView.regimentDetail.equipPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

import main.components.LabeledPanel;
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
		setBackground(Colors.green);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		int individualWidth = (width / 10);
		int individualHeight = height - 1;
		
		namePanel = new LabeledPanel(individualWidth * 2, individualHeight);
		namePanel.setBackground(Colors.lred);
		namePanel.label.setForeground(Colors.dred);
		add(namePanel);
		
		attackPanel = new LabeledPanel(individualWidth, individualHeight);
		attackPanel.setBackground(Colors.lred);
		attackPanel.label.setForeground(Colors.dred);
		add(attackPanel);
		
		chargePanel = new LabeledPanel(individualWidth, individualHeight);
		chargePanel.setBackground(Colors.lred);
		chargePanel.label.setForeground(Colors.dred);
		add(chargePanel);
		
		rangePanel = new LabeledPanel(individualWidth, individualHeight);
		rangePanel.setBackground(Colors.lred);
		rangePanel.label.setForeground(Colors.dred);
		add(rangePanel);
		
		missilePanel = new LabeledPanel(individualWidth, individualHeight);
		missilePanel.setBackground(Colors.lred);
		missilePanel.label.setForeground(Colors.dred);
		add(missilePanel);
		
		defencePanel = new LabeledPanel(individualWidth, individualHeight);
		defencePanel.setBackground(Colors.lred);
		defencePanel.label.setForeground(Colors.dred);
		add(defencePanel);
		
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

}
