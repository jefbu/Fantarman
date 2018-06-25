package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.graphics.gameScreen.homeScreen.NewsReel;
import main.utility.Colors;

public class BottomTextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public NewsReel newsReel;

	public BottomTextPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension (width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		newsReel = new NewsReel(width, height);
		add(newsReel);
		
	}
	
	public void fillBottomTextPanel(boolean fillNewsReel) {
		
		if(Main.tutorial) {
			newsReel.textArea.setText("Hello and welcome to Hands Off My Army. This is your homescreen, <br>"
					+ "from here you can see important information at a glance. You can also prepare for the next battle"
					+ " by selecting which regiments will partake in the fun. Do this by clicking on the role text, "
					+ "and then choose between 'combat', 'training' or 'marketing'. Training and marketing are currently"
					+ " not yet implemented, whereas a maximum of eight regiments can be given 'combat' role. <br>"
					+ "Finally, you can also click on the regiment to go to its detail page.");
		} 
		else if(fillNewsReel) newsReel.fillNewsReel();
	}

}
