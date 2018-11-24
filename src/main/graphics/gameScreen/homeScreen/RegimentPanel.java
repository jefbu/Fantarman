package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;
import main.graphics.Screen;
import main.utility.BottomTextTutorial;
import main.utility.Colors;
import main.utility.ImageLoader;

public class RegimentPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ButtonedPanel captainPanel;
	private ButtonedPanel lifePanel;
	private ButtonedPanel regimentTypePanel;

	private ButtonedPanel meleeOffensePanel;
	private ButtonedPanel defencePanel;
	private ButtonedPanel mobilityPanel;
	private ButtonedPanel rangedOffensePanel;

	private ButtonedPanel combatRolePanel;
	private ButtonedPanel trainingRolePanel;
	private ButtonedPanel marketingRolePanel;

	private int width;
	private int height;

	private ImageLoader imageLoader;

	private ArrayList<ButtonedPanel> list;

	public RegimentPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lgrey);
		// setBorder(new LineBorder(Color.BLACK, 1, false));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		/*
		 * namePanel = new LabeledPanel(width * 20 / 100, height);
		 * namePanel.setBackground(Colors.lorange); namePanel.setLayout(new
		 * FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		 * namePanel.label.setForeground(Colors.vdorange); add(namePanel);
		 */

		captainPanel = new ButtonedPanel(width * 18 / 100, height, Colors.vdgrey);
		captainPanel.setBackground(Colors.lorange);
		captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 200, height * 25 / 100));
		captainPanel.button.setLayout(new FlowLayout(FlowLayout.LEFT, width / 250, height * 25 / 100));
		captainPanel.label.setForeground(Colors.vdgrey);
		add(captainPanel);

		lifePanel = new ButtonedPanel(width * 7 / 100, height, Colors.vdgrey);
		lifePanel.setBackground(Colors.lorange);
		lifePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 200, height * 25 / 100));
		lifePanel.button.setLayout(new FlowLayout(FlowLayout.LEFT, width / 250, height * 25 / 100));
		lifePanel.label.setForeground(Colors.vdgrey);
		add(lifePanel);

		/*
		 * regimentNamePanel = new ButtonedPanel(width * 15 / 100, height,
		 * Colors.vdorange); regimentNamePanel.setBackground(Colors.lorange);
		 * regimentNamePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width /
		 * 250, height * 25 / 100)); regimentNamePanel.button.setLayout(new
		 * FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		 * regimentNamePanel.label.setForeground(Colors.vdorange);
		 * add(regimentNamePanel);
		 */

		regimentTypePanel = new ButtonedPanel(width * 15 / 100, height, Colors.vdgrey);
		regimentTypePanel.setBackground(Colors.lorange);
		regimentTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 200, height * 25 / 100));
		regimentTypePanel.button.setLayout(new FlowLayout(FlowLayout.LEFT, width / 250, height * 25 / 100));
		regimentTypePanel.label.setForeground(Colors.vdgrey);
		add(regimentTypePanel);

		meleeOffensePanel = new ButtonedPanel(width * 9 / 100, height, Colors.vdgrey);
		meleeOffensePanel.setBackground(Colors.lorange);
		meleeOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		meleeOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		meleeOffensePanel.label.setForeground(Colors.vdgrey);
		add(meleeOffensePanel);

		defencePanel = new ButtonedPanel(width * 9 / 100, height, Colors.vdgrey);
		defencePanel.setBackground(Colors.lorange);
		defencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		defencePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		defencePanel.label.setForeground(Colors.vdgrey);
		add(defencePanel);

		mobilityPanel = new ButtonedPanel(width * 9 / 100, height, Colors.vdgrey);
		mobilityPanel.setBackground(Colors.lorange);
		mobilityPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		mobilityPanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		mobilityPanel.label.setForeground(Colors.vdgrey);
		add(mobilityPanel);

		rangedOffensePanel = new ButtonedPanel(width * 9 / 100, height, Colors.vdgrey);
		rangedOffensePanel.setBackground(Colors.lorange);
		rangedOffensePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		rangedOffensePanel.label.setFont(new Font("garamond", Font.BOLD, 18));
		rangedOffensePanel.label.setForeground(Colors.vdgrey);
		add(rangedOffensePanel);

		combatRolePanel = new ButtonedPanel(width * 7 / 100, height, Colors.vdgrey);
		combatRolePanel.setBackground(Colors.lorange);
		combatRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.label.setForeground(Colors.vdgrey);
		add(combatRolePanel);

		trainingRolePanel = new ButtonedPanel(width * 7 / 100, height, Colors.vdgrey);
		trainingRolePanel.setBackground(Colors.lorange);
		trainingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.label.setForeground(Colors.vdgrey);
		add(trainingRolePanel);

		marketingRolePanel = new ButtonedPanel(width * 7 / 100, height, Colors.vdgrey);
		marketingRolePanel.setBackground(Colors.lorange);
		marketingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.label.setForeground(Colors.vdgrey);
		add(marketingRolePanel);

		list = new ArrayList<ButtonedPanel>();
		list.add(captainPanel);
		// list.add(regimentNamePanel);
		list.add(regimentTypePanel);
		list.add(meleeOffensePanel);
		list.add(rangedOffensePanel);
		list.add(defencePanel);
		list.add(mobilityPanel);

	}

	public void fillRegimentPanel(int i) {

		// Main.bottomTextTutorial = BottomTextTutorial.RegimentView;

		for (ButtonedPanel panel : list) {
			try {
				panel.button.removeActionListener(panel.button.getActionListeners()[0]);
			} catch (Exception e) {
			}
		}

		for (int ii = 0; ii < list.size(); ii++) {
			list.get(ii).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.bottomTextTutorial = BottomTextTutorial.RegimentView;
					Screen.gameScreen.mainPanel.armyView.setVisible(false);
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(Main.yourArmy.roster.get(i), true, i);
					Screen.gameScreen.bottomPanel.bottomTextPanel.fillBottomTextPanel(true);
					Screen.gameScreen.mainPanel.regimentView.setVisible(true);
				}
			});

			captainPanel.label.setText(Main.yourArmy.roster.get(i).captain.name);

			lifePanel.label.setText(
					Main.yourArmy.roster.get(i).totalLife + " (" + Main.yourArmy.roster.get(i).totalMaxLife + ")");

			switch (Main.yourArmy.roster.get(i).type) {
			case ARCHERS:
				regimentTypePanel.label.setText("Archers");
				break;
			case ARTILLERY:
				regimentTypePanel.label.setText("Artillery");
				break;
			case COMBINED_ARMS:
				regimentTypePanel.label.setText("Combined Arms");
				break;
			case FLYING:
				regimentTypePanel.label.setText("Flying");
				break;
			case HEAVY_CAVALRY:
				regimentTypePanel.label.setText("Heavy Cavalry");
				break;
			case HEAVY_INFANTRY:
				regimentTypePanel.label.setText("Heavy Infantry");
				break;
			case HERO:
				regimentTypePanel.label.setText("Hero");
				break;
			case LIGHT_CAVALRY:
				regimentTypePanel.label.setText("Light Cavalry");
				break;
			case LIGHT_INFANTRY:
				regimentTypePanel.label.setText("Light Infantry");
				break;
			default:
				break;
			}

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
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				break;
			case TRAINING:
				combatRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				break;
			case MARKETING:
				combatRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				trainingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
				marketingRolePanel.label
						.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
				break;

			default:
				break;

			}

			for (ActionListener listener : combatRolePanel.button.getActionListeners()) {
				combatRolePanel.button.removeActionListener(listener);
				;
			}
			for (ActionListener listener : trainingRolePanel.button.getActionListeners()) {
				trainingRolePanel.button.removeActionListener(listener);
				;
			}
			for (ActionListener listener : marketingRolePanel.button.getActionListeners()) {
				marketingRolePanel.button.removeActionListener(listener);
				;
			}

			combatRolePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int counter = 0;
					for (Regiment regiment : Main.yourArmy.roster) {
						if (regiment.role == Role.COMBAT)
							counter++;
					}

					if (counter < 8) {
						Main.yourArmy.roster.get(i).role = Role.COMBAT;
						combatRolePanel.label.setIcon(
								imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
						trainingRolePanel.label
								.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
						marketingRolePanel.label
								.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
						Screen.gameScreen.mainPanel.homeView.fillHomeScreen(false);
					}
				}
			});

			trainingRolePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.yourArmy.roster.get(i).role = Role.TRAINING;
					combatRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
					trainingRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
					marketingRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
					Screen.gameScreen.mainPanel.homeView.fillHomeScreen(false);
				}
			});

			marketingRolePanel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Main.yourArmy.roster.get(i).role = Role.MARKETING;
					combatRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
					trainingRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 3 / 100, height));
					marketingRolePanel.label
							.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 3 / 100, height));
					Screen.gameScreen.mainPanel.homeView.fillHomeScreen(false);
				}
			});

		}

	}

}
