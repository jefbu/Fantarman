package main.graphics.gameScreen.regimentView.captainDetail.orderPanel;

import java.awt.Dimension;

import javax.swing.JButton;

import main.utility.Colors;

public class IndividualOrderPanel extends JButton {

	private static final long serialVersionUID = 1L;

	public IndividualOrderPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(null);
		setBackground(Colors.lred);
		
		
		
	}
	

}
