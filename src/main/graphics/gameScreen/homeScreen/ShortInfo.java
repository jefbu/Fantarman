package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class ShortInfo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private ContentPanel titlePanel;
	private ContentPanel titleBarPanel;
	private ContentPanel regimentsPanel;

	public ShortInfo(int width, int height) {
		
			super();
			setPreferredSize(new Dimension(width, height));
			setBackground(Colors.vlblue);
			setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));
			
			titlePanel = new ContentPanel(width / 2, height / 10, Colour.DBLUE,
					new FlowLayout(FlowLayout.CENTER, 0, height / 50));
			titlePanel.contentLabel.setForeground(Colors.textyellow);
			titlePanel.contentLabel.setFont(new Font("garamond", Font.BOLD, 28));
			titlePanel.contentLabel.setText("INFO");
			add(titlePanel);

			titleBarPanel = new ContentPanel(width * 9 / 10, height / 10, Colour.BLUE,
					new FlowLayout(FlowLayout.LEADING, 0, 0));

			add(titleBarPanel);

			regimentsPanel = new ContentPanel(width * 9 / 10, height * 7 / 10, Colour.LBLUE,
					new FlowLayout(FlowLayout.LEFT, 1, 0));
			add(regimentsPanel);

		}
	
	public void fillShortInformation() {
		
		
	}

}
