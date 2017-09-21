package main.graphics.gameScreen.regimentView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.BattleStatsPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.EquipPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.HistoryStatsPanel;
import main.utility.ImageLoader;

public class RegimentDetailPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ImageLoader imageLoader;

	public RegimentDetailPanel(int width, int height) {
		
		super();
		imageLoader = new ImageLoader();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(170, 190, 255));
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		ContentPanel regimentIconPanel = new ContentPanel(width / 7, height / 2 - 20, Colour.BLUE, new FlowLayout(FlowLayout.CENTER, 0, 15));
			JLabel regimentIconLabel = new JLabel();
			regimentIconLabel.setIcon(imageLoader.loadImageIcon("/tiles/grass1.png", width / 8, height / 3));
			regimentIconPanel.insidePanel.add(regimentIconLabel);
		add(regimentIconPanel);
		
		BattleStatsPanel battleStatsPanel = new BattleStatsPanel(width / 3, height / 2 - 20, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 3, 3));
		add(battleStatsPanel);
		
		HistoryStatsPanel historyStatsPanel = new HistoryStatsPanel(width / 3, height / 2 - 20, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 3, 3));
		add(historyStatsPanel);
		
		EquipPanel equipPanel = new EquipPanel(width / 2, height / 2 + 10, Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 3, 3));
		add(equipPanel);
		
		
		
	}

}
