package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Color;
import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;

public class HistoryStatsPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	DoubleLabeledPanel killsPanel;
	DoubleLabeledPanel deathsPanel;
	DoubleLabeledPanel foughtPanel;
	DoubleLabeledPanel mvpPanel;

	public HistoryStatsPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		foughtPanel = new DoubleLabeledPanel((width - 12), (height - 10) / 4, 70, Colour.GREY);
			foughtPanel.titleLabel.setText("Battles Fought");
		mvpPanel = new DoubleLabeledPanel((width - 12), (height - 10) / 4, 70, Colour.GREY);
			mvpPanel.titleLabel.setText("MVP Awards");
		killsPanel = new DoubleLabeledPanel((width - 12), (height - 10) / 4, 70, Colour.GREY);
			killsPanel.titleLabel.setText("Regiments Defeated");
		deathsPanel = new DoubleLabeledPanel((width - 12), (height - 10) / 4, 70, Colour.GREY);
			deathsPanel.titleLabel.setText("Times Defeated");
		
		insidePanel.add(foughtPanel);
		insidePanel.add(mvpPanel);
		insidePanel.add(killsPanel);
		insidePanel.add(deathsPanel);
		
	}
	
	public void fillHistoryStatsPanel(Regiment regiment) {
		foughtPanel.contentLabel.setText(Integer.toString(regiment.battlesFought));
		mvpPanel.contentLabel.setText(Integer.toString(regiment.timesMVP));
		killsPanel.contentLabel.setText(Integer.toString(regiment.enemiesDefeated));
		deathsPanel.contentLabel.setText(Integer.toString(regiment.timesDefeated));
	}

}
