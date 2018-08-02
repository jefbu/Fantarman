package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.LabeledPanel;
import main.utility.Colors;

public class OrderTitlePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public OrderTitlePanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		LabeledPanel numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		numberPanel.setBackground(Colors.lgrey);
		numberPanel.label.setForeground(Colors.vdgrey);
		numberPanel.label.setText("Nr");
		add(numberPanel);
		
		LabeledPanel conditionPanel = new LabeledPanel(width * 2 / 10, height - 2);
		conditionPanel.setBackground(Colors.lgrey);
		conditionPanel.label.setForeground(Colors.vdgrey);
		conditionPanel.label.setText("Condition");
		add(conditionPanel);
		
		LabeledPanel conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		conditionXPPanel.setBackground(Colors.lgrey);
		conditionXPPanel.label.setForeground(Colors.vdgrey);
		conditionXPPanel.label.setText("XP");
		add(conditionXPPanel);
		
		LabeledPanel targetPanel = new LabeledPanel(width * 2 / 10, height - 2);
		targetPanel.setBackground(Colors.lgrey);
		targetPanel.label.setForeground(Colors.vdgrey);
		targetPanel.label.setText("Target");
		add(targetPanel);
		
		LabeledPanel targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		targetXPPanel.setBackground(Colors.lgrey);
		targetXPPanel.label.setForeground(Colors.vdgrey);
		targetXPPanel.label.setText("XP");
		add(targetXPPanel);
		
		LabeledPanel orderPanel = new LabeledPanel(width * 2 / 10, height - 2);
		orderPanel.setBackground(Colors.lgrey);
		orderPanel.label.setForeground(Colors.vdgrey);
		orderPanel.label.setText("Order");
		add(orderPanel);
		
		LabeledPanel orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		orderXPPanel.setBackground(Colors.lgrey);
		orderXPPanel.label.setForeground(Colors.vdgrey);
		orderXPPanel.label.setText("XP");
		add(orderXPPanel);
		
		LabeledPanel totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		totalXPPanel.setBackground(Colors.lgrey);
		totalXPPanel.label.setForeground(Colors.vdgrey);
		totalXPPanel.label.setText("TotXP");
		add(totalXPPanel);
		
	}

}
