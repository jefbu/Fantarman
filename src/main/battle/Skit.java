package main.battle;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import main.components.ButtonedPanel;
import main.components.ContentPanel;
import main.entity.armies.Army;
import main.entity.captains.Conversation;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.utility.Colors;
import main.utility.ImageLoader;

public class Skit extends JDialog {

	private static final long serialVersionUID = 1L;

	JLabel yourIconLabel;
	JTextPane yourTextLabel;
	JLabel opponentIconLabel;
	JTextPane opponentTextLabel;
	ButtonedPanel button;

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
		
		ContentPanel panel = new ContentPanel(width, height, Colors.lgrey, new FlowLayout(FlowLayout.LEFT, 0, 0));
		// panel.setPreferredSize(new Dimension(100, 100));
		// panel.setBackground(Colors.lblue);
		// panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(panel);
		
		panel.setBackground(Colors.vdgrey);
		panel.insidePanel.setPreferredSize(new Dimension (width - 10, height - 10));

		JPanel topEmptyPanel = new JPanel();
		topEmptyPanel.setPreferredSize(new Dimension(width, height / 10));
		topEmptyPanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(topEmptyPanel);

		JPanel topLeftEmptyPanel = new JPanel();
		topLeftEmptyPanel.setPreferredSize(new Dimension(width / 10, height * 3 / 10));
		topLeftEmptyPanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(topLeftEmptyPanel);

		JPanel topPortraitPanel = new JPanel();
		topPortraitPanel.setPreferredSize(new Dimension(width * 2 / 10, height * 3 / 10));
		topPortraitPanel.setBackground(Colors.grey);
		topPortraitPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		yourIconLabel = new JLabel();
		topPortraitPanel.add(yourIconLabel);
		panel.insidePanel.add(topPortraitPanel);

		ContentPanel topTextContentPanel = new ContentPanel(width / 2 + 10, height * 3 / 10 + 10, Colors.vlgrey,
				new FlowLayout(FlowLayout.LEFT, width / 200, height / 200));
		panel.insidePanel.add(topTextContentPanel);

			JPanel topTextPanel = new JPanel();
			topTextPanel.setPreferredSize(new Dimension(width * 48 / 100, height * 28 / 100));
			topTextPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			topTextPanel.setBackground(Colors.vdgrey);
			yourTextLabel = new JTextPane();
			yourTextLabel.setPreferredSize(new Dimension(width * 48 / 100, height * 28 / 100));
			// yourTextLabel.setLineWrap(true);
			// yourTextLabel.setWrapStyleWord(true);
			yourTextLabel.setOpaque(false);
			yourTextLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
			yourTextLabel.setContentType("text/html");
			yourTextLabel.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
			yourTextLabel.setFont(new Font("garamond", Font.BOLD, 18));
			topTextPanel.add(yourTextLabel);
			topTextContentPanel.insidePanel.add(topTextPanel);

		JPanel topRightEmptyPanel = new JPanel();
		topRightEmptyPanel.setPreferredSize(new Dimension(width * 18 / 100, height * 3 / 10));
		topRightEmptyPanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(topRightEmptyPanel);

		JPanel middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(width, height / 10));
		middlePanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(middlePanel);

		JPanel bottomLeftEmptyPanel = new JPanel();
		bottomLeftEmptyPanel.setPreferredSize(new Dimension(width * 15 / 100, height * 3 / 10));
		bottomLeftEmptyPanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(bottomLeftEmptyPanel);
		
		ContentPanel bottomTextContentPanel = new ContentPanel(width / 2 + 10, height * 3 / 10 + 10, Colors.vlgrey,
				new FlowLayout(FlowLayout.LEFT, width / 200, height / 200));
		panel.insidePanel.add(bottomTextContentPanel);

			JPanel bottomTextPanel = new JPanel();
			bottomTextPanel.setPreferredSize(new Dimension(width * 48 / 100, height * 28 / 100));
			bottomTextPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			bottomTextPanel.setBackground(Colors.vdgrey);
			opponentTextLabel = new JTextPane();
			opponentTextLabel.setPreferredSize(new Dimension(width * 48 / 100, height * 28 / 100));
			// opponentTextLabel.setLineWrap(true);
			// opponentTextLabel.setWrapStyleWord(true);
			opponentTextLabel.setOpaque(false);
			opponentTextLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 30));
			opponentTextLabel.setContentType("text/html");
			opponentTextLabel.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
			opponentTextLabel.setFont(new Font("garamond", Font.BOLD, 18));
			bottomTextPanel.add(opponentTextLabel);
			bottomTextContentPanel.insidePanel.add(bottomTextPanel);

		JPanel bottomPortraitPanel = new JPanel();
		bottomPortraitPanel.setPreferredSize(new Dimension(width * 2 / 10, height * 3 / 10));
		bottomPortraitPanel.setBackground(Colors.grey);
		bottomPortraitPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		opponentIconLabel = new JLabel();
		bottomPortraitPanel.add(opponentIconLabel);
		panel.insidePanel.add(bottomPortraitPanel);

		JPanel bottomRightEmptyPanel = new JPanel();
		bottomRightEmptyPanel.setPreferredSize(new Dimension(width / 10, height * 3 / 10));
		bottomRightEmptyPanel.setBackground(Colors.lgrey);
		panel.insidePanel.add(bottomRightEmptyPanel);

		JPanel bottomEmptyPanel = new JPanel();
		bottomEmptyPanel.setPreferredSize(new Dimension(width, height * 15 / 100));
		bottomEmptyPanel.setBackground(Colors.lgrey);
		bottomEmptyPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, width / 20, height / 30));

		button = new ButtonedPanel(width / 5, height / 10, Colors.lgrey);
		button.label.setIcon(imageLoader.loadImageIcon("/icons/orderButton.png", width / 6, height / 12));
		bottomEmptyPanel.add(button);

		panel.insidePanel.add(bottomEmptyPanel);

	}

	public void fillSkit(Army yourBattleArmy, Army opponentBattleArmy) {

		ArrayList<Conversation> possibleConversations = new ArrayList<Conversation>();

		for (Regiment regiment : yourBattleArmy.roster) {
			for (Conversation conversation : regiment.captain.conversations) {
				if (!conversation.alreadyDone) {
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
		}

		if (possibleConversations.size() > 0) {

			Conversation conversation = chooseConversation(possibleConversations);

			counter = 0;

			yourIconLabel
					.setIcon(imageLoader.loadImageIcon(conversation.owner.iconPath, width * 2 / 10, height * 3 / 10));
			opponentIconLabel
					.setIcon(imageLoader.loadImageIcon(conversation.partner.iconPath, width * 2 / 10, height * 3 / 10));

			setText(conversation, counter);

			button.button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (counter + 1 == conversation.texts.length) {
						button.button.removeActionListener(button.button.getActionListeners()[0]);
						conversation.alreadyDone = true;
						dispose();
					} else {
						counter++;
						setText(conversation, counter);
					}
				}
			});

			setVisible(true);
		}

	}

	private Conversation chooseConversation(ArrayList<Conversation> possibleConversations) {
		Random random = new Random();
		int roll = random.nextInt(possibleConversations.size());
		return possibleConversations.get(roll);
	}

	private void setText(Conversation conversation, int counter) {
		if (conversation.ownVoice[counter]) {
			yourTextLabel.setText("<font color = 'rgb(210, 210, 250)'>" + conversation.texts[counter]);
		} else {
			opponentTextLabel.setText(
					"<font color = 'rgb(210, 210, 250)'>" + "<p align = 'right'> " + conversation.texts[counter]);
		}
	}

}