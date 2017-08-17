package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.BattleOrchestrator;

public class SpeedButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton slowestSpeedButton;
	public JButton slowerSpeedButton;
	public JButton startStopButton;
	public JButton fasterSpeedButton;
	public JButton fastestSpeedButton;
	
	private boolean paused;
	
	public SpeedButtonPanel(Dimension dimension) {
		
		super();
		
		paused = false;
		
		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 15 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		
		slowestSpeedButton = new JButton();
		slowestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(slowestSpeedButton);
		
			slowestSpeedButton.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					BattleOrchestrator.timer.setDelay(10000);
				}
			});
		
		slowerSpeedButton = new JButton();
		slowerSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(slowerSpeedButton);
		
			slowerSpeedButton.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					int currentDelay = BattleOrchestrator.timer.getDelay();
					if (currentDelay < 9701) BattleOrchestrator.timer.setDelay(currentDelay + 300);
				}
			});

		startStopButton = new JButton();
		startStopButton.setPreferredSize(new Dimension(width * 15 / 100, height - 10));
		add(startStopButton);
		
			startStopButton.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					if (paused) {
						BattleOrchestrator.timer.start();
						paused = false;
					}
					else if (!paused) {
						BattleOrchestrator.timer.stop();
						paused = true;
					}					
				}
			});

		fasterSpeedButton = new JButton();
		fasterSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(fasterSpeedButton);
		
			fasterSpeedButton.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					int currentDelay = BattleOrchestrator.timer.getDelay();
					if (currentDelay > 399) BattleOrchestrator.timer.setDelay(currentDelay - 300);
				}
			});
		
		fastestSpeedButton = new JButton();
		fastestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height - 10));
		add(fastestSpeedButton);
		
			fastestSpeedButton.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					BattleOrchestrator.timer.setDelay(100);
				}
			});
		
		
		
		
	}
	
	

}
