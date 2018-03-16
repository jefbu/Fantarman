package main.graphics.gameScreen.regimentView.lieutenantDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.regiments.Regiment;
import main.utility.Colors;
import main.utility.ImageLoader;

public class LieutenantDetailPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	private ImageLoader imageLoader;
	public JLabel portrait;
	private int width;
	private int height;
	private JPanel infoPanel;
	private LabeledPanel namePanel;
	private LabeledPanel bonusPanel;

	public LieutenantDetailPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		imageLoader = new ImageLoader();
		
		this.width = width;
		this.height = height;
		
		portrait = new JLabel();
		insidePanel.add(portrait);
		
		infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(width / 100 * 90, height / 4 * 3));
		infoPanel.setBackground(Colors.vlgreen);
		infoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		insidePanel.add(infoPanel);
				
		namePanel = new LabeledPanel(width / 100 * 80, height / 4);
		namePanel.setBackground(Colors.dblue);
		namePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));
		namePanel.label.setForeground(Colors.textyellow);
		infoPanel.add(namePanel);
		
		bonusPanel = new LabeledPanel(width / 100 * 80, height / 3);
		bonusPanel.setBackground(Colors.dblue);
		bonusPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 3));
		bonusPanel.label.setForeground(Colors.textyellow);
		infoPanel.add(bonusPanel);

		
	}
	
	public void fillLieutenantDetailPanel(int order, Regiment regiment) {
		
		if (order > regiment.lieutenantsSize) {
		portrait.setIcon(imageLoader.loadImageIcon("/lieutenants/none.png", width / 4, height - 25));
		namePanel.label.setText("");
		bonusPanel.label.setText("");
		}
		else {
		portrait.setIcon(imageLoader.loadImageIcon(regiment.lieutenants.get(order - 1).imagePath, width / 4, height - 25));	
		namePanel.label.setText(regiment.lieutenants.get(order - 1).name);
		bonusPanel.label.setText(regiment.lieutenants.get(order - 1).bonus);
		}
		
	}
	
}
