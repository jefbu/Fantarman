package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.IndividualOrderPanel;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.OrderChoicePopup;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.OrderTitlePanel;
import main.utility.Colors;

public class OrderPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;

	public OrderTitlePanel orderTitlePanel;
	public JPanel ordersPanel;
	public ArrayList<IndividualOrderPanel> orderList;
	int width;
	int height;
	OrderChoicePopup orderChoicePopup;

	public OrderPanel(int width, int height, Colour colour, FlowLayout flowLayout) {

		super(width - 1, height - 1, colour, flowLayout);
		this.width = width - 1;
		this.height = height - 1;
		orderList = new ArrayList<IndividualOrderPanel>();

		orderTitlePanel = new OrderTitlePanel(width - 11, height / 6 - 4);
		insidePanel.add(orderTitlePanel);
		
		orderChoicePopup = new OrderChoicePopup(width * 2, height * 2, Colour.DRED, false);

		for (int i = 0; i < 5; i++) {
			orderList.add(new IndividualOrderPanel(width - 11, height / 6 - 3));
			insidePanel.add(orderList.get(i));
		}

	}

	public void fillOrderPanel(Regiment regiment, boolean editable) {
		
		if (editable) {
		
		int sequence = 0;
		
		for (IndividualOrderPanel orderPanel: orderList) {
			
			int index = sequence;
			if (sequence < regiment.captain.orders) {
				try {
					orderPanel.removeActionListener(orderPanel.getActionListeners()[0]);
				} catch (Exception e1) {}
				
				orderPanel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						orderChoicePopup.fillPopup(index, regiment);
						orderChoicePopup.setLocation(MouseInfo.getPointerInfo().getLocation());
						int x = orderChoicePopup.getX();
						int y = orderChoicePopup.getY() - height * 2;
						orderChoicePopup.setLocation(x, y);
						orderChoicePopup.setVisible(true);
					}
				});
				
					orderPanel.setBackground(Colors.lorange);
					orderPanel.numberPanel.label.setText(Integer.toString(sequence + 1));
					orderPanel.numberPanel.setBackground(Colors.lorange);
					orderPanel.conditionPanel.label.setText(regiment.instructions.get(sequence).condition.name());
					orderPanel.conditionPanel.setBackground(Colors.lorange);
					orderPanel.conditionXPPanel.label.setText("XP");
					orderPanel.conditionXPPanel.setBackground(Colors.lorange);
					orderPanel.targetPanel.label.setText(regiment.instructions.get(sequence).target.name());
					orderPanel.targetPanel.setBackground(Colors.lorange);
					orderPanel.targetXPPanel.label.setText("XP");
					orderPanel.targetXPPanel.setBackground(Colors.lorange);
					orderPanel.orderPanel.label.setText(regiment.instructions.get(sequence).order.name());
					orderPanel.orderPanel.setBackground(Colors.lorange);
					orderPanel.orderXPPanel.label.setText("XP");
					orderPanel.orderXPPanel.setBackground(Colors.lorange);
					orderPanel.totalXPPanel.label.setText("XP");
					orderPanel.totalXPPanel.setBackground(Colors.lorange);
	
			} else {
				try {
					orderList.get(sequence).removeActionListener(orderList.get(sequence).getActionListeners()[0]);
				} catch (Exception e1) {}
				
					orderPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.numberPanel.label.setText("");
					orderPanel.numberPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.conditionPanel.label.setText("");
					orderPanel.conditionPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.conditionXPPanel.label.setText("");
					orderPanel.conditionXPPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.targetPanel.label.setText("");
					orderPanel.targetPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.targetXPPanel.label.setText("");
					orderPanel.targetXPPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.orderPanel.label.setText("");
					orderPanel.orderPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.orderXPPanel.label.setText("");
					orderPanel.orderXPPanel.setBackground(Colors.emptyPanelColor);
					orderPanel.totalXPPanel.label.setText("");
					orderPanel.totalXPPanel.setBackground(Colors.emptyPanelColor);
			}
			
			sequence++;

		}
	} else {
		
		for (IndividualOrderPanel orderPanel: orderList) {

				try {
					orderPanel.removeActionListener(orderPanel.getActionListeners()[0]);
				} catch (Exception e1) {}
				
				orderPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.numberPanel.label.setText("");
				orderPanel.numberPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.conditionPanel.label.setText("");
				orderPanel.conditionPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.conditionXPPanel.label.setText("");
				orderPanel.conditionXPPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.targetPanel.label.setText("");
				orderPanel.targetPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.targetXPPanel.label.setText("");
				orderPanel.targetXPPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.orderPanel.label.setText("");
				orderPanel.orderPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.orderXPPanel.label.setText("");
				orderPanel.orderXPPanel.setBackground(Colors.emptyPanelColor);
				orderPanel.totalXPPanel.label.setText("");
				orderPanel.totalXPPanel.setBackground(Colors.emptyPanelColor);
				
		}
		
	}
	}
}
