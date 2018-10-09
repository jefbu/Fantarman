package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.IconLabelPanel;
import main.graphics.Screen;
import main.utility.Colors;
import main.utility.ImageLoader;
import main.utility.LoadGame;

public class TitleScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel background;
	JPanel panel;
	BufferedImage image;

	public TitleScreen(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		ImageLoader imageLoader = new ImageLoader();
		try {
			image = imageLoader.loadBufferedImage("/components/TitleBackground.png");
		} catch (IOException e) {
			e.printStackTrace();
		}

        JPanel backgroundPanel = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, width, height, null);
            }
        };
        backgroundPanel.setPreferredSize(new Dimension(width, height));
        backgroundPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        add(backgroundPanel);
        
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(width, height * 4 / 10));
        topPanel.setOpaque(false);
        backgroundPanel.add(topPanel);
        
        JPanel middleEmptyPanel = new JPanel();
        middleEmptyPanel.setPreferredSize(new Dimension (width / 4, height * 6 / 10));
        middleEmptyPanel.setOpaque(false);
        middleEmptyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        backgroundPanel.add(middleEmptyPanel);
        
        JPanel middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension (width / 2, height * 6 / 10));
        middlePanel.setOpaque(false);
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, width / 100));
        backgroundPanel.add(middlePanel);
        
        IconLabelPanel startPanel = new IconLabelPanel(width / 3, height / 15, Colour.BLUE);
        startPanel.buttonedPanel.label.setForeground(Colors.vdgrey);
        startPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 32));
        startPanel.buttonedPanel.label.setText("Start");
        startPanel.buttonedPanel.button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Screen.titleScreen.setVisible(false);
        		Screen.gameStartScreen.setVisible(true);
        	}
        });
        middlePanel.add(startPanel);
        
        IconLabelPanel loadPanel = new IconLabelPanel(width / 3, height / 15, Colour.GREEN);
        loadPanel.buttonedPanel.label.setForeground(Colors.vdgrey);
        loadPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 32));
        loadPanel.buttonedPanel.label.setText("Load");
        loadPanel.buttonedPanel.button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Screen.titleScreen.setVisible(false);
        		LoadGame.load();
        	}
        });
        middlePanel.add(loadPanel);
        
        IconLabelPanel exitPanel = new IconLabelPanel(width / 3, height / 15, Colour.RED);
        exitPanel.buttonedPanel.label.setForeground(Colors.vdgrey);
        exitPanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 32));
        exitPanel.buttonedPanel.label.setText("Quit");
        exitPanel.buttonedPanel.button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Main.screen.dispose();
        	}
        });
        middlePanel.add(exitPanel);
        
        /*
        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(width * 3 / 4, height / 2));
        bottomPanel.setBackground(Colors.blue);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        JLabel gameTitleLabel = new JLabel();
        gameTitleLabel.setForeground(Colors.textyellow);
        gameTitleLabel.setText("Hands Off My Army, v0.5.6.1.");
        bottomPanel.add(gameTitleLabel);
        backgroundPanel.add(bottomPanel);
        */

		
	}

}
