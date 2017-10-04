package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.IndividualOrderPanel;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.OrderTitlePanel;

public class OrderPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	public OrderTitlePanel orderTitlePanel;
	public JPanel ordersPanel;
	public ArrayList<IndividualOrderPanel> orderList;

	public OrderPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width - 1, height - 1, colour, flowLayout);
		orderList = new ArrayList<IndividualOrderPanel>();
		
		orderTitlePanel = new OrderTitlePanel(width - 11, height / 6 - 4);
		insidePanel.add(orderTitlePanel);
				
		for (int i = 0; i < 5; i++) {
			orderList.add(new IndividualOrderPanel(width - 11, height / 6 - 4));		
			insidePanel.add(orderList.get(i));
		}
		
		for (int ii = 0; ii < orderList.size(); ii++) {
		}
		
	}
	
	public void fillOrderPanel(Regiment regiment) {
		
		for (int i = 0; i < regiment.instructions.size(); i++) {
			orderList.get(i).numberPanel.label.setText(Integer.toString(i + 1));
			orderList.get(i).conditionPanel.label.setText(regiment.instructions.get(i).condition.name());
			orderList.get(i).conditionXPPanel.label.setText("XP");
			orderList.get(i).targetPanel.label.setText(regiment.instructions.get(i).target.name());
			orderList.get(i).targetXPPanel.label.setText("XP");
			orderList.get(i).orderPanel.label.setText(regiment.instructions.get(i).order.name());
			orderList.get(i).orderXPPanel.label.setText("XP");
			orderList.get(i).totalXPPanel.label.setText("XP");

		}
		
	}

}
