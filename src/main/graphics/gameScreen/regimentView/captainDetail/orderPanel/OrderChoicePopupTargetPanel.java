package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.tactics.Target;
import main.battle.tactics.TargetType;
import main.entity.regiments.Regiment;
import main.utility.ImageLoader;

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
	ConditionButton noneButton;
	
	TargetType targetType;
	
	public OrderChoicePopupTargetPanel(int width, int height, OrderChoicePopupOrderPanel orderChoicePopupOrderPanel) {

		super();
		targetPanel = this;
		orderPanel = orderChoicePopupOrderPanel;
		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));

		ImageLoader imageLoader = new ImageLoader();
		
		strongestButton = new ConditionButton(width / 6, height / 6, "Strongest Enemy");
		strongestButton.setIcon(imageLoader.loadImageIcon("/icons/targetButtonStrongest.png", width / 6, height / 6));
		add(strongestButton);

		nearestButton = new ConditionButton(width / 6, height / 6, "Nearest Enemy");
		nearestButton.setIcon(imageLoader.loadImageIcon("/icons/targetButtonNearest.png", width / 6, height / 6));
		add(nearestButton);
		
		weakestButton = new ConditionButton(width / 6, height / 6, "Weakest Enemy"); 
		weakestButton.setIcon(imageLoader.loadImageIcon("/icons/targetButtonWeakest.png", width / 6, height / 6));
		add(weakestButton);
		 
		selfButton = new ConditionButton(width / 6, height / 6, "Self"); 
		selfButton.setIcon(imageLoader.loadImageIcon("/icons/targetButtonSelf.png", width / 6, height / 6));
		add(selfButton);
		
		noneButton = new ConditionButton(width / 6, height / 6, "None");
		noneButton.setIcon(imageLoader.loadImageIcon("/icons/targetButtonNone.png", width / 6, height / 6));
		add(noneButton);
		

	}
	
	private void attributeTarget(Regiment regiment, Target target, int regimentNumber) {
		targetPanel.setVisible(false);
		regiment.instructions.get(index).target = target;
		orderPanel.fillOrderPanel(index, regiment, targetType, regimentNumber);
		orderPanel.setVisible(true);
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

	public void fillTargetPanel(int index, Regiment regiment, int regimentNumber) {
		this.index = index;
		
		try {
			strongestButton.removeActionListener(strongestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		strongestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				targetType = TargetType.Others;
				attributeTarget(regiment, Target.ENEMY_STRONGEST, regimentNumber);
				strongestButton.removeActionListener(strongestButton.getActionListeners()[0]);
			}
		});
		
		try {
			nearestButton.removeActionListener(nearestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		nearestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				targetType = TargetType.Others;
				attributeTarget(regiment, Target.ENEMY_NEAREST, regimentNumber);
				nearestButton.removeActionListener(nearestButton.getActionListeners()[0]);
			}
		});	
		
		try {
			weakestButton.removeActionListener(weakestButton.getActionListeners()[0]);
		} catch (Exception e) {}
		weakestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				targetType = TargetType.Others;
				attributeTarget(regiment, Target.ENEMY_WEAKEST, regimentNumber);
				weakestButton.removeActionListener(weakestButton.getActionListeners()[0]);
			}
		});	
		
		try {
			selfButton.removeActionListener(selfButton.getActionListeners()[0]);
		} catch (Exception e) {}
		selfButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				targetType = TargetType.Self;
				attributeTarget(regiment, Target.SELF, regimentNumber);
				selfButton.removeActionListener(selfButton.getActionListeners()[0]);
			}
		});	
		
		try {
			noneButton.removeActionListener(noneButton.getActionListeners()[0]);
		} catch (Exception e) {}
		noneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				targetType = TargetType.None;
				attributeTarget(regiment, Target.NONE, regimentNumber);
				noneButton.removeActionListener(selfButton.getActionListeners()[0]);
			}
		});	
		
		
	}

}
