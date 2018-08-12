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
	ConditionButton lifeUnder100Button;
	ConditionButton lifeUnder75Button;
	ConditionButton lifeUnder50Button;
	ConditionButton lifeUnder25Button;
	ConditionButton lifeOver25Button;
	ConditionButton lifeOver50Button;
	ConditionButton lifeOver75Button;
	ConditionButton life100Button;
	ConditionButton after1TurnButton;
	ConditionButton after2TurnButton;
	ConditionButton after3TurnButton;
	ConditionButton after4TurnButton;
	ConditionButton after5TurnButton;
	ConditionButton anyInRangeButton;
	ConditionButton targetInRangeButton;
	
	ConditionButton alwaysButton;

	public OrderChoicePopupConditionPanel(int width, int height, OrderChoicePopupTargetPanel orderChoicePopupTargetPanel) {

		super();

		setLayout(new FlowLayout(FlowLayout.LEFT, 7, 7));
		setPreferredSize(new Dimension(width - 10, height - 10));
		conditionPanel = this;
		targetPanel = orderChoicePopupTargetPanel;

		lifeUnder100Button = new ConditionButton(width / 6, height / 6, "Life < 100%");
		add(lifeUnder100Button);
		
		lifeUnder75Button = new ConditionButton(width / 6, height / 6, "Life < 75%"); 
		add(lifeUnder75Button);
		
		lifeUnder50Button = new ConditionButton(width / 6, height / 6, "Life < 50%"); 
		add(lifeUnder50Button);
		 
		lifeUnder25Button = new ConditionButton(width / 6, height / 6, "Life < 25%"); 
		add(lifeUnder25Button);
		
		lifeOver25Button = new ConditionButton(width / 6, height / 6, "Life > 25%");
		add(lifeOver25Button);
		
		lifeOver50Button = new ConditionButton(width / 6, height / 6, "Life > 50%");
		add(lifeOver50Button);
		
		lifeOver75Button = new ConditionButton(width / 6, height / 6, "Life > 75%");
		add(lifeOver75Button);
		
		life100Button = new ConditionButton(width / 6, height / 6, "Life = 100%");
		add(life100Button);
		
		after1TurnButton = new ConditionButton(width / 6, height / 6, "After 1 Turn");
		add(after1TurnButton);
		
		after2TurnButton = new ConditionButton(width / 6, height / 6, "After 2 Turns");
		add(after2TurnButton);
		
		after3TurnButton = new ConditionButton(width / 6, height / 6, "After 3 Turns");
		add(after3TurnButton);
		
		after4TurnButton = new ConditionButton(width / 6, height / 6, "After 4 Turns");
		add(after4TurnButton);
		
		after5TurnButton = new ConditionButton(width / 6, height / 6, "After 5 Turns");
		add(after5TurnButton);
		
		anyInRangeButton = new ConditionButton(width / 6, height / 6, "Any In Range");
		add(anyInRangeButton);
		
		targetInRangeButton = new ConditionButton(width / 6, height / 6, "Target In Range");
		add(targetInRangeButton);		
		 	 
		
		alwaysButton = new ConditionButton(width / 6, height / 6, "Always"); 
		add(alwaysButton);
		

	}
	
	private void attributeCondition(Regiment regiment, Condition condition) {
		conditionPanel.setVisible(false);
		regiment.instructions.get(index).condition = condition;
		targetPanel.fillTargetPanel(index, regiment);
		targetPanel.setVisible(true);
	}
	

	private class ConditionButton extends JButton {

		private static final long serialVersionUID = 1L;

		private ConditionButton(int width, int height, String title) {
			super();
			setPreferredSize(new Dimension(width, height));
			setText(title);
		}

	}


	public void fillConditionPanel(int index, Regiment regiment) {
		this.index = index;
		
		try {
			lifeUnder100Button.removeActionListener(lifeUnder100Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeUnder100Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_under_100);
				lifeUnder100Button.removeActionListener(lifeUnder100Button.getActionListeners()[0]);
			}
		});		
		
		try {
			lifeUnder75Button.removeActionListener(lifeUnder75Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeUnder75Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_under_75);
				lifeUnder75Button.removeActionListener(lifeUnder75Button.getActionListeners()[0]);
			}
		});	
		
		try {
			lifeUnder50Button.removeActionListener(lifeUnder50Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeUnder50Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_under_50);
				lifeUnder50Button.removeActionListener(lifeUnder50Button.getActionListeners()[0]);
			}
		});	
		
		try {
			lifeUnder25Button.removeActionListener(lifeUnder25Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeUnder25Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_under_25);
				lifeUnder25Button.removeActionListener(lifeUnder25Button.getActionListeners()[0]);
			}
		});	
		
		try {
			lifeOver25Button.removeActionListener(lifeOver25Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeOver25Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_above_25);
				lifeOver25Button.removeActionListener(lifeOver25Button.getActionListeners()[0]);
			}
		});	
		
		try {
			lifeOver50Button.removeActionListener(lifeOver50Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeOver50Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_above_50);
				lifeOver50Button.removeActionListener(lifeOver50Button.getActionListeners()[0]);
			}
		});	
		
		try {
			lifeOver75Button.removeActionListener(lifeOver75Button.getActionListeners()[0]);
		} catch (Exception e) {}
		lifeOver75Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_above_75);
				lifeOver75Button.removeActionListener(lifeOver75Button.getActionListeners()[0]);
			}
		});	
		
		try {
			life100Button.removeActionListener(life100Button.getActionListeners()[0]);
		} catch (Exception e) {}
		life100Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Life_full);
				life100Button.removeActionListener(life100Button.getActionListeners()[0]);
			}
		});	
		
		try {
			after1TurnButton.removeActionListener(after1TurnButton.getActionListeners()[0]);
		} catch (Exception e) {}
		after1TurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.After_1_Turn);
				after1TurnButton.removeActionListener(after1TurnButton.getActionListeners()[0]);
			}
		});	
		
		try {
			after2TurnButton.removeActionListener(after2TurnButton.getActionListeners()[0]);
		} catch (Exception e) {}
		after2TurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.After_2_Turns);
				after2TurnButton.removeActionListener(after2TurnButton.getActionListeners()[0]);
			}
		});	
		
		try {
			after3TurnButton.removeActionListener(after3TurnButton.getActionListeners()[0]);
		} catch (Exception e) {}
		after3TurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.After_3_Turns);
				after3TurnButton.removeActionListener(after3TurnButton.getActionListeners()[0]);
			}
		});	
		
		try {
			after4TurnButton.removeActionListener(after4TurnButton.getActionListeners()[0]);
		} catch (Exception e) {}
		after4TurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.After_4_Turns);
				after4TurnButton.removeActionListener(after4TurnButton.getActionListeners()[0]);
			}
		});	
		
		try {
			after5TurnButton.removeActionListener(after5TurnButton.getActionListeners()[0]);
		} catch (Exception e) {}
		after5TurnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.After_5_Turns);
				after5TurnButton.removeActionListener(after5TurnButton.getActionListeners()[0]);
			}
		});	
		
		try {
			anyInRangeButton.removeActionListener(anyInRangeButton.getActionListeners()[0]);
		} catch (Exception e) {}
		anyInRangeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Any_in_Range);
				anyInRangeButton.removeActionListener(anyInRangeButton.getActionListeners()[0]);
			}
		});	
		
		try {
			targetInRangeButton.removeActionListener(targetInRangeButton.getActionListeners()[0]);
		} catch (Exception e) {}
		targetInRangeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.Target_in_Range);
				targetInRangeButton.removeActionListener(targetInRangeButton.getActionListeners()[0]);
			}
		});	
		
		
		
		
		try {
			alwaysButton.removeActionListener(alwaysButton.getActionListeners()[0]);
		} catch (Exception e) {}
		alwaysButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attributeCondition(regiment, Condition.ALWAYS);
				alwaysButton.removeActionListener(alwaysButton.getActionListeners()[0]);
			}
		});	
		
		
		
	}

}
