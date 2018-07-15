package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.FlowLayout;

import main.components.ContentPanel;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.utility.Colors;
import main.utility.ImageLoader;

public class BattleOverviewInformationPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;

	ContentPanel armyLogoPanel;
	ContentPanel infoPanel;
	ContentPanel totalLifePanel;
	ContentPanel totalLifeTitlePanel;
	ContentPanel totalLifeContentPanel;
	ContentPanel totalValuePanel;
	ContentPanel totalValueTitlePanel;
	ContentPanel totalValueContentPanel;
	ContentPanel totalMoralePanel;
	ContentPanel totalMoraleTitlePanel;
	ContentPanel totalMoraleContentPanel;

	private int armyLogoWidth;
	private int armyLogoHeight;

	public BattleOverviewInformationPanel(int width, int height, Color colour) {

		super(width, height, colour, new FlowLayout(FlowLayout.LEFT, 2, 2));

		armyLogoWidth = width / 3;
		armyLogoHeight = height - 10;

		armyLogoPanel = new ContentPanel(armyLogoWidth, armyLogoHeight, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 0));
		insidePanel.add(armyLogoPanel);
		infoPanel = new ContentPanel(width * 2 / 3, height - 10, Colors.dblue, new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(infoPanel);
		totalLifePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalLifeTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalLifeContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalValuePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalValueTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalValueContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalMoralePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalMoraleTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalMoraleContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colors.dblue,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		infoPanel.insidePanel.add(totalLifePanel);
		totalLifePanel.insidePanel.add(totalLifeTitlePanel);
		totalLifePanel.insidePanel.add(totalLifeContentPanel);
		infoPanel.insidePanel.add(totalValuePanel);
		totalValuePanel.insidePanel.add(totalValueTitlePanel);
		totalValuePanel.insidePanel.add(totalValueContentPanel);
		infoPanel.insidePanel.add(totalMoralePanel);
		totalMoralePanel.insidePanel.add(totalMoraleTitlePanel);
		totalMoralePanel.insidePanel.add(totalMoraleContentPanel);

		totalLifeTitlePanel.contentLabel.setText("TOTAL LIFE");
		totalValueTitlePanel.contentLabel.setText("TOTAL VALUE");
		totalMoraleTitlePanel.contentLabel.setText("TOTAL MORALE");

	}

	public void update(Army army) {

		int totalLife = 0;
		for (Regiment regiment : army.roster) {
			totalLife = totalLife + regiment.battleLife;
		}
		totalLifeContentPanel.contentLabel.setText(Integer.toString(totalLife));

		int totalValue = 0;
		for (Regiment regiment : army.roster) {
			totalValue = totalValue + regiment.value;
		}
		totalValueContentPanel.contentLabel.setText(Integer.toString(totalValue));

		int totalMorale = 0;
		for (Regiment regiment : army.roster) {
			totalMorale = totalMorale + regiment.battleMorale;
		}
		totalMoraleContentPanel.contentLabel.setText(Integer.toString(totalMorale));

	}

	public void fillBattleOverviewInformationPanel(Army army) {

		ImageLoader imageLoader = new ImageLoader();

		switch (army.name) {
		case "Piknin Pickles":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/PikninPickles.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Wanted Wanmen":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Wanmen.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Terrible Terquits":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Terquits.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Skylords":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Skylords.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Chi Destroyers":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/ChiDestroyers.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Espequr":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Espequr.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Metropolitans":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Metropolitans.png", armyLogoWidth, armyLogoHeight));
			break;
		case "Multicultural Society":
			armyLogoPanel.contentLabel
					.setIcon(imageLoader.loadImageIcon("/ArmyLogo/Multicultural.png", armyLogoWidth, armyLogoHeight));
			break;
		}

	}

}
