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

		firstArmyPanel = new LabeledPanel(width * 40 / 100, height);
		firstArmyPanel.setBackground(Colors.lgrey);
		firstArmyPanel.label.setForeground(Colors.vdgrey);
		add(firstArmyPanel);

		LabeledPanel versusPanel = new LabeledPanel(width * 5 / 100, height);
		versusPanel.setBackground(Colors.lgrey);
		versusPanel.label.setForeground(Colors.vdgrey);
		versusPanel.label.setText("-");
		add(versusPanel);

		secondArmyPanel = new LabeledPanel(width * 40 / 100, height);
		secondArmyPanel.setBackground(Colors.lgrey);
		secondArmyPanel.label.setForeground(Colors.vdgrey);
		add(secondArmyPanel);

		resultPanel = new LabeledPanel(width * 15 / 100, height);
		resultPanel.setBackground(Colors.lgrey);
		resultPanel.label.setForeground(Colors.vdgrey);
		add(resultPanel);

	}

	public void fillMatchupRowPanel(int calendarDay) {

		firstArmyPanel.label.setText(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).army1.name);

		secondArmyPanel.label
				.setText(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).army2.name);

		if (Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).result != null) {
			switch(Main.league.calendar.calendarDays.get(calendarDay).matchups.get(index).result) {
			case D: resultPanel.label.setText("1-1"); break;
			case L: resultPanel.label.setText("0-2"); break;
			case W: resultPanel.label.setText("2-0"); break;
			case l: resultPanel.label.setText("0-1"); break;
			case w: resultPanel.label.setText("1-0"); break;
			default: break;
			}

		} else {
			resultPanel.label.setText("");
		}

	}

}
