package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.Color;
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

	public StatsBonusPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		attackPanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(attackPanel);
		
		chargePanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(chargePanel);
		
		defencePanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(defencePanel);
		
		moralePanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(moralePanel);
		
		missilePanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(missilePanel);
		
		speedPanel = new DoubleLabeledPanel(width, height / 6 - 3, 40, Colour.LGREY);
		insidePanel.add(speedPanel);
		
	}
	
	public void fillStatsBonusPanel(Regiment regiment) {
		
		attackPanel.titleLabel.setText("Attack");
		attackPanel.contentLabel.setText(Integer.toString(regiment.captain.attackBonus));

		chargePanel.titleLabel.setText("charge");
		chargePanel.contentLabel.setText(Integer.toString(regiment.captain.chargeBonus));
	
		defencePanel.titleLabel.setText("defence");
		defencePanel.contentLabel.setText(Integer.toString(regiment.captain.defenceBonus));

		moralePanel.titleLabel.setText("morale");
		moralePanel.contentLabel.setText(Integer.toString(regiment.captain.moraleBonus));
		
		missilePanel.titleLabel.setText("missile");
		missilePanel.contentLabel.setText(Integer.toString(regiment.captain.missileBonus));

		speedPanel.titleLabel.setText("speed");
		speedPanel.contentLabel.setText(Integer.toString(regiment.captain.speedBonus));
		
	}

}
