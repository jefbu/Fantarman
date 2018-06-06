package main.graphics.gameScreen.infoView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;
import main.utility.ImageLoader;
import main.utility.LoadTrophies;
import main.utility.Trophies;

public class TrophyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ContentPanel titlePanel;
	private ContentPanel contentPanel;
	
	private ImageLoader imageLoader;
	
	private JPanel spaghettiPanel;
	private JLabel spaghettiLabel;
	private JPanel wonLeaguePanel;
	private JLabel wonLeagueLabel;

	public TrophyPanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlblue);
		
		imageLoader = new ImageLoader();

		JPanel upperVoidPanel = new JPanel();
		upperVoidPanel.setPreferredSize(new Dimension(width, height * 5 / 100));
		upperVoidPanel.setBackground(Colors.vlblue);
		add(upperVoidPanel);

		JPanel upperLeftVoidPanel = new JPanel();
		upperLeftVoidPanel.setPreferredSize(new Dimension(width * 5 / 100, height * 20 / 100));
		upperLeftVoidPanel.setBackground(Colors.vlblue);
		add(upperLeftVoidPanel);

		titlePanel = new ContentPanel(width * 30 / 100, height * 25 / 100, Colour.DGREY,
				new FlowLayout(FlowLayout.CENTER, 0, 0));
		titlePanel.contentLabel.setText("Trophies");
		add(titlePanel);

		JPanel upperRightVoidPanel = new JPanel();
		upperRightVoidPanel.setPreferredSize(new Dimension(width * 65 / 100, height * 20 / 100));
		upperRightVoidPanel.setBackground(Colors.vlblue);
		add(upperRightVoidPanel);

		JPanel lowerLeftVoidPanel = new JPanel();
		lowerLeftVoidPanel.setPreferredSize(new Dimension(width * 6 / 100, height * 65 / 100));
		lowerLeftVoidPanel.setBackground(Colors.vlblue);
		add(lowerLeftVoidPanel);

		contentPanel = new ContentPanel(width * 80 / 100, height * 60 / 100, Colour.GREY,
				new FlowLayout(FlowLayout.LEFT, 10, 2));
		add(contentPanel);
		
			spaghettiPanel = new JPanel();
			spaghettiPanel.setPreferredSize(new Dimension (48, 48));
			spaghettiPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
			spaghettiLabel = new JLabel();
			spaghettiLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
			spaghettiPanel.add(spaghettiLabel);
			
		contentPanel.insidePanel.add(spaghettiPanel);
		
			wonLeaguePanel = new JPanel();
			wonLeaguePanel.setPreferredSize(new Dimension (48, 48));
			wonLeaguePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
			wonLeagueLabel = new JLabel();
			wonLeagueLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
			wonLeaguePanel.add(wonLeagueLabel);			
	
		contentPanel.insidePanel.add(wonLeaguePanel);
	}

	
	public void fillTrophyPanel() {
		
		try { LoadTrophies.load(); } catch (Exception e) {System.out.println("could not load trophies");}
		if (Trophies.spaghetti) {
			spaghettiLabel.setIcon(imageLoader.loadImageIcon("/trophies/spaghetti.png", 48, 48));
		}
		if (Trophies.wonLeague) {
			wonLeagueLabel.setIcon(imageLoader.loadImageIcon("/trophies/wonLeague.png", 48, 48));
		}
		
	}

}

