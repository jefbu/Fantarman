package main.graphics.gameScreen;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.IconLabelPanel;
import main.utility.ImageLoader;

public class TitleScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	public TitleScreen(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		
		ImageLoader imageLoader = new ImageLoader();
		IconLabelPanel background = new IconLabelPanel(width, height, Colour.LBLUE);
		background.iconLabel.setIcon(imageLoader.loadImageIcon("/components/IconLabelPanelTeal.png", width, height));
		add(background);
		
		JButton button = new JButton("Hello");
		button.setPreferredSize(new Dimension(300, 500));
		background.buttonedPanel.label.add(button);
		
	}

}
