package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import main.components.ButtonedPanel;
import main.strings.Wiki;
import main.utility.Colors;

public class WikiView extends JPanel {

	private static final long serialVersionUID = 1L;

	JPanel mainPanel;
	ButtonedPanel combatPanel;
	ButtonedPanel managementPanel;
	ButtonedPanel conceptsPanel;
	ButtonedPanel fluffPanel;
	ButtonedPanel creditsPanel;

	JTextPane textArea;

	public WikiView(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);
		setBackground(Colors.dgreen);

		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight * 5 / 100));
		topPanel.setBackground(Colors.vlblue);
		add(topPanel);

		combatPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight * 5 / 100, Colors.vdblue);
		combatPanel.label.setForeground(Colors.vdblue);
		combatPanel.label.setText("Combat");
		combatPanel.button.setOpaque(true);
		combatPanel.button.setBackground(Colors.green);
		combatPanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllPanelsColour();
				combatPanel.button.setBackground(Colors.green);
				textArea.setText(Wiki.combatString);
			}
		});
		add(combatPanel);

		managementPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight * 5 / 100, Colors.vdblue);
		managementPanel.label.setForeground(Colors.vdblue);
		managementPanel.label.setText("Management");
		managementPanel.button.setOpaque(true);
		managementPanel.button.setBackground(Colors.lblue);
		managementPanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllPanelsColour();
				managementPanel.button.setBackground(Colors.green);
				textArea.setText(Wiki.managementString);
			}
		});
		add(managementPanel);

		conceptsPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight * 5 / 100, Colors.vdblue);
		conceptsPanel.label.setForeground(Colors.vdblue);
		conceptsPanel.label.setText("Concepts");
		conceptsPanel.button.setOpaque(true);
		conceptsPanel.button.setBackground(Colors.lblue);
		conceptsPanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllPanelsColour();
				conceptsPanel.button.setBackground(Colors.green);
				textArea.setText(Wiki.conceptsString);
			}
		});
		add(conceptsPanel);

		fluffPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight * 5 / 100, Colors.vdblue);
		fluffPanel.label.setForeground(Colors.vdblue);
		fluffPanel.label.setText("Fluff");
		fluffPanel.button.setOpaque(true);
		fluffPanel.button.setBackground(Colors.lblue);
		fluffPanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllPanelsColour();
				fluffPanel.button.setBackground(Colors.green);
				textArea.setText(Wiki.fluffString);
			}
		});
		add(fluffPanel);

		creditsPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight * 5 / 100, Colors.vdblue);
		creditsPanel.label.setForeground(Colors.vdblue);
		creditsPanel.label.setText("Credits");
		creditsPanel.button.setOpaque(true);
		creditsPanel.button.setBackground(Colors.lblue);
		creditsPanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAllPanelsColour();
				creditsPanel.button.setBackground(Colors.green);
				textArea.setText(Wiki.creditsString);
			}
		});
		add(creditsPanel);

		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight * 90 / 100));
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, unroundedHeight * 5 / 100));
		mainPanel.setBackground(Colors.dgreen);
		add(mainPanel);
		
		textArea = new JTextPane();
		textArea.setPreferredSize(new Dimension (roundedWidth * 9 /10, unroundedHeight * 7 / 10));
		//textArea.setLineWrap(true);
		//textArea.setWrapStyleWord(true);
		textArea.setOpaque(false);
		textArea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 100));
		textArea.setContentType("text/html");
		textArea.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textArea.setFont(new Font("garamond",Font.BOLD,18));
		textArea.setText(
				"<font face = 'arial' color = 'rgb(200, 150, 255)'>" + "blablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla "
				+ "blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla "
				+ "blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl"
				+ " bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla "
				+ "blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  "
				+ "blablabla blablabla blablablablablabablabl bla blbla blablabla "
				+ "blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl "
				+ "bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla "
				+ "blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla "
				+ "blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  "
				+ "blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla "
				+ "blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba "
				+ "abla blblbla  blablabla jou-ji blablablablablabablabl bla blbla blablabla "
				+ "blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla "
				+ "blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla "
				+ "blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablablablablablablba abla blblbla  blablabla blablabla blablablablablabablabl bla blbla blablabla blablablablabla");
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
		mainPanel.add(scrollPane);

	}

	private void setAllPanelsColour() {
		combatPanel.button.setBackground(Colors.lblue);
		managementPanel.button.setBackground(Colors.lblue);
		conceptsPanel.button.setBackground(Colors.lblue);
		fluffPanel.button.setBackground(Colors.lblue);
		creditsPanel.button.setBackground(Colors.lblue);
	}

}
