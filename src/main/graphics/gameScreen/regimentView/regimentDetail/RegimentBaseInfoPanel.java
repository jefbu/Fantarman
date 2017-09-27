package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public class RegimentBaseInfoPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	ArrayList<JPanel> panelList;
	DoubleLabeledPanel namePanel;
	DoubleLabeledPanel typePanel;
	DoubleLabeledPanel levelPanel;
	DoubleLabeledPanel valuePanel;
	DoubleLabeledPanel upkeepPanel;
	DoubleLabeledPanel lieutenantsPanel;
	
	public RegimentBaseInfoPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		namePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.LBLUE);
		namePanel.titleLabel.setText("Name");
		insidePanel.add(namePanel);
		
		typePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.LBLUE);
		typePanel.titleLabel.setText("Type");
		insidePanel.add(typePanel);
		
		levelPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 70, Colour.LBLUE);
		levelPanel.titleLabel.setText("Level");
		insidePanel.add(levelPanel);
		
		valuePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 60, Colour.LBLUE);
		valuePanel.titleLabel.setText("Value");
		insidePanel.add(valuePanel);
		
		upkeepPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 50, Colour.LBLUE);
		upkeepPanel.titleLabel.setText("Upkeep");
		insidePanel.add(upkeepPanel);
		
		lieutenantsPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 70, Colour.LBLUE);
		lieutenantsPanel.titleLabel.setText("Lieutenants");
		insidePanel.add(lieutenantsPanel);
			
	}
	
	public void fillRegimentBaseInfoPanel(Regiment regiment) {
		
		namePanel.contentLabel.setText(regiment.name);
		typePanel.contentLabel.setText(regiment.type.toString());
		levelPanel.contentLabel.setText(Integer.toString(regiment.level));
		valuePanel.contentLabel.setText(Integer.toString(regiment.value));
		upkeepPanel.contentLabel.setText(Integer.toString(regiment.upkeep));
		lieutenantsPanel.contentLabel.setText(Integer.toString(regiment.lieutenantsSize));
		
		
		
	}
}
