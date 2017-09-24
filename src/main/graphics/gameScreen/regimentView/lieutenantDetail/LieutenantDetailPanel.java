package main.graphics.gameScreen.regimentView.lieutenantDetail;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.ImageLoader;

public class LieutenantDetailPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	private ImageLoader imageLoader;

	public LieutenantDetailPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		imageLoader = new ImageLoader();
		
		JLabel portrait = new JLabel();
		portrait.setIcon(imageLoader.loadImageIcon("/tiles/grass3.png", width / 4, height - 20));
		insidePanel.add(portrait);
		

		
	}
	
}
