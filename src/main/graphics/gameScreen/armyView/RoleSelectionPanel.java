package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import main.Main;
import main.components.ButtonedPanel;
import main.components.Colour;
import main.components.ContentPanel;
import main.entity.armies.Army;
import main.utility.Colors;

public class RoleSelectionPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	Color backgroundColorOwnArmy;
	Color backgroundColorOpponentArmy;
	ArrayList<ButtonedPanel> linePanels;
	RoleSelectionPopup roleSelectionPopup;

	public RoleSelectionPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		backgroundColorOwnArmy = Colors.blue;
		backgroundColorOpponentArmy = new Color (210, 180, 150);
		linePanels = new ArrayList<ButtonedPanel>();
		
		for (int i = 0; i < 15; i++) {
			
		roleSelectionPopup = new RoleSelectionPopup(width * 2, height / 2);

			ButtonedPanel linePanel = new ButtonedPanel(width, height / 15, Color.black);
			linePanel.setBackground(backgroundColorOpponentArmy);
			linePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			linePanels.add(linePanel);
					
		}

		for (ButtonedPanel panel: linePanels) {
		insidePanel.add(panel);
		}
	
	}
	
	public void fillRoleSelectionPanel(Army army) {
		
		boolean editable;
		if (army == Main.yourArmy) { editable = true; }
		else { editable = false; }
		
		for (int i = 0; i < 15; i++) {
			int index = i;
			
			try {
				linePanels.get(i).button.removeActionListener(linePanels.get(i).button.getActionListeners()[0]);
			} catch (Exception e) {}
			if(editable) {
			linePanels.get(i).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					roleSelectionPopup.setLocation(MouseInfo.getPointerInfo().getLocation());
					roleSelectionPopup.fillIndex(index);
					roleSelectionPopup.setVisible(true);
					fillRoleSelectionPanel(army);
				}
			});
			}
			
		}
		
		if(army == Main.yourArmy) {
			insidePanel.setBackground(backgroundColorOwnArmy);
		} else {
			insidePanel.setBackground(backgroundColorOpponentArmy);
		}
		
		for (int ii = 0; ii < 15; ii++) {
			linePanels.get(ii).button.setText("");
		}
		
		for (int i = 0; i < army.roster.size(); i++) {
			linePanels.get(i).button.setText(army.roster.get(i).role.name());
		}
		
	}
	
	

}
