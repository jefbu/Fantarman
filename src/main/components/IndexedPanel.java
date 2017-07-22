package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.entity.TerrainType;
import main.utility.ImageLoader;

public class IndexedPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public int index;
	public JButton button;
	public TerrainType terrain;
	private ImageLoader imageLoader;
	
	private static ImageIcon grass1Icon;	
	private static ImageIcon river1Icon;
	private static ImageIcon desert1Icon;
	private static ImageIcon forest1Icon;

	public IndexedPanel(int roundedWidth, int roundedHeight) {

		super();
		
		loadImages(roundedWidth / 48, roundedHeight / 32);
		
		Dimension individualPanelSize = new Dimension(roundedWidth / 48, roundedHeight / 32);
		setPreferredSize(individualPanelSize);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		button = new JButton();
		button.setPreferredSize(new Dimension((int) individualPanelSize.getWidth(), (int) individualPanelSize.getHeight()));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		add(button);
		
		


	}
	
	
	
	
	
	
	
	
	
	public void applyTerrainType(TerrainType terrainType) {
		
		this.terrain = terrainType;
		
	}
	
	public void applyColor() {
		
		Random random = new Random();
		int roll;
		
		switch (terrain) {
		
		case GRASS: 
			button.setIcon(grass1Icon); break;
		case FOREST: 
			button.setIcon(forest1Icon); break;
		case HILL: 
			roll = random.nextInt(5) + 1;
			setBackground(new Color (100 + roll, 110 + roll * 2, 20)); break;
		case MOUNTAIN:
			roll = random.nextInt(5) + 1;
			setBackground(new Color (60 + roll, 60 + roll * 2, 10)); break;
		case RIVER:
			button.setIcon(river1Icon); break;
		case ROAD:
			button.setIcon(desert1Icon); break;
		case DESERT:
			button.setIcon(desert1Icon); break;
		}
		
		
		
	}
	
	private void loadImages(int width, int height) {
		
		imageLoader = new ImageLoader();
		
		grass1Icon = imageLoader.loadImageIcon("/tiles/grass1.png", width, height);
		river1Icon = imageLoader.loadImageIcon("/tiles/river1.png", width, height);
		desert1Icon = imageLoader.loadImageIcon("/tiles/desert1.png", width, height);
		forest1Icon = imageLoader.loadImageIcon("/tiles/forest1.png", width, height);
		
	}

}
