package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

import main.components.LabeledPanel;
import main.utility.Colors;

public class IndividualOrderPanel extends JButton {

	private static final long serialVersionUID = 1L;
	
	public LabeledPanel numberPanel;
	public LabeledPanel conditionPanel;
	public LabeledPanel conditionXPPanel;
	public LabeledPanel targetPanel;
	public LabeledPanel targetXPPanel;
	public LabeledPanel orderPanel;
	public LabeledPanel orderXPPanel;
	public LabeledPanel totalXPPanel;

	public IndividualOrderPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBorder(null);
		setBackground(Colors.lred);
		
		numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		numberPanel.setBackground(Colors.lred);
		numberPanel.label.setForeground(Colors.dred);
		add(numberPanel);
		
		conditionPanel = new LabeledPanel(width * 2 / 10, height - 2);
		conditionPanel.setBackground(Colors.lred);
		conditionPanel.label.setForeground(Colors.dred);
		add(conditionPanel);
		
		conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		conditionXPPanel.setBackground(Colors.lred);
		conditionXPPanel.label.setForeground(Colors.dred);
		conditionXPPanel.label.setText("XP");
		add(conditionXPPanel);
		
		targetPanel = new LabeledPanel(width * 2 / 10, height - 2);
		targetPanel.setBackground(Colors.lred);
		targetPanel.label.setForeground(Colors.dred);
		targetPanel.label.setText("Target");
		add(targetPanel);
		
		targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		targetXPPanel.setBackground(Colors.lred);
		targetXPPanel.label.setForeground(Colors.dred);
		targetXPPanel.label.setText("XP");
		add(targetXPPanel);
		
		orderPanel = new LabeledPanel(width * 2 / 10, height - 2);
		orderPanel.setBackground(Colors.lred);
		orderPanel.label.setForeground(Colors.dred);
		orderPanel.label.setText("Order");
		add(orderPanel);
		
		orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		orderXPPanel.setBackground(Colors.lred);
		orderXPPanel.label.setForeground(Colors.dred);
		orderXPPanel.label.setText("XP");
		add(orderXPPanel);
		
		totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		totalXPPanel.setBackground(Colors.lred);
		totalXPPanel.label.setForeground(Colors.dred);
		totalXPPanel.label.setText("TotXP");
		add(totalXPPanel);
		
		
		
	}
	

}
