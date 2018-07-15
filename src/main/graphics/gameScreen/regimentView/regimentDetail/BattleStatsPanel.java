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

		lifePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		movePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		runPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		speedPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		moralePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		attackPanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		chargePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		defencePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		rangePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);
		missilePanel = new DoubleLabeledPanel((width - 20) / 2, (height - 20) / 5, 50, Colour.DBLUE);

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

		lifePanel.titlePanel.setPreferredSize(
				new Dimension(lifePanel.getWidth() * (regiment.totalLife * 2) / 100, lifePanel.getHeight()));
		lifePanel.contentPanel.setPreferredSize(new Dimension(lifePanel.getWidth() * (100 - regiment.totalLife * 2) / 100,
				lifePanel.contentPanel.getHeight()));
		lifePanel.titleLabel.setText("Life");
		lifePanel.contentLabel.setText(Integer.toString(regiment.totalLife));
		
		moralePanel.titlePanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (regiment.totalMorale) / 100, moralePanel.getHeight()));
		moralePanel.contentPanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (100 - regiment.totalMorale) / 100, moralePanel.getHeight()));
		moralePanel.titleLabel.setText("Morale");
		moralePanel.contentLabel.setText(Integer.toString(regiment.totalMorale));
		
		movePanel.titlePanel.setPreferredSize(
				new Dimension(movePanel.getWidth() * (regiment.totalMove) / 10, movePanel.getHeight()));
		movePanel.contentPanel.setPreferredSize(
				new Dimension(movePanel.getWidth() * (10 - regiment.totalMove) / 10, movePanel.getHeight()));
		movePanel.titleLabel.setText("Move");
		movePanel.contentLabel.setText(Integer.toString(regiment.totalMove));
		
		runPanel.titlePanel.setPreferredSize(
				new Dimension(runPanel.getWidth() * (regiment.totalRun) / 10, runPanel.getHeight()));
		runPanel.contentPanel.setPreferredSize(
				new Dimension(runPanel.getWidth() * (10 - regiment.totalRun) / 10, runPanel.getHeight()));
		runPanel.titleLabel.setText("Run");
		runPanel.contentLabel.setText(Integer.toString(regiment.totalRun));
		
		attackPanel.titlePanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (regiment.totalAttack) / 100, attackPanel.getHeight()));
		attackPanel.contentPanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (100 - regiment.totalAttack) / 100, attackPanel.getHeight()));
		attackPanel.titleLabel.setText("Attack");
		attackPanel.contentLabel.setText(Integer.toString(regiment.totalAttack));
		
		defencePanel.titlePanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (regiment.totalDefence) / 100, defencePanel.getHeight()));
		defencePanel.contentPanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (100 - regiment.totalDefence) / 100, defencePanel.getHeight()));
		defencePanel.titleLabel.setText("Defence");
		defencePanel.contentLabel.setText(Integer.toString(regiment.totalDefence));
		
		chargePanel.titlePanel.setPreferredSize(
				new Dimension(chargePanel.getWidth() * (regiment.totalCharge * 2) / 100, chargePanel.getHeight()));
		chargePanel.contentPanel.setPreferredSize(new Dimension(chargePanel.getWidth() * (100 - regiment.totalCharge * 2) / 100,
				chargePanel.contentPanel.getHeight()));
		chargePanel.titleLabel.setText("Charge");
		chargePanel.contentLabel.setText(Integer.toString(regiment.totalCharge));
		
		speedPanel.titlePanel.setPreferredSize(
				new Dimension(speedPanel.getWidth() * (regiment.totalSpeed * 4) / 100, speedPanel.getHeight()));
		speedPanel.contentPanel.setPreferredSize(new Dimension(speedPanel.getWidth() * (100 - regiment.totalSpeed * 4) / 100,
				speedPanel.contentPanel.getHeight()));
		speedPanel.titleLabel.setText("Speed");
		speedPanel.contentLabel.setText(Integer.toString(regiment.totalSpeed));
		
		rangePanel.titlePanel.setPreferredSize(
				new Dimension(rangePanel.getWidth() * (regiment.totalRange * 4) / 100, rangePanel.getHeight()));
		rangePanel.contentPanel.setPreferredSize(new Dimension(rangePanel.getWidth() * (100 - regiment.totalRange * 4) / 100,
				rangePanel.contentPanel.getHeight()));
		rangePanel.titleLabel.setText("Range");
		rangePanel.contentLabel.setText(Integer.toString(regiment.totalRange));
				
		missilePanel.titlePanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (regiment.totalMissile) / 100, missilePanel.getHeight()));
		missilePanel.contentPanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (100 - regiment.totalMissile) / 100, missilePanel.getHeight()));
		missilePanel.titleLabel.setText("Missile");
		missilePanel.contentLabel.setText(Integer.toString(regiment.totalMissile));
				
		
		

	}

}
