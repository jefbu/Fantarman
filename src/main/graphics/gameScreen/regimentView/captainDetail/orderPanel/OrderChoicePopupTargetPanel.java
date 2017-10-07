package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.tactics.Target;
import main.entity.regiments.Regiment;

public class OrderChoicePopupTargetPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	OrderChoicePopupTargetPanel targetPanel;
	OrderChoicePopupOrderPanel orderPanel;
	Target storedTarget;
	int index;

	public OrderChoicePopupTargetPanel(int width, int height, OrderChoicePopupOrderPanel orderChoicePopupOrderPanel,
			Regiment regiment, int index) {

		super();
		this.index = index;
		targetPanel = this;
		orderPanel = orderChoicePopupOrderPanel;
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));

		ConditionButton strongestButton = new ConditionButton(width / 6, height / 6, "Strongest Enemy");
		strongestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeTarget(regiment, Target.ENEMY_STRONGEST);
			}
		});
		add(strongestButton);

		/*
		 * ConditionButton nearestButton = new ConditionButton(width / 6, height
		 * / 6, "Nearest Enemy"); add(nearestButton);
		 * 
		 * ConditionButton weakestButton = new ConditionButton(width / 6, height
		 * / 6, "Weakest Enemy"); add(weakestButton);
		 * 
		 * ConditionButton selfButton = new ConditionButton(width / 6, height /
		 * 6, "Self"); add(selfButton);
		 */

	}
	
	private void attributeTarget(Regiment regiment, Target target) {
		targetPanel.setVisible(false);
		orderPanel.setVisible(true);
		regiment.instructions.get(index).target = target;
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
