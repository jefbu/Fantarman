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

	public void fillOrderPanel(Regiment regiment) {
		
		for (int ii = 0; ii < regiment.captain.orders; ii++) {
			int index = ii;
			try {
				orderList.get(index).removeActionListener(orderList.get(index).getActionListeners()[0]);
			} catch (Exception e1) {}
			orderList.get(index).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					orderChoicePopup.fillPopup(index, regiment);
					orderChoicePopup.setLocation(MouseInfo.getPointerInfo().getLocation());
					int x = orderChoicePopup.getX();
					int y = orderChoicePopup.getY() - height * 2;
					orderChoicePopup.setLocation(x, y);
					orderChoicePopup.setVisible(true);
				}
			});
		}
		
		

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
