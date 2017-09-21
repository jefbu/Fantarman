package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public JPanel insidePanel;
	public JLabel contentLabel;

	public ContentPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super();
		setPreferredSize (new Dimension(width - 10, height - 10));
		setBorder(null);
		setLayout (new FlowLayout(FlowLayout.LEADING, 0, 0));
		setBackground(applyColour(colour, 90));
		
		insidePanel = new JPanel();
		insidePanel.setPreferredSize(new Dimension (width - 15, height - 15));
		insidePanel.setBorder(null);
		insidePanel.setBackground(applyColour(colour, 140));
		insidePanel.setLayout(flowLayout);
		
		contentLabel = new JLabel();
		contentLabel.setForeground(new Color (255, 240, 200));
		contentLabel.setFont(new Font ("garamond", Font.BOLD, 22));
		
		insidePanel.add(contentLabel);		
		add(insidePanel);

		
	}
	
	private Color applyColour(Colour colour, int highlight) {
		
		switch (colour) {
		case RED: return new Color(highlight * 3 / 2, highlight, highlight / 2);
		case GREEN: return new Color (highlight, highlight * 3 / 2, highlight / 2);
		case BLUE: return new Color (highlight / 2, highlight, highlight * 3 / 2 );
		case DBLUE: return new Color (highlight / 3, highlight * 2 / 3, highlight);
		case DRED: return new Color (highlight * 2 / 3, highlight / 2, highlight / 4);
		case DGREEN: return new Color (highlight / 4, highlight * 2 / 3, highlight / 2);
		case LRED: return new Color(highlight * 3 / 2 + 30, highlight + 30, highlight / 2 + 30);
		case LGREEN: return new Color(highlight + 30, highlight * 3 / 2 + 30, highlight / 2 + 30);
		case LBLUE: return new Color(highlight / 2 + 30, highlight + 30, highlight * 3 / 2 + 30);
		}
		return new Color(0,0,0);
	}

}
