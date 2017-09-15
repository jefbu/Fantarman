package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.ContentPanel;
import main.components.IndexedButton;

public class RegimentListPanel extends ContentPanel {
	
	private static final long serialVersionUID = 1L;

	public RegimentListPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		Color backgroundColor = new Color(70, 140, 210);
		
		for (int i = 0; i < 15; i++) {
			
		int index = i;	
			
		JPanel linePanel = new JPanel();
		linePanel.setPreferredSize(new Dimension(width, height / 15));
		linePanel.setBackground(backgroundColor);
		linePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		insidePanel.add(linePanel);
		
		IndexedButton lineButton = new IndexedButton(i);
		lineButton.setPreferredSize(new Dimension(width, height / 15));
		lineButton.setBorderPainted(false);
		lineButton.setContentAreaFilled(false);
		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoleSelectionPopup roleSelectionPopup = new RoleSelectionPopup(width * 2, height / 2, index);
				roleSelectionPopup.setLocation(MouseInfo.getPointerInfo().getLocation());
				roleSelectionPopup.setVisible(true);
			}
		});
		
		linePanel.add(lineButton);
		
		}
		
		
	}

}
