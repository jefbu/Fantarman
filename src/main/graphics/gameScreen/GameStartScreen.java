package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.entity.armies.Pickles;
import main.entity.armies.SacredCrux;
import main.entity.armies.Skylords;
import main.entity.armies.TerribleTerquits;
import main.entity.armies.Wanmen;
import main.graphics.Screen;
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
					setVisible(false);
					Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats();
					Screen.gameScreen.setVisible(true);
				}
			});
		add(pikninButton);
		
		JButton terquitButton = new JButton("Terrible Terquits");
		terquitButton.setPreferredSize(new Dimension(300, 150));
			terquitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.yourArmy = new TerribleTerquits();
					setVisible(false);
					Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats();
					Screen.gameScreen.setVisible(true);
				}
			});
		add(terquitButton);
		
		JButton wanmenButton = new JButton("Wanted Wanmen");
		wanmenButton.setPreferredSize(new Dimension(300, 150));
		wanmenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Wanmen();
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats();
				Screen.gameScreen.setVisible(true);
			}
		});
		add(wanmenButton);	
	
		JButton skylordsButton = new JButton("Skylords");
		skylordsButton.setPreferredSize(new Dimension(300, 150));
		skylordsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new Skylords();
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats();
				Screen.gameScreen.setVisible(true);
			}
		});
		add(skylordsButton);
		
		JButton sacredCruxButton = new JButton("Skylords");
		sacredCruxButton.setPreferredSize(new Dimension(300, 150));
		sacredCruxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.yourArmy = new SacredCrux();
				setVisible(false);
				Screen.gameScreen.mainPanel.armyView.regimentListPanel.fillRegimentListPanelCombatStats();
				Screen.gameScreen.setVisible(true);
			}
		});
		add(sacredCruxButton);
		
		
	}

}
