package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.battle.BattleOrchestrator;
import main.utility.ImageLoader;

public class SpeedButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton slowestSpeedButton;
	public JButton slowerSpeedButton;
	public JButton startStopButton;
	public JButton fasterSpeedButton;
	public JButton fastestSpeedButton;
	public JButton interveneButton;

	public static InterventionPopup interventionPopup;
	
	private ImageLoader imageLoader;

	private boolean paused;

	public SpeedButtonPanel(Dimension dimension) {

		super();

		paused = false;

		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 15 / 100;

		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		slowestSpeedButton = new JButton();
		slowestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height * 50 / 100));
		slowestSpeedButton
				.setIcon(imageLoader.loadImageIcon("/icons/slowestButton.png", width * 20 / 100, height * 50 / 100));
		add(slowestSpeedButton);

		slowestSpeedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BattleOrchestrator.timer.setDelay(5000);
			}
		});

		slowerSpeedButton = new JButton();
		slowerSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height * 50 / 100));
		slowerSpeedButton
				.setIcon(imageLoader.loadImageIcon("/icons/slowerButton.png", width * 20 / 100, height * 50 / 100));
		add(slowerSpeedButton);

		slowerSpeedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentDelay = BattleOrchestrator.timer.getDelay();
				if (currentDelay < 9701)
					BattleOrchestrator.timer.setDelay(3000);
			}
		});

		startStopButton = new JButton();
		startStopButton.setPreferredSize(new Dimension(width * 20 / 100, height * 50 / 100));
		startStopButton
				.setIcon(imageLoader.loadImageIcon("/icons/playButton.png", width * 20 / 100, height * 50 / 100));
		add(startStopButton);

		startStopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (paused) {
					BattleOrchestrator.timer.start();
					paused = false;
				} else if (!paused) {
					BattleOrchestrator.timer.stop();
					paused = true;
				}
			}
		});

		fasterSpeedButton = new JButton();
		fasterSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height * 50 / 100));
		fasterSpeedButton
				.setIcon(imageLoader.loadImageIcon("/icons/fasterButton.png", width * 20 / 100, height * 50 / 100));
		add(fasterSpeedButton);

		fasterSpeedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentDelay = BattleOrchestrator.timer.getDelay();
				if (currentDelay > 399)
					BattleOrchestrator.timer.setDelay(1000);
			}
		});

		fastestSpeedButton = new JButton();
		fastestSpeedButton.setPreferredSize(new Dimension(width * 20 / 100, height * 50 / 100));
		fastestSpeedButton
				.setIcon(imageLoader.loadImageIcon("/icons/fastestButton.png", width * 20 / 100, height * 50 / 100));
		add(fastestSpeedButton);

		fastestSpeedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BattleOrchestrator.timer.setDelay(100);
			}
		});

		interveneButton = new JButton("Intervene (Not Implemented Yet)");
		interveneButton.setPreferredSize(new Dimension(width, height / 2));
		add(interveneButton);
		
		interventionPopup = new InterventionPopup(
				BattleScreen.battleScene.roundedWidth * 2 / 3,
				BattleScreen.battleScene.roundedHeight * 2 / 3);

		interveneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interventionPopup.fillInterventionPopup();
				interventionPopup.setVisible(true);
			}
		});

	}

}
