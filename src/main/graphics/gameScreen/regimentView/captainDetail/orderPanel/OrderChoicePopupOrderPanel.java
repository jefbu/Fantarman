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
	ConditionButton chargeButton;
	ConditionButton moveToButton;
	ConditionButton missileButton;
	ConditionButton recoverButton;
	
	OrderChoicePopup orderChoicePopup;

	public OrderChoicePopupOrderPanel(int width, int height, OrderChoicePopup orderChoicePopup) {
		
		super();
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		
		this.orderChoicePopup = orderChoicePopup;
		
		chargeButton = new ConditionButton(width / 6, height / 6, "Charge");
		add(chargeButton);
		
		moveToButton = new ConditionButton(width / 6, height / 6, "Move Towards");
		add(moveToButton);
		
		missileButton = new ConditionButton(width / 6, height / 6, "Fire At");
		add(missileButton);
		
		recoverButton = new ConditionButton(width / 6, height / 6, "Recover");
		add(recoverButton);

		
	}
	
	private void attributeOrder(Regiment regiment, Order order, OrderChoicePopup orderChoicePopup) {
		regiment.instructions.get(index).order = order;
		Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment);
		orderChoicePopup.setVisible(false);
	}
	
	
	private class ConditionButton extends JButton {

		private static final long serialVersionUID = 1L;

		private ConditionButton(int width, int height, String title) {
			super();
			setPreferredSize(new Dimension(width, height));
			setText(title);
		}
		
	}


	public void fillOrderPanel(int index, Regiment regiment) {
		this.index = index;
		
		chargeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.CHARGE, orderChoicePopup);
				chargeButton.removeActionListener(chargeButton.getActionListeners()[0]);
			}
		});
		
		moveToButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.Move_to, orderChoicePopup);
				moveToButton.removeActionListener(moveToButton.getActionListeners()[0]);
			}
		});	
		
		missileButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.FIRE, orderChoicePopup);
				missileButton.removeActionListener(missileButton.getActionListeners()[0]);
			}
		});	
		
		recoverButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.RECOVER, orderChoicePopup);
				recoverButton.removeActionListener(recoverButton.getActionListeners()[0]);
			}
		});	
		
		
		
	}

}
