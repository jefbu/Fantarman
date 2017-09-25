package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;

public class RegimentBaseInfoPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	ArrayList<JPanel> panelList;
	LabeledPanel namePanel;
	LabeledPanel typePanel;
	LabeledPanel levelPanel;
	LabeledPanel valuePanel;
	LabeledPanel upkeepPanel;
	LabeledPanel lieutenantsPanel;
	
	public RegimentBaseInfoPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		namePanel = new LabeledPanel(width - 10, (height - 18) / 6, 50, Colour.LBLUE);
		namePanel.titleLabel.setText("name");
		namePanel.contentLabel.setText("John");
		insidePanel.add(namePanel);
		
		typePanel = new LabeledPanel(width - 10, (height - 18) / 6, 50, Colour.LBLUE);
		insidePanel.add(typePanel);
		
		levelPanel = new LabeledPanel(width - 10, (height - 18) / 6, 70, Colour.LBLUE);
		insidePanel.add(levelPanel);
		
		valuePanel = new LabeledPanel(width - 10, (height - 18) / 6, 60, Colour.LBLUE);
		insidePanel.add(valuePanel);
		
		upkeepPanel = new LabeledPanel(width - 10, (height - 18) / 6, 60, Colour.LBLUE);
		insidePanel.add(upkeepPanel);
		
		lieutenantsPanel = new LabeledPanel(width - 10, (height - 18) / 6, 70, Colour.LBLUE);
		insidePanel.add(lieutenantsPanel);
		
		
	
	}
}
