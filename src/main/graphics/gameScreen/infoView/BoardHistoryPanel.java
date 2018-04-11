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
		setBackground(Colors.vlred);
		setLayout(new FlowLayout(FlowLayout.LEFT, width / 10, height / 10));

		JPanel graphPanel = new JPanel();
		graphPanel.setPreferredSize(new Dimension(width * 8 / 10, height * 8 / 10));
		graphPanel.setBackground(Colors.vlred);
		graphPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(graphPanel);

		minusFourTotalPanel = new JPanel();
		minusFourTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 8 / 10));
		minusFourTotalPanel.setBackground(Colors.vlred);
		minusFourTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		graphPanel.add(minusFourTotalPanel);

		minusFourSatisfactionPanel = new JPanel();
		minusFourSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusFourSatisfactionPanel.setBackground(Colors.green);

		minusFourLeftOverPanel = new JPanel();
		minusFourLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusFourLeftOverPanel.setBackground(Colors.vlred);

		minusFourTotalPanel.add(minusFourLeftOverPanel);
		minusFourTotalPanel.add(minusFourSatisfactionPanel);
		
		minusThreeTotalPanel = new JPanel();
		minusThreeTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 8 / 10));
		minusThreeTotalPanel.setBackground(Colors.vlred);
		minusThreeTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		graphPanel.add(minusThreeTotalPanel);

		minusThreeSatisfactionPanel = new JPanel();
		minusThreeSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusThreeSatisfactionPanel.setBackground(Colors.green);

		minusThreeLeftOverPanel = new JPanel();
		minusThreeLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusThreeLeftOverPanel.setBackground(Colors.vlred);

		minusThreeTotalPanel.add(minusThreeLeftOverPanel);
		minusThreeTotalPanel.add(minusThreeSatisfactionPanel);
		
		minusTwoTotalPanel = new JPanel();
		minusTwoTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 8 / 10));
		minusTwoTotalPanel.setBackground(Colors.vlred);
		minusTwoTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		graphPanel.add(minusTwoTotalPanel);

		minusTwoSatisfactionPanel = new JPanel();
		minusTwoSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusTwoSatisfactionPanel.setBackground(Colors.green);

		minusTwoLeftOverPanel = new JPanel();
		minusTwoLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusTwoLeftOverPanel.setBackground(Colors.vlred);

		minusTwoTotalPanel.add(minusTwoLeftOverPanel);
		minusTwoTotalPanel.add(minusTwoSatisfactionPanel);
		
		minusOneTotalPanel = new JPanel();
		minusOneTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 8 / 10));
		minusOneTotalPanel.setBackground(Colors.vlred);
		minusOneTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		graphPanel.add(minusOneTotalPanel);

		minusOneSatisfactionPanel = new JPanel();
		minusOneSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusOneSatisfactionPanel.setBackground(Colors.green);

		minusOneLeftOverPanel = new JPanel();
		minusOneLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		minusOneLeftOverPanel.setBackground(Colors.vlred);

		minusOneTotalPanel.add(minusOneLeftOverPanel);
		minusOneTotalPanel.add(minusOneSatisfactionPanel);
		
		currentTotalPanel = new JPanel();
		currentTotalPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 8 / 10));
		currentTotalPanel.setBackground(Colors.vlred);
		currentTotalPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		graphPanel.add(currentTotalPanel);

		currentSatisfactionPanel = new JPanel();
		currentSatisfactionPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		currentSatisfactionPanel.setBackground(Colors.green);

		currentLeftOverPanel = new JPanel();
		currentLeftOverPanel.setPreferredSize(new Dimension(width * 16 / 100, height * 4 / 10));
		currentLeftOverPanel.setBackground(Colors.vlred);

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
