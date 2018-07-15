package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import main.Main;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.graphics.gameScreen.infoView.BoardHistoryPanel;
import main.graphics.gameScreen.infoView.FanHistoryPanel;
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
	private FanHistoryPanel fanHistoryPanel;
	private BoardHistoryPanel boardHistoryPanel;

	public ShortInfo(int width, int height) {
		
			super();
			setPreferredSize(new Dimension(width, height));
			setBackground(Colors.dgrey);
			setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			
			/*
			titlePanel = new ContentPanel(width / 2, height / 10, Colour.DBLUE,
					new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			titlePanel.contentLabel.setForeground(Colors.textyellow);
			titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
			titlePanel.contentLabel.setText("INFO");
			add(titlePanel);
			*/

			titleBarPanel = new ContentPanel(width * 97 / 100, height * 165 / 1000, Colors.grey,
					new FlowLayout(FlowLayout.LEADING, 5, 0));

				LabeledPanel namePanel = new LabeledPanel(width * 85 / 100 * 9 / 10, height / 10);
				namePanel.setBackground(Colors.grey);
				namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, height * 4 / 100));
				namePanel.label.setFont(new Font("garamond", Font.BOLD, 16));
				namePanel.label.setForeground(Colors.vlgrey);
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

			infoPanel = new ContentPanel(width * 97 / 100, height * 71 / 100, Colors.lgrey,
					new FlowLayout(FlowLayout.LEFT, 0, 0));
			add(infoPanel);
			
			int halfWidth = width * 97 / 100 / 2 - 7;
			
			JPanel leftPanel = new JPanel();
			leftPanel.setPreferredSize(new Dimension(halfWidth, height * 71 / 100));
			leftPanel.setBackground(Colors.vdgrey);
			leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			infoPanel.insidePanel.add(leftPanel);
			
			JPanel rightPanel = new JPanel();
			rightPanel.setPreferredSize(new Dimension(halfWidth, height * 71 / 100));
			rightPanel.setBackground(Colors.vdgrey);
			rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			infoPanel.insidePanel.add(rightPanel);
						
			balancePanel = new LabeledPanel(halfWidth * 7 / 10, height / 10);
			balancePanel.setBackground(Colors.lgrey);
			balancePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			balancePanel.label.setForeground(Colors.vdgrey);
			balancePanel.label.setText("Balance");
			leftPanel.add(balancePanel);
			
			balanceResultPanel = new LabeledPanel(halfWidth * 3 / 10 , height / 10);
			balanceResultPanel.setBackground(Colors.lgrey);
			balanceResultPanel.label.setForeground(Colors.vdgrey);
			leftPanel.add(balanceResultPanel);
			
			projectionPanel = new LabeledPanel(halfWidth * 7 / 10, height / 10);
			projectionPanel.setBackground(Colors.lgrey);
			projectionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			projectionPanel.label.setForeground(Colors.vdgrey);
			projectionPanel.label.setText("Projection");
			leftPanel.add(projectionPanel);	
			
			projectionResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 10);
			projectionResultPanel.setBackground(Colors.lgrey);
			projectionResultPanel.label.setForeground(Colors.vdgrey);
			leftPanel.add(projectionResultPanel);		
			
			boardSatisfactionPanel = new LabeledPanel(halfWidth * 7 / 10, height / 10);
			boardSatisfactionPanel.setBackground(Colors.lgrey);
			boardSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			boardSatisfactionPanel.label.setForeground(Colors.vdgrey);
			boardSatisfactionPanel.label.setText("Board Satisfaction");
			leftPanel.add(boardSatisfactionPanel);	
			
			boardSatisfactionResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 10);
			boardSatisfactionResultPanel.setBackground(Colors.lgrey);
			boardSatisfactionResultPanel.label.setForeground(Colors.vdgrey);
			leftPanel.add(boardSatisfactionResultPanel);	
			
			boardHistoryPanel = new BoardHistoryPanel(halfWidth / 2, height / 7);
			leftPanel.add(boardHistoryPanel);
			
			fanSatisfactionPanel = new LabeledPanel(halfWidth * 7 / 10, height / 10);
			fanSatisfactionPanel.setBackground(Colors.lgrey);
			fanSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
			fanSatisfactionPanel.label.setForeground(Colors.vdgrey);
			fanSatisfactionPanel.label.setText("Fan Satisfaction");
			leftPanel.add(fanSatisfactionPanel);
			
			fanSatisfactionResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 10);
			fanSatisfactionResultPanel.setBackground(Colors.lgrey);
			fanSatisfactionResultPanel.label.setForeground(Colors.vdgrey);
			leftPanel.add(fanSatisfactionResultPanel);	
			
			fanHistoryPanel = new FanHistoryPanel(halfWidth, height / 7);
			leftPanel.add(fanHistoryPanel);
			
			trophyPanel = new LabeledPanel(width * 3 / 10, height / 10);
			trophyPanel.setBackground(Colors.lgrey);
			trophyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			trophyPanel.label.setForeground(Colors.vdgrey);
			trophyPanel.label.setText("Tophies");
			infoPanel.insidePanel.add(trophyPanel);
			
			trophyResultPanel = new LabeledPanel(width / 10, height * 7 / 10 / 10);
			trophyResultPanel.setBackground(Colors.lgrey);
			trophyResultPanel.label.setForeground(Colors.vdgrey);
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
