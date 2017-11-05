package main.utility;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageLoader implements Serializable {

	private static final long serialVersionUID = 1L;

	public ImageIcon loadImageIcon(String path, int width, int height) {
		
		java.net.URL imgURL = getClass().getResource(path);
		
		if (imgURL != null) {
			return new ImageIcon(((new ImageIcon(imgURL).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH))));
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
