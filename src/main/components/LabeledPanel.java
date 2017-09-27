package main.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabeledPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public JLabel label;
	
	public LabeledPanel(int width, int height) {
		
		super();
		
		int hgap = 0;
		int vgap = height / 4;
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.CENTER, hgap, vgap));
		
		label = new JLabel();
		add(label);
		
	}

}
