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
		firstArmyPanel.setBackground(Colors.lgrey);
		firstArmyPanel.label.setForeground(Colors.vdgrey);
		add(firstArmyPanel);

		LabeledPanel versusPanel = new LabeledPanel(width * 1 / 10, height);
		versusPanel.setBackground(Colors.lgrey);
		versusPanel.label.setForeground(Colors.vdgrey);
		versusPanel.label.setText("Vs");
		add(versusPanel);

		secondArmyPanel = new LabeledPanel(width * 4 / 10, height);
		secondArmyPanel.setBackground(Colors.lgrey);
		secondArmyPanel.label.setForeground(Colors.vdgrey);
		add(secondArmyPanel);

		resultPanel = new LabeledPanel(width * 1 / 10, height);
		resultPanel.setBackground(Colors.lgrey);
		resultPanel.label.setForeground(Colors.vdgrey);
		add(resultPanel);

	}

	public void fillMatchupRowPanel(int calendarDay) {

		firstArmyPanel.label.setText(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).army1.name);

		secondArmyPanel.label
				.setText(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).army2.name);

		if (Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).result != null) {
			resultPanel.label
					.setText(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).result.name());
		} else {
			resultPanel.label.setText("");
		}

	}

}
