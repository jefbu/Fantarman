package main.graphics.gameScreen.regimentView.captainDetail.bigTacticPanel;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Main;
import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Tactic;
import main.battle.tactics.Target;
import main.components.Colour;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class BigTacticPanel extends JDialog {

	private static final long serialVersionUID = 1L;

	ImageLoader imageLoader;
	
	int width;
	int height;

	BigConditionPanel bigConditionPanel;
	BigTargetPanel bigTargetPanel;
	BigOrderPanel bigOrderPanel;

	int checkboxPanelWidth;
	int checkboxPanelHeight;

	JButton dismissButton;
	JButton doTheSameButton;

	boolean doTheSame;

	public BigTacticPanel(int width, int height, Colour colour, Boolean dichotomy) {

		super(null, Dialog.ModalityType.APPLICATION_MODAL);
		this.width = width;
		this.height = height;

		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		imageLoader = new ImageLoader();

		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(width, height * 5 / 100));
		topPanel.setBackground(decideColour(colour));
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(topPanel);

		JLabel titleLabel = new JLabel();
		titleLabel.setForeground(Colors.vlgrey);
		titleLabel.setText("Choose your tactic by picking a condition, a target and an order.");
		topPanel.add(titleLabel);

		checkboxPanelHeight = height * 35 / 100 * 19 / 100;
		checkboxPanelWidth = width * 19 / 100;

		bigConditionPanel = new BigConditionPanel(width, height * 35 / 100, checkboxPanelHeight);
		bigTargetPanel = new BigTargetPanel(width, height * 25 / 100, checkboxPanelHeight);
		bigOrderPanel = new BigOrderPanel(width, height * 25 / 100, checkboxPanelHeight);

		add(bigConditionPanel);
		add(bigTargetPanel);
		add(bigOrderPanel);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(width, height * 10 / 100));
		bottomPanel.setBackground(decideColour(colour));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 100));
		add(bottomPanel);

		JPanel doTheSamePanel = new JPanel();
		doTheSamePanel.setPreferredSize(new Dimension(width * 7 / 10, height * 8 / 100));
		doTheSamePanel.setBackground(Colors.vdgrey);
		bottomPanel.add(doTheSamePanel);

		doTheSameButton = new JButton();
		doTheSameButton.setPreferredSize(new Dimension(width * 5 / 100, height * 5 / 100));
		doTheSameButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png", width * 5 / 100, height * 5 / 100));
		doTheSameButton.setContentAreaFilled(false);
		doTheSameButton.setBorderPainted(false);
		doTheSameButton.setBorder(null);
		doTheSameButton.setOpaque(false);
		doTheSamePanel.add(doTheSameButton);

		JLabel doTheSameLabel = new JLabel();
		doTheSameLabel.setForeground(Colors.vlgrey);
		doTheSameLabel.setText("Copy this regiment's instructions to all regiments of its type?");
		doTheSamePanel.add(doTheSameLabel);

		dismissButton = new JButton();
		dismissButton.setPreferredSize(new Dimension(width * 2 / 10, height * 8 / 100));
		dismissButton.setIcon(imageLoader.loadImageIcon("/icons/okayButton.png", width * 2 / 10, height * 8 / 100));
		dismissButton.setBorderPainted(false);
		dismissButton.setBorder(null);
		dismissButton.setOpaque(false);
		dismissButton.setContentAreaFilled(false);
		bottomPanel.add(dismissButton);

	}

	private Color decideColour(Colour colour) {

		switch (colour) {
		case DGREY:
			return Colors.dgrey;
		case VDGREY:
			return Colors.vdgrey;
		default:
			return Colors.lblue;
		}

	}

	public void fillBigTacticPanelComplete(Regiment regiment, int orderNumber) {

		doTheSame = false;

		if (dismissButton.getActionListeners().length == 0) {
			dismissButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int regimentNumber = 0;
					for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
						if (Main.yourArmy.roster.get(i).name == regiment.name) {
							regimentNumber = i;
						}
					}
					if(doTheSame) {
						for (Regiment regiment2: Main.yourArmy.roster) {
							if (regiment2.type == regiment.type) {
								for(int i = 0; i < regiment2.instructions.size(); i++) {
									regiment2.instructions.get(i).condition = regiment.instructions.get(i).condition;
									regiment2.instructions.get(i).target = regiment.instructions.get(i).target;
									regiment2.instructions.get(i).order = regiment.instructions.get(i).order;
								}
							}
						}
					}
					Screen.gameScreen.mainPanel.regimentView.fillRegimentView(regiment, true, regimentNumber);
					dispose();
				}
			});
		}

		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_100) {
			bigConditionPanel.lifeUnder100Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_75) {
			bigConditionPanel.lifeUnder75Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder75Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_50) {
			bigConditionPanel.lifeUnder50Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_under_25) {
			bigConditionPanel.lifeUnder25Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_25) {
			bigConditionPanel.lifeOver25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_50) {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_above_75) {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Life_full) {
			bigConditionPanel.life100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.life100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_1_Turn) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_2_Turns) {
			bigConditionPanel.after2TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after2TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_3_Turns) {
			bigConditionPanel.after3TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after3TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_4_Turns) {
			bigConditionPanel.after4TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after4TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.After_5_Turns) {
			bigConditionPanel.after5TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after5TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Target_in_Range) {
			bigConditionPanel.targetInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.targetInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.Any_in_Range) {
			bigConditionPanel.anyInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.anyInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}
		if (regiment.instructions.get(orderNumber).condition == Condition.ALWAYS) {
			bigConditionPanel.alwaysPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.alwaysPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).target == Target.ENEMY_NEAREST) {
			bigTargetPanel.nearestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.nearestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).target == Target.ENEMY_WEAKEST) {
			bigTargetPanel.weakestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.weakestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).target == Target.ENEMY_STRONGEST) {
			bigTargetPanel.strongestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.strongestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).target == Target.SELF) {
			bigTargetPanel.selfPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.selfPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).target == Target.NONE) {
			bigTargetPanel.nonePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.nonePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).order == Order.Move_to) {
			bigOrderPanel.moveToPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.moveToPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).order == Order.CHARGE) {
			bigOrderPanel.chargePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.chargePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).order == Order.Move_Forward) {
			bigOrderPanel.moveForwardPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.moveForwardPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).order == Order.FIRE) {
			bigOrderPanel.missilePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.missilePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (regiment.instructions.get(orderNumber).order == Order.RECOVER) {
			bigOrderPanel.recoverPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.recoverPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		try {
			bigConditionPanel.lifeUnder100Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeUnder100Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeUnder100Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_under_100;
				iconiseConditionPanels(Condition.Life_under_100);
			}
		});

		try {
			bigConditionPanel.lifeUnder75Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeUnder75Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeUnder75Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_under_75;
				iconiseConditionPanels(Condition.Life_under_75);
			}
		});

		try {
			bigConditionPanel.lifeUnder50Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeUnder50Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeUnder50Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_under_50;
				iconiseConditionPanels(Condition.Life_under_50);
			}
		});

		try {
			bigConditionPanel.lifeUnder25Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeUnder25Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeUnder25Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_under_25;
				iconiseConditionPanels(Condition.Life_under_25);
			}
		});

		try {
			bigConditionPanel.lifeOver25Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeOver25Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeOver25Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_above_25;
				iconiseConditionPanels(Condition.Life_above_25);
			}
		});

		try {
			bigConditionPanel.lifeOver50Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeOver50Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeOver50Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_above_50;
				iconiseConditionPanels(Condition.Life_above_50);
			}
		});

		try {
			bigConditionPanel.lifeOver75Panel.iconButton
					.removeActionListener(bigConditionPanel.lifeOver75Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.lifeOver75Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_above_75;
				iconiseConditionPanels(Condition.Life_above_75);
			}
		});

		try {
			bigConditionPanel.life100Panel.iconButton
					.removeActionListener(bigConditionPanel.life100Panel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.life100Panel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Life_full;
				iconiseConditionPanels(Condition.Life_full);
			}
		});

		try {
			bigConditionPanel.after1TurnPanel.iconButton
					.removeActionListener(bigConditionPanel.after1TurnPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.after1TurnPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.After_1_Turn;
				System.out.println("order given for nr " + orderNumber);
				iconiseConditionPanels(Condition.After_1_Turn);
			}
		});

		try {
			bigConditionPanel.after2TurnPanel.iconButton
					.removeActionListener(bigConditionPanel.after2TurnPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.after2TurnPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.After_2_Turns;
				iconiseConditionPanels(Condition.After_2_Turns);
			}
		});

		try {
			bigConditionPanel.after3TurnPanel.iconButton
					.removeActionListener(bigConditionPanel.after3TurnPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.after3TurnPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.After_3_Turns;
				iconiseConditionPanels(Condition.After_3_Turns);
			}
		});

		try {
			bigConditionPanel.after4TurnPanel.iconButton
					.removeActionListener(bigConditionPanel.after4TurnPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.after4TurnPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.After_4_Turns;
				iconiseConditionPanels(Condition.After_4_Turns);
			}
		});

		try {
			bigConditionPanel.after5TurnPanel.iconButton
					.removeActionListener(bigConditionPanel.after5TurnPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.after5TurnPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.After_5_Turns;
				iconiseConditionPanels(Condition.After_5_Turns);
			}
		});

		try {
			bigConditionPanel.anyInRangePanel.iconButton
					.removeActionListener(bigConditionPanel.anyInRangePanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.anyInRangePanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Any_in_Range;
				iconiseConditionPanels(Condition.Any_in_Range);
			}
		});

		try {
			bigConditionPanel.targetInRangePanel.iconButton
					.removeActionListener(bigConditionPanel.targetInRangePanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.targetInRangePanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.Target_in_Range;
				iconiseConditionPanels(Condition.Target_in_Range);
			}
		});

		try {
			bigConditionPanel.alwaysPanel.iconButton
					.removeActionListener(bigConditionPanel.alwaysPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigConditionPanel.alwaysPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).condition = Condition.ALWAYS;
				iconiseConditionPanels(Condition.ALWAYS);
			}
		});

		try {
			bigTargetPanel.nearestPanel.iconButton
					.removeActionListener(bigTargetPanel.nearestPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigTargetPanel.nearestPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).target = Target.ENEMY_NEAREST;
				iconiseTargetPanels(Target.ENEMY_NEAREST);
			}
		});

		try {
			bigTargetPanel.weakestPanel.iconButton
					.removeActionListener(bigTargetPanel.weakestPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigTargetPanel.weakestPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).target = Target.ENEMY_WEAKEST;
				iconiseTargetPanels(Target.ENEMY_WEAKEST);
			}
		});

		try {
			bigTargetPanel.strongestPanel.iconButton
					.removeActionListener(bigTargetPanel.strongestPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigTargetPanel.strongestPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).target = Target.ENEMY_STRONGEST;
				iconiseTargetPanels(Target.ENEMY_STRONGEST);
			}
		});

		try {
			bigTargetPanel.selfPanel.iconButton
					.removeActionListener(bigTargetPanel.selfPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigTargetPanel.selfPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).target = Target.SELF;
				iconiseTargetPanels(Target.SELF);
			}
		});

		try {
			bigTargetPanel.nonePanel.iconButton
					.removeActionListener(bigTargetPanel.nonePanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigTargetPanel.nonePanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).target = Target.NONE;
				iconiseTargetPanels(Target.NONE);
			}
		});

		try {
			bigOrderPanel.moveToPanel.iconButton
					.removeActionListener(bigOrderPanel.moveToPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigOrderPanel.moveToPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).order = Order.Move_to;
				iconiseOrderPanels(Order.Move_to);
			}
		});

		try {
			bigOrderPanel.chargePanel.iconButton
					.removeActionListener(bigOrderPanel.chargePanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigOrderPanel.chargePanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).order = Order.CHARGE;
				iconiseOrderPanels(Order.CHARGE);
			}
		});

		try {
			bigOrderPanel.moveForwardPanel.iconButton
					.removeActionListener(bigOrderPanel.moveForwardPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigOrderPanel.moveForwardPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).order = Order.Move_Forward;
				iconiseOrderPanels(Order.Move_Forward);
			}
		});

		try {
			bigOrderPanel.missilePanel.iconButton
					.removeActionListener(bigOrderPanel.missilePanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigOrderPanel.missilePanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).order = Order.FIRE;
				iconiseOrderPanels(Order.FIRE);
			}
		});

		try {
			bigOrderPanel.recoverPanel.iconButton
					.removeActionListener(bigOrderPanel.recoverPanel.iconButton.getActionListeners()[0]);
		} catch (Exception e) {
		}
		bigOrderPanel.recoverPanel.iconButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regiment.instructions.get(orderNumber).order = Order.RECOVER;
				iconiseOrderPanels(Order.RECOVER);
			}
		});

	}

	private void iconiseConditionPanels(Condition condition) {

		if (condition == Condition.Life_under_100) {
			bigConditionPanel.lifeUnder100Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_under_75) {
			bigConditionPanel.lifeUnder75Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder75Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_under_50) {
			bigConditionPanel.lifeUnder50Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_under_25) {
			bigConditionPanel.lifeUnder25Panel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeUnder25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_above_25) {
			bigConditionPanel.lifeOver25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver25Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_above_50) {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver50Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_above_75) {
			bigConditionPanel.lifeOver75Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.lifeOver75Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Life_full) {
			bigConditionPanel.life100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.life100Panel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.After_1_Turn) {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after1TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.After_2_Turns) {
			bigConditionPanel.after2TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after2TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.After_3_Turns) {
			bigConditionPanel.after3TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after3TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.After_4_Turns) {
			bigConditionPanel.after4TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after4TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.After_5_Turns) {
			bigConditionPanel.after5TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.after5TurnPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Any_in_Range) {
			bigConditionPanel.anyInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.anyInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.Target_in_Range) {
			bigConditionPanel.targetInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon(
					"/icons/checkboxChecked.png", checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.targetInRangePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (condition == Condition.ALWAYS) {
			bigConditionPanel.alwaysPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigConditionPanel.alwaysPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

	}

	private void iconiseTargetPanels(Target target) {

		if (target == Target.ENEMY_WEAKEST) {
			bigTargetPanel.weakestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.weakestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (target == Target.ENEMY_STRONGEST) {
			bigTargetPanel.strongestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.strongestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (target == Target.ENEMY_NEAREST) {
			bigTargetPanel.nearestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.nearestPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (target == Target.SELF) {
			bigTargetPanel.selfPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.selfPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (target == Target.NONE) {
			bigTargetPanel.nonePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigTargetPanel.nonePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

	}

	private void iconiseOrderPanels(Order order) {

		if (order == Order.Move_to) {
			bigOrderPanel.moveToPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.moveToPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (order == Order.CHARGE) {
			bigOrderPanel.chargePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.chargePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (order == Order.Move_Forward) {
			bigOrderPanel.moveForwardPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.moveForwardPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (order == Order.FIRE) {
			bigOrderPanel.missilePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.missilePanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		if (order == Order.RECOVER) {
			bigOrderPanel.recoverPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkboxChecked.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		} else {
			bigOrderPanel.recoverPanel.iconButton.setIcon(imageLoader.loadImageIcon("/icons/checkbox.png",
					checkboxPanelWidth * 2 / 10, checkboxPanelHeight * 6 / 10));
		}

		try {
			doTheSameButton.removeActionListener(doTheSameButton.getActionListeners()[0]);
		} catch (Exception e) {
		}

		doTheSameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!doTheSame) {
					doTheSameButton.setIcon(
							imageLoader.loadImageIcon("/icons/checkboxChecked.png", width * 5 / 100, height * 5 / 100));
					doTheSame = true;
				} else {
					doTheSameButton.setIcon(
							imageLoader.loadImageIcon("/icons/checkbox.png", width * 5 / 100, height * 5 / 100));
					doTheSame = false;
				}

			}
		});

	}

}
