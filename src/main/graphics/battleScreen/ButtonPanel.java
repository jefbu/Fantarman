package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.battle.BattleOrchestrator;

public class ButtonPanel extends JPanel {
	

	private static final long serialVersionUID = 1L;
	public JButton exitButton;

	public ButtonPanel(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		
		int roundedHeight = battleScreenHeight * 2 / 10 + ((battleScreenHeight * 8 / 10)%48);
		int roundedWidth = battleScreenWidth * 1 / 10;
		
		setPreferredSize(new Dimension(roundedWidth, roundedHeight));
		setBackground(new Color(40, 50, 40));
		
		
		exitButton = new JButton();
		exitButton.setPreferredSize(new Dimension(50, 50));
		exitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				BattleOrchestrator.timer.stop();
				Main.screen.dispose();
			}
			
		});
		
		add(exitButton);
		
	}

}
