package main.graphics.gameScreen.regimentView.captainDetail.bigOrderPanel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.utility.Colors;

public class BigTargetPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public BigTargetPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(new LineBorder(Colors.dgrey, 3));
		setBackground(Colors.vlgrey);
		
	}

}
