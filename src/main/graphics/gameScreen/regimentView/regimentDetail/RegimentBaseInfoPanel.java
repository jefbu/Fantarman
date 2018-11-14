package main.graphics.gameScreen.regimentView.regimentDetail;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.DoubleLabeledPanel;
import main.entity.regiments.Regiment;

public class RegimentBaseInfoPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	ArrayList<JPanel> panelList;
	public DoubleLabeledPanel namePanel;
	DoubleLabeledPanel typePanel;
	DoubleLabeledPanel levelPanel;
	DoubleLabeledPanel valuePanel;
	DoubleLabeledPanel upkeepPanel;
	DoubleLabeledPanel lieutenantsPanel;
	
	public RegimentBaseInfoPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		namePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		namePanel.titleLabel.setText("Name");
		insidePanel.add(namePanel);
		
		typePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		typePanel.titleLabel.setText("Type");
		insidePanel.add(typePanel);
		
		levelPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		levelPanel.titleLabel.setText("Level");
		insidePanel.add(levelPanel);
		
		valuePanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		valuePanel.titleLabel.setText("Value");
		insidePanel.add(valuePanel);
		
		upkeepPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		upkeepPanel.titleLabel.setText("Upkeep");
		insidePanel.add(upkeepPanel);
		
		lieutenantsPanel = new DoubleLabeledPanel(width - 10, (height - 18) / 6, 40, Colour.DGREY);
		lieutenantsPanel.titleLabel.setText("Lieutenants");
		insidePanel.add(lieutenantsPanel);
			
	}
	
	public void fillRegimentBaseInfoPanel(Regiment regiment) {
		
		namePanel.contentLabel.setText(regiment.regiment);
		
		switch(regiment.type) {
		case ARCHERS: typePanel.contentLabel.setText("Archers"); break;
		case ARTILLERY: typePanel.contentLabel.setText("Artillery"); break;
		case COMBINED_ARMS: typePanel.contentLabel.setText("Combined Arms"); break;
		case FLYING: typePanel.contentLabel.setText("Flying"); break;
		case HEAVY_CAVALRY: typePanel.contentLabel.setText("Heavy Cavalry"); break;
		case HEAVY_INFANTRY: typePanel.contentLabel.setText("Heavy Infantry"); break;
		case HERO: typePanel.contentLabel.setText("Hero"); break;
		case LIGHT_CAVALRY: typePanel.contentLabel.setText("Light Cavalry"); break;
		case LIGHT_INFANTRY: typePanel.contentLabel.setText("Light Infantry"); break;
		default: break;		
		}
		
		levelPanel.contentLabel.setText(Integer.toString(regiment.level));
		valuePanel.contentLabel.setText(Integer.toString(regiment.value));
		upkeepPanel.contentLabel.setText(Integer.toString(regiment.upkeep));
		lieutenantsPanel.contentLabel.setText(Integer.toString(regiment.lieutenantsSize));
		
		
		
	}
}
