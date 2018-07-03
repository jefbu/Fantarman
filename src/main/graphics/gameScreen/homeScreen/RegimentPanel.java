package main.graphics.gameScreen.homeScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.Main;
import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class RegimentPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private LabeledPanel namePanel;
	private LabeledPanel captainPanel;
	private LabeledPanel lieutenantsPanel;

	private LabeledPanel lifePanel;
	private LabeledPanel movePanel;
	private LabeledPanel runPanel;
	private LabeledPanel speedPanel;
	private LabeledPanel attackPanel;
	private LabeledPanel chargePanel;
	private LabeledPanel defencePanel;
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

	public RegimentPanel(int width, int height) {

		super();
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lorange);
		//setBorder(new LineBorder(Color.BLACK, 1, false));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		namePanel = new LabeledPanel(width * 20 / 100, height);
		namePanel.setBackground(Colors.lorange);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		namePanel.label.setForeground(Colors.vdorange);
		add(namePanel);

		captainPanel = new LabeledPanel(width * 20 / 100, height);
		captainPanel.setBackground(Colors.lorange);
		captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, width / 100, height * 25 / 100));
		captainPanel.label.setForeground(Colors.vdorange);
		add(captainPanel);
		
		lieutenantsPanel = new LabeledPanel(width * 5 / 100, height);
		lieutenantsPanel.setBackground(Colors.lorange);
		lieutenantsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		lieutenantsPanel.label.setForeground(Colors.vdorange);
		add(lieutenantsPanel);

		lifePanel = new LabeledPanel(width * 4 / 100, height);
		lifePanel.setBackground(Colors.lorange);
		lifePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		lifePanel.label.setForeground(Colors.vdorange);
		add(lifePanel);

		movePanel = new LabeledPanel(width * 4 / 100, height);
		movePanel.setBackground(Colors.lorange);
		movePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		movePanel.label.setForeground(Colors.vdorange);
		add(movePanel);

		runPanel = new LabeledPanel(width * 4 / 100, height);
		runPanel.setBackground(Colors.lorange);
		runPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		runPanel.label.setForeground(Colors.vdorange);
		add(runPanel);

		speedPanel = new LabeledPanel(width * 4 / 100, height);
		speedPanel.setBackground(Colors.lorange);
		speedPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		speedPanel.label.setForeground(Colors.vdorange);
		add(speedPanel);

		attackPanel = new LabeledPanel(width * 4 / 100, height);
		attackPanel.setBackground(Colors.lorange);
		attackPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		attackPanel.label.setForeground(Colors.vdorange);
		add(attackPanel);

		chargePanel = new LabeledPanel(width * 4 / 100, height);
		chargePanel.setBackground(Colors.lorange);
		chargePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		chargePanel.label.setForeground(Colors.vdorange);
		add(chargePanel);

		defencePanel = new LabeledPanel(width * 4 / 100, height);
		defencePanel.setBackground(Colors.lorange);
		defencePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		defencePanel.label.setForeground(Colors.vdorange);
		add(defencePanel);

		rangePanel = new LabeledPanel(width * 4 / 100, height);
		rangePanel.setBackground(Colors.lorange);
		rangePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		rangePanel.label.setForeground(Colors.vdorange);
		add(rangePanel);

		missilePanel = new LabeledPanel(width * 4 / 100, height);
		missilePanel.setBackground(Colors.lorange);
		missilePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		missilePanel.label.setForeground(Colors.vdorange);
		add(missilePanel);

		moralePanel = new LabeledPanel(width * 4 / 100, height);
		moralePanel.setBackground(Colors.lorange);
		moralePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		moralePanel.label.setForeground(Colors.vdorange);
		add(moralePanel);
		
		upkeepPanel = new LabeledPanel(width * 4 / 100, height);
		upkeepPanel.setBackground(Colors.lorange);
		upkeepPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		upkeepPanel.label.setForeground(Colors.vdorange);
		add(upkeepPanel);

		valuePanel = new LabeledPanel(width * 4 / 100, height);
		valuePanel.setBackground(Colors.lorange);
		valuePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 25 / 100));
		valuePanel.label.setForeground(Colors.vdorange);
		add(valuePanel);

		combatRolePanel = new ButtonedPanel(width * 2 / 100, height, Colors.lorange);
		combatRolePanel.setBackground(Colors.lorange);
		combatRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		combatRolePanel.label.setForeground(Colors.vdorange);
		add(combatRolePanel);

		trainingRolePanel = new ButtonedPanel(width * 2 / 100, height, Colors.lorange);
		trainingRolePanel.setBackground(Colors.lorange);
		trainingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		trainingRolePanel.label.setForeground(Colors.vdorange);
		add(trainingRolePanel);

		marketingRolePanel = new ButtonedPanel(width * 2 / 100, height, Colors.lorange);
		marketingRolePanel.setBackground(Colors.lorange);
		marketingRolePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.button.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		marketingRolePanel.label.setForeground(Colors.vdorange);
		add(marketingRolePanel);

	}

	public void fillRegimentPanel(int i) {

		namePanel.label.setText(Main.yourArmy.roster.get(i).name);
		captainPanel.label.setText(Main.yourArmy.roster.get(i).captain.name);
		lieutenantsPanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).lieutenantsSize));
		lifePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalLife));
		movePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMove));
		runPanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRun));
		speedPanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalSpeed));
		attackPanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalAttack));
		chargePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalCharge));
		defencePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalDefence));
		rangePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalRange));
		missilePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMissile));
		moralePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).totalMorale));
		upkeepPanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).upkeep));
		valuePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).value));


		ImageIcon icon = new ImageIcon();
		ImageLoader imageLoader = new ImageLoader();

		switch (Main.yourArmy.roster.get(i).role) {
		case COMBAT:
			combatRolePanel.label.setIcon(
					imageLoader.loadImageIcon("/icons/combatShortButton.png", width * 3 / 100, height));
			break;
		case TRAINING:
			trainingRolePanel.label.setIcon(
					imageLoader.loadImageIcon("/icons/trainingShortButton.png", width * 3 / 100, height));
			break;
		case MARKETING:
			marketingRolePanel.label.setIcon(
					imageLoader.loadImageIcon("/icons/marketingShortButton.png", width * 3 / 100, height));
			break;

		default:
			break;

		}

	}

}
