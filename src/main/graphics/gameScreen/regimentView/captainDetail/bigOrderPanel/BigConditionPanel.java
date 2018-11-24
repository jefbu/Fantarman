package main.graphics.gameScreen.regimentView.captainDetail.bigOrderPanel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.components.CheckboxPanel;
import main.utility.Colors;

public class BigConditionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	CheckboxPanel alwaysPanel;

	public BigConditionPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(new LineBorder(Colors.dgrey, 3));
		setBackground(Colors.vlgrey);
		
		alwaysPanel = new CheckboxPanel(150, 50, Colors.dgreen);
		
		add(alwaysPanel);
		
		
	}

}
