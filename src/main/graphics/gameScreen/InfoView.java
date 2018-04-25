package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.entity.armies.Army;
import main.graphics.gameScreen.infoView.MoneyPanel;
import main.graphics.gameScreen.infoView.RecordPanel;
import main.graphics.gameScreen.infoView.SatisfactionPanel;
import main.graphics.gameScreen.infoView.TrophyPanel;
import main.utility.Colors;

public class InfoView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	MoneyPanel moneyPanel;
	SatisfactionPanel satisfactionPanel;
	RecordPanel recordPanel;
	TrophyPanel trophyPanel;

	public InfoView(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);
		setBackground(Colors.vlblue);
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		moneyPanel = new MoneyPanel(roundedWidth / 3, unroundedHeight * 3 / 4);
		
		satisfactionPanel = new SatisfactionPanel(roundedWidth / 3, unroundedHeight * 3 / 4, Colour.DGREEN); 
		
		recordPanel = new RecordPanel(roundedWidth / 3, unroundedHeight * 3 / 4);
		
		trophyPanel = new TrophyPanel(roundedWidth, unroundedHeight / 4);
		
		
		add(moneyPanel);
		add(satisfactionPanel);
		add(recordPanel);
		add(trophyPanel);
		
	}
	
	public void fillInfoView(Army army) {
		
		moneyPanel.fillMoneyPanel(army);
		satisfactionPanel.fillSatisfactionPanel(army);
		trophyPanel.fillTrophyPanel();
		
	}

}
