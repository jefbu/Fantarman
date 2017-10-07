package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.tactics.Condition;
import main.entity.regiments.Regiment;

public class OrderChoicePopupConditionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	OrderChoicePopupConditionPanel conditionPanel;
	OrderChoicePopupTargetPanel  targetPanel;
	Condition storedCondition;
	private int index;

	public OrderChoicePopupConditionPanel(int width, int height,
			OrderChoicePopupTargetPanel orderChoicePopupTargetPanel, Regiment regiment, int index) {

		super();
		this.index = index;
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		conditionPanel = this;
		targetPanel = orderChoicePopupTargetPanel;

		ConditionButton life100Button = new ConditionButton(width / 6, height / 6, "Life < 100%");
		life100Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_under_100);
			}
		});
		add(life100Button);
		/*
		 * ConditionButton life75Button = new ConditionButton(width / 6, height
		 * / 6, "Life < 75%"); add(life75Button);
		 * 
		 * ConditionButton life50Button = new ConditionButton(width / 6, height
		 * / 6, "Life < 50%"); add(life50Button);
		 * 
		 * ConditionButton life25Button = new ConditionButton(width / 6, height
		 * / 6, "Life < 25%"); add(life25Button);
		 * 
		 * 
		 * 
		 * ConditionButton alwaysButton = new ConditionButton(width / 6, height
		 * / 6, "Always"); add(alwaysButton);
		 */

	}
	
	private void attributeCondition(Regiment regiment, Condition condition) {
		conditionPanel.setVisible(false);
		targetPanel.setVisible(true);
		regiment.instructions.get(index).condition = condition;
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
