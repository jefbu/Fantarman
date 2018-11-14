package main.graphics.gameScreen.regimentView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.components.ContentPanel;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
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

	JButton previousButton;
	JButton nextButton;

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

		JPanel nextPreviousPanel = new JPanel();
		nextPreviousPanel.setPreferredSize(new Dimension(width * 60 / 100, height * 7 / 100));
		nextPreviousPanel.setBackground(Colors.lgrey);
		nextPreviousPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		add(nextPreviousPanel);

		ImageLoader imageLoader = new ImageLoader();

		previousButton = new JButton();
		previousButton.setContentAreaFilled(false);
		previousButton.setBorder(null);
		previousButton.setOpaque(false);
		previousButton.setPreferredSize(new Dimension(width * 10 / 100, height * 5 / 100));
		previousButton
				.setIcon(imageLoader.loadImageIcon("/icons/previousButton.png", width * 8 / 100, height * 5 / 100));

		nextButton = new JButton();
		nextButton.setContentAreaFilled(false);
		nextButton.setBorder(null);
		nextButton.setOpaque(false);
		nextButton.setPreferredSize(new Dimension(width * 10 / 100, height * 5 / 100));
		nextButton.setIcon(imageLoader.loadImageIcon("/icons/nextButton.png", width * 8 / 100, height * 5 / 100));

		nextPreviousPanel.add(previousButton);
		nextPreviousPanel.add(nextButton);

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

	public void fillRegimentDetailPanel(Regiment regiment, boolean editable, int regimentNumber) {

		regimentIconLabel.setIcon(regiment.largeIcon);
		regimentBaseInfoPanel.fillRegimentBaseInfoPanel(regiment);
		battleStatsPanel.fillBattleStatsPanel(regiment);
		historyStatsPanel.fillHistoryStatsPanel(regiment);
		equipPanel.fillEquipPanel(regiment, editable, regimentNumber);

		try {
			nextButton.removeActionListener(nextButton.getActionListeners()[0]);
			previousButton.removeActionListener(previousButton.getActionListeners()[0]);
		} catch (Exception e) {
		}

		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (regimentNumber > 0) {
					Screen.gameScreen.mainPanel.regimentView
							.fillRegimentView(Main.yourArmy.roster.get(regimentNumber - 1), true, regimentNumber - 1);
				} else {
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(
							Main.yourArmy.roster.get(Main.yourArmy.roster.size() - 1), true, Main.yourArmy.roster.size() - 1);
				}
			}
		});

		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (regimentNumber < Main.yourArmy.roster.size() - 1) {
				Screen.gameScreen.mainPanel.regimentView.fillRegimentView(Main.yourArmy.roster.get(regimentNumber + 1),
						true, regimentNumber + 1);
				} else {
				Screen.gameScreen.mainPanel.regimentView.fillRegimentView(Main.yourArmy.roster.get(0), true, 0);	
				}
			}
		});

	}

}
