package main.graphics.gameScreen.leagueView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.utility.Colors;
import main.utility.ImageLoader;

public class LeagueFixturesPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	LeagueFixturesFixturesPanel fixturesPanel;
	
	int matchDay;
	ImageLoader imageLoader;

	public LeagueFixturesPanel(int width, int height) {

		super();
		imageLoader = new ImageLoader();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, width * 3 / 100, height / 10));
		setBackground(Colors.vlblue);
		
		JButton previousButton = new JButton();
		previousButton.setPreferredSize(new Dimension(width * 9 / 100, height / 5));
		previousButton.setIcon(imageLoader.loadImageIcon("/icons/previousButton.png", width * 9 / 100, height / 5));
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (matchDay > 0) matchDay--;
				fixturesPanel.fillLeagueFixturesFixturesPanel(matchDay);
			}
		});
		add(previousButton);

		fixturesPanel = new LeagueFixturesFixturesPanel(width * 70 / 100, height * 8 / 10, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, width / 20, height / 30));
		
		add(fixturesPanel);
		
		JButton nextButton = new JButton();
		nextButton.setPreferredSize(new Dimension(width * 9 / 100, height / 5));
		nextButton.setIcon(imageLoader.loadImageIcon("/icons/nextButton.png", width * 9 /100, height / 5));
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (matchDay < Main.league.calendar.calendarDays.size() - 1) matchDay++;
				fixturesPanel.fillLeagueFixturesFixturesPanel(matchDay);
			}
		});
		add(nextButton);
		

	}

	public void fillFixturesPanel() {
		
		matchDay = Main.league.calendarDay;
		fixturesPanel.fillLeagueFixturesFixturesPanel(Main.league.calendarDay);

	}

}
