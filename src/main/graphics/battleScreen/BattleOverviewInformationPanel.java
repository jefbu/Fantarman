package main.graphics.battleScreen;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.armies.Army;

public class BattleOverviewInformationPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	
	ContentPanel armyLogoPanel;
	ContentPanel infoPanel;
	ContentPanel totalLifePanel;
	ContentPanel totalValuePanel;
	ContentPanel totalMoralePanel;

	public BattleOverviewInformationPanel(int width, int height, Colour colour, Army army) {
		
		super(width, height, colour);
		
		armyLogoPanel = new ContentPanel (width / 3, height - 10, Colour.BLUE);
		insidePanel.add(armyLogoPanel);
		infoPanel = new ContentPanel(width * 2 / 3, height - 10, Colour.BLUE);
		insidePanel.add(infoPanel);
		totalLifePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour);
		totalValuePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour);
		totalMoralePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour);
		infoPanel.insidePanel.add(totalLifePanel);
		infoPanel.insidePanel.add(totalValuePanel);
		infoPanel.insidePanel.add(totalMoralePanel);
		
	}

}
