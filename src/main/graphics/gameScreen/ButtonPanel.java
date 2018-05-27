package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.Main;
import main.battle.Battle;
import main.components.Colour;
import main.components.IconLabelPanel;
import main.graphics.Screen;
import main.utility.Colors;

public class ButtonPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JButton exitButton;
	JButton battleButton;

	public ButtonPanel(int roundedWidth, int unroundedHeight) {
		
		super();
		
		int roundedHeight = unroundedHeight * 25 / 100 + 1;
		int width = roundedWidth;
		
		setPreferredSize(new Dimension(width, roundedHeight));
		setBackground(Colors.vlblue);
		
       IconLabelPanel battlePanel = new IconLabelPanel(width * 8 / 10, roundedHeight * 2 / 3, Colour.RED);
        battlePanel.buttonedPanel.label.setForeground(Colors.textyellow);
        battlePanel.buttonedPanel.label.setFont(new Font("garamond", Font.BOLD, 48));
        battlePanel.buttonedPanel.label.setText("To Battle");
        battlePanel.buttonedPanel.button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setVisible(false);
				Screen.battleScreen.setVisible(true);
				Main.battles.add(new Battle());	        	}
        });
        add(battlePanel);
		

	}

}
