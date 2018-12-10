package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.battle.BattleOrchestrator;
import main.components.ButtonedPanel;
import main.graphics.gameScreen.regimentView.captainDetail.OrderPanel;
import main.utility.Colors;
import main.utility.ImageLoader;

public class InterventionPopup extends JDialog {

	private static final long serialVersionUID = 1L;

	private JButton acceptButton;
	private ImageIcon acceptIcon;
	private ImageLoader imageLoader;
	private JPanel bottomPanel;
	private JPanel middlePanel;
	private JPanel mainPanel;
	private JPanel mainPanelTopPanel;
	private JPanel mainPanelMiddlePanel;
	private JPanel mainPanelBottomLeftPanel;
	private JPanel mainPanelBottomRightPanel;
	private JLabel interventionLabel;

	private ArrayList<ButtonedPanel> panels;

	public static int interventions;

	public InterventionPopup(int width, int height) {

		super(null, Dialog.ModalityType.APPLICATION_MODAL);

		setSize(new Dimension(width, height));
		setLocationRelativeTo(RightAggregatePanel.infoTextPanel);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);

		panels = new ArrayList<ButtonedPanel>();

		interventions = 2;

		imageLoader = new ImageLoader();

		bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(width, height));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));
		bottomPanel.setBackground(Colors.vdgrey);

		middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(width - 6, height - 6));
		middlePanel.setLayout(new FlowLayout(FlowLayout.LEADING, 3, 3));
		middlePanel.setBackground(Colors.lgrey);

		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(width - 12, height - 12));
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		add(bottomPanel);
		bottomPanel.add(middlePanel);
		middlePanel.add(mainPanel);

		mainPanelTopPanel = new JPanel();
		mainPanelTopPanel.setPreferredSize(new Dimension(width - 12, (height - 12) / 10));
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 8));
		mainPanelTopPanel.setBackground(Colors.vdgrey);
		mainPanel.add(mainPanelTopPanel);

		interventionLabel = new JLabel();
		interventionLabel.setForeground(Colors.vlgrey);
		mainPanelTopPanel.add(interventionLabel);

		mainPanelMiddlePanel = new JPanel();
		mainPanelMiddlePanel.setPreferredSize(new Dimension(width - 12, (height - 12) * 8 / 10));
		mainPanelMiddlePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		mainPanelMiddlePanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelMiddlePanel);

		JPanel mainPanelMiddleTopPanel = new JPanel();
		mainPanelMiddleTopPanel.setPreferredSize(new Dimension(width - 12, (height - 12) * 1 / 10));
		mainPanelMiddleTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 12, 12));
		mainPanelMiddleTopPanel.setBackground(Colors.dgrey);
		mainPanelMiddlePanel.add(mainPanelMiddleTopPanel);

		JLabel chooseLabel = new JLabel();
		chooseLabel.setForeground(Colors.vlgrey);
		chooseLabel.setText("Choose the regiment you want to give new orders:");
		mainPanelMiddleTopPanel.add(chooseLabel);

		JPanel mainPanelMiddleBottomPanel = new JPanel();
		mainPanelMiddleBottomPanel.setPreferredSize(new Dimension(width - 12, (height - 12) * 7 / 10));
		mainPanelMiddleBottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		mainPanelMiddleBottomPanel.setBackground(Colors.dgrey);
		mainPanelMiddlePanel.add(mainPanelMiddleBottomPanel);

		for (int i = 0; i < 8; i++) {
			Random random = new Random();
			Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
			ButtonedPanel panel = new ButtonedPanel((width - 12) / 2, (height - 12) / 4 * 7 / 10, color);
			panel.setBackground(Colors.dgreen);
			panel.button.setBorder(new LineBorder(Colors.vlgrey, 1));
			panel.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(color.getBlue());
				}
			});
			panels.add(panel);
		}

		for (ButtonedPanel panel : panels) {
			mainPanelMiddleBottomPanel.add(panel);
		}

		mainPanelBottomLeftPanel = new JPanel();
		mainPanelBottomLeftPanel.setPreferredSize(new Dimension((width - 12) * 2 / 3, (height - 12) / 10));
		mainPanelBottomLeftPanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelBottomLeftPanel);

		mainPanelBottomRightPanel = new JPanel();
		mainPanelBottomRightPanel
				.setPreferredSize(new Dimension((width - 12) - ((width - 12) * 2 / 3), (height - 12) / 10));
		mainPanelBottomRightPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 2));
		mainPanelBottomRightPanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelBottomRightPanel);

		acceptButton = new JButton();
		acceptButton.setPreferredSize(new Dimension((width - 12) / 3, ((height - 12) / 11) - 4));
		acceptButton.setOpaque(false);
		acceptButton.setContentAreaFilled(false);
		acceptButton.setBorderPainted(false);
		acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", (width - 12) / 6, (height - 12) / 12);
		acceptButton.setIcon(acceptIcon);

		mainPanelBottomRightPanel.add(acceptButton);

		for (ActionListener actionListener : acceptButton.getActionListeners()) {
			acceptButton.removeActionListener(actionListener);
		}

		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

	public void fillInterventionPopup() {
		
		interventionLabel.setText("Interventions left: " + interventions);
		interventions--;

		for (int i = 0; i < panels.size(); i++) {
			panels.get(i).label.setText("");
		}

		for (int i = 0; i < BattleOrchestrator.yourBattleArmy.roster.size(); i++) {
			panels.get(i).label.setText(BattleOrchestrator.yourBattleArmy.roster.get(i).captain.name + "'s "
					+ BattleOrchestrator.yourBattleArmy.roster.get(i).regiment);
		}
		
		for (int i = 0; i < BattleOrchestrator.yourBattleArmy.roster.size(); i++) {
			int index = i;
			try { panels.get(i).button.removeActionListener(panels.get(i).button.getActionListeners()[0]);
		} catch (Exception e) {}
			panels.get(i).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (interventions >= 0) {
					dispose();
					OrderPanel.bigTacticPanel.fillBigTacticPanelComplete(BattleOrchestrator.yourBattleArmy.roster.get(index), 0);
					OrderPanel.bigTacticPanel.setVisible(true);
					}
				}
			});

	}
		
	}

}
