package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class InfoTextPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public InfoTextPanel(Dimension dimension) {
		
		super();
		
		int width = (int) dimension.getWidth() - 4;
		int height = ((int) dimension.getHeight() - 4) * 85 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		
	}
	
	

}
