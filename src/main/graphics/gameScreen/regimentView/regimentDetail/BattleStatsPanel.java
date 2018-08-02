package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;

public class BattleStatsPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;

	DoubleLabeledPanel lifePanel;
	DoubleLabeledPanel movePanel;
	DoubleLabeledPanel runPanel;
	DoubleLabeledPanel speedPanel;
	DoubleLabeledPanel moralePanel;
	DoubleLabeledPanel attackPanel;
	DoubleLabeledPanel chargePanel;
	DoubleLabeledPanel defencePanel;
	DoubleLabeledPanel rangePanel;
	DoubleLabeledPanel missilePanel;

	public BattleStatsPanel(int width, int height, Color colour, FlowLayout flowLayout) {

		super(width, height, colour, flowLayout);

		lifePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		movePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		runPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		speedPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		moralePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		attackPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		chargePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		defencePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		rangePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);
		missilePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.LGREY);

		insidePanel.add(lifePanel);
		insidePanel.add(moralePanel);
		insidePanel.add(movePanel);
		insidePanel.add(runPanel);
		insidePanel.add(attackPanel);
		insidePanel.add(defencePanel);
		insidePanel.add(chargePanel);
		insidePanel.add(speedPanel);
		insidePanel.add(rangePanel);
		insidePanel.add(missilePanel);

	}

	public void fillBattleStatsPanel(Regiment regiment) {
		
		regiment.calculateTotalStats();

		lifePanel.titleLabel.setText("Life");
		lifePanel.contentLabel.setText(Integer.toString(regiment.totalLife));

		moralePanel.titleLabel.setText("Morale");
		moralePanel.contentLabel.setText(Integer.toString(regiment.totalMorale));
		
		movePanel.titleLabel.setText("Move");
		movePanel.contentLabel.setText(Integer.toString(regiment.totalMove));

		runPanel.titleLabel.setText("Run");
		runPanel.contentLabel.setText(Integer.toString(regiment.totalRun));

		attackPanel.titleLabel.setText("Attack");
		attackPanel.contentLabel.setText(Integer.toString(regiment.totalAttack));

		defencePanel.titleLabel.setText("Defence");
		defencePanel.contentLabel.setText(Integer.toString(regiment.totalDefence));

		chargePanel.titleLabel.setText("Charge");
		chargePanel.contentLabel.setText(Integer.toString(regiment.totalCharge));
		
		speedPanel.titleLabel.setText("Speed");
		speedPanel.contentLabel.setText(Integer.toString(regiment.totalSpeed));

		rangePanel.titleLabel.setText("Range");
		rangePanel.contentLabel.setText(Integer.toString(regiment.totalRange));

		missilePanel.titleLabel.setText("Missile");
		missilePanel.contentLabel.setText(Integer.toString(regiment.totalMissile));		

	}

}
