package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.armies.Army;
import main.utility.Colors;

public class ShortLeague extends JPanel {

	private static final long serialVersionUID = 1L;

	private ContentPanel titlePanel;
	private ContentPanel titleBarPanel;
	private ContentPanel armiesPanel;
	private ArrayList<ArmyPanel> armyPanels;

	public ShortLeague(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		armyPanels = new ArrayList<ArmyPanel>();
		
		/*
		titlePanel = new ContentPanel(width / 2, height / 10, Colour.DGREEN,
				new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		titlePanel.contentLabel.setForeground(Colors.textyellow);
		titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		titlePanel.contentLabel.setText("LEAGUE");
		add(titlePanel);
		*/

		titleBarPanel = new ContentPanel(width * 95 / 100, height * 165 / 1000, Colors.grey,
				new FlowLayout(FlowLayout.LEADING, 5, 0));
			LabeledPanel namePanel = new LabeledPanel(width * 6 / 10, height / 10);
			namePanel.setBackground(Colors.grey);
			namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, height * 4 / 100));
			namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
			namePanel.label.setForeground(Colors.vlgrey);
			namePanel.label.setText("League");
			titleBarPanel.insidePanel.add(namePanel);
			/*
			LabeledPanel pointsPanel = new LabeledPanel(width * 2 / 10, height / 10);
			pointsPanel.setBackground(Colors.green);
			pointsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 20));
			pointsPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
			pointsPanel.label.setForeground(Colors.textyellow);
			pointsPanel.label.setText("POINTS");
			titleBarPanel.insidePanel.add(pointsPanel);*/
		add(titleBarPanel);

		armiesPanel = new ContentPanel(width * 95 / 100, height * 835 / 1000, Colors.lgrey,
				new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(armiesPanel);
		
		for (int i = 0; i < 8; i++) {
			armyPanels.add(new ArmyPanel(width * 9 / 10, height / 12));
		}
		
		for (ArmyPanel armyPanel: armyPanels) {
			armiesPanel.insidePanel.add(armyPanel);
		}

	}

	public void fillShortLeague() {

		Collections.sort(Main.league.armies, new Comparator<Army>() {
			@Override
			public int compare(Army p1, Army p2) {
				return p2.scoreSheet.totalPoints - p1.scoreSheet.totalPoints;
			}
		});
		
		for (int i = 0; i < armyPanels.size(); i++) {
			armyPanels.get(i).fillArmyPanel(i);
		}
	}

}
