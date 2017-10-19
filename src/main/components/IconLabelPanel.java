package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.ImageLoader;

public class IconLabelPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel iconLabel;
	public ButtonedPanel buttonedPanel;
	ImageLoader imageLoader;
	private int width;
	private int height;
	
	public IconLabelPanel(int width, int height, Colour colour) {
		
		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		imageLoader = new ImageLoader();
		
		iconLabel = new JLabel();
		iconLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		decideIcon(colour);		
		add(iconLabel);
		
		buttonedPanel = new ButtonedPanel(width, height);
		buttonedPanel.setOpaque(false);
		buttonedPanel.button.setBorder(null);
		buttonedPanel.button.setContentAreaFilled(false);

		iconLabel.add(buttonedPanel);
		
		
	}
	
	private void decideIcon(Colour colour) {
		switch(colour) {
		case BLUE: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelBlue.png", width, height));
			break;
		case DBLUE: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelBlue.png", width, height));
			break;
		case DGREEN: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelGreen.png", width, height));
			break;
		case DRED: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelRed.png", width, height));
			break;
		case GREEN: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelGreen.png", width, height));
			break;
		case LBLUE: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelBlue.png", width, height));
			break;
		case LGREEN: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelGreen.png", width, height));
			break;
		case LRED: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelRed.png", width, height));
			break;
		case RED: iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelRed.png", width, height));
			break;
		default:
			break;	
		}
		
	}

}
