package main.graphics.gameScreen;

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
	public RoleSelectionPanel roleSelectionPanel;
	public RegimentListPanel  regimentListPanel;
	
	RegimentDetailPanel regimentDetailPanel;
	CaptainDetailPanel captainDetailPanel;
	LieutenantsDetailPanel lieutenantsDetailPanel;

	public RegimentView(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(gameScreenWidth, gameScreenHeight);
		setPreferredSize(gameSceneSize);

		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		regimentDetailPanel = new RegimentDetailPanel(gameScreenWidth, gameScreenHeight * 45 / 100);
		add(regimentDetailPanel);
		
		captainDetailPanel = new CaptainDetailPanel(gameScreenWidth, gameScreenHeight * 45 / 100);
		add(captainDetailPanel);
		
		lieutenantsDetailPanel = new LieutenantsDetailPanel(gameScreenWidth, gameScreenHeight / 10);
		add(lieutenantsDetailPanel);

	}
	
	public void fillRegimentView(Regiment regiment, boolean editable) {
		
		regimentDetailPanel.fillRegimentDetailPanel(regiment, editable);
		captainDetailPanel.fillCaptainDetailPanel(regiment, editable);
		lieutenantsDetailPanel.fillLieutenantsDetailPanel(regiment, editable);		
		
	}
	
}
