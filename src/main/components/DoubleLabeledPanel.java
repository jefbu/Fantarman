package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.utility.Colors;

public class DoubleLabeledPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JPanel titlePanel;
	public JLabel titleLabel;
	public JPanel contentPanel;
	public JLabel contentLabel;
	
	public DoubleLabeledPanel(int width, int height, int ratio, Colour colour) {
				
		super();
		int vgap = height / 4;
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension (width * ratio / 100, height));
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, vgap));
		titlePanel.setBackground(new Color(0,0,0));
		
		titleLabel = new JLabel();
		titlePanel.add(titleLabel);
		
		contentPanel = new JPanel();
		contentPanel.setPreferredSize(new Dimension(width * (100 - ratio) / 100, height));
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, vgap));
		contentPanel.setBackground(new Color(180,180,180));
		
		contentLabel = new JLabel();
		contentPanel.add(contentLabel);

		add(titlePanel);
		add(contentPanel);
		
		applyColours(colour);
		
	}
	
	private void applyColours(Colour colour) {
		
		switch(colour) {

		case LRED:
			titlePanel.setBackground(Colors.lorange);
			titleLabel.setForeground(Colors.dorange);
			contentPanel.setBackground(Colors.orange);
			contentLabel.setForeground(Colors.vlorange);
			break;
		case RED:
			break;
		case DRED:
			break;
		case LGREEN:
			titlePanel.setBackground(Colors.lgreen);
			titleLabel.setForeground(Colors.dgreen);
			contentPanel.setBackground(Colors.green);
			contentLabel.setForeground(Colors.vlgreen);
			break;
		case GREEN:
			break;
		case DGREEN:
			break;
		case BLUE:
			break;
		case DBLUE:
			titlePanel.setBackground(Colors.dblue);
			titleLabel.setForeground(Colors.backgroundOrange);
			contentPanel.setBackground(Colors.backgroundOrange);
			contentLabel.setForeground(Colors.blue);
			break;
		case LBLUE:
			titlePanel.setBackground(Colors.lblue);
			titleLabel.setForeground(Colors.dblue);
			contentPanel.setBackground(Colors.blue);
			contentLabel.setForeground(Colors.backgroundOrange);
			break;	
		case DGREY:
			titlePanel.setBackground(Colors.dgrey);
			titleLabel.setForeground(Colors.lgrey);
			contentPanel.setBackground(Colors.vlgrey);
			contentLabel.setForeground(Colors.grey);
			break;
		case GREY:
			titlePanel.setBackground(Colors.grey);
			titleLabel.setForeground(Colors.vdgrey);
			contentPanel.setBackground(Colors.grey);
			contentLabel.setForeground(Colors.vlgrey);
			break;
		case LGREY:
			titlePanel.setBackground(Colors.lgrey);
			titleLabel.setForeground(Colors.dgrey);
			contentPanel.setBackground(Colors.vdgrey);
			contentLabel.setForeground(Colors.grey);
			break;
		case VDGREY:
			titlePanel.setBackground(Colors.lgrey);
			titleLabel.setForeground(Colors.dgrey);
			contentPanel.setBackground(Colors.vdgrey);
			contentLabel.setForeground(Colors.grey);
			break;
			
		
		}
		
	}

}