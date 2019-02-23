package main.graphics.gameScreen.tutorial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.graphics.Screen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class Tutorial extends JPanel {

	private static final long serialVersionUID = 1L;
	private ImageLoader imageLoader;
	private JLabel image;
	
	private int state;
	
	private int width;
	private int height;
	
	public Tutorial(int width, int height) {
		
		super();
		state = 1;
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.dblue);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		imageLoader = new ImageLoader();
		image = new JLabel();
		image.setIcon(imageLoader.loadImageIcon("/tutorial/homeScreen1.png", width, height * 90 / 100));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(width, height * 10 /100));
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, width * 2 / 100, height * 2 / 100));
		
		JButton previousButton = new JButton();
		previousButton.setPreferredSize(new Dimension(width * 10 /100, height * 6 / 100));
		previousButton.setIcon(imageLoader.loadImageIcon("/icons/previousButton.png", width * 10 / 100, height * 6 / 100));
		
			previousButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(state > 1) { state--; }
					changeImage();
				}
			});
		
		buttonPanel.add(previousButton);
		
		JButton nextButton = new JButton();
		nextButton.setPreferredSize(new Dimension(width * 10 /100, height * 6 / 100));
		nextButton.setIcon(imageLoader.loadImageIcon("/icons/nextButton.png", width * 10 / 100, height * 6 / 100));
			
			nextButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(state < 14) { state++; }
					changeImage();
				}
			});
		
		buttonPanel.add(nextButton);
		
		JButton endTutorialButton = new JButton();
		endTutorialButton.setPreferredSize(new Dimension(width * 10 /100, height * 6 / 100));
		endTutorialButton.setIcon(imageLoader.loadImageIcon("/icons/endTutorialButton.png", width * 10 / 100, height * 6 / 100));
		
			endTutorialButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					state = 1;
					Screen.tutorial.setVisible(false);
					Screen.titleScreen.setVisible(true);
				}
			});
		
		buttonPanel.add(endTutorialButton);
		
		JButton quitButton = new JButton();
		quitButton.setPreferredSize(new Dimension(width * 10 /100, height * 6 / 100));
		quitButton.setIcon(imageLoader.loadImageIcon("/icons/quitButton.png", width * 10 / 100, height * 6 / 100));
		
			quitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.screen.dispose();
				}
			});
		
		buttonPanel.add(quitButton);
		
		add(image);
		add(buttonPanel);
		
		
	}
	
	public void changeImage() {
				
		switch(state) {
		
		case 1: image.setIcon(imageLoader.loadImageIcon("/tutorial/homeScreen1.png", width, height * 90 / 100)); break;
		case 2: image.setIcon(imageLoader.loadImageIcon("/tutorial/homeScreen2.png", width, height * 90 / 100)); break;
		case 3: image.setIcon(imageLoader.loadImageIcon("/tutorial/homeScreen3.png", width, height * 90 / 100)); break;
		case 4: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen1.png", width, height * 90 / 100)); break;
		case 5: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen2.png", width, height * 90 / 100)); break;
		case 6: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen3.png", width, height * 90 / 100)); break;
		case 7: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen4.png", width, height * 90 / 100)); break;
		case 8: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen5.png", width, height * 90 / 100)); break;
		case 9: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen6.png", width, height * 90 / 100)); break;
		case 10: image.setIcon(imageLoader.loadImageIcon("/tutorial/regimentScreen7.png", width, height * 90 / 100)); break;
		case 11: image.setIcon(imageLoader.loadImageIcon("/tutorial/battleScreen1.png", width, height * 90 / 100)); break;
		case 12: image.setIcon(imageLoader.loadImageIcon("/tutorial/battleScreen2.png", width, height * 90 / 100)); break;
		case 13: image.setIcon(imageLoader.loadImageIcon("/tutorial/battleScreen3.png", width, height * 90 / 100)); break;
		case 14: image.setIcon(imageLoader.loadImageIcon("/tutorial/battleScreen4.png", width, height * 90 / 100)); break;

		
		}
		
	}
	
	
}
