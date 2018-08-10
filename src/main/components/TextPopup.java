package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import main.graphics.Screen;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class TextPopup extends Popup {

	private static final long serialVersionUID = 1L;

	private JPanel bottomPanel;
	private JPanel middlePanel;
	private JPanel mainPanel;
	public JPanel mainPanelTopPanel;
	public JTextPane textArea;
	private JPanel mainPanelBottomLeftPanel;
	private JPanel mainPanelBottomRightPanel;

	public JButton acceptButton;
	public JButton cancelButton;
	public JButton confirmButton;

	ImageLoader imageLoader;
	ImageIcon acceptIcon;
	ImageIcon confirmIcon;
	ImageIcon cancelIcon;

	public TextPopup(int width, int height, Colour colour, boolean dichotomy) {

		super(width, height, colour, dichotomy);

		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);

		imageLoader = new ImageLoader();

		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(width, height));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));

		middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(width - 6, height - 6));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));

		mainPanel = new JPanel();
		int mainPanelWidth = width - 12;
		int mainPanelHeight = height - 12;
		mainPanel.setPreferredSize(new Dimension(mainPanelWidth, mainPanelHeight));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		add(bottomPanel);
		bottomPanel.add(middlePanel);
		middlePanel.add(mainPanel);

		mainPanelTopPanel = new JPanel();
		mainPanelTopPanel.setPreferredSize(new Dimension(mainPanelWidth, mainPanelHeight * 3 / 4));
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 8));

		textArea = new JTextPane();
		textArea.setContentType("text/html");
		textArea.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textArea.setFont(new Font("garamond", Font.BOLD, 20));
		textArea.setPreferredSize(new Dimension((width - 12) - 16, ((height - 12) * 3 / 4) - 16));
		textArea.setEditable(false);
		textArea.setMargin(new Insets(10, 10, 10, 10));

		mainPanelTopPanel.add(textArea);

		mainPanel.add(mainPanelTopPanel);

		mainPanelBottomLeftPanel = new JPanel();
		mainPanelBottomLeftPanel.setPreferredSize(new Dimension(mainPanelWidth * 2 / 3, mainPanelHeight / 4));

		mainPanel.add(mainPanelBottomLeftPanel);

		mainPanelBottomRightPanel = new JPanel();
		mainPanelBottomRightPanel.setPreferredSize(new Dimension(mainPanelWidth / 3, mainPanelHeight / 4));
		mainPanelBottomRightPanel
				.setLayout(new FlowLayout(FlowLayout.LEADING, mainPanelWidth / 100, mainPanelHeight / 10));

		mainPanel.add(mainPanelBottomRightPanel);

		if (dichotomy) {
			confirmButton = new JButton();
			confirmButton.setPreferredSize(new Dimension(mainPanelWidth / 7, mainPanelHeight / 6));
			confirmButton.setOpaque(false);
			confirmButton.setBorderPainted(false);
			confirmButton.setContentAreaFilled(false);
			if (height > 300) {
				confirmIcon = imageLoader.loadImageIcon("/icons/yesButton.png", mainPanelWidth / 7,
						mainPanelHeight / 10);
			} else {
				confirmIcon = imageLoader.loadImageIcon("/icons/yesButton.png", mainPanelWidth / 7,
						mainPanelHeight / 10);
			}
			confirmButton.setIcon(confirmIcon);
			confirmButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					Screen.battleScreen.setVisible(false);
					Screen.gameScreen.setVisible(true);
				}
			});
			mainPanelBottomRightPanel.add(confirmButton);
			cancelButton = new JButton();
			cancelButton.setPreferredSize(new Dimension(mainPanelWidth / 7, mainPanelHeight / 6));
			cancelButton.setOpaque(false);
			cancelButton.setBorderPainted(false);
			cancelButton.setContentAreaFilled(false);
			if (height > 300) {
				cancelIcon = imageLoader.loadImageIcon("/icons/noButton.png", mainPanelWidth / 7, mainPanelHeight / 10);
			} else {
				cancelIcon = imageLoader.loadImageIcon("/icons/noButton.png", mainPanelWidth / 7, mainPanelHeight / 10);
			}
			cancelButton.setIcon(cancelIcon);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(cancelButton);
		} else {
			acceptButton = new JButton();
			acceptButton.setPreferredSize(new Dimension(mainPanelWidth / 4, mainPanelHeight / 10));
			acceptButton.setOpaque(false);
			acceptButton.setContentAreaFilled(false);
			acceptButton.setBorderPainted(false);
			if (height > 300) {
				acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", mainPanelWidth / 4, mainPanelHeight / 10);
			} else {
				acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", mainPanelWidth / 4, mainPanelHeight / 10);
			}
			acceptButton.setIcon(acceptIcon);
			acceptButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(acceptButton);
		}
		
		applyColour(colour);
		
	}

	private void applyColour(Colour colour) {

		switch (colour) {

		case GREY:
			bottomPanel.setBackground(Colors.dgrey);
			middlePanel.setBackground(Colors.lgrey);
			mainPanel.setBackground(Colors.vdgrey);
			mainPanelTopPanel.setBackground(Colors.vdgrey);
			mainPanelBottomLeftPanel.setBackground(Colors.vdgrey);
			mainPanelBottomRightPanel.setBackground(Colors.vdgrey);
			textArea.setBackground(Colors.vdgrey);
		case DGREY:
			bottomPanel.setBackground(Colors.dgrey);
			middlePanel.setBackground(Colors.lgrey);
			mainPanel.setBackground(Colors.vdgrey);
			mainPanelTopPanel.setBackground(Colors.vdgrey);
			mainPanelBottomLeftPanel.setBackground(Colors.vdgrey);
			mainPanelBottomRightPanel.setBackground(Colors.vdgrey);
			textArea.setBackground(Colors.vdgrey);
		case LGREY:
			bottomPanel.setBackground(Colors.dgrey);
			middlePanel.setBackground(Colors.lgrey);
			mainPanel.setBackground(Colors.vdgrey);
			mainPanelTopPanel.setBackground(Colors.vdgrey);
			mainPanelBottomLeftPanel.setBackground(Colors.vdgrey);
			mainPanelBottomRightPanel.setBackground(Colors.vdgrey);
			textArea.setBackground(Colors.vdgrey);
		default:
			break;
		}

	}

	public void writeText(String input) {

		textArea.setText("<font color = 'rgb(180, 180, 180)'>" + input);

	}

}
