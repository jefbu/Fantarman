package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.components.Colour;

public class ArmyViewViewPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JButton sortButton;

	public ArmyViewViewPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color (150, 170, 255));
		sortButton = new JButton();
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewChoicePopup viewChoicePopup = new ViewChoicePopup(width, height * 4 + 10, Colour.DGREEN, false);
				viewChoicePopup.setLocation(MouseInfo.getPointerInfo().getLocation());
				viewChoicePopup.setVisible(true);				
			}
		});
		add(sortButton);

		
		
	}

}
