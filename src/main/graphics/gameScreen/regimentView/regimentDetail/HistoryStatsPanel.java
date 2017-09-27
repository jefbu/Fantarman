package main.graphics.gameScreen.regimentView.regimentDetail;

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

	public HistoryStatsPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		foughtPanel = new DoubleLabeledPanel((width - 12) / 2, (height - 10) / 6, 70, Colour.LBLUE);
			foughtPanel.titleLabel.setText("Battles Fought");
		mvpPanel = new DoubleLabeledPanel((width - 12) / 2, (height - 10) / 6, 70, Colour.LBLUE);
			mvpPanel.titleLabel.setText("MVP Awards");
		killsPanel = new DoubleLabeledPanel((width - 12) / 2, (height - 10) / 6, 70, Colour.LGREEN);
			killsPanel.titleLabel.setText("Regiments Defeated");
		deathsPanel = new DoubleLabeledPanel((width - 12) / 2, (height - 10) / 6, 70, Colour.LRED);
			deathsPanel.titleLabel.setText("Times Defeated");
		
		insidePanel.add(foughtPanel);
		insidePanel.add(mvpPanel);
		insidePanel.add(killsPanel);
		insidePanel.add(deathsPanel);
		
	}
	
	public void fillHistoryStatsPanel(Regiment regiment) {
		
	}

}
