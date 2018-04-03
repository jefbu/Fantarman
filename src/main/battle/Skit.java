package main.battle;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.entity.armies.Army;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class Skit extends JDialog {

	private static final long serialVersionUID = 1L;
	
	JLabel yourIconLabel;
	JLabel yourTextLabel;
	JLabel opponentIconLabel;
	JLabel opponentTextLabel;
	
	ImageLoader imageLoader;
	
	int width;
	int height;

	public Skit(Army yourBattleArmy, Army opponentBattleArmy) {
		
		super(null, Dialog.ModalityType.APPLICATION_MODAL);
		
		imageLoader = new ImageLoader();
		
		width = BattleScreen.battleScene.roundedWidth * 3 / 4;
		height = BattleScreen.battleScene.roundedHeight * 3 / 4;
		
		setSize(new Dimension(width, height));
		setLocationRelativeTo(BattleScreen.battleScene);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Colors.lblue);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(panel);
		
			JPanel topEmptyPanel = new JPanel();
			topEmptyPanel.setPreferredSize(new Dimension(width, height / 10));
			topEmptyPanel.setBackground(Colors.lblue);
			panel.add(topEmptyPanel);
			
			JPanel topLeftEmptyPanel = new JPanel();
			topLeftEmptyPanel.setPreferredSize(new Dimension(width / 10, height * 3 / 10));
			topLeftEmptyPanel.setBackground(Colors.lblue);
			panel.add(topLeftEmptyPanel);
			
			JPanel topPortraitPanel = new JPanel();
			topPortraitPanel.setPreferredSize(new Dimension(width * 2 / 10, height * 3 / 10));
			topPortraitPanel.setBackground(Colors.lred);
				yourIconLabel = new JLabel();
				topPortraitPanel.add(yourIconLabel);
			panel.add(topPortraitPanel);
			
			JPanel topTextPanel = new JPanel();
			topTextPanel.setPreferredSize(new Dimension(width * 5 / 10, height * 3 / 10));
			topTextPanel.setBackground(Colors.dgreen);
				yourTextLabel = new JLabel();
				topTextPanel.add(yourTextLabel);
			panel.add(topTextPanel);
			
			JPanel topRightEmptyPanel = new JPanel();
			topRightEmptyPanel.setPreferredSize(new Dimension(width * 15 / 100, height * 3 / 10));
			topRightEmptyPanel.setBackground(Colors.lblue);
			panel.add(topRightEmptyPanel);
			
			JPanel middlePanel = new JPanel();
			middlePanel.setPreferredSize(new Dimension(width, height / 10));
			middlePanel.setBackground(Colors.lblue);
			panel.add(middlePanel);
			
			JPanel bottomLeftEmptyPanel = new JPanel();
			bottomLeftEmptyPanel.setPreferredSize(new Dimension(width * 15 / 100, height * 3 / 10));
			bottomLeftEmptyPanel.setBackground(Colors.lblue);
			panel.add(bottomLeftEmptyPanel);
			
			JPanel bottomTextPanel = new JPanel();
			bottomTextPanel.setPreferredSize(new Dimension(width * 5 / 10, height * 3 / 10));
			bottomTextPanel.setBackground(Colors.dgreen);
				opponentTextLabel = new JLabel();
				bottomTextPanel.add(opponentTextLabel);
			panel.add(bottomTextPanel);
			
			JPanel bottomPortraitPanel = new JPanel();
			bottomPortraitPanel.setPreferredSize(new Dimension(width * 2 / 10, height * 3 / 10));
			bottomPortraitPanel.setBackground(Colors.lred);
				opponentIconLabel = new JLabel();
				bottomPortraitPanel.add(opponentIconLabel);
			panel.add(bottomPortraitPanel);
			
			JPanel bottomRightEmptyPanel = new JPanel();
			bottomRightEmptyPanel.setPreferredSize(new Dimension(width / 10, height * 3 / 10));
			bottomRightEmptyPanel.setBackground(Colors.lblue);
			panel.add(bottomRightEmptyPanel);
			
			JPanel bottomEmptyPanel = new JPanel();
			bottomEmptyPanel.setPreferredSize(new Dimension(width, height * 15 / 100));
			bottomEmptyPanel.setBackground(Colors.lblue);
			bottomEmptyPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
			
				JButton button = new JButton();
				button.setPreferredSize(new Dimension(width / 15, height / 10));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				bottomEmptyPanel.add(button);
			
			panel.add(bottomEmptyPanel);
			
			fillSkit(yourBattleArmy, opponentBattleArmy);
		
		setVisible(true);
		
	}
	
	public void fillSkit(Army yourBattleArmy, Army opponentBattleArmy) {
		
		yourIconLabel.setIcon(imageLoader.loadImageIcon(yourBattleArmy.roster.get(0).captain.iconPath, width * 2 / 10, height * 3 / 10));
		opponentIconLabel.setIcon(imageLoader.loadImageIcon(opponentBattleArmy.roster.get(0).captain.iconPath, width * 2 / 10, height * 3 / 10));
		
	}

}
