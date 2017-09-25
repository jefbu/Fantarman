package main.graphics.gameScreen.regimentView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.graphics.gameScreen.regimentView.regimentDetail.BattleStatsPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.EquipPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.HistoryStatsPanel;
import main.graphics.gameScreen.regimentView.regimentDetail.RegimentBaseInfoPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class RegimentDetailPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ImageLoader imageLoader;
	
	ContentPanel regimentIconPanel;
	JLabel regimentIconLabel;
	RegimentBaseInfoPanel regimentBaseInfoPanel;
	BattleStatsPanel battleStatsPanel;
	HistoryStatsPanel historyStatsPanel;
	EquipPanel equipPanel;
	

	public RegimentDetailPanel(int width, int height) {

		super();
		imageLoader = new ImageLoader();

		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		regimentIconPanel = new ContentPanel(width / 7, height / 2 - 20, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		regimentIconLabel = new JLabel();
		regimentIconPanel.insidePanel.add(regimentIconLabel);
		add(regimentIconPanel);

		regimentBaseInfoPanel = new RegimentBaseInfoPanel(width / 6, height / 2 - 20,
				Colour.DBLUE, new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(regimentBaseInfoPanel);

		battleStatsPanel = new BattleStatsPanel(width / 3, height / 2 - 20, Colour.BLUE,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(battleStatsPanel);

		historyStatsPanel = new HistoryStatsPanel(width / 3, height / 2 - 20, Colour.BLUE,
				new FlowLayout(FlowLayout.LEFT, 3, 3));
		add(historyStatsPanel);

		equipPanel = new EquipPanel(width / 2, height / 2 + 10, Colour.DBLUE,
				new FlowLayout(FlowLayout.LEFT, 3, 3));
		add(equipPanel);
		
	}

	public void fillRegimentDetailPanel(Regiment regiment) {
		
		regimentIconLabel.setIcon(imageLoader.loadImageIcon("/tiles/grass1.png", 128, 156));
		regimentBaseInfoPanel.fillRegimentBaseInfoPanel(regiment);
		battleStatsPanel.fillBattleStatsPanel(regiment);
		historyStatsPanel.fillHistoryStatsPanel(regiment);
		equipPanel.fillEquipPanel(regiment);

	}

}
