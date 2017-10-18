package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.IconLabelPanel;
import main.utility.ImageLoader;

public class TitleScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel background;
	JPanel panel;
	BufferedImage image;

	public TitleScreen(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		
		ImageLoader imageLoader = new ImageLoader();
		try {
			image = imageLoader.loadBufferedImage("/components/IconLabelPanelRed.png");
		} catch (IOException e) {
			e.printStackTrace();
		}

        JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, width, height, null);
            }
        };
        panel.setPreferredSize(new Dimension(width, height));
        add(panel);
        
        IconLabelPanel startPanel = new IconLabelPanel(width / 3, height / 5, Colour.BLUE);
        panel.add(startPanel);

		
	}

}
