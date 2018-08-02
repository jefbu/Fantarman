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
		setBackground(Colors.vlgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		numberPanel.setBackground(Colors.vlgrey);
		numberPanel.label.setForeground(Colors.dgrey);
		add(numberPanel);
		
		conditionPanel = new LabeledPanel(width * 2 / 10, height - 2);
		conditionPanel.setBackground(Colors.vlgrey);
		conditionPanel.label.setForeground(Colors.dgrey);
		add(conditionPanel);
		
		conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		conditionXPPanel.setBackground(Colors.vlgrey);
		conditionXPPanel.label.setForeground(Colors.dgrey);
		conditionXPPanel.label.setText("XP");
		add(conditionXPPanel);
		
		targetPanel = new LabeledPanel(width * 2 / 10, height - 2);
		targetPanel.setBackground(Colors.vlgrey);
		targetPanel.label.setForeground(Colors.dgrey);
		targetPanel.label.setText("Target");
		add(targetPanel);
		
		targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		targetXPPanel.setBackground(Colors.vlgrey);
		targetXPPanel.label.setForeground(Colors.dgrey);
		targetXPPanel.label.setText("XP");
		add(targetXPPanel);
		
		orderPanel = new LabeledPanel(width * 2 / 10, height - 2);
		orderPanel.setBackground(Colors.vlgrey);
		orderPanel.label.setForeground(Colors.dgrey);
		orderPanel.label.setText("Order");
		add(orderPanel);
		
		orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		orderXPPanel.setBackground(Colors.vlgrey);
		orderXPPanel.label.setForeground(Colors.dgrey);
		orderXPPanel.label.setText("XP");
		add(orderXPPanel);
		
		totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		totalXPPanel.setBackground(Colors.vlgrey);
		totalXPPanel.label.setForeground(Colors.dgrey);
		totalXPPanel.label.setText("TotXP");
		add(totalXPPanel);
		
		
	}
	

}
