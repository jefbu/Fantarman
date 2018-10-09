package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import main.utility.Colors;

public class NewsReel extends JPanel {

	private static final long serialVersionUID = 1L;

	private RandomNews randomNews;
	public JTextPane textArea;

	public NewsReel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		setBackground(Colors.dgrey);
		
		randomNews = new RandomNews();
		
		/*
		titlePanel = new ContentPanel(width * 30 / 100, height * 25 / 100, Colour.DGREY,
				new FlowLayout(FlowLayout.CENTER, 0, 0));
		titlePanel.contentLabel.setText("Breaking News");
		add(titlePanel);

		JPanel upperRightVoidPanel = new JPanel();
		upperRightVoidPanel.setPreferredSize(new Dimension(width * 65 / 100, height * 20 / 100));
		upperRightVoidPanel.setBackground(Colors.vlblue);
		add(upperRightVoidPanel);

		JPanel lowerLeftVoidPanel = new JPanel();
		lowerLeftVoidPanel.setPreferredSize(new Dimension(width * 6 / 100, height * 65 / 100));
		lowerLeftVoidPanel.setBackground(Colors.vlblue);
		add(lowerLeftVoidPanel);
		*/

		
		
		textArea = new JTextPane();
		textArea.setContentType("text/html");
		textArea.putClientProperty(JTextPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		textArea.setFont(new Font("garamond",Font.BOLD,20));
		textArea.setPreferredSize(new Dimension(width, height * 9 / 10));
		textArea.setEditable(false);
		textArea.setBackground(Colors.vlgrey);
		textArea.setMargin(new Insets(10,10,10,10));

		add(textArea);

	}

	public void fillNewsReel() {
		textArea.setText(randomNews.getNews());
	}

}
