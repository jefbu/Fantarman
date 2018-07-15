package main.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonedPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JLabel label;
	public JButton button;
	private Color color;
	
	public ButtonedPanel(int width, int height, Color color) {
		
		super();
		int hgap = 0;
		int vgap = height / 4;
		
		this.color = color;
		
		setPreferredSize(new Dimension(width, height));
		setOpaque(false);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		button = new JButton();
		button.setPreferredSize(new Dimension(width, height));
		button.setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
		button.setBorder(null);
		button.setContentAreaFilled(false);
		button.addMouseListener(new MouseClass());
		add(button);
		
		label = new JLabel();
		button.add(label);
	}
	
	private class MouseClass extends MouseAdapter {

		public void mouseEntered(MouseEvent e) {

			int red = color.getRed() + 60;
			if(red > 255) red = 255;
			int green = color.getGreen() + 60;
			if(green > 255) green = 255;
			int blue = color.getBlue() - 60;
			if(blue < 0) blue = 0;
			
			label.setForeground(new Color(red, green, blue));
		}
		
		public void mouseExited(MouseEvent e) {
			label.setForeground(new Color(color.getRed(), color.getGreen(), color.getBlue()));
		}
	}

}
