package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OrderChoicePopupOrderPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public OrderChoicePopupOrderPanel(int width, int height) {
		
		super();
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		
		ConditionButton chargeButton = new ConditionButton(width / 6, height / 6, "Charge");
		add(chargeButton);
		
		ConditionButton moveToButton = new ConditionButton(width / 6, height / 6, "Move Towards");
		add(moveToButton);
		
		ConditionButton missileButton = new ConditionButton(width / 6, height / 6, "Fire At");
		add(missileButton);
		
		ConditionButton recoverButton = new ConditionButton(width / 6, height / 6, "Recover");
		add(recoverButton);
		
		
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
