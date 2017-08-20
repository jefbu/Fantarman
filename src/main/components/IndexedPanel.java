package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.utility.TerrainType;

public class IndexedPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public int index;
	public JButton button;
	public TerrainType terrain;
	public ImageIcon icon;
	


	public IndexedPanel(int roundedWidth, int roundedHeight) {

		super();
				
		Dimension individualPanelSize = new Dimension(roundedWidth / 48, roundedHeight / 32);
		setPreferredSize(individualPanelSize);
		setBorder(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		button = new JButton();
		button.setPreferredSize(new Dimension((int) individualPanelSize.getWidth(), (int) individualPanelSize.getHeight()));
		button.setContentAreaFilled(false);
		button.setBorder(null);
		
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
		button.setIcon(icon);
	}
	
	/*public void applyColor() {
		
		switch (terrain) {
		
		case GRASS: 
			button.setIcon(TileImages.grass1Icon); break;
		case FOREST: 
			button.setIcon(TileImages.forest1Icon); break;
		case HILL: 
			button.setIcon(TileImages.hill1Icon); break;
		case MOUNTAIN:
			button.setIcon(TileImages.mountain1Icon); break;
		case RIVER:
			button.setIcon(TileImages.river1Icon); break;
		case ROAD:
			button.setIcon(TileImages.road1Icon); break;
		case DESERT:
			button.setIcon(TileImages.desert1Icon); break;
		}
		
		
		
	}*/

}
