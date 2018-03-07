package main.graphics.gameScreen.leagueView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class LeagueFixturesPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	LeagueFixturesFixturesPanel fixturesPanel;

	public LeagueFixturesPanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, width * 5 / 100, height / 10));
		setBackground(Colors.vlblue);
		
		JButton previousButton = new JButton();
		previousButton.setPreferredSize(new Dimension(width * 5 / 100, height / 10));
		add(previousButton);

		fixturesPanel = new LeagueFixturesFixturesPanel(width * 70 / 100, height * 8 / 10, Colour.DBLUE,
				new FlowLayout(FlowLayout.LEFT, width / 20, height / 30));
		
		add(fixturesPanel);
		
		JButton nextButton = new JButton();
		nextButton.setPreferredSize(new Dimension(width * 5 / 100, height / 10));
		add(nextButton);
		

	}

	public void fillFixturesPanel() {
		
		fixturesPanel.fillLeagueFixturesFixturesPanel();

	}

}
