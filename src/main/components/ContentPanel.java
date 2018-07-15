package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.Colors;

public class ContentPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public JPanel insidePanel;
	public JLabel contentLabel;

	public ContentPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super();
		setPreferredSize (new Dimension(width - 10, height - 10));
		setBorder(null);
		setLayout (new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		insidePanel = new JPanel();
		insidePanel.setPreferredSize(new Dimension (width - 15, height - 15));
		insidePanel.setBorder(null);
		insidePanel.setLayout(flowLayout);
		
		contentLabel = new JLabel();
		contentLabel.setForeground(new Color (255, 240, 200));
		contentLabel.setFont(new Font ("garamond", Font.BOLD, 22));
		
		insidePanel.add(contentLabel);		
		add(insidePanel);
		
		applyColours(colour);

		
	}
	
	private void applyColours(Color colour) {
		
		setBackground(Colors.vdgrey);
		insidePanel.setBackground(colour);
		
		/*
		switch (colour) {
		case LRED:
			setBackground(Colors.orange);
			insidePanel.setBackground(Colors.lorange);
			break;
		case RED:
			setBackground(Colors.dorange);
			insidePanel.setBackground(Colors.orange);
			break;
		case DRED:
			setBackground(Colors.vdorange);
			insidePanel.setBackground(Colors.dorange);
			break;
		case LGREEN:
			setBackground(Colors.green);
			insidePanel.setBackground(Colors.lgreen);
			break;
		case GREEN:
			setBackground(Colors.dgreen);
			insidePanel.setBackground(Colors.green);
			break;
		case DGREEN:
			setBackground(Colors.vdgreen);
			insidePanel.setBackground(Colors.dgreen);
			break;
		case LBLUE:
			setBackground(Colors.blue);
			insidePanel.setBackground(Colors.lblue);
			break;
		case BLUE:
			setBackground(Colors.dblue);
			insidePanel.setBackground(Colors.blue);
			break;
		case DBLUE:
			setBackground(Colors.vdblue);
			insidePanel.setBackground(Colors.dblue);
			break;
		case LGREY:
			setBackground(Colors.grey);
			insidePanel.setBackground(Colors.lgrey);
			break;
		case GREY:
			setBackground(Colors.dgrey);
			insidePanel.setBackground(Colors.grey);
			break;
		case DGREY:
			setBackground(Colors.vdgrey);
			insidePanel.setBackground(Colors.dgrey);
			break;
		default:
			break;

		}
*/
	}

}
