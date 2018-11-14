package main.graphics.gameScreen.regimentView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
	public JLabel captainIconLabel;
	public LieutenantsDetailPanel lieutenantsDetailPanel;

	private int width;
	private int height;

	public CaptainDetailPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		imageLoader = new ImageLoader();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, width * 2 / 100, height * 2 / 100));
		
		ContentPanel bigTitlePanel = new ContentPanel(width * 40 / 100, height * 7 / 100, Colors.dgrey,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		add(bigTitlePanel);
		
		bigTitlePanel.contentLabel.setForeground(Colors.vlgrey);
		bigTitlePanel.contentLabel.setText("Captain & Lieutenants");
		
		JPanel emptyTitlePanel = new JPanel();
		emptyTitlePanel.setPreferredSize(new Dimension(width * 45 / 100, height * 7 / 100));
		emptyTitlePanel.setBackground(Colors.lgrey);
		add(emptyTitlePanel);

		ContentPanel captainIconPanel = new ContentPanel(width * 25 / 100, height * 25 / 100, Colors.grey,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		captainIconLabel = new JLabel();
		captainIconLabel.setIcon(imageLoader.loadImageIcon("/portraits/unknown.png", width / 8, height / 3));
		captainIconPanel.insidePanel.add(captainIconLabel);
		add(captainIconPanel);

		captainBaseInfoPanel = new CaptainBaseInfoPanel(width * 33 / 100, height * 25 / 100, Colors.grey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(captainBaseInfoPanel);

		statsBonusPanel = new StatsBonusPanel(width * 36 / 100, height * 25 / 100, Colors.grey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(statsBonusPanel);

		captainBiographyPanel = new CaptainBiographyPanel(width * 95 / 100, height * 25 / 100, Colors.vlgrey,
				new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(captainBiographyPanel);

		orderPanel = new OrderPanel(width * 95 / 100, height * 28 / 100, Colors.grey, new FlowLayout(FlowLayout.LEFT, 1, 2));
		add(orderPanel);
		
		lieutenantsDetailPanel = new LieutenantsDetailPanel(width * 95 / 100, height * 11 / 100);
		add(lieutenantsDetailPanel);

	}

	public void fillCaptainDetailPanel(Regiment regiment, boolean editable, int regimentNumber) {

		captainIconLabel
				.setIcon(imageLoader.loadImageIcon(regiment.captain.iconPath, width * 21 / 100, height * 18 / 100));
		captainBaseInfoPanel.fillCaptainBaseInfoPanel(regiment);
		captainBiographyPanel.fillCaptainBiography(regiment.captain);
		orderPanel.fillOrderPanel(regiment, editable, regimentNumber);
		statsBonusPanel.fillStatsBonusPanel(regiment);
		lieutenantsDetailPanel.fillLieutenantsDetailPanel(regiment, true);

	}

}
