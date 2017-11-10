package main.graphics.gameScreen.regimentView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.captainDetail.CaptainBaseInfoPanel;
import main.graphics.gameScreen.regimentView.captainDetail.CaptainBiographyPanel;
import main.graphics.gameScreen.regimentView.captainDetail.OrderPanel;
import main.graphics.gameScreen.regimentView.captainDetail.StatsBonusPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class CaptainDetailPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ImageLoader imageLoader;
	
	public CaptainBaseInfoPanel captainBaseInfoPanel;
	public OrderPanel orderPanel;
	public StatsBonusPanel statsBonusPanel;
	public CaptainBiographyPanel captainBiographyPanel;

	public CaptainDetailPanel(int width, int height) {

		super();
		imageLoader = new ImageLoader();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.white);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		ContentPanel captainIconPanel = new ContentPanel(width / 7, height / 2 - 20, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		JLabel regimentIconLabel = new JLabel();
		regimentIconLabel.setIcon(imageLoader.loadImageIcon("/portraits/test2.png", width / 8, height / 3));
		captainIconPanel.insidePanel.add(regimentIconLabel);
		add(captainIconPanel);

		captainBaseInfoPanel = new CaptainBaseInfoPanel(width / 6, height / 2 - 20, Colour.DBLUE,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(captainBaseInfoPanel);

		captainBiographyPanel = new CaptainBiographyPanel(width / 2, height / 2 - 20,
				Colour.LBLUE, new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(captainBiographyPanel);

		orderPanel = new OrderPanel(width / 2, height / 2 + 10, Colour.DGREEN,
				new FlowLayout(FlowLayout.LEFT, 1, 2));
		add(orderPanel);

		statsBonusPanel = new StatsBonusPanel(width / 3, height / 2 + 10, Colour.BLUE,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(statsBonusPanel);

	}

	public void fillCaptainDetailPanel(Regiment regiment) {

		captainBaseInfoPanel.fillCaptainBaseInfoPanel(regiment);
		captainBiographyPanel.fillCaptainBiography(regiment.captain);
		orderPanel.fillOrderPanel(regiment);
		statsBonusPanel.fillStatsBonusPanel(regiment);
		
		
	}

}
