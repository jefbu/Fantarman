package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.IconLabelPanel;
import main.graphics.Screen;
import main.utility.Colors;

public class NavigationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	IconLabelPanel homeViewPanel;
	IconLabelPanel armyViewPanel;
	IconLabelPanel leagueViewPanel;
	IconLabelPanel infoViewPanel;
	IconLabelPanel wikiViewPanel;


	public NavigationPanel(int roundedWidth, int unroundedHeight) {
		
		super();
		
		int width = roundedWidth;
		int height = unroundedHeight * 75 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		homeViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
			homeViewPanel.buttonedPanel.button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Screen.gameScreen.setScreensInvisible();
					Screen.gameScreen.mainPanel.homeView.fillHomeScreen(false);
					Screen.gameScreen.mainPanel.homeView.setVisible(true);
				}
			});
			homeViewPanel.buttonedPanel.label.setForeground(Colors.textyellow);
			homeViewPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 42));
			homeViewPanel.buttonedPanel.label.setText("Home");
		add(homeViewPanel);
		
		armyViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
			armyViewPanel.buttonedPanel.button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Screen.gameScreen.setScreensInvisible();
					Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
					Screen.gameScreen.mainPanel.armyView.setVisible(true);
				}
			});
			armyViewPanel.buttonedPanel.label.setForeground(Colors.textyellow);
			armyViewPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 42));
			armyViewPanel.buttonedPanel.label.setText("Army");
		add(armyViewPanel);
		
		leagueViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
		leagueViewPanel.buttonedPanel.button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.leagueView.fillLeagueView();
				Screen.gameScreen.mainPanel.leagueView.setVisible(true);
			}
		});
		leagueViewPanel.buttonedPanel.label.setForeground(Colors.textyellow);
		leagueViewPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 42));
		leagueViewPanel.buttonedPanel.label.setText("League");
	add(leagueViewPanel);
	
		infoViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
		infoViewPanel.buttonedPanel.button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.infoView.fillInfoView(Main.yourArmy);
				Screen.gameScreen.mainPanel.infoView.setVisible(true);
			}
		});
		infoViewPanel.buttonedPanel.label.setForeground(Colors.textyellow);
		infoViewPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 42));
		infoViewPanel.buttonedPanel.label.setText("Information");
	add(infoViewPanel);
	
		wikiViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
		wikiViewPanel.buttonedPanel.button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.wikiView.setVisible(true);
			}
		});
		wikiViewPanel.buttonedPanel.label.setForeground(Colors.textyellow);
		wikiViewPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 42));
		wikiViewPanel.buttonedPanel.label.setText("Encyclopedia");
	add(wikiViewPanel);
		
	}
	

}
