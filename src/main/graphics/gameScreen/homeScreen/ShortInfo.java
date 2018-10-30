package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.components.ContentPanel;
import main.components.LabeledPanel;
import main.graphics.Screen;
import main.graphics.gameScreen.infoView.BoardHistoryPanel;
import main.graphics.gameScreen.infoView.FanHistoryPanel;
import main.utility.Colors;
import main.utility.ImageLoader;
import main.utility.LoadTrophies;
import main.utility.Trophies;

public class ShortInfo extends JPanel {

	private static final long serialVersionUID = 1L;

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
	private FanHistoryPanel fanHistoryPanel;
	private BoardHistoryPanel boardHistoryPanel;
	private JPanel spaghettiPanel;
	private JLabel spaghettiLabel;
	private JPanel wonLeaguePanel;
	private JLabel wonLeagueLabel;
	private JPanel calciumPanel;
	private JLabel calciumLabel;
	private JPanel stagPanel;
	private JLabel stagLabel;

	private ImageLoader imageLoader;

	public ShortInfo(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.dgrey);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		/*
		 * titlePanel = new ContentPanel(width / 2, height / 10, Colour.DBLUE,
		 * new FlowLayout(FlowLayout.CENTER, 0, height / 50));
		 * titlePanel.contentLabel.setForeground(Colors.textyellow);
		 * titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
		 * titlePanel.contentLabel.setText("INFO"); add(titlePanel);
		 */

		titleBarPanel = new ContentPanel(width * 97 / 100, height * 165 / 1000, Colors.grey,
				new FlowLayout(FlowLayout.LEADING, 5, 0));

		LabeledPanel namePanel = new LabeledPanel(width * 85 / 100 * 9 / 10, height / 10);
		namePanel.setBackground(Colors.grey);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, height * 4 / 100));
		namePanel.label.setFont(new Font("garamond", Font.BOLD, Screen.FONTSIZE));
		namePanel.label.setForeground(Colors.vlgrey);
		namePanel.label.setText("Information");
		titleBarPanel.insidePanel.add(namePanel);
		/*
		 * LabeledPanel resultPanel = new LabeledPanel(width * 85 / 100 * 3 /
		 * 10, height / 10); resultPanel.label.setText("RESULT");
		 * resultPanel.setBackground(Colors.blue); resultPanel.setLayout(new
		 * FlowLayout(FlowLayout.LEFT, 10, 20)); resultPanel.label.setFont(new
		 * Font("garamond", Font.BOLD, Screen.FONTSIZE));
		 * resultPanel.label.setForeground(Colors.textyellow);
		 * titleBarPanel.insidePanel.add(resultPanel);
		 */

		add(titleBarPanel);

		infoPanel = new ContentPanel(width * 97 / 100, height * 71 / 100, Colors.lgrey,
				new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(infoPanel);

		int halfWidth = width * 97 / 100 / 2 - 7;

		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(halfWidth, height * 71 / 100));
		leftPanel.setBackground(Colors.lgrey);
		leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		infoPanel.insidePanel.add(leftPanel);

		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(halfWidth, height * 71 / 100));
		rightPanel.setBackground(Colors.lgrey);
		rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 1, 0));
		infoPanel.insidePanel.add(rightPanel);

		JPanel rightEmptyPanel = new JPanel();
		rightEmptyPanel.setPreferredSize(new Dimension(halfWidth / 10, 48));
		rightEmptyPanel.setBackground(Colors.lgrey);
		rightPanel.add(rightEmptyPanel);

		balancePanel = new LabeledPanel(halfWidth * 7 / 10, height / 10);
		balancePanel.setBackground(Colors.lgrey);
		balancePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		balancePanel.label.setForeground(Colors.vdgrey);
		balancePanel.label.setText("Balance");
		leftPanel.add(balancePanel);

		balanceResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 10);
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

		JPanel emptyDivision1Panel = new JPanel();
		emptyDivision1Panel.setPreferredSize(new Dimension(halfWidth * 7 / 10, height / 30));
		emptyDivision1Panel.setBackground(Colors.lgrey);
		leftPanel.add(emptyDivision1Panel);

		boardSatisfactionPanel = new LabeledPanel(halfWidth * 7 / 10, height / 18);
		boardSatisfactionPanel.setBackground(Colors.lgrey);
		boardSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		boardSatisfactionPanel.label.setForeground(Colors.vdgrey);
		boardSatisfactionPanel.label.setText("Board Satisfaction");
		leftPanel.add(boardSatisfactionPanel);

		boardSatisfactionResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 18);
		boardSatisfactionResultPanel.setBackground(Colors.lgrey);
		boardSatisfactionResultPanel.label.setForeground(Colors.vdgrey);
		leftPanel.add(boardSatisfactionResultPanel);

		boardHistoryPanel = new BoardHistoryPanel(halfWidth / 3, height / 10);
		leftPanel.add(boardHistoryPanel);

		JPanel emptyDivision2Panel = new JPanel();
		emptyDivision2Panel.setPreferredSize(new Dimension(halfWidth * 7 / 10, height / 30));
		emptyDivision2Panel.setBackground(Colors.lgrey);
		leftPanel.add(emptyDivision2Panel);

		fanSatisfactionPanel = new LabeledPanel(halfWidth * 7 / 10, height / 18);
		fanSatisfactionPanel.setBackground(Colors.lgrey);
		fanSatisfactionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		fanSatisfactionPanel.label.setForeground(Colors.vdgrey);
		fanSatisfactionPanel.label.setText("Fan Satisfaction");
		leftPanel.add(fanSatisfactionPanel);

		fanSatisfactionResultPanel = new LabeledPanel(halfWidth * 3 / 10, height / 18);
		fanSatisfactionResultPanel.setBackground(Colors.lgrey);
		fanSatisfactionResultPanel.label.setForeground(Colors.vdgrey);
		leftPanel.add(fanSatisfactionResultPanel);

		fanHistoryPanel = new FanHistoryPanel(halfWidth / 3, height / 10);
		leftPanel.add(fanHistoryPanel);

		spaghettiPanel = new JPanel();
		spaghettiPanel.setPreferredSize(new Dimension(48, 48));
		spaghettiPanel.setOpaque(false);
		spaghettiPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		spaghettiLabel = new JLabel();
		spaghettiLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
		spaghettiPanel.add(spaghettiLabel);
		rightPanel.add(spaghettiPanel);

		wonLeaguePanel = new JPanel();
		wonLeaguePanel.setPreferredSize(new Dimension(48, 48));
		wonLeaguePanel.setOpaque(false);
		wonLeaguePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		wonLeagueLabel = new JLabel();
		wonLeagueLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
		wonLeaguePanel.add(wonLeagueLabel);
		rightPanel.add(wonLeaguePanel);

		calciumPanel = new JPanel();
		calciumPanel.setPreferredSize(new Dimension(48, 48));
		calciumPanel.setOpaque(false);
		calciumPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		calciumLabel = new JLabel();
		calciumLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
		calciumPanel.add(calciumLabel);
		rightPanel.add(calciumPanel);

		stagPanel = new JPanel();
		stagPanel.setPreferredSize(new Dimension(48, 48));
		stagPanel.setOpaque(false);
		stagPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		stagLabel = new JLabel();
		stagLabel.setIcon(imageLoader.loadImageIcon("/trophies/notyet.png", 48, 48));
		stagPanel.add(stagLabel);
		rightPanel.add(stagPanel);

	}

	public void fillShortInformation() {

		Main.yourArmy.calculateIncome();
		Main.yourArmy.calculateUpkeep();
		LoadTrophies.load();

		if (Trophies.wonLeague) {
			wonLeagueLabel.setIcon(imageLoader.loadImageIcon("/trophies/wonLeague.png", 48, 48));
			wonLeagueLabel.setToolTipText("You won the league! Permanent +1 to Morale for all regiments");
		}
		if (Trophies.spaghetti) {
			spaghettiLabel.setIcon(imageLoader.loadImageIcon("/trophies/spaghetti.png", 48, 48));
			spaghettiLabel.setToolTipText("You survived the fan's spaghetti evening. Permanent +1 to Fan Satisfaction");
		}
		if (Trophies.calcium) {
			calciumLabel.setIcon(imageLoader.loadImageIcon("/trophies/calcium.png", 48, 48));
			calciumLabel.setToolTipText("You discovered a cow! Permanent +1 to Defence for all regiments");
		}
		if (Trophies.stag) {
			stagLabel.setIcon(imageLoader.loadImageIcon("/trophies/stag.png", 48, 48));
			stagLabel.setToolTipText("You discovered a stag! Permanent +1 to Charge for all regiments");
		}

		balanceResultPanel.label.setText(Integer.toString(Main.yourArmy.money));
		projectionResultPanel.label.setText(Integer.toString(Main.yourArmy.income - Main.yourArmy.upkeep));
		boardSatisfactionResultPanel.label.setText(Integer.toString(Main.yourArmy.boardSatisfaction));
		fanSatisfactionResultPanel.label.setText(Integer.toString(Main.yourArmy.fanSatisfaction));

		fanHistoryPanel.fillFanHistoryPanel(Main.yourArmy);
		boardHistoryPanel.fillBoardHistoryPanel(Main.yourArmy);

	}

}
