package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonedPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JLabel label;
	public JButton button;
	
	public ButtonedPanel(int width, int height) {
		
		super();
		int hgap = 0;
		int vgap = height / 4;
		
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		button = new JButton();
		button.setPreferredSize(new Dimension(width, height));
		button.setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		add(button);
		
		label = new JLabel();
		button.add(label);
	}

}
