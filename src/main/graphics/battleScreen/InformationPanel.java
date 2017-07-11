package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class InformationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public InformationPanel(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		
		int roundedHeight = battleScreenHeight * 2 / 10 + ((battleScreenHeight * 8 / 10)%48);
		int roundedWidth = battleScreenWidth * 9 / 10;
		
		setPreferredSize(new Dimension(roundedWidth, roundedHeight));
		setBackground(new Color(60, 50, 40));
		
	}
	
	

}
