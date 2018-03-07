package main.graphics.gameScreen.leagueView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.components.LabeledPanel;
import main.utility.Colors;

public class MatchupRowPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	LabeledPanel firstArmyPanel;
	LabeledPanel secondArmyPanel;
	LabeledPanel resultPanel;
	int index;

	public MatchupRowPanel(int width, int height, int index) {

		super();
		this.index = index;
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		firstArmyPanel = new LabeledPanel(width * 4 / 10, height);
		firstArmyPanel.setBackground(Colors.blue);
		add(firstArmyPanel);

		secondArmyPanel = new LabeledPanel(width * 4 / 10, height);
		secondArmyPanel.setBackground(Colors.dgreen);
		add(secondArmyPanel);

		resultPanel = new LabeledPanel(width * 2 / 10, height);
		resultPanel.setBackground(Colors.emptyPanelColor);
		add(resultPanel);

	}

	public void fillMatchupRowPanel() {
		
		firstArmyPanel.label
				.setText(Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups.get(index).army1.name);
		
		secondArmyPanel.label
		.setText(Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups.get(index).army2.name);

		
	}

}
