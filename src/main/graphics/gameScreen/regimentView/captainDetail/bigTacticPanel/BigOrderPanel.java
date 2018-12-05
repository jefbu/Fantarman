package main.graphics.gameScreen.regimentView.captainDetail.bigTacticPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.components.CheckboxPanel;
import main.utility.Colors;

public class BigOrderPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	CheckboxPanel moveToPanel;
	CheckboxPanel moveForwardPanel;
	CheckboxPanel chargePanel;
	CheckboxPanel recoverPanel;
	CheckboxPanel missilePanel;

	public BigOrderPanel(int width, int height, int checkboxPanelHeight) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(new LineBorder(Colors.dgrey, 3));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlgrey);
		
		moveToPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		moveToPanel.textLabel.setText("Move Towards");
		moveForwardPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		moveForwardPanel.textLabel.setText("Move Forwards");
		chargePanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		chargePanel.textLabel.setText("Chaaarge!");
		recoverPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		recoverPanel.textLabel.setText("Recover");
		missilePanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		missilePanel.textLabel.setText("Fire At");
		
		add(moveToPanel);
		add(chargePanel);
		add(moveForwardPanel);
		add(missilePanel);
		add(recoverPanel);
		
	}

}
