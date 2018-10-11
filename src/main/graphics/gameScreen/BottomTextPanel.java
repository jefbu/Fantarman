package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.graphics.Screen;
import main.graphics.gameScreen.homeScreen.NewsReel;
import main.utility.Colors;

public class BottomTextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public NewsReel newsReel;

	public BottomTextPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension (width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		newsReel = new NewsReel(width, height);
		add(newsReel);
		
	}
	
	public void fillBottomTextPanel(boolean fillNewsReel) {
		
	if(Main.tutorial) {

		switch(Main.bottomTextTutorial) {
		case Homeview:
			newsReel.textArea.setText("Hello and welcome to Fantasy Army Manager. This is your home screen. <br> <br> "
					+ "The most important thing to do here is to choose what your regiments will be doing this week."
					+ "You can select up to eight regiments to go to battle, the leftovers can be sent to "
					+ " practice their skills, or to cajole, coax, and manhandle "
					+ "fans and sponsors into giving you money! <br> <br>"
					+ "You can also see the current league ranking, previous results and who you'll be fighting next, "
					+ "and some generic information and trophies. <br> <br>"
					+ "Click on one of your regiments to go to a more detailed overview.");
			break;
		case RegimentView:
			newsReel.textArea.setText("The left hand side of this screen gives you information about the regiment. "
					+ "You can also change equipment options here. <br>"
					+ "Meanwhile, over at the right hand side, you'll find information on the regiment's captain, "
					+ "such as their riveting and tragic life stories. <br> <br>"
					+ "More interesting, if not more important, are the battle orders you can give the captain. "
					+ "These orders will be executed without fail from top to bottom. Meaning, when a regiment has its "
					+ "turn, it will try to carry out its first order. If this is impossible, it will try its second "
					+ "and so on until the last. If no orders meet the chosen condition, the regiment will do nothing, "
					+ "so it's usually a good idea to choose your orders in decreasing narrowness of scope. A simple "
					+ "example would be to choose your first order's condition as 'life smaller than 25%', and the "
					+ "second order as 'always'. If you invert these, the second order would never be executed! ");
			break;
		default:
			break;
		}
	}		
		else if(fillNewsReel) newsReel.fillNewsReel();
	}

}
