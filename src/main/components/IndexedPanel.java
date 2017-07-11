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
		int roll = random.nextInt(100) + 1;
		
		switch (terrain) {
		
		case GRASS: setBackground(new Color (140, 160, 60)); break;
		case FOREST: setBackground(new Color (90, 170, 40)); break;
		case HILL: setBackground(new Color (180, 190, 100)); break;
		case MOUNTAIN: setBackground(new Color (60, 40, 40)); break;
		case RIVER: setBackground(new Color (40, 110 + roll / 2, 140 + roll)); break;
		case ROAD: setBackground(new Color (120, 125, 30)); break;
		case DESERT: setBackground(new Color (190, 100, 40)); break;
		
		}
		
		
		
	}

}
