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
		setBorder(null);
		setBackground(Colors.lred);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 1));
		
		numberPanel = new LabeledPanel(width * 8 / 100, height - 2);
		add(numberPanel);
		
		conditionPanel = new LabeledPanel(width * 20 / 100, height - 2);
		add(conditionPanel);
		
		conditionXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		add(conditionXPPanel);
		
		targetPanel = new LabeledPanel(width * 20 / 100, height - 2);
		add(targetPanel);
		
		targetXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		add(targetXPPanel);
		
		orderPanel = new LabeledPanel(width * 20 / 100, height - 2);
		add(orderPanel);
		
		orderXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		add(orderXPPanel);
		
		totalXPPanel = new LabeledPanel(width * 8 / 100, height - 2);
		add(totalXPPanel);
		
	}
	

}
