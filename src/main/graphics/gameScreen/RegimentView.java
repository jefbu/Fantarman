package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.entity.regiments.Regiment;
import main.graphics.gameScreen.armyView.RegimentListPanel;
import main.graphics.gameScreen.armyView.RoleSelectionPanel;
import main.graphics.gameScreen.regimentView.CaptainDetailPanel;
import main.graphics.gameScreen.regimentView.RegimentDetailPanel;
import main.utility.Colors;

public class RegimentView extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public RoleSelectionPanel roleSelectionPanel;
	public RegimentListPanel  regimentListPanel;
	
	RegimentDetailPanel regimentDetailPanel;
	CaptainDetailPanel captainDetailPanel;

	public RegimentView(int gameScreenWidth, int gameScreenHeight) {

		super();


		Dimension gameSceneSize = new Dimension(gameScreenWidth, gameScreenHeight);
		setPreferredSize(gameSceneSize);

		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(gameScreenWidth / 2, gameScreenHeight));
		leftPanel.setBackground(Colors.dgrey);
		leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, gameScreenHeight * 5 / 100));
		add(leftPanel);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(gameScreenWidth / 2, gameScreenHeight));
		rightPanel.setBackground(Colors.dgrey);
		rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, gameScreenHeight * 5 / 100));
		add(rightPanel);
		
		regimentDetailPanel = new RegimentDetailPanel(gameScreenWidth * 45 / 100, gameScreenHeight * 9 / 10);
		leftPanel.add(regimentDetailPanel);
		
		captainDetailPanel = new CaptainDetailPanel(gameScreenWidth * 45 / 100, gameScreenHeight * 9 / 10);
		rightPanel.add(captainDetailPanel);

	}
	
	public void fillRegimentView(Regiment regiment, boolean editable, int regimentNumber) {
		
		regimentDetailPanel.fillRegimentDetailPanel(regiment, editable, regimentNumber);
		captainDetailPanel.fillCaptainDetailPanel(regiment, editable, regimentNumber);
		
	}
	
}
