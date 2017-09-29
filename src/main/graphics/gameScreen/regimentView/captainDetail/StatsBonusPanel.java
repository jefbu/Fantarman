package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;

public class StatsBonusPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	DoubleLabeledPanel speedPanel;
	DoubleLabeledPanel moralePanel;
	DoubleLabeledPanel attackPanel;
	DoubleLabeledPanel chargePanel;
	DoubleLabeledPanel defencePanel;
	DoubleLabeledPanel missilePanel;

	public StatsBonusPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		attackPanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(attackPanel);
		
		chargePanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(chargePanel);
		
		defencePanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(defencePanel);
		
		moralePanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(moralePanel);
		
		missilePanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(missilePanel);
		
		speedPanel = new DoubleLabeledPanel(width, height / 6 - 3, 50, Colour.DBLUE);
		insidePanel.add(speedPanel);
		
	}
	
	public void fillStatsBonusPanel(Regiment regiment) {
		
		attackPanel.titlePanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (regiment.captain.attackBonus) / 10, attackPanel.getHeight()));
		attackPanel.contentPanel.setPreferredSize(
				new Dimension(attackPanel.getWidth() * (10 - regiment.captain.attackBonus) / 10, attackPanel.getHeight()));
		attackPanel.titleLabel.setText("Attack");
		attackPanel.contentLabel.setText(Integer.toString(regiment.captain.attackBonus));
		
		chargePanel.titlePanel.setPreferredSize(
				new Dimension(chargePanel.getWidth() * (regiment.captain.chargeBonus) / 10, chargePanel.getHeight()));
		chargePanel.contentPanel.setPreferredSize(
				new Dimension(chargePanel.getWidth() * (10 - regiment.captain.chargeBonus) / 10, chargePanel.getHeight()));
		chargePanel.titleLabel.setText("charge");
		chargePanel.contentLabel.setText(Integer.toString(regiment.captain.chargeBonus));
		
		defencePanel.titlePanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (regiment.captain.defenceBonus) / 10, defencePanel.getHeight()));
		defencePanel.contentPanel.setPreferredSize(
				new Dimension(defencePanel.getWidth() * (10 - regiment.captain.defenceBonus) / 10, defencePanel.getHeight()));
		defencePanel.titleLabel.setText("defence");
		defencePanel.contentLabel.setText(Integer.toString(regiment.captain.defenceBonus));
		
		moralePanel.titlePanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (regiment.captain.moraleBonus) / 10, moralePanel.getHeight()));
		moralePanel.contentPanel.setPreferredSize(
				new Dimension(moralePanel.getWidth() * (10 - regiment.captain.moraleBonus) / 10, moralePanel.getHeight()));
		moralePanel.titleLabel.setText("morale");
		moralePanel.contentLabel.setText(Integer.toString(regiment.captain.moraleBonus));
		
		missilePanel.titlePanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (regiment.captain.missileBonus) / 10, missilePanel.getHeight()));
		missilePanel.contentPanel.setPreferredSize(
				new Dimension(missilePanel.getWidth() * (10 - regiment.captain.missileBonus) / 10, missilePanel.getHeight()));
		missilePanel.titleLabel.setText("missile");
		missilePanel.contentLabel.setText(Integer.toString(regiment.captain.missileBonus));
		
		speedPanel.titlePanel.setPreferredSize(
				new Dimension(speedPanel.getWidth() * (regiment.captain.speedBonus) / 10, speedPanel.getHeight()));
		speedPanel.contentPanel.setPreferredSize(
				new Dimension(speedPanel.getWidth() * (10 - regiment.captain.speedBonus) / 10, speedPanel.getHeight()));
		speedPanel.titleLabel.setText("speed");
		speedPanel.contentLabel.setText(Integer.toString(regiment.captain.speedBonus));
		
	}

}
