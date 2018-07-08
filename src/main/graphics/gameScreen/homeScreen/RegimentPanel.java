package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private LabeledPanel captainPanel;
	private LabeledPanel regimentNamePanel;
	private LabeledPanel regimentTypePanel;

	private LabeledPanel meleeOffensePanel;
	private LabeledPanel defencePanel;
	private LabeledPanel mobilityPanel;
	private LabeledPanel rangedOffensePanel;
	private LabeledPanel attackPanel;
	private LabeledPanel chargePanel;
	private LabeledPanel rangePanel;
	private LabeledPanel missilePanel;
	private LabeledPanel moralePanel;

	private LabeledPanel upkeepPanel;
	private LabeledPanel valuePanel;

	private ButtonedPanel combatRolePanel;
	private ButtonedPanel trainingRolePanel;
	private ButtonedPanel marketingRolePanel;

	private int width;
	private int height;
	
	private ImageLoader imageLoader;

	public RegimentPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lorange);
		// setBorder(new LineBorder(Color.BLACK, 1, false));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		/*
		 * namePanel = new LabeledPanel(width * 20 / 100, height);
		 * namePanel.setBackground(Colors.lorange); namePanel.setLayout(new
		 * FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		 * namePanel.label.setForeground(Colors.vdorange); add(namePanel);
		 */

		captainPanel = new LabeledPanel(width * 12 / 100, height);
		captainPanel.setBackground(Colors.lorange);
		captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		captainPanel.label.setForeground(Colors.vdorange);
		add(captainPanel);

		regimentNamePanel = new LabeledPanel(width * 12 / 100, height);
		regimentNamePanel.setBackground(Colors.lorange);
		regimentNamePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		regimentNamePanel.label.setForeground(Colors.vdorange);
		add(regimentNamePanel);

		regimentTypePanel = new LabeledPanel(width * 12 / 100, height);
		regimentTypePanel.setBackground(Colors.lorange);
		regimentTypePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		regimentTypePanel.label.setForeground(Colors.vdorange);
		add(regimentTypePanel);

		meleeOffensePanel = new LabeledPanel(width * 8 / 100, height);
		meleeOffensePanel.setBackground(Colors.lorange);
		meleeOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		meleeOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		meleeOffensePanel.label.setForeground(Colors.vdorange);
		add(meleeOffensePanel);

		defencePanel = new LabeledPanel(width * 8 / 100, height);
		defencePanel.setBackground(Colors.lorange);
		defencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		defencePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		defencePanel.label.setForeground(Colors.vdorange);
		add(defencePanel);

		mobilityPanel = new LabeledPanel(width * 8 / 100, height);
		mobilityPanel.setBackground(Colors.lorange);
		mobilityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		mobilityPanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		mobilityPanel.label.setForeground(Colors.vdorange);
		add(mobilityPanel);

		rangedOffensePanel = new LabeledPanel(width * 8 / 100, height);
		rangedOffensePanel.setBackground(Colors.lorange);
		rangedOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		rangedOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		rangedOffensePanel.label.setForeground(Colors.vdorange);
		add(rangedOffensePanel);

		combatRolePanel = new ButtonedPanel(width * 10 / 100, height, Colors.lorange);
		combatRolePanel.setBackground(Colors.lorange);
		combatRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.label.setForeground(Colors.vdorange);
		add(combatRolePanel);

		combatRolePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combatRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			}
		});

		trainingRolePanel = new ButtonedPanel(width * 10 / 100, height, Colors.lorange);
		trainingRolePanel.setBackground(Colors.lorange);
		trainingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.label.setForeground(Colors.vdorange);
		add(trainingRolePanel);
		
		trainingRolePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combatRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			}
		});


		marketingRolePanel = new ButtonedPanel(width * 10 / 100, height, Colors.lorange);
		marketingRolePanel.setBackground(Colors.lorange);
		marketingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.label.setForeground(Colors.vdorange);
		add(marketingRolePanel);
		
		marketingRolePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				combatRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
			}
		});


	}

	public void fillRegimentPanel(int i) {

		captainPanel.label.setText(Main.yourArmy.roster.get(i).captain.name);
		regimentTypePanel.label.setText(Main.yourArmy.roster.get(i).type.toString());

		String meleeOffense;
		int meleeCalc = 2 * Main.yourArmy.roster.get(i).totalAttack + Main.yourArmy.roster.get(i).totalCharge;
		if (meleeCalc > 100) {
			meleeOffense = "***";
		} else if (meleeCalc > 75) {
			meleeOffense = "**";
		} else
			meleeOffense = "*";
		meleeOffensePanel.label.setText(meleeOffense);

		String defence;
		int defenceCalc = 2 * Main.yourArmy.roster.get(i).totalLife + Main.yourArmy.roster.get(i).totalDefence;
		if (defenceCalc > 90) {
			defence = "***";
		} else if (defenceCalc > 70) {
			defence = "**";
		} else
			defence = "*";
		defencePanel.label.setText(defence);

		String mobility;
		int mobilityCalc = 5 * Main.yourArmy.roster.get(i).totalMove + 2 * Main.yourArmy.roster.get(i).totalRun
				+ 2 * Main.yourArmy.roster.get(i).totalSpeed + Main.yourArmy.roster.get(i).totalSpeedVariation;
		if (mobilityCalc > 70) {
			mobility = "***";
		} else if (mobilityCalc > 55) {
			mobility = "**";
		} else
			mobility = "*";
		mobilityPanel.label.setText(mobility);

		String rangedOffense;
		int rangedCalc = 4 * Main.yourArmy.roster.get(i).totalRange + Main.yourArmy.roster.get(i).totalMissile;
		if (rangedCalc > 100) {
			rangedOffense = "***";
		} else if (rangedCalc > 75) {
			rangedOffense = "**";
		} else
			rangedOffense = "*";
		rangedOffensePanel.label.setText(rangedOffense);

		switch (Main.yourArmy.roster.get(i).role) {
		case COMBAT:
			combatRolePanel.label
					.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
			trainingRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			marketingRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			break;
		case TRAINING:
			combatRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			trainingRolePanel.label
					.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
			marketingRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			break;
		case MARKETING:
			combatRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			trainingRolePanel.label.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
			marketingRolePanel.label
					.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
			break;

		default:
			break;

		}

	}

}
