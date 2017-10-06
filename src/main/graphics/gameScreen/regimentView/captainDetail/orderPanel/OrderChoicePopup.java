package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.FlowLayout;

import main.components.Colour;
import main.components.Popup;
import main.entity.regiments.Regiment;
import main.utility.Colors;

public class OrderChoicePopup extends Popup {

	private static final long serialVersionUID = 1L;
	OrderChoicePopupConditionPanel orderChoicePopupConditionPanel;
	OrderChoicePopupTargetPanel orderChoicePopupTargetPanel;
	OrderChoicePopupOrderPanel orderChoicePopupOrderPanel;

	int state;

	public OrderChoicePopup(int width, int height, Colour colour, Boolean dichotomy, Regiment regiment, int index) {

		super(width, height, colour, dichotomy);
		OrderChoicePopup orderChoicePopup = this;
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		state = 0;

		orderChoicePopupOrderPanel = new OrderChoicePopupOrderPanel(width - 10, height - 10, orderChoicePopup, regiment,
				index);
		orderChoicePopupOrderPanel.setBackground(Colors.red);

		orderChoicePopupTargetPanel = new OrderChoicePopupTargetPanel(width - 10, height - 10,
				orderChoicePopupOrderPanel, regiment, index);
		orderChoicePopupTargetPanel.setBackground(Colors.red);

		orderChoicePopupConditionPanel = new OrderChoicePopupConditionPanel(width - 10, height - 10,
				orderChoicePopupTargetPanel, regiment, index);
		orderChoicePopupConditionPanel.setBackground(Colors.red);

		mainPanelTopPanel.add(orderChoicePopupConditionPanel);
		mainPanelTopPanel.add(orderChoicePopupTargetPanel);
		mainPanelTopPanel.add(orderChoicePopupOrderPanel);

		orderChoicePopupTargetPanel.setVisible(false);
		orderChoicePopupOrderPanel.setVisible(false);
		orderChoicePopupConditionPanel.setVisible(true);

		acceptButton.removeActionListener(acceptButton.getActionListeners()[0]);
		/*
		 * acceptButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { switch(state) { case 0:
		 * orderChoicePopupConditionPanel.setVisible(false);
		 * orderChoicePopupTargetPanel.setVisible(true); state++; break; case 1:
		 * orderChoicePopupTargetPanel.setVisible(false);
		 * orderChoicePopupOrderPanel.setVisible(true); state++; break; case 2:
		 * dispose(); break; } } })
		 */

	}

}
