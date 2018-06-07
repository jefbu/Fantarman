package main.graphics;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.entity.armies.Army;
import main.entity.armies.ChiDestroyers;
import main.entity.armies.Espequr;
import main.entity.armies.Metropolitans;
import main.entity.armies.MulticulturalSociety;
import main.entity.armies.Pickles;
import main.entity.armies.Skylords;
import main.entity.armies.TerribleTerquits;
import main.entity.armies.Wanmen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class GameStartScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	public GameStartScreen(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(width, height / 10));
		titlePanel.setBackground(Colors.vlblue);
		JLabel label = new JLabel("Choose your Army");
		label.setForeground(Colors.dblue);
		label.setFont(new Font("garamond", Font.BOLD, 48));
		titlePanel.add(label);
		add(titlePanel);

		JPanel emptyLeftPanel = new JPanel();
		emptyLeftPanel.setPreferredSize(new Dimension(width / 10, height * 8 / 10));
		emptyLeftPanel.setBackground(Colors.vlblue);
		add(emptyLeftPanel);

		JPanel centrePanel = new JPanel();
		centrePanel.setPreferredSize(new Dimension(width * 8 / 10, height * 8 / 10));
		centrePanel.setBackground(Colors.vlblue);
		centrePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(centrePanel);

		ImageLoader imageLoader = new ImageLoader();

		JPanel pikninPanel = new JPanel();
		pikninPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		pikninPanel.setBackground(Colors.vlblue);
		centrePanel.add(pikninPanel);

		JButton pikninButton = new JButton("Piknin Pickles");
		pikninButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		pikninButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		pikninButton.setOpaque(false);
		pikninButton.setContentAreaFilled(false);
		pikninButton.setBorder(null);
		pikninButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/PikninPickles.png", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		pikninButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Pickles();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		pikninPanel.add(pikninButton);

		JPanel pikninTitlePanel = new JPanel();
		pikninTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		pikninTitlePanel.setBackground(Colors.vlblue);
		pikninPanel.add(pikninTitlePanel);

		JLabel pikninTitleLabel = new JLabel();
		pikninTitleLabel.setText("Piknin Pickles");
		pikninTitlePanel.add(pikninTitleLabel);

		JPanel terquitPanel = new JPanel();
		terquitPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		terquitPanel.setBackground(Colors.vlblue);
		centrePanel.add(terquitPanel);

		JButton terquitButton = new JButton("Terrible Terquits");
		terquitButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		terquitButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		terquitButton.setOpaque(false);
		terquitButton.setContentAreaFilled(false);
		terquitButton.setBorder(null);
		terquitButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Terquits.png", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		terquitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new TerribleTerquits();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		terquitPanel.add(terquitButton);
		
		JPanel terquitTitlePanel = new JPanel();
		terquitTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		terquitTitlePanel.setBackground(Colors.vlblue);
		terquitPanel.add(terquitTitlePanel);

		JLabel terquitTitleLabel = new JLabel();
		terquitTitleLabel.setText("Terrible Terquits");
		terquitTitlePanel.add(terquitTitleLabel);

		JPanel wanmenPanel = new JPanel();
		wanmenPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		wanmenPanel.setBackground(Colors.vlblue);
		centrePanel.add(wanmenPanel);

		JButton wanmenButton = new JButton("Wanted Wanmen");
		wanmenButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		wanmenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Wanmen();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		wanmenPanel.add(wanmenButton);
		
		JPanel wanmenTitlePanel = new JPanel();
		wanmenTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		wanmenTitlePanel.setBackground(Colors.vlblue);
		wanmenPanel.add(wanmenTitlePanel);

		JLabel wanmenTitleLabel = new JLabel();
		wanmenTitleLabel.setText("Wanted Wanmen");
		wanmenTitlePanel.add(wanmenTitleLabel);

		JPanel skylordsPanel = new JPanel();
		skylordsPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		skylordsPanel.setBackground(Colors.vlblue);
		centrePanel.add(skylordsPanel);

		JButton skylordsButton = new JButton("Skylords");
		skylordsButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		skylordsButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		skylordsButton.setOpaque(false);
		skylordsButton.setContentAreaFilled(false);
		skylordsButton.setBorder(null);
		skylordsButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Skylords.png", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		skylordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Skylords();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		skylordsPanel.add(skylordsButton);
		
		JPanel skylordsTitlePanel = new JPanel();
		skylordsTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		skylordsTitlePanel.setBackground(Colors.vlblue);
		skylordsPanel.add(skylordsTitlePanel);

		JLabel skylordsTitleLabel = new JLabel();
		skylordsTitleLabel.setText("Skylords");
		skylordsTitlePanel.add(skylordsTitleLabel);

		JPanel espequrPanel = new JPanel();
		espequrPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		espequrPanel.setBackground(Colors.vlblue);
		centrePanel.add(espequrPanel);

		JButton espequrButton = new JButton("Espequr");
		espequrButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		espequrButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		espequrButton.setOpaque(false);
		espequrButton.setContentAreaFilled(false);
		espequrButton.setBorder(null);
		espequrButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Espequr.png", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		espequrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Espequr();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		espequrPanel.add(espequrButton);
		
		JPanel espequrTitlePanel = new JPanel();
		espequrTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		espequrTitlePanel.setBackground(Colors.vlblue);
		espequrPanel.add(espequrTitlePanel);

		JLabel espequrTitleLabel = new JLabel();
		espequrTitleLabel.setText("Piknin Pickles");
		espequrTitlePanel.add(espequrTitleLabel);

		JPanel chiDestroyersPanel = new JPanel();
		chiDestroyersPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		chiDestroyersPanel.setBackground(Colors.vlblue);
		centrePanel.add(chiDestroyersPanel);

		JButton chiDestroyersButton = new JButton("Chi Destroyers");
		chiDestroyersButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		chiDestroyersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new ChiDestroyers();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		chiDestroyersPanel.add(chiDestroyersButton);
		
		JPanel chiDestroyersTitlePanel = new JPanel();
		chiDestroyersTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		chiDestroyersTitlePanel.setBackground(Colors.vlblue);
		chiDestroyersPanel.add(chiDestroyersTitlePanel);

		JLabel chiDestroyersTitleLabel = new JLabel();
		chiDestroyersTitleLabel.setText("Chi Destroyers");
		chiDestroyersTitlePanel.add(chiDestroyersTitleLabel);

		JPanel metropolitansPanel = new JPanel();
		metropolitansPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		metropolitansPanel.setBackground(Colors.vlblue);
		centrePanel.add(metropolitansPanel);

		JButton metropolitansButton = new JButton("Metropolitans");
		metropolitansButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		metropolitansButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Metropolitans();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		metropolitansPanel.add(metropolitansButton);
		
		JPanel metropolitansTitlePanel = new JPanel();
		metropolitansTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		metropolitansTitlePanel.setBackground(Colors.vlblue);
		metropolitansPanel.add(metropolitansTitlePanel);

		JLabel metropolitansTitleLabel = new JLabel();
		metropolitansTitleLabel.setText("Metropolitans");
		metropolitansTitlePanel.add(metropolitansTitleLabel);

		JPanel multiculturalSocietyPanel = new JPanel();
		multiculturalSocietyPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		multiculturalSocietyPanel.setBackground(Colors.vlblue);
		centrePanel.add(multiculturalSocietyPanel);

		JButton multiculturalSocietyButton = new JButton("Multicultural Society");
		multiculturalSocietyButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		multiculturalSocietyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new MulticulturalSociety();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		multiculturalSocietyPanel.add(multiculturalSocietyButton);
		
		JPanel multiculturalSocietyTitlePanel = new JPanel();
		multiculturalSocietyTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		multiculturalSocietyTitlePanel.setBackground(Colors.vlblue);
		multiculturalSocietyPanel.add(multiculturalSocietyTitlePanel);

		JLabel multiculturalSocietyTitleLabel = new JLabel();
		multiculturalSocietyTitleLabel.setText("Multicultural Society");
		multiculturalSocietyTitlePanel.add(multiculturalSocietyTitleLabel);

	}

	public void createLeague(Army army) {

		ArrayList<Army> armies = new ArrayList<Army>();

		armies.add(Main.yourArmy);

		if (Main.yourArmy.name != "Chi Destroyers")
			armies.add(new ChiDestroyers());
		if (Main.yourArmy.name != "Metropolitans")
			armies.add(new Metropolitans());
		if (Main.yourArmy.name != "Multicultural Society")
			armies.add(new MulticulturalSociety());
		if (Main.yourArmy.name != "Piknin Pickles")
			armies.add(new Pickles());
		if (Main.yourArmy.name != "Espequr")
			armies.add(new Espequr());
		if (Main.yourArmy.name != "Skylords")
			armies.add(new Skylords());
		if (Main.yourArmy.name != "Terrible Terquits")
			armies.add(new TerribleTerquits());
		if (Main.yourArmy.name != "Wanted Wanmen")
			armies.add(new Wanmen());

		Main.league.populateLeague(armies);
		Main.league.createCalendar();

	}

}
