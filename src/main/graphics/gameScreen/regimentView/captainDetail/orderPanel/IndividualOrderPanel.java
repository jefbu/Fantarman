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
		setBackground(Colors.lorange);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		numberPanel.setBackground(Colors.lorange);
		numberPanel.label.setForeground(Colors.dorange);
		add(numberPanel);
		
		conditionPanel = new LabeledPanel(width * 2 / 10, height - 2);
		conditionPanel.setBackground(Colors.lorange);
		conditionPanel.label.setForeground(Colors.dorange);
		add(conditionPanel);
		
		conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		conditionXPPanel.setBackground(Colors.lorange);
		conditionXPPanel.label.setForeground(Colors.dorange);
		conditionXPPanel.label.setText("XP");
		add(conditionXPPanel);
		
		targetPanel = new LabeledPanel(width * 2 / 10, height - 2);
		targetPanel.setBackground(Colors.lorange);
		targetPanel.label.setForeground(Colors.dorange);
		targetPanel.label.setText("Target");
		add(targetPanel);
		
		targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		targetXPPanel.setBackground(Colors.lorange);
		targetXPPanel.label.setForeground(Colors.dorange);
		targetXPPanel.label.setText("XP");
		add(targetXPPanel);
		
		orderPanel = new LabeledPanel(width * 2 / 10, height - 2);
		orderPanel.setBackground(Colors.lorange);
		orderPanel.label.setForeground(Colors.dorange);
		orderPanel.label.setText("Order");
		add(orderPanel);
		
		orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		orderXPPanel.setBackground(Colors.lorange);
		orderXPPanel.label.setForeground(Colors.dorange);
		orderXPPanel.label.setText("XP");
		add(orderXPPanel);
		
		totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		totalXPPanel.setBackground(Colors.lorange);
		totalXPPanel.label.setForeground(Colors.dorange);
		totalXPPanel.label.setText("TotXP");
		add(totalXPPanel);
		
		
	}
	

}
