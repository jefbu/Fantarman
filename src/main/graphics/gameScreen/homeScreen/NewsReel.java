package main.graphics.gameScreen.homeScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class NewsReel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ContentPanel titlePanel;
	private ContentPanel contentPanel;

	public NewsReel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlblue);

		JPanel upperVoidPanel = new JPanel();
		upperVoidPanel.setPreferredSize(new Dimension(width, height * 5 / 100));
		upperVoidPanel.setBackground(Colors.vlblue);
		add(upperVoidPanel);

		JPanel upperLeftVoidPanel = new JPanel();
		upperLeftVoidPanel.setPreferredSize(new Dimension(width * 5 / 100, height * 20 / 100));
		upperLeftVoidPanel.setBackground(Colors.vlblue);
		add(upperLeftVoidPanel);

		titlePanel = new ContentPanel(width * 30 / 100, height * 25 / 100, Colour.BLUE,
				new FlowLayout(FlowLayout.CENTER, 0, 0));
		add(titlePanel);

		JPanel upperRightVoidPanel = new JPanel();
		upperRightVoidPanel.setPreferredSize(new Dimension(width * 65 / 100, height * 20 / 100));
		upperRightVoidPanel.setBackground(Colors.vlblue);
		add(upperRightVoidPanel);

		JPanel lowerLeftVoidPanel = new JPanel();
		lowerLeftVoidPanel.setPreferredSize(new Dimension(width * 6 / 100, height * 65 / 100));
		lowerLeftVoidPanel.setBackground(Colors.vlblue);
		add(lowerLeftVoidPanel);

		contentPanel = new ContentPanel(width * 80 / 100, height * 60 / 100, Colour.LBLUE,
				new FlowLayout(FlowLayout.LEFT, 10, 10));
		add(contentPanel);

	}

	public void fillNewsReel() {

	}

}
