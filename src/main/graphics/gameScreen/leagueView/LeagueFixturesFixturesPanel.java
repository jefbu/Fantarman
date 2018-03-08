package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.utility.Colors;

public class LeagueFixturesFixturesPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	
	ContentPanel matchDayPanel;
	ContentPanel matchupsPanel;
	LabeledPanel matchDayLabeledPanel;
	
	ArrayList<MatchupRowPanel> matchupRowPanels;
	
	public LeagueFixturesFixturesPanel(int width, int height, Colour colour, FlowLayout flowLayout) {

		super(width, height, colour, flowLayout);
		
		matchupRowPanels = new ArrayList<MatchupRowPanel>(); 

		matchDayPanel = new ContentPanel(width / 4, height / 4, Colour.DBLUE,
				new FlowLayout(FlowLayout.CENTER, 0, height / 30));
		
		matchDayLabeledPanel = new LabeledPanel(width / 10, height / 10);
		matchDayPanel.insidePanel.add(matchDayLabeledPanel);
		
		insidePanel.add(matchDayPanel);

		matchupsPanel = new ContentPanel(width * 4 / 5, height * 2 / 3, Colour.DBLUE,
				new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		for (int i = 0; i < 4; i++) {
			Random random = new Random();
			MatchupRowPanel matchupRowPanel = new MatchupRowPanel(width * 4 / 5, height / 7, i);
			matchupRowPanel.setBackground(new Color(random.nextInt(255), 0, 100));
			matchupRowPanels.add(matchupRowPanel);
		}
		
		for (MatchupRowPanel panel: matchupRowPanels) {
			matchupsPanel.insidePanel.add(panel);
		}
		
		insidePanel.add(matchupsPanel);

	}
	
	public void fillLeagueFixturesFixturesPanel(int calendarDay) {
		
		int displayDate = calendarDay + 1;
		matchDayLabeledPanel.label.setForeground(Colors.vlred);
		matchDayLabeledPanel.setBackground(Colors.dblue);
		matchDayLabeledPanel.label.setText("Match Day: " + displayDate);
		
		for (MatchupRowPanel panel: matchupRowPanels) {
			panel.fillMatchupRowPanel(calendarDay);
		}
		
		
		
		
	}

}
