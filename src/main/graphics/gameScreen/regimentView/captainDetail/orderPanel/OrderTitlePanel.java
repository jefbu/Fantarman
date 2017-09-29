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
		setBackground(Colors.lgreen);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		LabeledPanel numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		numberPanel.setBackground(Colors.lgreen);
		numberPanel.label.setForeground(Colors.dgreen);
		numberPanel.label.setText("Nr");
		add(numberPanel);
		
		LabeledPanel conditionPanel = new LabeledPanel(width * 2 / 10, height - 2);
		conditionPanel.setBackground(Colors.lgreen);
		conditionPanel.label.setForeground(Colors.dgreen);
		conditionPanel.label.setText("Condition");
		add(conditionPanel);
		
		LabeledPanel conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		conditionXPPanel.setBackground(Colors.lgreen);
		conditionXPPanel.label.setForeground(Colors.dgreen);
		conditionXPPanel.label.setText("XP");
		add(conditionXPPanel);
		
		LabeledPanel targetPanel = new LabeledPanel(width * 2 / 10, height - 2);
		targetPanel.setBackground(Colors.lgreen);
		targetPanel.label.setForeground(Colors.dgreen);
		targetPanel.label.setText("Target");
		add(targetPanel);
		
		LabeledPanel targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		targetXPPanel.setBackground(Colors.lgreen);
		targetXPPanel.label.setForeground(Colors.dgreen);
		targetXPPanel.label.setText("XP");
		add(targetXPPanel);
		
		LabeledPanel orderPanel = new LabeledPanel(width * 2 / 10, height - 2);
		orderPanel.setBackground(Colors.lgreen);
		orderPanel.label.setForeground(Colors.dgreen);
		orderPanel.label.setText("Order");
		add(orderPanel);
		
		LabeledPanel orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		orderXPPanel.setBackground(Colors.lgreen);
		orderXPPanel.label.setForeground(Colors.dgreen);
		orderXPPanel.label.setText("XP");
		add(orderXPPanel);
		
		LabeledPanel totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		totalXPPanel.setBackground(Colors.lgreen);
		totalXPPanel.label.setForeground(Colors.dgreen);
		totalXPPanel.label.setText("TotXP");
		add(totalXPPanel);
		
	}

}
