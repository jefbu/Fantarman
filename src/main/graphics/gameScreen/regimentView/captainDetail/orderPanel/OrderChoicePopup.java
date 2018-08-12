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

	public OrderChoicePopup(int width, int height, Colour colour, Boolean dichotomy) {

		super(width, height, colour, dichotomy);
		OrderChoicePopup orderChoicePopup = this;
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		state = 0;

		orderChoicePopupOrderPanel = new OrderChoicePopupOrderPanel(width - 10, height - 10, orderChoicePopup);
		orderChoicePopupOrderPanel.setBackground(Colors.grey);

		orderChoicePopupTargetPanel = new OrderChoicePopupTargetPanel(width - 10, height - 10, orderChoicePopupOrderPanel);
		orderChoicePopupTargetPanel.setBackground(Colors.grey);

		orderChoicePopupConditionPanel = new OrderChoicePopupConditionPanel(width - 10, height - 10, orderChoicePopupTargetPanel);
		orderChoicePopupConditionPanel.setBackground(Colors.grey);

		mainPanelTopPanel.add(orderChoicePopupConditionPanel);
		mainPanelTopPanel.add(orderChoicePopupTargetPanel);
		mainPanelTopPanel.add(orderChoicePopupOrderPanel);

		orderChoicePopupTargetPanel.setVisible(false);
		orderChoicePopupOrderPanel.setVisible(false);
		orderChoicePopupConditionPanel.setVisible(true);

	}
	
	public void fillPopup(int index, Regiment regiment) {
		orderChoicePopupConditionPanel.fillConditionPanel(index, regiment);
		
		orderChoicePopupTargetPanel.setVisible(false);
		orderChoicePopupOrderPanel.setVisible(false);
		orderChoicePopupConditionPanel.setVisible(true);
	}

}
