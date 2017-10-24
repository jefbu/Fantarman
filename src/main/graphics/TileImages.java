package main.graphics;

import javax.swing.ImageIcon;

import main.utility.ImageLoader;

public class TileImages {
	
	public static ImageIcon grass1Icon;
	public static ImageIcon grass2Icon;
	public static ImageIcon grass3Icon;
	public static ImageIcon grass4Icon;
	public static ImageIcon river1Icon;
	public static ImageIcon river2Icon;
	public static ImageIcon riverGrassLeftIcon;
	public static ImageIcon riverGrassRightIcon;
	public static ImageIcon riverGrassTopIcon;
	public static ImageIcon riverGrassBottomIcon;
	public static ImageIcon riverGrassLeftTopIcon;
	public static ImageIcon riverGrassLeftBottomIcon;
	public static ImageIcon riverGrassRightTopIcon;
	public static ImageIcon riverGrassRightBottomIcon;
	public static ImageIcon riverGrassLeftRightIcon;
	public static ImageIcon riverGrassTopBottomIcon;
	public static ImageIcon waterAllSidesIcon;
	public static ImageIcon desert1Icon;
	public static ImageIcon desert2Icon;
	public static ImageIcon desert3Icon;
	public static ImageIcon forest1Icon;
	public static ImageIcon forest2Icon;
	public static ImageIcon forest3Icon;
	public static ImageIcon road1Icon;
	public static ImageIcon hill1Icon;
	public static ImageIcon mountain1Icon;
	public static ImageIcon mountain2Icon;
	
	private static ImageLoader imageLoader;

	
	public static void loadImages(int width, int height) {
		
		imageLoader = new ImageLoader();
		
		grass1Icon = imageLoader.loadImageIcon("/tiles/grass1.png", width, height);
		grass2Icon = imageLoader.loadImageIcon("/tiles/grass2.png", width, height);
		grass3Icon = imageLoader.loadImageIcon("/tiles/grass3.png", width, height);
		grass4Icon = imageLoader.loadImageIcon("/tiles/grass4.png", width, height);
		river1Icon = imageLoader.loadImageIcon("/tiles/river1.png", width, height);
		river2Icon = imageLoader.loadImageIcon("/tiles/river2.png", width, height);
		riverGrassLeftIcon = imageLoader.loadImageIcon("/tiles/water/grassleft.png", width, height);
		riverGrassRightIcon = imageLoader.loadImageIcon("/tiles/water/grassright.png", width, height);
		riverGrassTopIcon = imageLoader.loadImageIcon("/tiles/water/grasstop.png", width, height);
		riverGrassBottomIcon = imageLoader.loadImageIcon("/tiles/water/grassbottom.png", width, height);
		riverGrassLeftTopIcon = imageLoader.loadImageIcon("/tiles/water/grasslefttop.png", width, height);
		riverGrassLeftBottomIcon = imageLoader.loadImageIcon("/tiles/water/grassleftbottom.png", width, height);
		riverGrassRightTopIcon = imageLoader.loadImageIcon("/tiles/water/grassrighttop.png", width, height);
		riverGrassRightBottomIcon = imageLoader.loadImageIcon("/tiles/water/grassrightbottom.png", width, height);
		riverGrassLeftRightIcon = imageLoader.loadImageIcon("/tiles/water/grassleftright.png", width, height);
		riverGrassTopBottomIcon = imageLoader.loadImageIcon("/tiles/water/grasstopbottom.png", width, height);
		waterAllSidesIcon = imageLoader.loadImageIcon("tiles/water/waterallsides.png", width, height);
		road1Icon = imageLoader.loadImageIcon("/tiles/road1.png", width, height);
		desert1Icon = imageLoader.loadImageIcon("/tiles/desert1.png", width, height);
		desert2Icon = imageLoader.loadImageIcon("/tiles/desert2.png", width, height);
		desert3Icon = imageLoader.loadImageIcon("/tiles/desert3.png", width, height);
		forest1Icon = imageLoader.loadImageIcon("/tiles/forest1.png", width, height);
		forest2Icon = imageLoader.loadImageIcon("/tiles/forest2.png", width, height);
		forest3Icon = imageLoader.loadImageIcon("/tiles/forest3.png", width, height);
		hill1Icon = imageLoader.loadImageIcon("/tiles/hill1.png", width, height);
		mountain1Icon = imageLoader.loadImageIcon("/tiles/mountain1.png", width, height);
		mountain2Icon = imageLoader.loadImageIcon("/tiles/mountain2.png", width, height);
		
	}
	
}
