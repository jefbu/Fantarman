package main.graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.entity.armies.Army;
import main.entity.armies.ChiDestroyers;
import main.entity.armies.Metropolitans;
import main.entity.armies.MulticulturalSociety;
import main.entity.armies.Pickles;
import main.entity.armies.SacredCrux;
import main.entity.armies.Skylords;
import main.entity.armies.TerribleTerquits;
import main.entity.armies.Wanmen;
import main.utility.Colors;

public class GameStartScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	public GameStartScreen(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		
		JLabel label = new JLabel("Choose your Army");
		add(label);
		
		JButton pikninButton = new JButton("Piknin Pickles");
		pikninButton.setPreferredSize(new Dimension(300, 150));
			pikninButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.yourArmy = new Pickles();
					createLeague(Main.yourArmy);
					setVisible(false);
					Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
					Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
					Screen.gameScreen.setVisible(true);
				}
			});
		add(pikninButton);
		
		JButton terquitButton = new JButton("Terrible Terquits");
		terquitButton.setPreferredSize(new Dimension(300, 150));
			terquitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.yourArmy = new TerribleTerquits();
					createLeague(Main.yourArmy);
					setVisible(false);
					Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
					Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
					Screen.gameScreen.setVisible(true);
				}
			});
		add(terquitButton);
		
		JButton wanmenButton = new JButton("Wanted Wanmen");
		wanmenButton.setPreferredSize(new Dimension(300, 150));
		wanmenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Wanmen();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(wanmenButton);	
	
		JButton skylordsButton = new JButton("Skylords");
		skylordsButton.setPreferredSize(new Dimension(300, 150));
		skylordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Skylords();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(skylordsButton);
		
		JButton sacredCruxButton = new JButton("Sacred Crux");
		sacredCruxButton.setPreferredSize(new Dimension(300, 150));
		sacredCruxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new SacredCrux();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(sacredCruxButton);
		
		
		JButton chiDestroyersButton = new JButton("Chi Destroyers");
		chiDestroyersButton.setPreferredSize(new Dimension(300, 150));
		chiDestroyersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new ChiDestroyers();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(chiDestroyersButton);
		
		JButton metropolitansButton = new JButton("Metropolitans");
		metropolitansButton.setPreferredSize(new Dimension(300, 150));
		metropolitansButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Metropolitans();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(metropolitansButton);
		
		JButton multiculturalSocietyButton = new JButton("Multicultural Society");
		multiculturalSocietyButton.setPreferredSize(new Dimension(300, 150));
		multiculturalSocietyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new MulticulturalSociety();
				createLeague(Main.yourArmy);
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats(Main.yourArmy);
				Screen.gameScreen.mainPanel.armyView.roleSelectionPanel.fillRoleSelectionPanel(Main.yourArmy);
				Screen.gameScreen.setVisible(true);
			}
		});
		add(multiculturalSocietyButton);
				
		
	}
	
	public void createLeague(Army army) {
		
		ArrayList<Army> armies = new ArrayList<Army>();
		
		armies.add(Main.yourArmy);
		
		if (Main.yourArmy.name != "Chi Destroyers") armies.add(new ChiDestroyers());
		if (Main.yourArmy.name != "Metropolitans") armies.add(new Metropolitans());
		if (Main.yourArmy.name != "Multicultural Society") armies.add(new MulticulturalSociety());
		if (Main.yourArmy.name != "Piknin Pickles") armies.add(new Pickles());
		if (Main.yourArmy.name != "Order of the Sacred Crux") armies.add(new SacredCrux());
		if (Main.yourArmy.name != "Skylords") armies.add(new Skylords());
		if (Main.yourArmy.name != "Terrible Terquits") armies.add(new TerribleTerquits());
		if (Main.yourArmy.name != "Wanted Wanmen") armies.add(new Wanmen());
		
		Main.league.populateLeague(armies);
		Main.league.createCalendar();
		
	}

}
