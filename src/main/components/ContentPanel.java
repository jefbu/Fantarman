package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ContentPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public JPanel insidePanel;

	public ContentPanel(int width, int height, Colour colour) {
		
		super();
		setPreferredSize (new Dimension(width - 10, height - 10));
		setBorder(null);
		setLayout (new FlowLayout(FlowLayout.LEADING, 0, 0));
		setBackground(applyColour(colour, 0));
		
		insidePanel = new JPanel();
		insidePanel.setPreferredSize(new Dimension (width - 15, height - 15));
		insidePanel.setBorder(null);
		insidePanel.setBackground(applyColour(colour, 100));
		insidePanel.setLayout(new FlowLayout (FlowLayout.LEFT, 2, 2));
		
		add(insidePanel);
		
		
	}
	
	private Color applyColour(Colour colour, int highlight) {
		
		switch (colour) {
		case RED: return new Color(40 + highlight * 4 / 3, 35 + highlight * 2 / 3, 35 + highlight * 2 / 3);
		case GREEN: return new Color (35 + highlight * 3 / 4, 40 + highlight * 4 / 3, 35 + highlight * 3 / 4);
		case BLUE: return new Color (35 + highlight * 2 / 3, 35 + highlight * 2 / 3, 40 + highlight * 4 / 3);
		}
		return new Color(0,0,0);
	}

}
