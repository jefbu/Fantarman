package main.graphics.gameScreen.regimentView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
	JPanel regimentIconNamePanel;
	RegimentBaseInfoPanel regimentBaseInfoPanel;
	BattleStatsPanel battleStatsPanel;
	HistoryStatsPanel historyStatsPanel;
	EquipPanel equipPanel;

	public RegimentDetailPanel(int width, int height) {

		super();
		imageLoader = new ImageLoader();

		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, width * 2 / 100, height * 2 / 100));

		ContentPanel bigTitlePanel = new ContentPanel(width * 25 / 100, height * 7 / 100, Colors.dgrey,
				new FlowLayout(FlowLayout.LEFT, 5, 5));
		add(bigTitlePanel);
		
		bigTitlePanel.contentLabel.setForeground(Colors.vlgrey);
		bigTitlePanel.contentLabel.setText("Regiment");
		
		JPanel emptyTitlePanel = new JPanel();
		emptyTitlePanel.setPreferredSize(new Dimension(width * 60 / 100, height * 7 / 100));
		emptyTitlePanel.setBackground(Colors.lgrey);
		add(emptyTitlePanel);

		regimentIconPanel = new ContentPanel(width * 25 / 100, height / 4, Colors.grey,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		regimentIconLabel = new JLabel();
		regimentIconPanel.insidePanel.add(regimentIconLabel);
		add(regimentIconPanel);

		regimentBaseInfoPanel = new RegimentBaseInfoPanel(width * 69 / 100, height / 4, Colors.grey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(regimentBaseInfoPanel);

		battleStatsPanel = new BattleStatsPanel(width * 63 / 100, height / 4, Colors.grey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(battleStatsPanel);

		historyStatsPanel = new HistoryStatsPanel(width * 31 / 100, height / 4, Colors.grey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(historyStatsPanel);

		equipPanel = new EquipPanel(width * 95 / 100, height * 39 / 100, Colors.vlgrey,
				new FlowLayout(FlowLayout.LEFT, 0, 1));
		add(equipPanel);

	}

	public void fillRegimentDetailPanel(Regiment regiment, boolean editable) {

		regimentIconLabel.setIcon(regiment.largeIcon);
		regimentBaseInfoPanel.fillRegimentBaseInfoPanel(regiment);
		battleStatsPanel.fillBattleStatsPanel(regiment);
		historyStatsPanel.fillHistoryStatsPanel(regiment);
		equipPanel.fillEquipPanel(regiment, editable);

	}

}
