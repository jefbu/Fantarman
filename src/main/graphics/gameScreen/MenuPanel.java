package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.Colors;
import main.utility.SaveGame;

public class MenuPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	Color backgroundColor;
	Dimension labelDimension;
	
	public MenuPanel(int gameScreenWidth, int gameScreenHeight) {
		
		super();
		
		backgroundColor = Colors.dblue;
		labelDimension = new Dimension(gameScreenWidth / 20, gameScreenHeight / 50);
		
		setPreferredSize(new Dimension(gameScreenWidth, gameScreenHeight / 50));
		setBackground(backgroundColor);
		setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		
		JPanel savePanel = new JPanel();
		savePanel.setPreferredSize(labelDimension);
		savePanel.setBackground(backgroundColor);
		savePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton saveButton = new JButton();
			saveButton.setPreferredSize(labelDimension);
			saveButton.setContentAreaFilled(false);
			saveButton.setBorderPainted(false);
			saveButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SaveGame.save();
				}
			});
			savePanel.add(saveButton);
				JLabel saveLabel = new JLabel();
				saveLabel.setForeground(Colors.textyellow);
				saveLabel.setText("save");
				saveButton.add(saveLabel);
		add(savePanel);
		
		JPanel loadPanel = new JPanel();
		loadPanel.setPreferredSize(labelDimension);
		loadPanel.setBackground(backgroundColor);
		loadPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton loadButton = new JButton();
			loadButton.setPreferredSize(labelDimension);
			loadButton.setContentAreaFilled(false);
			loadButton.setBorderPainted(false);
			loadButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("load");
				}
			});
			loadPanel.add(loadButton);
				JLabel loadLabel = new JLabel();
				loadLabel.setForeground(Colors.textyellow);
				loadLabel.setText("load");
				loadButton.add(loadLabel);
		add(loadPanel);
		
		JPanel creditsPanel = new JPanel();
		creditsPanel.setPreferredSize(labelDimension);
		creditsPanel.setBackground(backgroundColor);
		creditsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton creditsButton = new JButton();
			creditsButton.setPreferredSize(labelDimension);
			creditsButton.setContentAreaFilled(false);
			creditsButton.setBorderPainted(false);
			creditsButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("credits");
				}
			});
			creditsPanel.add(creditsButton);
				JLabel creditsLabel = new JLabel();
				creditsLabel.setForeground(Colors.textyellow);
				creditsLabel.setText("credits");
				creditsButton.add(creditsLabel);
		add(creditsPanel);
		
		JPanel helpPanel = new JPanel();
		helpPanel.setPreferredSize(labelDimension);
		helpPanel.setBackground(backgroundColor);
		helpPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton helpButton = new JButton();
			helpButton.setPreferredSize(labelDimension);
			helpButton.setContentAreaFilled(false);
			helpButton.setBorderPainted(false);
			helpButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("helpd");
				}
			});
			helpPanel.add(helpButton);
				JLabel helpLabel = new JLabel();
				helpLabel.setForeground(Colors.textyellow);
				helpLabel.setText("help");
				helpButton.add(helpLabel);
		add(helpPanel);
		
		JPanel exitPanel = new JPanel();
		exitPanel.setPreferredSize(labelDimension);
		exitPanel.setBackground(backgroundColor);
		exitPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton exitButton = new JButton();
			exitButton.setPreferredSize(labelDimension);
			exitButton.setContentAreaFilled(false);
			exitButton.setBorderPainted(false);
			exitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("exitd");
				}
			});
			exitPanel.add(exitButton);
				JLabel exitLabel = new JLabel();
				exitLabel.setForeground(Colors.textyellow);
				exitLabel.setText("exit");
				exitButton.add(exitLabel);
		add(exitPanel);
		
		
	}

}
