package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.components.Colour;
import main.components.Popup;
import main.utility.Colors;

public class OrderChoicePopup extends Popup {

	private static final long serialVersionUID = 1L;
	OrderChoicePopupConditionPanel orderChoicePopupConditionPanel;
	OrderChoicePopupTargetPanel orderChoicePopupTargetPanel;
	OrderChoicePopupOrderPanel orderChoicePopupOrderPanel;
	
	int state;

	public OrderChoicePopup(int width, int height, Colour colour, Boolean dichotomy) {
		
		super(width, height, colour, dichotomy);
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		state = 0;
		
		orderChoicePopupConditionPanel = new OrderChoicePopupConditionPanel(width - 10, height - 10);
		orderChoicePopupConditionPanel.setBackground(Colors.red);
		
		orderChoicePopupTargetPanel = new OrderChoicePopupTargetPanel(width - 10, height - 10);
		orderChoicePopupTargetPanel.setBackground(Colors.red);
		
		orderChoicePopupOrderPanel = new OrderChoicePopupOrderPanel();
		orderChoicePopupOrderPanel.setPreferredSize(new Dimension(width - 10, height - 10));
		orderChoicePopupOrderPanel.setBackground(Colors.red);
		
		mainPanelTopPanel.add(orderChoicePopupConditionPanel);
		mainPanelTopPanel.add(orderChoicePopupTargetPanel);
		mainPanelTopPanel.add(orderChoicePopupOrderPanel);
		
		orderChoicePopupTargetPanel.setVisible(false);
		orderChoicePopupOrderPanel.setVisible(false);
		orderChoicePopupConditionPanel.setVisible(true);
		
		acceptButton.removeActionListener(acceptButton.getActionListeners()[0]);
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(state) {
				case 0: orderChoicePopupConditionPanel.setVisible(false);
						orderChoicePopupTargetPanel.setVisible(true);
						state++;
						break;
				case 1: orderChoicePopupTargetPanel.setVisible(false);
						orderChoicePopupOrderPanel.setVisible(true);
						state++;
						break;
				case 2: dispose();
						break;
				}
			}
		});
		
	}

}
