package main.graphics.battleScreen;

import java.awt.FlowLayout;

import main.components.Colour;
import main.components.ContentPanel;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

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

	public BattleOverviewInformationPanel(int width, int height, Colour colour) {

		super(width, height, colour, new FlowLayout(FlowLayout.LEFT, 2, 2));

		armyLogoPanel = new ContentPanel(width / 3, height - 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(armyLogoPanel);
		infoPanel = new ContentPanel(width * 2 / 3, height - 10, Colour.BLUE, new FlowLayout(FlowLayout.LEFT, 2, 2));
		insidePanel.add(infoPanel);
		totalLifePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalLifeTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalLifeContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalValuePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalValueTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalValueContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalMoralePanel = new ContentPanel(width * 2 / 3 - 10, height / 3 - 1, colour,
				new FlowLayout(FlowLayout.LEFT, 2, 2));
		totalMoraleTitlePanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 15));
		totalMoraleContentPanel = new ContentPanel(width * 2 / 6 - 5, height / 3 - 10, Colour.BLUE,
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
		for (Regiment regiment: army.roster) {
			totalLife = totalLife + regiment.battleLife; }
		totalLifeContentPanel.contentLabel.setText(Integer.toString(totalLife));
		
		int totalValue = 0;
		for (Regiment regiment: army.roster) {
			totalValue = totalValue + regiment.value; }
		totalValueContentPanel.contentLabel.setText(Integer.toString(totalValue));
		
		int totalMorale = 0;
		for (Regiment regiment: army.roster) {
			totalMorale = totalMorale + regiment.battleMorale; }
		totalMoraleContentPanel.contentLabel.setText(Integer.toString(totalMorale));
		
		
	}

}
