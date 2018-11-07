package main.graphics.battleScreen;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import main.battle.BattleOrchestrator;
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
	private JPanel mainPanelBottomLeftPanel;
	private JPanel mainPanelBottomRightPanel;

	public InterventionPopup(int width, int height) {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);

		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
				
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
		mainPanelTopPanel.setPreferredSize(new Dimension(width - 12, (height - 12) * 3 / 4));
		mainPanelTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 8));
		mainPanelTopPanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelTopPanel);

		mainPanelBottomLeftPanel = new JPanel();
		mainPanelBottomLeftPanel.setPreferredSize(new Dimension((width - 12) * 2 / 3, (height - 12) / 4));
		mainPanelBottomLeftPanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelBottomLeftPanel);

		mainPanelBottomRightPanel = new JPanel();
		mainPanelBottomRightPanel.setPreferredSize(new Dimension((width - 12) - ((width - 12) * 2 / 3), (height - 12) / 4));
		mainPanelBottomRightPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 2));
		mainPanelBottomRightPanel.setBackground(Colors.dgrey);
		mainPanel.add(mainPanelBottomRightPanel);
		
		acceptButton = new JButton();
		acceptButton.setPreferredSize(new Dimension((width - 12) / 3, ((height - 12) / 4) - 4));
		acceptButton.setOpaque(false);
		acceptButton.setContentAreaFilled(false);
		acceptButton.setBorderPainted(false);
		acceptIcon = imageLoader.loadImageIcon("/icons/confirm.png", (width - 12) / 4, (height - 12) / 5);
		acceptButton.setIcon(acceptIcon);

		mainPanelBottomRightPanel.add(acceptButton);	
		
		for (ActionListener actionListener: acceptButton.getActionListeners()) {
			acceptButton.removeActionListener(actionListener);
		}
		
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BattleOrchestrator.timer.restart();
				dispose();
			}
		});
		
		
	}
	
	
}
