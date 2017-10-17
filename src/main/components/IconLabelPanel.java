package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.ImageLoader;

public class IconLabelPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel iconLabel;
	public ButtonedPanel buttonedPanel;
	ImageLoader imageLoader;
	
	public IconLabelPanel(int width, int height, Colour colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		imageLoader = new ImageLoader();
		
		iconLabel = new JLabel();
		iconLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelBlue.png", width, height));
		
		add(iconLabel);
		
		buttonedPanel = new ButtonedPanel(width, height);
		buttonedPanel.setOpaque(false);
		buttonedPanel.button.setBorder(null);
		buttonedPanel.button.setContentAreaFilled(false);

		iconLabel.add(buttonedPanel);
		
		
	}

}
