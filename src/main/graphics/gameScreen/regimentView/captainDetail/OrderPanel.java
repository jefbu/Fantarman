package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.IndividualOrderPanel;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.OrderChoicePopup;
import main.graphics.gameScreen.regimentView.captainDetail.orderPanel.OrderTitlePanel;

public class OrderPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	public OrderTitlePanel orderTitlePanel;
	public JPanel ordersPanel;
	public ArrayList<IndividualOrderPanel> orderList;

	public OrderPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width - 1, height - 1, colour, flowLayout);
		orderList = new ArrayList<IndividualOrderPanel>();
		
		orderTitlePanel = new OrderTitlePanel(width - 11, height / 6 - 3);
		insidePanel.add(orderTitlePanel);
				
		for (int i = 0; i < 5; i++) {
			orderList.add(new IndividualOrderPanel(width - 11, height / 6 - 3));
			orderList.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					OrderChoicePopup orderChoicePopup = new OrderChoicePopup(width * 2, height * 2, Colour.DRED, false);
					orderChoicePopup.setLocation(MouseInfo.getPointerInfo().getLocation());
					int x = orderChoicePopup.getX();
					int y = orderChoicePopup.getY() - height * 2;
					orderChoicePopup.setLocation(x, y);
					orderChoicePopup.setVisible(true);
				}
			});
			insidePanel.add(orderList.get(i));
		}

		
	}

}
