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
	ConditionButton strongestButton;
	ConditionButton nearestButton;
	ConditionButton weakestButton;
	ConditionButton selfButton;
	
	public OrderChoicePopupTargetPanel(int width, int height, OrderChoicePopupOrderPanel orderChoicePopupOrderPanel) {

		super();
		targetPanel = this;
		orderPanel = orderChoicePopupOrderPanel;
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));

		strongestButton = new ConditionButton(width / 6, height / 6, "Strongest Enemy");
		add(strongestButton);

		nearestButton = new ConditionButton(width / 6, height / 6, "Nearest Enemy"); 
		add(nearestButton);
		
		weakestButton = new ConditionButton(width / 6, height / 6, "Weakest Enemy"); 
		add(weakestButton);
		 
		selfButton = new ConditionButton(width / 6, height / 6, "Self"); 
		add(selfButton);
		

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

	public void fillTargetPanel(int index, Regiment regiment) {
		this.index = index;
		
		try {
			strongestButton.removeActionListener(strongestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		strongestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeTarget(regiment, Target.ENEMY_STRONGEST);
				strongestButton.removeActionListener(strongestButton.getActionListeners()[0]);
			}
		});
		
		try {
			nearestButton.removeActionListener(nearestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		nearestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeTarget(regiment, Target.ENEMY_NEAREST);
				nearestButton.removeActionListener(nearestButton.getActionListeners()[0]);
			}
		});	
		
		try {
			weakestButton.removeActionListener(weakestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		weakestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeTarget(regiment, Target.ENEMY_WEAKEST);
				weakestButton.removeActionListener(weakestButton.getActionListeners()[0]);
			}
		});	
		
		try {
			selfButton.removeActionListener(selfButton.getActionListeners()[0]);
		} catch (Exception e) {}
		selfButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeTarget(regiment, Target.SELF);
				selfButton.removeActionListener(selfButton.getActionListeners()[0]);
			}
		});	
		
		
	}

}
