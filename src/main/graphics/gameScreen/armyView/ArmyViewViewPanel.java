package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

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
				
			}
		});

		
		
	}

}
