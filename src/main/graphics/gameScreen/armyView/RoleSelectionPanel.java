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

public class RoleSelectionPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;
	
	Color backgroundColor;
	ArrayList<ButtonedPanel> linePanels;
	RoleSelectionPopup roleSelectionPopup;

	public RoleSelectionPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		backgroundColor = new Color (70, 140, 210);
		linePanels = new ArrayList<ButtonedPanel>();
		
		for (int i = 0; i < 15; i++) {
			
		int index = i;		
		roleSelectionPopup = new RoleSelectionPopup(width * 2, height / 2);

		ButtonedPanel linePanel = new ButtonedPanel(width, height / 15, Color.black);
		linePanel.setBackground(backgroundColor);
		linePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		linePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roleSelectionPopup.setLocation(MouseInfo.getPointerInfo().getLocation());
				roleSelectionPopup.fillIndex(index);
				roleSelectionPopup.setVisible(true);
				fillRoleSelectionPanel();
			}
		});
		
		linePanels.add(linePanel);
					
		}

		for (ButtonedPanel panel: linePanels) {
		insidePanel.add(panel);
		}
	
	}
	
	public void fillRoleSelectionPanel() {
		
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			linePanels.get(i).button.setText(Main.yourArmy.roster.get(i).role.name());
		}
		
	}
	
	

}
