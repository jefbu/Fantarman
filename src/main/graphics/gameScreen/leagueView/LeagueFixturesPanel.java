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
		setBackground(Colors.backgroundOrange);
		

		fixturesPanel = new LeagueFixturesFixturesPanel(width * 70 / 100, height * 8 / 10, Colors.lorange,
				new FlowLayout(FlowLayout.LEFT, width / 20, height / 30));
		
		add(fixturesPanel);

	}

	public void fillFixturesPanel() {
		
		matchDay = Main.league.calendarDay;
		fixturesPanel.fillLeagueFixturesFixturesPanel(Main.league.calendarDay);

	}

}
