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
	
	public SatisfactionPanel(int width, int height, Colour colour) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		
		titlePanel = new ContentPanel(width / 2, height / 10, Colour.DRED,
				new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		titlePanel.contentLabel.setForeground(Colors.textyellow);
		titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		titlePanel.contentLabel.setText("HAPPINESS");
		add(titlePanel);
		
		boardSatisfactionPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.RED,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel boardSatisfactionTitlePanel = new LabeledPanel(width * 6 / 10, height / 20);
			boardSatisfactionTitlePanel.setBackground(Colors.red);
			boardSatisfactionTitlePanel.label.setForeground(Colors.textyellow);
			boardSatisfactionTitlePanel.label.setText("Board Satisfaction");
			boardSatisfactionPanel.insidePanel.add(boardSatisfactionTitlePanel);
			boardSatisfactionAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			boardSatisfactionAmountPanel.setBackground(Colors.red);
			boardSatisfactionAmountPanel.label.setForeground(Colors.textyellow);
			boardSatisfactionAmountPanel.label.setText("0");
			boardSatisfactionPanel.insidePanel.add(boardSatisfactionAmountPanel);
		add(boardSatisfactionPanel);
		
		JPanel inbetween = new JPanel();
		inbetween.setPreferredSize(new Dimension(width * 9 / 10, height * 29 / 100));
		add(inbetween);
		
		fanSatisfactionPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.RED,
				new FlowLayout(FlowLayout.LEFT, 0, height / 10 / 6));
			LabeledPanel fanSatisfactionTitlePanel = new LabeledPanel(width * 6 / 10, height / 20);
			fanSatisfactionTitlePanel.setBackground(Colors.red);
			fanSatisfactionTitlePanel.label.setForeground(Colors.textyellow);
			fanSatisfactionTitlePanel.label.setText("Fan Satisfaction");
			fanSatisfactionPanel.insidePanel.add(fanSatisfactionTitlePanel);
			fanSatisfactionAmountPanel = new LabeledPanel(width * 25 / 100, height / 20);
			fanSatisfactionAmountPanel.setBackground(Colors.red);
			fanSatisfactionAmountPanel.label.setForeground(Colors.textyellow);
			fanSatisfactionAmountPanel.label.setText("0");
			fanSatisfactionPanel.insidePanel.add(fanSatisfactionAmountPanel);
		add(fanSatisfactionPanel);
		
		JPanel inbetween2 = new JPanel();
		inbetween2.setPreferredSize(new Dimension(width * 9 / 10, height * 29 / 100));
		add(inbetween2);
		
	}
	
	
	public void fillSatisfactionPanel(Army army) {
		
		boardSatisfactionAmountPanel.label.setText("20");
		
	}
	

}
