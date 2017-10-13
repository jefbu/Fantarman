package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.Popup;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;

public class RoleSelectionPopup extends Popup {

	private static final long serialVersionUID = 1L;
	Dimension panelDimension;
	Color panelColour;
	JButton roleSelectionButton;
	int index;
	public RoleSelectionPopup(int width, int height) {
		
		super(width, height, Colour.DRED, false);
		panelDimension = new Dimension(width / 3 - 16, height / 10);
		panelColour = new Color(160, 120, 30);
		
		RolePanel combat1Panel = new RolePanel("Combat 1", 1, this);
		mainPanelTopPanel.add(combat1Panel);
		
		RolePanel combat2Panel = new RolePanel("Combat 2", 2, this);
		mainPanelTopPanel.add(combat2Panel);
		
		RolePanel combat3Panel = new RolePanel("Combat 3", 3, this);
		mainPanelTopPanel.add(combat3Panel);
		
		RolePanel combat4Panel = new RolePanel("Combat 4", 4, this);
		mainPanelTopPanel.add(combat4Panel);
		
		RolePanel combat5Panel = new RolePanel("Combat 5", 5, this);
		mainPanelTopPanel.add(combat5Panel);
		
		RolePanel combat6Panel = new RolePanel("Combat 6", 6, this);
		mainPanelTopPanel.add(combat6Panel);
		
		RolePanel combat7Panel = new RolePanel("Combat 7", 7, this);
		mainPanelTopPanel.add(combat7Panel);
		
		RolePanel combat8Panel = new RolePanel("Combat 8", 8, this);
		mainPanelTopPanel.add(combat8Panel);
		
		RolePanel combat9Panel = new RolePanel("Combat 9", 9, this);
		mainPanelTopPanel.add(combat9Panel);
		
		RolePanel combat10Panel = new RolePanel("Combat 10", 10, this);
		mainPanelTopPanel.add(combat10Panel);
		
		RolePanel questPanel = new RolePanel("Training", 11, this);
		mainPanelTopPanel.add(questPanel);
		
		RolePanel trainPanel = new RolePanel("Questing", 12, this);
		mainPanelTopPanel.add(trainPanel);
			
	}
	
	private class RolePanel extends JPanel {

		private static final long serialVersionUID = 1L;

		private RolePanel(String title, int role, RoleSelectionPopup roleSelectionPopup) {
			
			super();
			setPreferredSize(panelDimension);
			setBackground(panelColour);
			setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
			
			roleSelectionButton = new JButton();
			roleSelectionButton.setText(title);
			roleSelectionButton.setPreferredSize(panelDimension);
			
			roleSelectionButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Role tempRole = decideRole(role);
					boolean roleFree = true;
					for (Regiment regiment: Main.yourArmy.roster) {
						if (regiment.role == tempRole) roleFree = false;
					}
					if (roleFree) Main.yourArmy.roster.get(index).role = decideRole(role);
					roleSelectionPopup.dispose();
				}
			});
			
			add(roleSelectionButton);

		}
	}
	
	private Role decideRole(int role) {
		
		switch(role) {
		case 1: return Role.COMBAT1;
		case 2: return Role.COMBAT2;
		case 3: return Role.COMBAT3;
		case 4: return Role.COMBAT4;
		case 5: return Role.COMBAT5;
		case 6: return Role.COMBAT6;
		case 7: return Role.COMBAT7;
		case 8: return Role.COMBAT8;
		case 9: return Role.COMBAT9;
		case 10:return Role.COMBAT10;
		case 11:return Role.TRAINING;
		case 12:return Role.QUESTING;
		}
		
		return Role.TRAINING;
		
	}
	
	public void fillIndex(int index) {
		this.index= index;		
	}

}
