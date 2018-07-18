package main.graphics.gameScreen.infoView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.entity.armies.Army;
import main.utility.Colors;

public class BoardHistoryPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	int width;
	int height;

	JPanel minusFourTotalPanel;
	JPanel minusFourSatisfactionPanel;
	JPanel minusFourLeftOverPanel;
	
	JPanel minusThreeTotalPanel;
	JPanel minusThreeSatisfactionPanel;
	JPanel minusThreeLeftOverPanel;
	
	JPanel minusTwoTotalPanel;
	JPanel minusTwoSatisfactionPanel;
	JPanel minusTwoLeftOverPanel;
	
	JPanel minusOneTotalPanel;
	JPanel minusOneSatisfactionPanel;
	JPanel minusOneLeftOverPanel;
	
	JPanel currentTotalPanel;
	JPanel currentSatisfactionPanel;
	JPanel currentLeftOverPanel;

	public BoardHistoryPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));

		minusFourTotalPanel = new JPanel();
		minusFourTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 2 / 3));
		minusFourTotalPanel.setBackground(Colors.lgrey);
		minusFourTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(minusFourTotalPanel);

		minusFourSatisfactionPanel = new JPanel();
		minusFourSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusFourSatisfactionPanel.setBackground(Colors.vlgrey);

		minusFourLeftOverPanel = new JPanel();
		minusFourLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusFourLeftOverPanel.setBackground(Colors.lgrey);

		minusFourTotalPanel.add(minusFourLeftOverPanel);
		minusFourTotalPanel.add(minusFourSatisfactionPanel);
		
		minusThreeTotalPanel = new JPanel();
		minusThreeTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 2 / 3));
		minusThreeTotalPanel.setBackground(Colors.lgrey);
		minusThreeTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(minusThreeTotalPanel);

		minusThreeSatisfactionPanel = new JPanel();
		minusThreeSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusThreeSatisfactionPanel.setBackground(Colors.vlgrey);

		minusThreeLeftOverPanel = new JPanel();
		minusThreeLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusThreeLeftOverPanel.setBackground(Colors.lgrey);

		minusThreeTotalPanel.add(minusThreeLeftOverPanel);
		minusThreeTotalPanel.add(minusThreeSatisfactionPanel);
		
		minusTwoTotalPanel = new JPanel();
		minusTwoTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 2 / 3));
		minusTwoTotalPanel.setBackground(Colors.lgrey);
		minusTwoTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(minusTwoTotalPanel);

		minusTwoSatisfactionPanel = new JPanel();
		minusTwoSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusTwoSatisfactionPanel.setBackground(Colors.vlgrey);

		minusTwoLeftOverPanel = new JPanel();
		minusTwoLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusTwoLeftOverPanel.setBackground(Colors.lgrey);

		minusTwoTotalPanel.add(minusTwoLeftOverPanel);
		minusTwoTotalPanel.add(minusTwoSatisfactionPanel);
		
		minusOneTotalPanel = new JPanel();
		minusOneTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 2 / 3));
		minusOneTotalPanel.setBackground(Colors.lgrey);
		minusOneTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(minusOneTotalPanel);

		minusOneSatisfactionPanel = new JPanel();
		minusOneSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusOneSatisfactionPanel.setBackground(Colors.vlgrey);

		minusOneLeftOverPanel = new JPanel();
		minusOneLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		minusOneLeftOverPanel.setBackground(Colors.lgrey);

		minusOneTotalPanel.add(minusOneLeftOverPanel);
		minusOneTotalPanel.add(minusOneSatisfactionPanel);
		
		currentTotalPanel = new JPanel();
		currentTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 2 / 3));
		currentTotalPanel.setBackground(Colors.lgrey);
		currentTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(currentTotalPanel);

		currentSatisfactionPanel = new JPanel();
		currentSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		currentSatisfactionPanel.setBackground(Colors.vlgrey);

		currentLeftOverPanel = new JPanel();
		currentLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height / 3));
		currentLeftOverPanel.setBackground(Colors.lgrey);

		currentTotalPanel.add(currentLeftOverPanel);
		currentTotalPanel.add(currentSatisfactionPanel);

	}

	public void fillBoardHistoryPanel(Army army) {

		minusFourLeftOverPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * (100 - army.previousBoardSatisfaction[0]) / 100));
		minusFourSatisfactionPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * army.previousBoardSatisfaction[0] / 100));
		minusFourSatisfactionPanel.setBackground(new Color(70, army.previousBoardSatisfaction[0], 0));
		
		minusFourTotalPanel.revalidate();
		minusFourTotalPanel.repaint();
		
		minusThreeLeftOverPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * (100 - army.previousBoardSatisfaction[1]) / 100));
		minusThreeSatisfactionPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * army.previousBoardSatisfaction[1] / 100));
		minusThreeSatisfactionPanel.setBackground(new Color(70, army.previousBoardSatisfaction[1], 0));
		
		minusThreeTotalPanel.revalidate();
		minusThreeTotalPanel.repaint();
		
		minusTwoLeftOverPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * (100 - army.previousBoardSatisfaction[2]) / 100));
		minusTwoSatisfactionPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * army.previousBoardSatisfaction[2] / 100));
		minusTwoSatisfactionPanel.setBackground(new Color(70, army.previousBoardSatisfaction[2], 0));
		
		minusTwoTotalPanel.revalidate();
		minusTwoTotalPanel.repaint();
		
		minusOneLeftOverPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * (100 - army.previousBoardSatisfaction[3]) / 100));
		minusOneSatisfactionPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * army.previousBoardSatisfaction[3] / 100));
		minusOneSatisfactionPanel.setBackground(new Color(70, army.previousBoardSatisfaction[3], 0));

		minusOneTotalPanel.revalidate();
		minusOneTotalPanel.repaint();
		
		currentLeftOverPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * (100 - army.boardSatisfaction) / 100));
		currentSatisfactionPanel.setPreferredSize(
				new Dimension(width * 15 / 100, height * 8 / 10 * army.boardSatisfaction / 100));
		currentSatisfactionPanel.setBackground(new Color(70, army.boardSatisfaction, 0));

		currentTotalPanel.revalidate();
		currentTotalPanel.repaint();

	}
	

}
