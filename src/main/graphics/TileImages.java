package main.graphics;

import javax.swing.ImageIcon;

import main.utility.ImageLoader;

public class TileImages {
	
	public static ImageIcon grass1Icon;
	public static ImageIcon grass2Icon;
	public static ImageIcon grass3Icon;
	public static ImageIcon river1Icon;
	public static ImageIcon desert1Icon;
	public static ImageIcon forest1Icon;
	public static ImageIcon road1Icon;
	public static ImageIcon hill1Icon;
	public static ImageIcon mountain1Icon;
	
	private static ImageLoader imageLoader;

	
	public static void loadImages(int width, int height) {
		
		imageLoader = new ImageLoader();
		
		grass1Icon = imageLoader.loadImageIcon("/tiles/grass1.png", width, height);
		grass2Icon = imageLoader.loadImageIcon("/tiles/grass2.png", width, height);
		grass3Icon = imageLoader.loadImageIcon("/tiles/grass3.png", width, height);
		river1Icon = imageLoader.loadImageIcon("/tiles/river1.png", width, height);
		road1Icon = imageLoader.loadImageIcon("/tiles/road1.png", width, height);
		desert1Icon = imageLoader.loadImageIcon("/tiles/desert1.png", width, height);
		forest1Icon = imageLoader.loadImageIcon("/tiles/forest1.png", width, height);
		hill1Icon = imageLoader.loadImageIcon("/tiles/hill1.png", width, height);
		mountain1Icon = imageLoader.loadImageIcon("/tiles/mountain1.png", width, height);
		
	}
	
	
}
