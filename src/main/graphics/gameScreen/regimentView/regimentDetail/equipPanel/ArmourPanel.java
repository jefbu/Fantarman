package main.graphics.gameScreen.regimentView.regimentDetail.equipPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import main.components.LabeledPanel;
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
		setBackground(Colors.vlgreen);
		setBorder(null);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		int individualWidth = (width / 8);
		int individualHeight = height - 1;
		
		namePanel = new LabeledPanel(individualWidth * 2, individualHeight);
		namePanel.setBackground(Colors.lred);
		add(namePanel);
		
		defencePanel = new LabeledPanel(individualWidth, individualHeight);
		defencePanel.setBackground(Colors.lred);
		add(defencePanel);
		
		moralePanel = new LabeledPanel(individualWidth, individualHeight);
		moralePanel.setBackground(Colors.lred);
		add(moralePanel);
		
		movePanel = new LabeledPanel(individualWidth, individualHeight);
		movePanel.setBackground(Colors.lred);
		add(movePanel);
		
		speedPanel = new LabeledPanel(individualWidth, individualHeight);
		speedPanel.setBackground(Colors.lred);
		add(speedPanel);
		
		costPanel = new LabeledPanel(individualWidth, individualHeight);
		costPanel.setBackground(Colors.lred);
		add(costPanel);
		
		upkeepPanel = new LabeledPanel(individualWidth, individualHeight);
		upkeepPanel.setBackground(Colors.lred);
		add(upkeepPanel);
		
		
		
		
	}

}
