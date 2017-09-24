package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.entity.regiments.Regiment;
import main.graphics.gameScreen.armyView.RegimentListPanel;
import main.graphics.gameScreen.armyView.RoleSelectionPanel;
import main.graphics.gameScreen.regimentView.CaptainDetailPanel;
import main.graphics.gameScreen.regimentView.LieutenantsDetailPanel;
import main.graphics.gameScreen.regimentView.RegimentDetailPanel;

public class RegimentView extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Color backgroundColor;
	public RoleSelectionPanel roleSelectionPanel;
	public RegimentListPanel  regimentListPanel;
	
	RegimentDetailPanel regimentDetailPanel;
	CaptainDetailPanel captainDetailPanel;
	LieutenantsDetailPanel lieutenantsDetailPanel;

	public RegimentView(int gameScreenWidth, int gameScreenHeight) {

		super();

		backgroundColor = new Color(170, 190, 255);
		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);

		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		regimentDetailPanel = new RegimentDetailPanel(roundedWidth, unroundedHeight * 45 / 100);
		add(regimentDetailPanel);
		
		captainDetailPanel = new CaptainDetailPanel(roundedWidth, unroundedHeight * 45 / 100);
		add(captainDetailPanel);
		
		lieutenantsDetailPanel = new LieutenantsDetailPanel(roundedWidth, unroundedHeight / 10);
		add(lieutenantsDetailPanel);

	}
	
	public void fillRegimentView(Regiment regiment) {
		
		regimentDetailPanel.fillRegimentDetailPanel(regiment);
		captainDetailPanel.fillCaptainDetailPanel(regiment);
		lieutenantsDetailPanel.fillLieutenantsDetailPanel(regiment);		
		
	}
	
}
