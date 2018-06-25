package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class RegimentPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private LabeledPanel namePanel;
	private ButtonedPanel rolePanel;
	private LabeledPanel valuePanel;
	private LabeledPanel captainPanel;

	private int width;
	private int height;

	public RegimentPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lorange);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		namePanel = new LabeledPanel(width * 33 / 100, height);
		namePanel.setBackground(Colors.lorange);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		namePanel.label.setForeground(Colors.vdorange);
		add(namePanel);

		rolePanel = new ButtonedPanel(width * 17 / 100, height, Colors.orange);
		rolePanel.setBackground(Colors.lorange);
		rolePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		rolePanel.label.setForeground(Colors.vdorange);
		add(rolePanel);

		valuePanel = new LabeledPanel(width * 22 / 100, height);
		valuePanel.setBackground(Colors.lorange);
		valuePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		valuePanel.label.setForeground(Colors.vdorange);
		add(valuePanel);

		captainPanel = new LabeledPanel(width * 22 / 100, height);
		captainPanel.setBackground(Colors.lorange);
		captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		captainPanel.label.setForeground(Colors.vdorange);
		add(captainPanel);

	}

	public void fillRegimentPanel(int i) {

		namePanel.label.setText(Main.yourArmy.roster.get(i).name);
		valuePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).value));
		captainPanel.label.setText(Main.yourArmy.roster.get(i).captain.name);

		ImageIcon icon = new ImageIcon();
		ImageLoader imageLoader = new ImageLoader();

		switch (Main.yourArmy.roster.get(i).role) {
		case COMBAT:
			icon = imageLoader.loadImageIcon("/icons/combatShortButton.png", width * 12 / 100, height * 3 / 4);
			break;
		case MARKETING:
			icon = imageLoader.loadImageIcon("/icons/marketingShortButton.png", width * 12 / 100, height * 3 / 4);
			break;
		case TRAINING:
			icon = imageLoader.loadImageIcon("/icons/trainingShortButton.png", width * 12 / 100, height * 3 / 4);
			break;
		default:
			break;

		}

		rolePanel.label.setIcon(icon);

	}

}
