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
import main.components.TextPopup;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;
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
        		
        		int combattants = 0;
        		for (Regiment regiment: Main.yourArmy.roster) {
        			if (regiment.role == Role.COMBAT) combattants++;
        		}
        		
        		if (combattants == 8) {
				Screen.gameScreen.setVisible(false);
				Screen.battleScreen.setVisible(true);
				Main.battles.add(new Battle());
        		}
        		else {
        			TextPopup popup = new TextPopup(width * 3 / 2, roundedHeight, Colour.LRED, true);
        			
        			popup.writeText("You have not selected eight regiments. Do you still want to continue?");
        			
        				try { popup.confirmButton.removeActionListener(popup.confirmButton.getActionListeners()[0]); }
        				catch (Exception e1) {}
        				try { popup.cancelButton.removeActionListener(popup.cancelButton.getActionListeners()[0]); }
        				catch (Exception e2) {}
        				
        			popup.confirmButton.addActionListener(new ActionListener() {
        				public void actionPerformed(ActionEvent e) {
        					Screen.gameScreen.setVisible(false);
        					Screen.battleScreen.setVisible(true);
        					Main.battles.add(new Battle());
        					popup.dispose();
        				}
        			});
        			popup.cancelButton.addActionListener(new ActionListener() {
        				public void actionPerformed(ActionEvent e) {
        					popup.dispose();
        				}
        			});
        			popup.setVisible(true);
        		}
			}
        });
        add(battlePanel);
		

	}

}
