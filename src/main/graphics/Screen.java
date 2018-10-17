package main.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.graphics.battleScreen.BattleScreen;
import main.graphics.gameScreen.GameScreen;
import main.graphics.gameScreen.TitleScreen;

public class Screen extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private int screenWidth;
	private int screenHeight;
	private int mainPanelWidth;
	private int mainPanelHeight;
	private Dimension mainPanelSize;
	private JPanel mainPanel;
	
	public static TitleScreen titleScreen;
	public static BattleScreen battleScreen;
	public static GameScreen gameScreen;
	public static GameStartScreen gameStartScreen;
	
	public static int FONTSIZE;

	
	public Screen() {
		
		super();
		
		createScreen();
		adjustScreenSize();
		createContentPane();
		createMainPanel();
		
		FONTSIZE = decideFontSize();
		System.out.println(screenHeight);
		System.out.println(FONTSIZE);
		
		titleScreen = new TitleScreen(mainPanelWidth, mainPanelHeight);
		titleScreen.setVisible(true);
		mainPanel.add(titleScreen);
		
		gameStartScreen = new GameStartScreen(mainPanelWidth, mainPanelHeight);
		gameStartScreen.setVisible(false);
		mainPanel.add(gameStartScreen);
		
		battleScreen = new BattleScreen(mainPanelWidth, mainPanelHeight);
		battleScreen.setVisible(false);
		mainPanel.add(battleScreen);
		
		gameScreen = new GameScreen(mainPanelWidth, mainPanelHeight);
		gameScreen.setVisible(false);
		mainPanel.add(gameScreen);
		
		
		setVisible(true);
				
	}
	

	
	
	public void createScreen() {

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void adjustScreenSize() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenWidth = (int) screenSize.getWidth();
		screenHeight = (int) screenSize.getHeight();
		mainPanelWidth = screenWidth * 9 / 10;
		mainPanelHeight = screenHeight * 95 / 100;
		mainPanelSize = (new Dimension(mainPanelWidth, mainPanelHeight));
		
	}
	
	private void createContentPane() {
				
		JPanel contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension (screenWidth, screenHeight));
		contentPane.setBackground(new Color(0, 0, 0));
		add(contentPane);
		setContentPane(contentPane);
		
	}
	
	private int decideFontSize() {
		
		if (screenHeight > 2500) { return 32; }
		else if (screenHeight > 2000) { return 28; }
		else if (screenHeight > 1400) { return 24; }
		else if (screenHeight > 1000) { return 16; }
		else return 14;

		
	}
	
	public void createMainPanel() {
		
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(mainPanelSize);
		mainPanel.setBackground(new Color(0, 0, 0));
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, false));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		getContentPane().add(mainPanel);
		
	}

}
