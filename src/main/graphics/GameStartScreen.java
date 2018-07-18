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
		setBackground(Colors.backgroundOrange);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(width, height / 10));
		titlePanel.setBackground(Colors.backgroundOrange);
		JLabel label = new JLabel("Choose your Army");
		label.setForeground(Colors.dblue);
		label.setFont(new Font("garamond", Font.BOLD, 48));
		titlePanel.add(label);
		add(titlePanel);

		JPanel emptyLeftPanel = new JPanel();
		emptyLeftPanel.setPreferredSize(new Dimension(width / 10, height * 8 / 10));
		emptyLeftPanel.setBackground(Colors.backgroundOrange);
		add(emptyLeftPanel);

		JPanel centrePanel = new JPanel();
		centrePanel.setPreferredSize(new Dimension(width * 8 / 10, height * 8 / 10));
		centrePanel.setBackground(Colors.backgroundOrange);
		centrePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(centrePanel);

		ImageLoader imageLoader = new ImageLoader();

		JPanel pikninPanel = new JPanel();
		pikninPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		pikninPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(pikninPanel);

		JButton pikninButton = new JButton("Piknin Pickles");
		pikninButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		pikninButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		pikninButton.setOpaque(false);
		pikninButton.setContentAreaFilled(false);
		pikninButton.setBorder(null);
		pikninButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Piknin.jpg", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		pikninButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Pickles();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		pikninPanel.add(pikninButton);

		JPanel pikninTitlePanel = new JPanel();
		pikninTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		pikninTitlePanel.setBackground(Colors.backgroundOrange);
		pikninPanel.add(pikninTitlePanel);

		JLabel pikninTitleLabel = new JLabel();
		pikninTitleLabel.setText("Piknin");
		pikninTitlePanel.add(pikninTitleLabel);

		JPanel terquitPanel = new JPanel();
		terquitPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		terquitPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(terquitPanel);

		JButton terquitButton = new JButton("Terrible Terquits");
		terquitButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		terquitButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		terquitButton.setOpaque(false);
		terquitButton.setContentAreaFilled(false);
		terquitButton.setBorder(null);
		terquitButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Terquits.jpg", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		terquitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new TerribleTerquits();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		terquitPanel.add(terquitButton);

		JPanel terquitTitlePanel = new JPanel();
		terquitTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		terquitTitlePanel.setBackground(Colors.backgroundOrange);
		terquitPanel.add(terquitTitlePanel);

		JLabel terquitTitleLabel = new JLabel();
		terquitTitleLabel.setText("Terquits");
		terquitTitlePanel.add(terquitTitleLabel);

		JPanel wanmenPanel = new JPanel();
		wanmenPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		wanmenPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(wanmenPanel);

		JButton wanmenButton = new JButton("Wanmen");
		wanmenButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		wanmenButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		wanmenButton.setOpaque(false);
		wanmenButton.setContentAreaFilled(false);
		wanmenButton.setBorder(null);
		wanmenButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Wanmen.jpg", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		wanmenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Wanmen();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		wanmenPanel.add(wanmenButton);

		JPanel wanmenTitlePanel = new JPanel();
		wanmenTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		wanmenTitlePanel.setBackground(Colors.backgroundOrange);
		wanmenPanel.add(wanmenTitlePanel);

		JLabel wanmenTitleLabel = new JLabel();
		wanmenTitleLabel.setText("Wanmen");
		wanmenTitlePanel.add(wanmenTitleLabel);

		JPanel skylordsPanel = new JPanel();
		skylordsPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		skylordsPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(skylordsPanel);

		JButton skylordsButton = new JButton("Skylords");
		skylordsButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		skylordsButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		skylordsButton.setOpaque(false);
		skylordsButton.setContentAreaFilled(false);
		skylordsButton.setBorder(null);
		skylordsButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Skylords.jpg", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		skylordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Skylords();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		skylordsPanel.add(skylordsButton);

		JPanel skylordsTitlePanel = new JPanel();
		skylordsTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		skylordsTitlePanel.setBackground(Colors.backgroundOrange);
		skylordsPanel.add(skylordsTitlePanel);

		JLabel skylordsTitleLabel = new JLabel();
		skylordsTitleLabel.setText("Skylords");
		skylordsTitlePanel.add(skylordsTitleLabel);

		JPanel espequrPanel = new JPanel();
		espequrPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		espequrPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(espequrPanel);

		JButton espequrButton = new JButton("Espequr");
		espequrButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		espequrButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		espequrButton.setOpaque(false);
		espequrButton.setContentAreaFilled(false);
		espequrButton.setBorder(null);
		espequrButton.setIcon(
				imageLoader.loadImageIcon("/ArmyLogo/Espequr.jpg", width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		espequrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Espequr();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		espequrPanel.add(espequrButton);

		JPanel espequrTitlePanel = new JPanel();
		espequrTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		espequrTitlePanel.setBackground(Colors.backgroundOrange);
		espequrPanel.add(espequrTitlePanel);

		JLabel espequrTitleLabel = new JLabel();
		espequrTitleLabel.setText("Espequr");
		espequrTitlePanel.add(espequrTitleLabel);

		JPanel chiDestroyersPanel = new JPanel();
		chiDestroyersPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		chiDestroyersPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(chiDestroyersPanel);

		JButton chiDestroyersButton = new JButton("Chi");
		chiDestroyersButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		chiDestroyersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new ChiDestroyers();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		chiDestroyersPanel.add(chiDestroyersButton);

		JPanel chiDestroyersTitlePanel = new JPanel();
		chiDestroyersTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		chiDestroyersButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		chiDestroyersButton.setOpaque(false);
		chiDestroyersButton.setContentAreaFilled(false);
		chiDestroyersButton.setBorder(null);
		chiDestroyersButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Chi.jpg", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		chiDestroyersTitlePanel.setBackground(Colors.backgroundOrange);
		chiDestroyersPanel.add(chiDestroyersTitlePanel);

		JLabel chiDestroyersTitleLabel = new JLabel();
		chiDestroyersTitleLabel.setText("Chi");
		chiDestroyersTitlePanel.add(chiDestroyersTitleLabel);

		JPanel metropolitansPanel = new JPanel();
		metropolitansPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		metropolitansPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(metropolitansPanel);

		JButton metropolitansButton = new JButton("Metropolitans");
		metropolitansButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		metropolitansButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		metropolitansButton.setOpaque(false);
		metropolitansButton.setContentAreaFilled(false);
		metropolitansButton.setBorder(null);
		metropolitansButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Metropolitans.jpg", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		metropolitansButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Metropolitans();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		metropolitansPanel.add(metropolitansButton);

		JPanel metropolitansTitlePanel = new JPanel();
		metropolitansTitlePanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		metropolitansTitlePanel.setBackground(Colors.backgroundOrange);
		metropolitansPanel.add(metropolitansTitlePanel);

		JLabel metropolitansTitleLabel = new JLabel();
		metropolitansTitleLabel.setText("Metropolitans");
		metropolitansTitlePanel.add(metropolitansTitleLabel);

		JPanel multiculturalSocietyPanel = new JPanel();
		multiculturalSocietyPanel.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2));
		multiculturalSocietyPanel.setBackground(Colors.backgroundOrange);
		centrePanel.add(multiculturalSocietyPanel);

		JButton multiculturalSocietyButton = new JButton("Society");
		multiculturalSocietyButton.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 8 / 10));
		multiculturalSocietyButton.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		multiculturalSocietyButton.setOpaque(false);
		multiculturalSocietyButton.setContentAreaFilled(false);
		multiculturalSocietyButton.setBorder(null);
		multiculturalSocietyButton.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Society.jpg", width * 8 / 10 / 4,
				height * 8 / 10 / 2 * 8 / 10));
		multiculturalSocietyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new MulticulturalSociety();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				Screen.gameScreen.setVisible(true);
			}
		});
		multiculturalSocietyPanel.add(multiculturalSocietyButton);

		JPanel multiculturalSocietyTitlePanel = new JPanel();
		multiculturalSocietyTitlePanel
				.setPreferredSize(new Dimension(width * 8 / 10 / 4, height * 8 / 10 / 2 * 2 / 10));
		multiculturalSocietyTitlePanel.setBackground(Colors.backgroundOrange);
		multiculturalSocietyPanel.add(multiculturalSocietyTitlePanel);

		JLabel multiculturalSocietyTitleLabel = new JLabel();
		multiculturalSocietyTitleLabel.setText("Multicultural Society");
		multiculturalSocietyTitlePanel.add(multiculturalSocietyTitleLabel);

	}

	public void createLeague(Army army) {

		ArrayList<Army> armies = new ArrayList<Army>();

		armies.add(Main.yourArmy);

		if (Main.yourArmy.name != "Chi")
			armies.add(new ChiDestroyers());
		if (Main.yourArmy.name != "Metropolitans")
			armies.add(new Metropolitans());
		if (Main.yourArmy.name != "Society")
			armies.add(new MulticulturalSociety());
		if (Main.yourArmy.name != "Piknin")
			armies.add(new Pickles());
		if (Main.yourArmy.name != "Espequr")
			armies.add(new Espequr());
		if (Main.yourArmy.name != "Skylords")
			armies.add(new Skylords());
		if (Main.yourArmy.name != "Terquits")
			armies.add(new TerribleTerquits());
		if (Main.yourArmy.name != "Wanmen")
			armies.add(new Wanmen());

		Main.league.populateLeague(armies);
		Main.league.createCalendar();

	}

}
