package main.graphics.gameScreen.regimentView.captainDetail;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JTextPane;

import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class CaptainBiographyPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	
	JTextPane biographyTextPane;

	public CaptainBiographyPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		biographyTextPane = new JTextPane();
		biographyTextPane.setPreferredSize(new Dimension(width - 30, height - 30));
		biographyTextPane.setEditable(false);
		biographyTextPane.setBorder(null);
		biographyTextPane.setBackground(Colors.lblue);
		biographyTextPane.setContentType("text/html");
		biographyTextPane.setText("<font color = 'rgb(20, 40, 80)' size = 5>" + "How does this work? <br>");
		insidePanel.add(biographyTextPane);
		
	}

}
