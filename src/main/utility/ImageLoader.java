package main.utility;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageLoader {

	public ImageIcon loadImageIcon(String path) {
		
		java.net.URL imgURL = getClass().getResource(path);
		
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
	public BufferedImage loadBufferedImage(String path) throws IOException {
		
		BufferedImage image = ImageIO.read(getClass().getResource(path));
		return image;
	}
	
}
