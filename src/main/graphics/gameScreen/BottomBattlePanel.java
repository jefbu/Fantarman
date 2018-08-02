package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;
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
import main.utility.ImageLoader;

public class BottomBattlePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JButton exitButton;
	JButton battleButton;

	public BottomBattlePanel(int width, int height) {
		
		super();
		
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.dgrey);
		
		JPanel vdgreyPanel = new JPanel();
		vdgreyPanel.setPreferredSize(new Dimension(width * 90 / 100, height * 9 / 10));
		vdgreyPanel.setBackground(Colors.dgrey);
		vdgreyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(vdgreyPanel);
		
		JButton click = new JButton();
		click.setPreferredSize(new Dimension(width * 90 / 100, height * 9 / 10));
		click.setContentAreaFilled(false);
		click.setOpaque(false);
		click.setBorderPainted(false);
		ImageLoader imageLoader = new ImageLoader();
		click.setIcon(imageLoader.loadImageIcon("/icons/battleButton.png", width * 90 / 100, height * 9 / 10));
		vdgreyPanel.add(click);
		
		click.addActionListener(new ActionListener() {
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
        			TextPopup popup = new TextPopup(width * 3 / 2, height, Colour.LRED, true);
        			
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
		

	}

}
