package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.utility.Colors;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public ArmyView armyView;
	public RegimentView regimentView;
	public HomeView homeView;
	public InfoView infoView;
	public LeagueView leagueView;
	public WikiView wikiView;


	public MainPanel(int width, int height) {

		super();

		Dimension gameSceneSize = new Dimension(width, height);
		setPreferredSize(gameSceneSize);
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		armyView = new ArmyView(width, height);
		add(armyView);
		
		regimentView = new RegimentView(width, height);
		add(regimentView);
		
		homeView = new HomeView(width, height);
		add(homeView);
		
		leagueView = new LeagueView(width, height);
		add(leagueView);
		
		infoView = new InfoView(width, height);
		add(infoView);
		
		wikiView = new WikiView(width, height);
		add(wikiView);
		

		


	}
	

}
