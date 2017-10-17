package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.ImageLoader;

public class IconLabelPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel iconLabel;
	ButtonedPanel buttonedPanel;
	ImageLoader imageLoader;
	
	public IconLabelPanel(int width, int height, Colour colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		imageLoader = new ImageLoader();
		
		iconLabel = new JLabel();
		iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelBlue.png", width, height));
		
		add(iconLabel);
		
	}

}
