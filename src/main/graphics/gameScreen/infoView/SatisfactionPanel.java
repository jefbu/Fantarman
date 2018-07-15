package main.graphics.gameScreen.infoView;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.entity.armies.Army;
import main.utility.Colors;

public class SatisfactionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ContentPanel titlePanel;
	private ContentPanel boardSatisfactionPanel;
	private LabeledPanel boardSatisfactionAmountPanel;
	private ContentPanel fanSatisfactionPanel;
	private LabeledPanel fanSatisfactionAmountPanel;
	
	private BoardHistoryPanel boardHistoryPanel;
	private FanHistoryPanel fanHistoryPanel;
	
	public SatisfactionPanel(int width, int height, Colour colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.backgroundOrange);
		
		titlePanel = new ContentPanel(width / 2, height / 10, Colors.dorange,
				new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		titlePanel.contentLabel.setForeground(Colors.textyellow);
		titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		titlePanel.contentLabel.setText("HAPPINESS");
		add(titlePanel);
		
		boardSatisfactionPanel = new ContentPanel(width * 9 / 10, height / 10, Colors.orange,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel boardSatisfactionTitlePanel = new LabeledPanel(width * 6 / 10, height / 20);
			boardSatisfactionTitlePanel.setBackground(Colors.orange);
			boardSatisfactionTitlePanel.label.setForeground(Colors.textyellow);
			boardSatisfactionTitlePanel.label.setText("Board Satisfaction");
			boardSatisfactionPanel.insidePanel.add(boardSatisfactionTitlePanel);
			boardSatisfactionAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			boardSatisfactionAmountPanel.setBackground(Colors.orange);
			boardSatisfactionAmountPanel.label.setForeground(Colors.textyellow);
			boardSatisfactionAmountPanel.label.setText("0");
			boardSatisfactionPanel.insidePanel.add(boardSatisfactionAmountPanel);
		add(boardSatisfactionPanel);
		
		boardHistoryPanel = new BoardHistoryPanel(width * 9 / 10, height * 29 / 100);
		add(boardHistoryPanel);
		
		fanSatisfactionPanel = new ContentPanel(width * 9 / 10, height / 10, Colors.orange,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel fanSatisfactionTitlePanel = new LabeledPanel(width * 6 / 10, height / 20);
			fanSatisfactionTitlePanel.setBackground(Colors.orange);
			fanSatisfactionTitlePanel.label.setForeground(Colors.textyellow);
			fanSatisfactionTitlePanel.label.setText("Fan Satisfaction");
			fanSatisfactionPanel.insidePanel.add(fanSatisfactionTitlePanel);
			fanSatisfactionAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			fanSatisfactionAmountPanel.setBackground(Colors.orange);
			fanSatisfactionAmountPanel.label.setForeground(Colors.textyellow);
			fanSatisfactionAmountPanel.label.setText("0");
			fanSatisfactionPanel.insidePanel.add(fanSatisfactionAmountPanel);
		add(fanSatisfactionPanel);
		
		fanHistoryPanel = new FanHistoryPanel(width * 9 / 10, height * 29 / 100);
		add(fanHistoryPanel);
		
	}
	
	
	public void fillSatisfactionPanel(Army army) {
		
		boardSatisfactionAmountPanel.label.setText(Integer.toString(army.boardSatisfaction));
		fanSatisfactionAmountPanel.label.setText(Integer.toString(army.fanSatisfaction));

		boardHistoryPanel.fillBoardHistoryPanel(army);
		fanHistoryPanel.fillFanHistoryPanel(army);
		
	}
	

}
