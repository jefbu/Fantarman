package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.battle.Battle;
import main.graphics.Screen;

public class ButtonPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JButton exitButton;

	public ButtonPanel(int roundedWidth, int unroundedHeight) {
		
		super();
		
		int roundedHeight = unroundedHeight * 25 / 100 + 1;
		int width = roundedWidth;
		
		setPreferredSize(new Dimension(width, roundedHeight));
		setBackground(new Color(40, 50, 40));
		
		
		exitButton = new JButton();
		exitButton.setPreferredSize(new Dimension(50, 50));
		exitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {

				Screen.gameScreen.setVisible(false);
				Screen.battleScreen.setVisible(true);
				Main.battles.add(new Battle());
				//Main.screen.dispose();
				//if (Screen.gameScreen.mainPanel.armyView.isVisible()) {
				//Screen.gameScreen.mainPanel.armyView.setVisible(false);
				//}
				//else Main.screen.dispose();
			}
			
		});
		
		add(exitButton);
		
	}

}
