package main.components;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import main.graphics.Screen;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class Popup extends JDialog {

	private static final long serialVersionUID = 1L;

	public JPanel bottomPanel;
	public JPanel middlePanel;
	public JPanel mainPanel;
	public JPanel mainPanelTopPanel;
	private JPanel mainPanelBottomLeftPanel;
	private JPanel mainPanelBottomRightPanel;

	public JButton acceptButton;
	public JButton cancelButton;
	public JButton confirmButton;

	ImageLoader imageLoader;
	ImageIcon acceptIcon;
	ImageIcon confirmIcon;
	ImageIcon cancelIcon;

	public Popup(int width, int height, Colour colour, boolean dichotomy) {

		super(null, Dialog.ModalityType.APPLICATION_MODAL);

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
		mainPanel.setPreferredSize(new Dimension(width - 12, height - 12));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		add(bottomPanel);
		bottomPanel.add(middlePanel);
		middlePanel.add(mainPanel);

		mainPanelTopPanel = new JPanel();
		mainPanelTopPanel.setPreferredSize(new Dimension(width - 12, (height - 12) * 3 / 4));
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 8));

		mainPanel.add(mainPanelTopPanel);

		mainPanelBottomLeftPanel = new JPanel();
		mainPanelBottomLeftPanel.setPreferredSize(new Dimension((width - 12) * 2 / 3, (height - 12) / 4));

		mainPanel.add(mainPanelBottomLeftPanel);

		mainPanelBottomRightPanel = new JPanel();
		mainPanelBottomRightPanel.setPreferredSize(new Dimension((width - 12) / 3, (height - 12) / 4));
		mainPanelBottomRightPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 2));

		mainPanel.add(mainPanelBottomRightPanel);

		if (dichotomy) {
			confirmButton = new JButton();
			confirmButton.setPreferredSize(new Dimension((width - 12) / 6, (height - 12) / 4 - 4));
			confirmButton.setOpaque(false);
			confirmButton.setBorderPainted(false);
			confirmButton.setContentAreaFilled(false);
			confirmIcon = imageLoader.loadImageIcon("/icons/yesButton.png", (width - 12) / 6, (height - 12) / 4 - 4);
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
			cancelButton.setPreferredSize(new Dimension((width - 12) / 6, (height - 12) / 4 - 4));
			cancelButton.setOpaque(false);
			cancelButton.setBorderPainted(false);
			cancelButton.setContentAreaFilled(false);
			cancelIcon = imageLoader.loadImageIcon("/icons/noButton.png", (width - 12) / 6, (height - 12) / 4 - 4);
			cancelButton.setIcon(cancelIcon);
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(cancelButton);
		} else {
			acceptButton = new JButton();
			acceptButton.setPreferredSize(new Dimension((width - 12) / 3, ((height - 12) / 4) - 4));
			acceptButton.setOpaque(false);
			acceptButton.setContentAreaFilled(false);
			acceptButton.setBorderPainted(false);
			if (height > 300) {
				acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", (width - 12) / 4, (height - 12) / 5);
			} else {
				acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", (width - 12) / 4, (height - 12) / 5);
			}
			acceptButton.setIcon(acceptIcon);
			acceptButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPanelBottomRightPanel.add(acceptButton);
		}

		applyColours(colour);

	}

	private Color applyColours(Colour colour) {

		switch (colour) {
		case LRED:
			bottomPanel.setBackground(Colors.orange);
			middlePanel.setBackground(Colors.lorange);
			mainPanelTopPanel.setBackground(Colors.vlorange);
			mainPanelBottomLeftPanel.setBackground(Colors.vlorange);
			mainPanelBottomRightPanel.setBackground(Colors.vlorange);
			break;
		case RED:
			bottomPanel.setBackground(Colors.dorange);
			middlePanel.setBackground(Colors.orange);
			mainPanelTopPanel.setBackground(Colors.lorange);
			mainPanelBottomLeftPanel.setBackground(Colors.lorange);
			mainPanelBottomRightPanel.setBackground(Colors.lorange);
			break;
		case DRED:
			bottomPanel.setBackground(Colors.vdorange);
			middlePanel.setBackground(Colors.dorange);
			mainPanelTopPanel.setBackground(Colors.orange);
			mainPanelBottomLeftPanel.setBackground(Colors.orange);
			mainPanelBottomRightPanel.setBackground(Colors.orange);
			break;
		case LGREEN:
			bottomPanel.setBackground(Colors.green);
			middlePanel.setBackground(Colors.lgreen);
			mainPanelTopPanel.setBackground(Colors.vlgreen);
			mainPanelBottomLeftPanel.setBackground(Colors.vlgreen);
			mainPanelBottomRightPanel.setBackground(Colors.vlgreen);
			break;
		case GREEN:
			bottomPanel.setBackground(Colors.dgreen);
			middlePanel.setBackground(Colors.green);
			mainPanelTopPanel.setBackground(Colors.lgreen);
			mainPanelBottomLeftPanel.setBackground(Colors.lgreen);
			mainPanelBottomRightPanel.setBackground(Colors.lgreen);
			break;
		case DGREEN:
			bottomPanel.setBackground(Colors.vdgreen);
			middlePanel.setBackground(Colors.dgreen);
			mainPanelTopPanel.setBackground(Colors.green);
			mainPanelBottomLeftPanel.setBackground(Colors.green);
			mainPanelBottomRightPanel.setBackground(Colors.green);
			break;
		case LBLUE:
			bottomPanel.setBackground(Colors.blue);
			middlePanel.setBackground(Colors.lblue);
			mainPanelTopPanel.setBackground(Colors.backgroundOrange);
			mainPanelBottomLeftPanel.setBackground(Colors.backgroundOrange);
			mainPanelBottomRightPanel.setBackground(Colors.backgroundOrange);
			break;
		case BLUE:
			bottomPanel.setBackground(Colors.dblue);
			middlePanel.setBackground(Colors.blue);
			mainPanelTopPanel.setBackground(Colors.lblue);
			mainPanelBottomLeftPanel.setBackground(Colors.lblue);
			mainPanelBottomRightPanel.setBackground(Colors.lblue);
			break;
		case DBLUE:
			bottomPanel.setBackground(Colors.vdblue);
			middlePanel.setBackground(Colors.dblue);
			mainPanelTopPanel.setBackground(Colors.blue);
			mainPanelBottomLeftPanel.setBackground(Colors.blue);
			mainPanelBottomRightPanel.setBackground(Colors.blue);
			break;
		default:
			break;

		}
		return new Color(0, 0, 0);

	}

}
