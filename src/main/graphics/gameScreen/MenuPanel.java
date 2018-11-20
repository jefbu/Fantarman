package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.TextPopup;
import main.graphics.Screen;
import main.utility.Colors;
import main.utility.LoadGame;
import main.utility.SaveGame;

public class MenuPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	Color backgroundColor;
	Dimension labelDimension;
	FileInputStream saveFile;
	
	public MenuPanel(int width, int height) {
		
		super();
		
		backgroundColor = Colors.vdgrey;
		labelDimension = new Dimension(width / 20, height);
		
		setPreferredSize(new Dimension(width, height));
		setBackground(backgroundColor);
		setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		
		JPanel wikiPanel = new JPanel();
		wikiPanel.setPreferredSize(labelDimension);
		wikiPanel.setBackground(backgroundColor);
		wikiPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));			
		JButton wikiButton = new JButton();
			wikiButton.setPreferredSize(labelDimension);
			wikiButton.setContentAreaFilled(false);
			wikiButton.setBorderPainted(false);
			wikiButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Screen.gameScreen.setScreensInvisible();
					Screen.gameScreen.mainPanel.wikiView.setVisible(true);
				}
			});
			wikiPanel.add(wikiButton);
				JLabel wikiLabel = new JLabel();
				wikiLabel.setForeground(Colors.vlgrey);
				wikiLabel.setText("wiki");
				wikiButton.add(wikiLabel);
		add(wikiPanel);
		
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
					TextPopup savePopup = new TextPopup (width / 2, height * 20, Colour.DGREY, true);
					
					savePopup.writeText("<font color = 'rgb(180, 180, 180)'>" 
					+ "Do you want to save the game (old save will be overwritten)?");
					
					try { savePopup.confirmButton.removeActionListener(savePopup.confirmButton.getActionListeners()[0]);
					} catch (Exception e1) {}
					try { savePopup.cancelButton.removeActionListener(savePopup.cancelButton.getActionListeners()[0]);
					} catch (Exception e2) {}
					
					savePopup.confirmButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							savePopup.dispose();
							SaveGame.save();
						}
					});
					
					savePopup.cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							savePopup.dispose();
						}
					});
					
					savePopup.setVisible(true);
					
				}
			});
			savePanel.add(saveButton);
				JLabel saveLabel = new JLabel();
				saveLabel.setForeground(Colors.vlgrey);
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
									
					try {
						saveFile = new FileInputStream("saveTest.sav");
					} catch (FileNotFoundException e3) {}
					
					if (saveFile != null) {
					
					TextPopup loadPopup = new TextPopup (width / 2, height * 20, Colour.DGREY, true);
					
					loadPopup.writeText("<font color = 'rgb(180, 180, 180)'>" + 
					"Do you want to load the saved game?");
					
					try { loadPopup.confirmButton.removeActionListener(loadPopup.confirmButton.getActionListeners()[0]);
					} catch (Exception e1) {}
					try { loadPopup.cancelButton.removeActionListener(loadPopup.cancelButton.getActionListeners()[0]);
					} catch (Exception e2) {}
					
					loadPopup.confirmButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							loadPopup.dispose();
							LoadGame.load();
						}
					});
					
					loadPopup.cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							loadPopup.dispose();
						}
					});
					
					loadPopup.setVisible(true);
				}
					else { 

					TextPopup couldNotLoadPopup = new TextPopup(width / 2, height * 25, Colour.DGREY, false);
					couldNotLoadPopup.writeText("You ponder your choices of the past... <br> <br>"
							+ "Too many mistakes, too much pain caused. Frankly, you don't see a way out any more. "
							+ "And so, you decide to invoke the power you were born with, "
							+ "to go back in time and set things right. <br> <br>"
							+ "You close your eyes, concentrate. You call upon all your mental energy. "
							+ "You channel your chakra, murmur the mantra and spill the spell. "
							+ "The rays of power flow through your body. But nothing happens? "
							+ "You frown, concentrate harder and start once more. Sweaty drops form on your brow. "
							+ "A headache is heralding itself. And still nothing happens. "
							+ "Faintly, far off in the distance in the astral plane, you suddenly see a few words appear in "
							+ "the aether. <br> <br> They shimmer ... 'save file could not be found'.");
					couldNotLoadPopup.setVisible(true);
					
					
					}
					
				}
			});
			loadPanel.add(loadButton);
				JLabel loadLabel = new JLabel();
				loadLabel.setForeground(Colors.vlgrey);
				loadLabel.setText("load");
				loadButton.add(loadLabel);
		add(loadPanel);
		
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
					Main.screen.dispose();
				}
			});
			exitPanel.add(exitButton);
				JLabel exitLabel = new JLabel();
				exitLabel.setForeground(Colors.vlgrey);
				exitLabel.setText("exit");
				exitButton.add(exitLabel);
		add(exitPanel);
		
	}

}
