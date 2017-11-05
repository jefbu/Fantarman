package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.entity.armies.Pickles;
import main.entity.armies.TerribleTerquits;
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
		
		
	}

}
