package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class OrderChoicePopupTargetPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public OrderChoicePopupTargetPanel(int width, int height, OrderChoicePopupOrderPanel orderChoicePopupOrderPanel) {
		
		super();
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		OrderChoicePopupTargetPanel panel = this;
		
		ConditionButton strongestButton = new ConditionButton(width / 6, height / 6, "Strongest Enemy");
			strongestButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(false);
					orderChoicePopupOrderPanel.setVisible(true);
				}
			});
		add(strongestButton);
		
		
		/*
		ConditionButton nearestButton = new ConditionButton(width / 6, height / 6, "Nearest Enemy");
		add(nearestButton);
		
		ConditionButton weakestButton = new ConditionButton(width / 6, height / 6, "Weakest Enemy");
		add(weakestButton);
		
		ConditionButton selfButton = new ConditionButton(width / 6, height / 6, "Self");
		add(selfButton);*/
		
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
