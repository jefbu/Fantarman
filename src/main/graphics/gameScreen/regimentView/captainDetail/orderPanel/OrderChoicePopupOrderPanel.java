package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.tactics.Order;
import main.entity.regiments.Regiment;
import main.graphics.Screen;

public class OrderChoicePopupOrderPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	int index;

	public OrderChoicePopupOrderPanel(int width, int height, OrderChoicePopup orderChoicePopup, Regiment regiment, int index) {
		
		super();
		this.index = index;
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		
		ConditionButton chargeButton = new ConditionButton(width / 6, height / 6, "Charge");
			chargeButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					attributeOrder(regiment, Order.CHARGE, orderChoicePopup);
				}
			});
		add(chargeButton);
		
		/*
		ConditionButton moveToButton = new ConditionButton(width / 6, height / 6, "Move Towards");
		add(moveToButton);
		
		ConditionButton missileButton = new ConditionButton(width / 6, height / 6, "Fire At");
		add(missileButton);
		
		ConditionButton recoverButton = new ConditionButton(width / 6, height / 6, "Recover");
		add(recoverButton);
		*/
		
	}
	
	private void attributeOrder(Regiment regiment, Order order, OrderChoicePopup orderChoicePopup) {
		regiment.instructions.get(index).order = order;
		Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment);
		orderChoicePopup.dispose();
	}
	
	
	private class ConditionButton extends JButton {

		private static final long serialVersionUID = 1L;

		private ConditionButton(int width, int height, String title) {
			super();
			setPreferredSize(new Dimension(width, height));
			setText(title);
		}
		
	}

}
