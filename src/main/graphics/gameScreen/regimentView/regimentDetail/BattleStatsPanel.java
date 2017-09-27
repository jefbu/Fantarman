package main.graphics.gameScreen.regimentView.regimentDetail;

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

	public BattleStatsPanel(int width, int height, Colour colour, FlowLayout flowLayout) {

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

		lifePanel.titlePanel.setPreferredSize(
				new Dimension(lifePanel.getWidth() * (regiment.life * 2) / 100, lifePanel.getHeight()));
		lifePanel.contentPanel.setPreferredSize(new Dimension(lifePanel.getWidth() * (100 - regiment.life * 2) / 100,
				lifePanel.contentPanel.getHeight()));
		lifePanel.titleLabel.setText("Life");
		lifePanel.contentLabel.setText(Integer.toString(regiment.life));
		
		moralePanel.titlePanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (regiment.morale) / 100, moralePanel.getHeight()));
		moralePanel.contentPanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (100 - regiment.morale) / 100, moralePanel.getHeight()));
		moralePanel.titleLabel.setText("Morale");
		moralePanel.contentLabel.setText(Integer.toString(regiment.morale));
		
		movePanel.titlePanel.setPreferredSize(
				new Dimension(movePanel.getWidth() * (regiment.move) / 10, movePanel.getHeight()));
		movePanel.contentPanel.setPreferredSize(
				new Dimension(movePanel.getWidth() * (10 - regiment.move) / 10, movePanel.getHeight()));
		movePanel.titleLabel.setText("Move");
		movePanel.contentLabel.setText(Integer.toString(regiment.move));
		
		runPanel.titlePanel.setPreferredSize(
				new Dimension(runPanel.getWidth() * (regiment.run) / 10, runPanel.getHeight()));
		runPanel.contentPanel.setPreferredSize(
				new Dimension(runPanel.getWidth() * (10 - regiment.run) / 10, runPanel.getHeight()));
		runPanel.titleLabel.setText("Run");
		runPanel.contentLabel.setText(Integer.toString(regiment.run));
		
		attackPanel.titlePanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (regiment.attack) / 100, attackPanel.getHeight()));
		attackPanel.contentPanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (100 - regiment.attack) / 100, attackPanel.getHeight()));
		attackPanel.titleLabel.setText("Attack");
		attackPanel.contentLabel.setText(Integer.toString(regiment.attack));
		
		defencePanel.titlePanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (regiment.defence) / 100, defencePanel.getHeight()));
		defencePanel.contentPanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (100 - regiment.defence) / 100, defencePanel.getHeight()));
		defencePanel.titleLabel.setText("Defence");
		defencePanel.contentLabel.setText(Integer.toString(regiment.defence));
		
		chargePanel.titlePanel.setPreferredSize(
				new Dimension(chargePanel.getWidth() * (regiment.charge * 2) / 100, chargePanel.getHeight()));
		chargePanel.contentPanel.setPreferredSize(new Dimension(chargePanel.getWidth() * (100 - regiment.charge * 2) / 100,
				chargePanel.contentPanel.getHeight()));
		chargePanel.titleLabel.setText("Charge");
		chargePanel.contentLabel.setText(Integer.toString(regiment.charge));
		
		speedPanel.titlePanel.setPreferredSize(
				new Dimension(speedPanel.getWidth() * (regiment.speed * 4) / 100, speedPanel.getHeight()));
		speedPanel.contentPanel.setPreferredSize(new Dimension(speedPanel.getWidth() * (100 - regiment.speed * 4) / 100,
				speedPanel.contentPanel.getHeight()));
		speedPanel.titleLabel.setText("Speed");
		speedPanel.contentLabel.setText(Integer.toString(regiment.speed));
		
		rangePanel.titlePanel.setPreferredSize(
				new Dimension(rangePanel.getWidth() * (regiment.range * 4) / 100, rangePanel.getHeight()));
		rangePanel.contentPanel.setPreferredSize(new Dimension(rangePanel.getWidth() * (100 - regiment.range * 4) / 100,
				rangePanel.contentPanel.getHeight()));
		rangePanel.titleLabel.setText("Range");
		rangePanel.contentLabel.setText(Integer.toString(regiment.range));
				
		missilePanel.titlePanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (regiment.missile) / 100, missilePanel.getHeight()));
		missilePanel.contentPanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (100 - regiment.missile) / 100, missilePanel.getHeight()));
		missilePanel.titleLabel.setText("Missile");
		missilePanel.contentLabel.setText(Integer.toString(regiment.missile));
				
		
		

	}

}
