package main.graphics.gameScreen.regimentView.captainDetail.bigTacticPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import main.components.CheckboxPanel;
import main.utility.Colors;

public class BigTargetPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	CheckboxPanel strongestPanel;
	CheckboxPanel nearestPanel;
	CheckboxPanel weakestPanel;
	CheckboxPanel selfPanel;
	CheckboxPanel nonePanel;

	public BigTargetPanel(int width, int height, int checkboxPanelHeight) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBorder(new LineBorder(Colors.dgrey, 3));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlgrey);
		
		strongestPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		strongestPanel.textLabel.setText("Strongest Enemy");
		nearestPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		nearestPanel.textLabel.setText("Nearest Enemy");
		weakestPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		weakestPanel.textLabel.setText("Weakest Enemy");
		selfPanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		selfPanel.textLabel.setText("Ourselves");
		nonePanel = new CheckboxPanel(width * 19 / 100, checkboxPanelHeight, Colors.vlgrey);
		nonePanel.textLabel.setText("No Target");

		add(strongestPanel);
		add(nearestPanel);
		add(weakestPanel);
		add(selfPanel);
		add(nonePanel);

		
	}

}
