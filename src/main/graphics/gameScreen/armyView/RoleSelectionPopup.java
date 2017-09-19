package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.components.Colour;
import main.components.Popup;

public class RoleSelectionPopup extends Popup {

	private static final long serialVersionUID = 1L;
	Dimension panelDimension;
	Color panelColour;

	public RoleSelectionPopup(int width, int height, int index) {
		
		super(width, height, Colour.DRED, false);
		panelDimension = new Dimension(width / 3 - 16, height / 10);
		panelColour = new Color(160, 120, 30);
		
		RolePanel combat1Panel = new RolePanel();
		mainPanelTopPanel.add(combat1Panel);
		
		RolePanel combat2Panel = new RolePanel();
		mainPanelTopPanel.add(combat2Panel);
		
		RolePanel combat3Panel = new RolePanel();
		mainPanelTopPanel.add(combat3Panel);
		
		RolePanel combat4Panel = new RolePanel();
		mainPanelTopPanel.add(combat4Panel);
		
		RolePanel combat5Panel = new RolePanel();
		mainPanelTopPanel.add(combat5Panel);
		
		RolePanel combat6Panel = new RolePanel();
		mainPanelTopPanel.add(combat6Panel);
		
		RolePanel combat7Panel = new RolePanel();
		mainPanelTopPanel.add(combat7Panel);
		
		RolePanel combat8Panel = new RolePanel();
		mainPanelTopPanel.add(combat8Panel);
		
		RolePanel combat9Panel = new RolePanel();
		mainPanelTopPanel.add(combat9Panel);
		
		RolePanel combat10Panel = new RolePanel();
		mainPanelTopPanel.add(combat10Panel);
		
		RolePanel questPanel = new RolePanel();
		mainPanelTopPanel.add(questPanel);
		
		RolePanel trainPanel = new RolePanel();
		mainPanelTopPanel.add(trainPanel);
			
	}
	
	private class RolePanel extends JPanel {

		private static final long serialVersionUID = 1L;

		private RolePanel() {
			
			super();
			setPreferredSize(panelDimension);
			setBackground(panelColour);
			
			JButton roleSelectionButton = new JButton();


		}
	}

}
