package main.battle;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.entity.captains.Conversation;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class Skit extends JDialog {

	private static final long serialVersionUID = 1L;

	JLabel yourIconLabel;
	JLabel yourTextLabel;
	JLabel opponentIconLabel;
	JLabel opponentTextLabel;
	JButton button;
	
	int counter;

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
		topPortraitPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
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
		bottomPortraitPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
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

		button = new JButton();
		button.setPreferredSize(new Dimension(width / 15, height / 10));
		bottomEmptyPanel.add(button);

		panel.add(bottomEmptyPanel);

		fillSkit(yourBattleArmy, opponentBattleArmy);

	}

	public void fillSkit(Army yourBattleArmy, Army opponentBattleArmy) {

		ArrayList<Conversation> possibleConversations = new ArrayList<Conversation>();

		for (Regiment regiment : yourBattleArmy.roster) {
			for (Conversation conversation : regiment.captain.conversations) {
				for (Regiment opponentRegiment : opponentBattleArmy.roster) {
					if (conversation.partner.name == opponentRegiment.captain.name) {
						possibleConversations.add(conversation);
					}
				}
				for (Regiment playerRegiment : yourBattleArmy.roster) {
					if (conversation.partner.name == playerRegiment.captain.name) {
						possibleConversations.add(conversation);
					}
				}
			}
		}

		if (possibleConversations.size() > 0) {

			Conversation conversation = chooseConversation(possibleConversations);
			counter = 0;
			
			yourIconLabel.setIcon(
					imageLoader.loadImageIcon(conversation.owner.iconPath, width * 2 / 10, height * 3 / 10));
			opponentIconLabel.setIcon(
					imageLoader.loadImageIcon(conversation.partner.iconPath, width * 2 / 10, height * 3 / 10));
			
			setText(conversation, counter);
				
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (counter + 1 == conversation.texts.length) {
							button.removeActionListener(button.getActionListeners()[0]);
							dispose();
						} else {
						counter++;
						setText(conversation, counter);
						}
					}
				});
				
			}
			
			setVisible(true);

		}


	private Conversation chooseConversation(ArrayList<Conversation> possibleConversations) {
		Random random = new Random();
		int roll = random.nextInt(possibleConversations.size());
		return possibleConversations.get(roll);
	}
	
	private void setText(Conversation conversation, int counter) {
		if (conversation.ownVoice[counter]) {
			yourTextLabel.setText(conversation.texts[counter]);
		} else {
			opponentTextLabel.setText(conversation.texts[counter]);
		}
	}

}