package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.tactics.Order;
import main.battle.tactics.TargetType;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
import main.utility.ImageLoader;

public class OrderChoicePopupOrderPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	int index;
	ConditionButton chargeButton;
	ConditionButton moveToButton;
	ConditionButton moveForwardButton;
	ConditionButton missileButton;
	ConditionButton recoverButton;
	
	OrderChoicePopup orderChoicePopup;

	public OrderChoicePopupOrderPanel(int width, int height, OrderChoicePopup orderChoicePopup) {
		
		super();
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		
		ImageLoader imageLoader = new ImageLoader();
		
		this.orderChoicePopup = orderChoicePopup;
		
		chargeButton = new ConditionButton(width / 6, height / 6, "Charge");
		chargeButton.setIcon(imageLoader.loadImageIcon("/icons/orderButtonCharge.png", width / 6, height / 6));
		add(chargeButton);
		
		moveToButton = new ConditionButton(width / 6, height / 6, "Move Towards");
		moveToButton.setIcon(imageLoader.loadImageIcon("/icons/orderButtonMoveTo.png", width / 6, height / 6));
		add(moveToButton);
		
		moveForwardButton = new ConditionButton(width / 6, height / 6, "Move Forwards");
		moveForwardButton.setIcon(imageLoader.loadImageIcon("/icons/orderButtonMoveForward.png", width / 6, height / 6));
		add(moveForwardButton);
		
		missileButton = new ConditionButton(width / 6, height / 6, "Fire At");
		missileButton.setIcon(imageLoader.loadImageIcon("/icons/orderButtonMissile.png", width / 6, height / 6));
		add(missileButton);
		
		recoverButton = new ConditionButton(width / 6, height / 6, "Recover");
		recoverButton.setIcon(imageLoader.loadImageIcon("/icons/orderButtonRecover.png", width / 6, height / 6));
		add(recoverButton);

		
	}
	
	private void attributeOrder(Regiment regiment, Order order, OrderChoicePopup orderChoicePopup, int regimentNumber) {
		regiment.instructions.get(index).order = order;
		Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment, true, regimentNumber);
		orderChoicePopup.setVisible(false);
	}
	
	
	private class ConditionButton extends JButton {

		private static final long serialVersionUID = 1L;

		private ConditionButton(int width, int height, String title) {
			super();
			setContentAreaFilled(false);
			setBorderPainted(false);
			setPreferredSize(new Dimension(width, height));
			setText(title);
		}

	}


	public void fillOrderPanel(int index, Regiment regiment, TargetType targetType, int regimentNumber) {
		this.index = index;
		
		switch (targetType) {
		case None:
			moveForwardButton.setVisible(true);
			moveToButton.setVisible(false);
			chargeButton.setVisible(false);
			missileButton.setVisible(false);
			recoverButton.setVisible(false);
			break;
		case Others:
			moveToButton.setVisible(true);
			chargeButton.setVisible(true);
			missileButton.setVisible(true);
			moveForwardButton.setVisible(false);
			recoverButton.setVisible(false);
			break;
		case Self:
			recoverButton.setVisible(true);
			moveToButton.setVisible(false);
			chargeButton.setVisible(false);
			missileButton.setVisible(false);
			moveForwardButton.setVisible(false);
			break;
		default:
			break;
		
		}
		
		try {
			chargeButton.removeActionListener(chargeButton.getActionListeners()[0]);
		} catch (Exception e) {}
		chargeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.CHARGE, orderChoicePopup, regimentNumber);
				chargeButton.removeActionListener(chargeButton.getActionListeners()[0]);
			}
		});
		
		try {
			moveToButton.removeActionListener(moveToButton.getActionListeners()[0]);
		} catch (Exception e) {}
		moveToButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.Move_to, orderChoicePopup, regimentNumber);
				moveToButton.removeActionListener(moveToButton.getActionListeners()[0]);
			}
		});
		
		try {
			moveForwardButton.removeActionListener(moveForwardButton.getActionListeners()[0]);
		} catch (Exception e) {}
		moveForwardButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.Move_Forward, orderChoicePopup, regimentNumber);
				moveForwardButton.removeActionListener(moveForwardButton.getActionListeners()[0]);
			}
		});	
		
		try {
			missileButton.removeActionListener(missileButton.getActionListeners()[0]);
		} catch (Exception e) {}
		missileButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.FIRE, orderChoicePopup, regimentNumber);
				missileButton.removeActionListener(missileButton.getActionListeners()[0]);
			}
		});	
		
		try {
			recoverButton.removeActionListener(recoverButton.getActionListeners()[0]);
		} catch (Exception e) {}
		recoverButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				attributeOrder(regiment, Order.RECOVER, orderChoicePopup, regimentNumber);
				recoverButton.removeActionListener(recoverButton.getActionListeners()[0]);
			}
		});
		
	}

}
