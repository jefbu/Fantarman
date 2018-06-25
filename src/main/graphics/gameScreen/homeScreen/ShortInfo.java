package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.utility.Colors;
import main.utility.LoadTrophies;
import main.utility.Trophies;

public class ShortInfo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ContentPanel titlePanel;
	private ContentPanel titleBarPanel;
	private ContentPanel infoPanel;
	private LabeledPanel balancePanel;
	private LabeledPanel balanceResultPanel;
	private LabeledPanel projectionPanel;
	private LabeledPanel projectionResultPanel;
	private LabeledPanel boardSatisfactionPanel;
	private LabeledPanel boardSatisfactionResultPanel;
	private LabeledPanel fanSatisfactionPanel;
	private LabeledPanel fanSatisfactionResultPanel;
	private LabeledPanel trophyPanel;
	private LabeledPanel trophyResultPanel;

	public ShortInfo(int width, int height) {
		
			super();
			setPreferredSize(new Dimension(width, height));
			setBackground(Colors.backgroundOrange);
			setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
			
			/*
			titlePanel = new ContentPanel(width / 2, height / 10, Colour.DBLUE,
					new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			titlePanel.contentLabel.setForeground(Colors.textyellow);
			titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
			titlePanel.contentLabel.setText("INFO");
			add(titlePanel);
			*/

			titleBarPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.RED,
					new FlowLayout(FlowLayout.LEADING, 0, 0));

				LabeledPanel namePanel = new LabeledPanel(width * 85 / 100 * 9 / 10, height / 10);
				namePanel.setBackground(Colors.orange);
				namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
				namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
				namePanel.label.setForeground(Colors.textyellow);
				namePanel.label.setText("Information");
				titleBarPanel.insidePanel.add(namePanel);
				/*
				LabeledPanel resultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height / 10);
				resultPanel.label.setText("RESULT");
				resultPanel.setBackground(Colors.blue);
				resultPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
				resultPanel.label.setFont(new Font("garamond", Font.BOLD, 16));
				resultPanel.label.setForeground(Colors.textyellow);
				titleBarPanel.insidePanel.add(resultPanel);
				*/
			
			add(titleBarPanel);

			infoPanel = new ContentPanel(width * 9 / 10, height * 7 / 10, Colour.LRED,
					new FlowLayout(FlowLayout.LEFT, 0, 0));
			add(infoPanel);
			
			balancePanel = new LabeledPanel(width * 85 / 100 * 7 / 10, height * 7 / 10 / 10);
			balancePanel.setBackground(Colors.lorange);
			balancePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			balancePanel.label.setForeground(Colors.vdorange);
			balancePanel.label.setText("Balance");
			infoPanel.insidePanel.add(balancePanel);
			
			balanceResultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height * 7 / 10 / 10);
			balanceResultPanel.setBackground(Colors.lorange);
			balanceResultPanel.label.setForeground(Colors.vdorange);
			infoPanel.insidePanel.add(balanceResultPanel);
			
			projectionPanel = new LabeledPanel(width * 85 / 100 * 7 / 10, height * 7 / 10 / 10);
			projectionPanel.setBackground(Colors.lorange);
			projectionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			projectionPanel.label.setForeground(Colors.vdorange);
			projectionPanel.label.setText("Projection");
			infoPanel.insidePanel.add(projectionPanel);	
			
			projectionResultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height * 7 / 10 / 10);
			projectionResultPanel.setBackground(Colors.lorange);
			projectionResultPanel.label.setForeground(Colors.vdorange);
			infoPanel.insidePanel.add(projectionResultPanel);		
			
			boardSatisfactionPanel = new LabeledPanel(width * 85 / 100 * 7 / 10, height * 7 / 10 / 10);
			boardSatisfactionPanel.setBackground(Colors.lorange);
			boardSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			boardSatisfactionPanel.label.setForeground(Colors.vdorange);
			boardSatisfactionPanel.label.setText("Board Satisfaction");
			infoPanel.insidePanel.add(boardSatisfactionPanel);	
			
			boardSatisfactionResultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height * 7 / 10 / 10);
			boardSatisfactionResultPanel.setBackground(Colors.lorange);
			boardSatisfactionResultPanel.label.setForeground(Colors.vdorange);
			infoPanel.insidePanel.add(boardSatisfactionResultPanel);			
			
			fanSatisfactionPanel = new LabeledPanel(width * 85 / 100 * 7 / 10, height * 7 / 10 / 10);
			fanSatisfactionPanel.setBackground(Colors.lorange);
			fanSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			fanSatisfactionPanel.label.setForeground(Colors.vdorange);
			fanSatisfactionPanel.label.setText("Projection");
			infoPanel.insidePanel.add(fanSatisfactionPanel);
			
			fanSatisfactionResultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height * 7 / 10 / 10);
			fanSatisfactionResultPanel.setBackground(Colors.lorange);
			fanSatisfactionResultPanel.label.setForeground(Colors.vdorange);
			infoPanel.insidePanel.add(fanSatisfactionResultPanel);			
			
			trophyPanel = new LabeledPanel(width * 85 / 100 * 7 / 10, height * 7 / 10 / 10);
			trophyPanel.setBackground(Colors.lorange);
			trophyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			trophyPanel.label.setForeground(Colors.vdorange);
			trophyPanel.label.setText("Tophies");
			infoPanel.insidePanel.add(trophyPanel);
			
			trophyResultPanel = new LabeledPanel(width * 85 / 100 * 3 / 10, height * 7 / 10 / 10);
			trophyResultPanel.setBackground(Colors.lorange);
			trophyResultPanel.label.setForeground(Colors.vdorange);
			infoPanel.insidePanel.add(trophyResultPanel);
			
			

		}
	
	public void fillShortInformation() {
		
		Main.yourArmy.calculateIncome();
		Main.yourArmy.calculateUpkeep();
		LoadTrophies.load();

		balanceResultPanel.label.setText(Integer.toString(Main.yourArmy.money));
		projectionResultPanel.label.setText(Integer.toString(Main.yourArmy.income - Main.yourArmy.upkeep));
		boardSatisfactionResultPanel.label.setText(Integer.toString(Main.yourArmy.boardSatisfaction));
		fanSatisfactionResultPanel.label.setText(Integer.toString(Main.yourArmy.fanSatisfaction));
		
		int trophies = 0;
		if (Trophies.spaghetti) trophies++;
		if (Trophies.wonLeague) trophies++;
		
		trophyResultPanel.label.setText(trophies + " / 2"); 
		
	}

}
