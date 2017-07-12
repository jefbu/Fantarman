package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.entity.TerrainType;

public class IndexedPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public int index;
	private JLabel label;
	private JButton button;
	public TerrainType terrain;

	public IndexedPanel(int roundedWidth, int roundedHeight) {

		super();

		Dimension individualPanelSize = new Dimension(roundedWidth / 48, roundedHeight / 32);
		setPreferredSize(individualPanelSize);

	}
	
	public void applyTerrainType(TerrainType terrainType) {
		
		this.terrain = terrainType;
		
	}
	
	public void applyColor() {
		
		Random random = new Random();
		int roll;
		
		switch (terrain) {
		
		case GRASS: 
			roll = random.nextInt(20) + 1;
			setBackground(new Color (100 + roll / 2, 110 + roll, 60)); break;
		case FOREST: 
			roll = random.nextInt(20) + 1;
			setBackground(new Color (40, 70 + roll, 30 + roll / 2)); break;
		case HILL: 
			roll = random.nextInt(40) + 1;
			setBackground(new Color (160 + roll / 2, 140 + roll, 100)); break;
		case MOUNTAIN:
			roll = random.nextInt(60) + 1;
			setBackground(new Color (40 + roll, 40 + roll, 40 + roll)); break;
		case RIVER:
			roll = random.nextInt(100) + 1;
			setBackground(new Color (40, 110 + roll / 2, 140 + roll)); break;
		case ROAD:
			roll = random.nextInt(20) + 1;
			setBackground(new Color (120 + roll * 2, 125 + roll, 30)); break;
		case DESERT:
			roll = random.nextInt(20) + 1;
			setBackground(new Color (170, 110 + roll, 60 + roll)); break;
		
		}
		
		
		
	}

}
