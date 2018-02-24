package main.graphics.gameScreen.regimentView.lieutenantDetail;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.utility.ImageLoader;

public class LieutenantDetailPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	private ImageLoader imageLoader;
	public JLabel portrait;
	private int width;
	private int height;

	public LieutenantDetailPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		imageLoader = new ImageLoader();
		
		this.width = width;
		this.height = height;
		
		portrait = new JLabel();
		insidePanel.add(portrait);
		
	}
	
	public void fillLieutenantDetailPanel(int order, Regiment regiment) {
		
		if (order > regiment.lieutenantsSize) {
		portrait.setIcon(imageLoader.loadImageIcon("/lieutenants/none.png", width / 4, height - 25));
		}
		else {
		portrait.setIcon(imageLoader.loadImageIcon("/lieutenants/mendicant.png", width / 4, height - 25));			
		}
		
	}
	
}
